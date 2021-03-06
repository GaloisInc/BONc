
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

public class MemberRange extends VariableRange {


  public final Expression expression;

  public final List<String> identifiers;


  // === Constructors and Factories ===
  protected MemberRange(List<String> identifiers, Expression expression, SourceLocation location) {
    super(location);
    this.identifiers = identifiers; assert identifiers != null;
    this.expression = expression; assert expression != null;
  }

  public static MemberRange mk(List<String> identifiers, Expression expression, SourceLocation location) {
    return new MemberRange(identifiers, expression, location);
  }

  // === Accessors ===

  public List<String> getIdentifiers() { return identifiers; }
  public Expression getExpression() { return expression; }

  // === Visitor ===
  public void accept(IVisitorWithAdditions visitor) {
    visitor.visitMemberRange(this, identifiers, expression, getLocation());
  }

  // === Others ===
  @Override
  public MemberRange clone() {
    List<String> newIdentifiers = identifiers;
    Expression newExpression = expression == null ? null : expression.clone();
    return MemberRange.mk(newIdentifiers, newExpression, getLocation());
  }

  @Override
  public String toString() {
    return StringUtil.prettyPrint(this);
  }
}

