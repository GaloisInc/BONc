/**
 * Copyright (c) 2007, Fintan Fairmichael, University College Dublin under the BSD licence.
 * See LICENCE.TXT for details.
 */
package ie.ucd.bon.typechecker.errors;

import java.io.File;

import ie.ucd.bon.source.SourceLocation;
import ie.ucd.bon.typechecker.TypeCheckingError;

public class ClassDoesNotDeclareFeatureError extends TypeCheckingError {

  private static final String message = "Class %s does not declare a feature with name %s";
  
  private final String className;
  private final String featureName;
  
  public ClassDoesNotDeclareFeatureError(File sourceFile, int lineNumber, int charPosition, String className, String featureName) {
    super(sourceFile, lineNumber, charPosition);
    this.className = className;
    this.featureName = featureName;
  }

  public ClassDoesNotDeclareFeatureError(SourceLocation loc, String className, String featureName) {
    super(loc);
    this.className = className;
    this.featureName = featureName;
  }

  @Override
  public String getMessage() {
    return String.format(message, className, featureName);
  }  

}
