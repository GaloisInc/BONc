
/**
 * Copyright (c) 2007-2009, Fintan Fairmichael, University College Dublin under the BSD licence.
 * See LICENCE.TXT for details.
 *
 * This class is generated automatically from normal_classes.tpl.
 * Do not edit.
 */
package ie.ucd.bon.ast;

import java.util.List;
import ie.ucd.bon.source.SourceLocation;

public class IntegerConstant extends ManifestConstant {



  public final Integer value;


  // === Constructors and Factories ===
  protected IntegerConstant(Integer value, SourceLocation location) {
    super(location);
    this.value = value; assert value != null;
  }

  public static IntegerConstant mk(Integer value, SourceLocation location) {
    return new IntegerConstant(value, location);
  }

  // === Accessors ===

  public Integer getValue() { return value; }

  // === Visitor ===
  public void accept(IVisitorWithAdditions visitor) {
    visitor.visitIntegerConstant(this, value, getLocation());
  }

  // === Others ===
  @Override
  public IntegerConstant clone() {
    Integer newValue = value;
    return IntegerConstant.mk(newValue, getLocation());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("IntegerConstant ast node: ");
    sb.append("value = ");
    sb.append(value);
    sb.append(", ");
    if (sb.length() >= 2) {
      sb.delete(sb.length()-2, sb.length());
    }
    return sb.toString();
  }
}

