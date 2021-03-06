
/**
 * Copyright (c) 2007-2010, Fintan Fairmichael, University College Dublin under the BSD licence.
 * See LICENCE.TXT for details.
 *
 * This class is generated automatically from normal_classes.tpl.
 * Do not edit.
 */
package ie.ucd.bon.ast;

import java.util.List;
import ie.ucd.bon.source.SourceLocation;
import ie.ucd.bon.util.StringUtil;

public class TypeRange extends VariableRange {


  public final Type type;

  public final List<String> identifiers;


  // === Constructors and Factories ===
  protected TypeRange(List<String> identifiers, Type type, SourceLocation location) {
    super(location);
    this.identifiers = identifiers; assert identifiers != null;
    this.type = type; assert type != null;
  }

  public static TypeRange mk(List<String> identifiers, Type type, SourceLocation location) {
    return new TypeRange(identifiers, type, location);
  }

  // === Accessors ===

  public List<String> getIdentifiers() { return identifiers; }
  public Type getType() { return type; }

  // === Visitor ===
  public void accept(IVisitorWithAdditions visitor) {
    visitor.visitTypeRange(this, identifiers, type, getLocation());
  }

  // === Others ===
  @Override
  public TypeRange clone() {
    List<String> newIdentifiers = identifiers;
    Type newType = type == null ? null : type.clone();
    return TypeRange.mk(newIdentifiers, newType, getLocation());
  }

  @Override
  public String toString() {
    return StringUtil.prettyPrint(this);
  }
}

