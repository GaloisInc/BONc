/**
 * Copyright (c) 2007, Fintan Fairmichael, University College Dublin under the BSD licence.
 * See LICENCE.TXT for details.
 */
package ie.ucd.bon.parser.errors;

import ie.ucd.bon.errorreporting.BONError;
import ie.ucd.bon.parser.SourceLocation;

import java.io.File;

public abstract class ParsingError extends BONError {

  private final boolean severe;
  
  public ParsingError(File sourceFile, int lineNumber, int charPosition, boolean isSevere) {
    super(sourceFile, lineNumber, charPosition);
    this.severe = isSevere;
  }

  public ParsingError(SourceLocation sourceLoc, boolean isSevere) {
    super(sourceLoc);
    this.severe = isSevere;
  }  
  
  public final boolean isSevere() {
    return severe;
  }

  @Override
  public boolean equals(Object obj) {
    return super.equals(obj);
  }
  
  
}
