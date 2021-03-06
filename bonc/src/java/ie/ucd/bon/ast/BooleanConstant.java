
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

public class BooleanConstant extends ManifestConstant {



  public final Boolean value;


  // === Constructors and Factories ===
  protected BooleanConstant(Boolean value, SourceLocation location) {
    super(location);
    this.value = value; assert value != null;
  }

  public static BooleanConstant mk(Boolean value, SourceLocation location) {
    return new BooleanConstant(value, location);
  }

  // === Accessors ===

  public Boolean getValue() { return value; }

  // === Visitor ===
  public void accept(IVisitorWithAdditions visitor) {
    visitor.visitBooleanConstant(this, value, getLocation());
  }

  // === Others ===
  @Override
  public BooleanConstant clone() {
    Boolean newValue = value;
    return BooleanConstant.mk(newValue, getLocation());
  }

  @Override
  public String toString() {
    return StringUtil.prettyPrint(this);
  }
}

