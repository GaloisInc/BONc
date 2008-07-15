/**
 * Copyright (c) 2007, Fintan Fairmichael, University College Dublin under the BSD licence.
 * See LICENCE.TXT for details.
 */
package ie.ucd.bon.typechecker;

import ie.ucd.bon.errorreporting.BONWarning;
import ie.ucd.bon.source.SourceLocation;

public abstract class TypeCheckingWarning extends BONWarning {

  public TypeCheckingWarning(SourceLocation loc) {
    super(loc);
  }

}
