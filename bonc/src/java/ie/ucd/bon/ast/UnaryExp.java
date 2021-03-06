
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

public class UnaryExp extends Expression {
  public static enum Op {
    OLD, 
    DELTA, 
    SUB, 
    NOT, 
    ADD
  }

  public final Expression expression;

  public final Op op;


  // === Constructors and Factories ===
  protected UnaryExp(Op op, Expression expression, SourceLocation location) {
    super(location);
    this.op = op; 
    this.expression = expression; assert expression != null;
  }

  public static UnaryExp mk(Op op, Expression expression, SourceLocation location) {
    return new UnaryExp(op, expression, location);
  }

  // === Accessors ===

  public Op getOp() { return op; }
  public Expression getExpression() { return expression; }

  // === Visitor ===
  public void accept(IVisitorWithAdditions visitor) {
    visitor.visitUnaryExp(this, op, expression, getLocation());
  }

  // === Others ===
  @Override
  public UnaryExp clone() {
    Op newOp = op;
    Expression newExpression = expression == null ? null : expression.clone();
    return UnaryExp.mk(newOp, newExpression, getLocation());
  }

  @Override
  public String toString() {
    return StringUtil.prettyPrint(this);
  }
}

