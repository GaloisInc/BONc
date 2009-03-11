/**
 * Copyright (c) 2007-2009, Fintan Fairmichael, University College Dublin under the BSD licence.
 * See LICENCE.TXT for details.
 */
package ie.ucd.bon.errorreporting;

import ie.ucd.bon.parser.errors.ParsingError;
import ie.ucd.bon.source.SourceLocation;

import java.io.File;

public class FileReadError extends ParsingError {

  private static final String message = "An I/O error occurred whilst reading %s: %s";
  
  //private final File sourceFile;
  private final String exceptionMessage;
  
  public FileReadError(File sourceFile, String exceptionMessage) {
    super(new SourceLocation(sourceFile, SourceLocation.FILE_PROBLEM, SourceLocation.UNKNOWN_CHAR_POSITION, SourceLocation.UNKNOWN_CHAR_POSITION, SourceLocation.UNKNOWN_CHAR_POSITION), true);
    //this.sourceFile = sourceFile;
    this.exceptionMessage = exceptionMessage;
  }

  @Override
  public String getMessage() {
    return String.format(message, getLocation().getFilePath(), exceptionMessage);
  }

  
  
}
