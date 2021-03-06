package ie.ucd.bon.tester;

import ie.ucd.bon.util.FileUtil;
import ie.ucd.bon.util.StringUtil;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileFilter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {

  private static int numberOfTests = 1000000;
  private static final int minimumMods = 0;
  private static final int maximumMods = 10000;

  private static final FileFilter bonFilter = new FileFilter() {
    @Override
    public boolean accept(File pathname) {
      return pathname.isDirectory() || pathname.getName().endsWith(".bon");
    }
  };

  private static final ToolTestWrapper bonTestWrapper = new BONTestWrapper();

  public static void main(String[] args) {
    if (args.length == 3) {
      numberOfTests = Integer.parseInt(args[2]);
      runTests(new File(args[0]), new File(args[1]));
    } else if (args.length == 2) {
      runTests(new File(args[0]), new File(args[1]));
    } else if (args.length == 1) {
      testInputs(new File(args[0]));
    } else {
      System.out.println("Invalid args");
    }
  }

  private static void runTests(File inputDirectory, File outputDirectory) {
    List<File> allFiles = listFiles(inputDirectory);
    List<Pair<File,String>> readFiles = new ArrayList<Pair<File,String>>(allFiles.size());
    try {
      for (File file : allFiles) {
        readFiles.add(new Pair<File,String>(file,FileUtil.readToString(file)));
        //System.out.println("Read " + file.getAbsolutePath());
      }
    } catch (IOException ioe) {
      System.out.println("IOException when reading input files " + ioe);
      return;
    }
    System.out.println("Read all files (" + allFiles.size() + ").");

    runTests(readFiles, outputDirectory);
  }

  private static void runTests(List<Pair<File,String>> inputs, File outputDirectory) {
    System.out.println("Running " + numberOfTests + " tests.");
    Tracker tracker = new Tracker();
    long startTime = System.nanoTime();

    int exceptionCount = 0;
    for (int i=0; i < numberOfTests; i++) {
      Pair<File,String> input = RandomUtil.randomlyChooseFromList(inputs);
      String actualInput = performModifications(input.getSecond(), inputs);
      tracker.addInput(actualInput);
      try {
        bonTestWrapper.run(actualInput); 
      } catch (Exception e) {
        exceptionCount++;
        //System.out.println("Caught exception, yay! " + e);
        try {
          FileUtil.writeStringToFile(actualInput, new File(outputDirectory.getAbsoluteFile() + File.separator + "exception" + exceptionCount + "input.bon"));
          PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(new File(outputDirectory.getAbsoluteFile() + File.separator + "exception" + exceptionCount + "stacktrace"))));
          pw.println("exception" + exceptionCount);
          e.printStackTrace(pw);
          pw.flush();
          pw.close();
        } catch (IOException ioe) {
          System.out.println("IOException when trying to deal report error #" + exceptionCount);
        }
      }

      //System.out.println("Actual:\n" + actualInput);

      if (i % 10000 == 9999) {
        System.out.println("Completed " + (i+1));
      }
    }
    System.out.println("Average length of input: " + (tracker.getTotalLength() / numberOfTests));
    System.out.println("Done. Hit " + exceptionCount + " exceptions.");
    long endTime = System.nanoTime();
    System.out.println("Testing took: " + StringUtil.timeString(endTime - startTime));
  }

  private static String performModifications(String input, List<Pair<File,String>> otherInputs) {
    boolean justJoin = RandomUtil.justJoin();
    StringBuilder sb = new StringBuilder(input);
    for (int i=0; i < minimumMods; i++) {
      performSingleMod(sb, otherInputs, justJoin);
    }

    for (int i=minimumMods; i < maximumMods; i++) {
      if (!RandomUtil.makeAnotherMod()) {
        //System.out.println("Stopped at " + i + " modifications.");
        return sb.toString();
      } else {
        performSingleMod(sb, otherInputs, justJoin);
      }
    }    

    return sb.toString();
  }

  private static void performSingleMod(StringBuilder string, List<Pair<File,String>> otherInputs, boolean justJoin) {
    if (justJoin) {
      RandomUtil.appendMod.modify(string, otherInputs);
    } else {
      RandomUtil.chooseRandomModification().modify(string, otherInputs);
    }
  }

  private static void testInputs(File directory) {
    List<File> files = listFiles(directory);
    int failCount = 0;
    int successCount = 0;
    for (File file : files) {
      String s = null;
      try {
        s = FileUtil.readToString(file);
      } catch (IOException ioe) {
        System.out.println("IOException when reading file: " + ioe);
        continue;
      }
      try {
        bonTestWrapper.run(s);
        System.out.println("No longer fails! - " + file.getAbsolutePath());

        String absolutePath = file.getAbsolutePath();
        new File(absolutePath.substring(0, absolutePath.length()-9).concat("stacktrace")).delete();
        file.delete();

        successCount++;
      } catch (Exception e) { 
        failCount++;
      }
    }
    System.out.println("Now passing: " + successCount);
    System.out.println("Still failing: " + failCount);
    System.out.println("Total: " + (failCount + successCount));
  }

  private static List<File> listFiles(File directory) {
    if (directory.isDirectory()) {
      List<File> filesList = new ArrayList<File>();
      File[] files = directory.listFiles(bonFilter);
      for (File file : files) {
        if (file.isDirectory()) {
          filesList.addAll(listFiles(file));
        } else {
          filesList.add(file);
        }
      }
      return filesList;
    } else {
      return new ArrayList<File>(0);
    }
  }

}
