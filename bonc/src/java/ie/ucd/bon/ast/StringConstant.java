
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

public class StringConstant extends ManifestConstant {



  public final String value;


  // === Constructors and Factories ===
  protected StringConstant(String value, SourceLocation location) {
    super(location);
    this.value = value; assert value != null;
  }

  public static StringConstant mk(String value, SourceLocation location) {
    return new StringConstant(value, location);
  }

  // === Accessors ===

  public String getValue() { return value; }

  // === Visitor ===
  public void accept(IVisitorWithAdditions visitor) {
    visitor.visitStringConstant(this, value, getLocation());
  }

  // === Others ===
  @Override
  public StringConstant clone() {
    String newValue = value;
    return StringConstant.mk(newValue, getLocation());
  }

  @Override
  public String toString() {
    return StringUtil.prettyPrint(this);
  }
}

