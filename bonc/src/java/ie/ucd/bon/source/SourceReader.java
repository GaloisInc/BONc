/**
 * Copyright (c) 2007-2009, Fintan Fairmichael, University College Dublin under the BSD licence.
 * See LICENCE.TXT for details.
 */
package ie.ucd.bon.source;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Manages reading from Files as well as from standard input.
 * @author fintan
 *
 */
public final class SourceReader {
//TODO, this static instance will not function correctly upon multiple uses through the API
//For the commandline version the single process is fine
//For eclipse, there is no issue as we don't read back from the SourceReader (we just use the source locations)
  
  /** Singleton instance of SourceReader. */
  private static SourceReader instance;

  /** Mapping Files to SourceLineReaders. */
  private final Map<File,SourceLineReader> readers;

  /** The lines read from standard input (if any). */
  private final List<String> stdInLines;

  /**
   * Construct a new SourceReader. Simply initialise the contained data structures.
   */
  private SourceReader() {
    readers = new HashMap<File,SourceLineReader>();
    stdInLines = new ArrayList<String>();
  }

  /**
   * Get the singleton instance of SourceReader.
   * @return
   */
  public static SourceReader getInstance() {
    if (instance == null) {
      instance = new SourceReader();
    }
    return instance;
  }

  /**
   *
   * @param sourceFile
   * @param lineNumber
   * @return
   */
  public String getSource(File sourceFile, int lineNumber) {
    if (sourceFile == null) {
      return getStandardInputSource(lineNumber);
    } else {
      SourceLineReader reader = readers.get(sourceFile);
      if (reader == null) {
        if (!sourceFile.exists()) {
          return null;
        }
        reader = new SourceLineReader(sourceFile);
        readers.put(sourceFile, reader);
      }
      return reader.getLine(lineNumber);
    }
  }
  
  /**
   * 
   * @param sourceFile
   * @param lineNumberStart
   * @param lineNumberEnd ending line number (inclusive)
   * @return
   */
  public List<String> getSourceLines(File sourceFile, int lineNumberStart, int lineNumberEnd) {
    if (lineNumberStart > lineNumberEnd) {
      return Collections.emptyList();
    }
    List<String> lines = new ArrayList<String>(lineNumberEnd - lineNumberStart + 1);
    for (int i=lineNumberStart; i <= lineNumberEnd; i++) {
      lines.add(getSource(sourceFile, i));
    }
    return lines;
  }

  public SourceLineReader getSourceLineReader(File file) {
    return readers.get(file);
  }

  /**
   * Get the chosen line's text from the standard input source.
   * @param lineNumber
   * @return
   */
  private String getStandardInputSource(int lineNumber) {
    if (stdInLines.size() == 0) {
      return null;
    }
    if (lineNumber <= stdInLines.size()) {
      return stdInLines.get(lineNumber-1);
    } else {
      return null;
    }
  }

  /**
   * Read all of standard input to a buffer, and return an input stream to read from this.
   * @return an input stream to access the contents read from standard input.
   */
  public InputStream readStandardInput() {
    try {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringBuilder sb = new StringBuilder();
      String line;
      while ((line = br.readLine()) != null) {
        sb.append(line);
        stdInLines.add(line);
        sb.append('\n');
      }
      return new ByteArrayInputStream(sb.toString().getBytes());
    } catch (IOException ioe) {
      System.out.println("Something went wrong when reading from stdin");
      return null;
    }
  }

  /**
   * Read from a provided File, creating an InputStream to facilitate this.
   * @param f the File to read from.
   * @return an InputStream to read the given File's contents.
   * @throws IOException if an IOException occurs whilst reading from the given file.
   */
  public InputStream readFile(File f) throws IOException {
    BufferedReader br = new BufferedReader(new FileReader(f));
    StringBuilder sb = new StringBuilder();
    ArrayList<String> lines = new ArrayList<String>();

    String line;
    while ((line = br.readLine()) != null) {
      sb.append(line);
      lines.add(line);
      sb.append('\n');
    }

    SourceLineReader slr = new SourceLineReader(lines);
    readers.put(f, slr);

    return new ByteArrayInputStream(sb.toString().getBytes());
  }
}
