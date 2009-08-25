package ie.ucd.bon;

import ie.ucd.bon.clinterface.BONcOptionsInterface;
import ie.ucd.bon.errorreporting.Problems;
import ie.ucd.bon.graph.display.PrefuseGraphDisplay;
import ie.ucd.bon.parser.tracker.ParseResult;
import ie.ucd.bon.parser.tracker.ParsingTracker;
import ie.ucd.bon.source.SourceReader;
import ie.ucd.bon.util.StringUtil;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Collection;

import org.antlr.runtime.RecognitionException;

public class API {

  //Parse

  public static ParsingTracker parse(final Collection<File> files, final boolean readFromStdIn, final boolean printTiming) {
    ParsingTracker tracker = new ParsingTracker();

    if (readFromStdIn) {
      ParseResult parseResult = doActualParse(SourceReader.getInstance().readStandardInput(), null, tracker, printTiming);
      if (parseResult != null) {
        tracker.addParse("stdin", null, parseResult);
      }
    }

    for (File file : files) {      
      try {
        InputStream is = SourceReader.getInstance().readFile(file);

        ParseResult parseResult = doActualParse(is, file, tracker, printTiming);
        if (parseResult != null) {
          tracker.addParse(file.getName(), file, parseResult);
        }        
      } catch (FileNotFoundException fnfe) {
        //TODO report error
      } catch (IOException ioe) {
        //TODO report error
      }
    }

    return tracker;
  }

  private static ParseResult doActualParse(InputStream is, File file, ParsingTracker tracker, boolean printTiming) {
    try {
      if (printTiming) {
        long startTime = System.nanoTime();
        ParseResult parseResult = Parser.parse(file, is, tracker);
        long endTime = System.nanoTime();
        System.out.println("Parsing took: " + StringUtil.timeString(endTime - startTime));
        return parseResult;
      } else {
        return Parser.parse(file, is, tracker);
      }
    } catch (RecognitionException re) {
      //Nothing - won't actually happen?
      System.out.println("ERROR, something went wrong...");
      return null;
    }
  }


  public static void print(final Collection<File> files, final ParsingTracker tracker, final BONcOptionsInterface options, final boolean timing) {

    if (!options.isPrintSet()) {
      return;
    }

    BONcOptionsInterface.Print printType = options.getPrint();

    if (options.getGenClassDic() && printType != BONcOptionsInterface.Print.DIC) {
      try {
        String classDic = Printer.printGeneratedClassDictionaryToString(tracker);
        File classDicAutoFile = new File("class-dic-auto");
        if (!classDic.equals("")) {
          tracker.addParse(classDicAutoFile.getName(), classDicAutoFile, Parser.parse(classDicAutoFile, new ByteArrayInputStream(classDic.getBytes()), tracker));
          files.add(classDicAutoFile);
        }
      } catch (RecognitionException re) {
        //Can't actually be thrown for this.
        Main.logDebug("Main: Threw RecognitionException while executing printGeneratedClassDictionaryToString");
      }
    }

    boolean printToFile = options.isPrintOutputSet();

    PrintStream outputStream;
    File outputFile = null;
    if (printToFile) {
      outputFile = options.getPrintOutput();

      try {
        FileOutputStream outputFileStream = new FileOutputStream(outputFile);
        outputStream = new PrintStream(outputFileStream);

        Main.logDebug("printing: " + printType + ", to: " + outputFile.getPath());
      } catch (FileNotFoundException fnfe) {
        System.out.println("Error writing to file " + outputFile.getPath());
        return;
      }
    } else {
      outputStream = System.out;
      Main.logDebug("printing: " + printType + ", to: stdout");
    }  


    Printer.printToStream(files, tracker, outputStream, printType, printToFile, timing);

    if (printToFile) {
      outputStream.close();
      System.out.println("Succesfully created: " + outputFile.getPath());
    }
  }

  public static void printResults(final Problems problems, final ParsingTracker tracker, PrintStream out) {
    printResults(problems, out);
    if (tracker != null) {
      tracker.printFinalMessage(out);
    }
  }
  
  public static void printResults(final Problems problems, final PrintStream out) {
    problems.printProblems(out);
    problems.printSummary(out);
  }

  public static void displayGraphs(final ParsingTracker tracker, final BONcOptionsInterface so) {
    if (so.isGraphSet()) {
      System.out.println("Graphing...");
      PrefuseGraphDisplay.displayGraph(so.getGraph(), tracker);
    }
  }

  public static Problems typeCheck(final ParsingTracker tracker, final BONcOptionsInterface so, final boolean timing) {
    boolean checkInformal = so.getCheckInformal();
    boolean checkFormal = so.getCheckFormal();
    boolean checkConsistency = so.getCheckConsistency();
    boolean typeCheck = so.getTypecheck();
    Main.logDebug("typeCheck: " + typeCheck + ", checkInformal: " + checkInformal + ", checkFormal: " + checkFormal + ", checkConsistency: " + checkConsistency);

    if (timing) {
      long startTime = System.nanoTime();
      Problems problems = TypeChecker.typeCheck(tracker, typeCheck, checkInformal, checkFormal, checkConsistency);
      long endTime = System.nanoTime();
      System.out.println("Typechecking took: " + StringUtil.timeString(endTime - startTime));
      return problems;
    } else {
      return TypeChecker.typeCheck(tracker, typeCheck, checkInformal, checkFormal, checkConsistency);
    }
  }
}