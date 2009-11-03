
/**
 * Copyright (c) 2007-2009, Fintan Fairmichael, University College Dublin under the BSD licence.
 * See LICENCE.TXT for details.
 *
 * This class is generated automatically from abstract_classes.tpl.
 * Do not edit.
 */
package ie.ucd.bon.ast;

import ie.ucd.bon.source.SourceLocation;

public abstract class Prefix extends ClientEntity {

  public Prefix(SourceLocation location) {
    super(location);
  }

  // a more specific return type
  @Override
  public abstract Prefix clone();
}
