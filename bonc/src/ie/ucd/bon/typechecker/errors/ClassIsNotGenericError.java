/**
 * Copyright (c) 2007, Fintan Fairmichael, University College Dublin under the BSD licence.
 * See LICENCE.TXT for details.
 */
package ie.ucd.bon.typechecker.errors;

import java.io.File;

import ie.ucd.bon.parser.SourceLocation;
import ie.ucd.bon.typechecker.TypeCheckingError;

public class ClassIsNotGenericError extends TypeCheckingError {

  private static final String message = "Class %s is not generic ";
  
  private final String className;
  
  public ClassIsNotGenericError(File sourceFile, int lineNumber, int charPosition, String className) {
    super(sourceFile, lineNumber, charPosition);
    this.className = className;
  }

  public ClassIsNotGenericError(SourceLocation loc, String className) {
    super(loc);
    this.className = className;
  }

  @Override
  public String getMessage() {
    return String.format(message, className);
  }
  
  

}
