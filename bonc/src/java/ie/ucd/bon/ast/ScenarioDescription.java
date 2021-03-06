
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

public class ScenarioDescription extends DynamicComponent {



  public final String name;
  public final List<LabelledAction> actions;
  public final String comment;


  // === Constructors and Factories ===
  protected ScenarioDescription(String name, List<LabelledAction> actions, String comment, SourceLocation location) {
    super(location);
    this.name = name; assert name != null;
    this.actions = actions; assert actions != null;
    this.comment = comment; 
  }

  public static ScenarioDescription mk(String name, List<LabelledAction> actions, String comment, SourceLocation location) {
    return new ScenarioDescription(name, actions, comment, location);
  }

  // === Accessors ===

  public String getName() { return name; }
  public List<LabelledAction> getActions() { return actions; }
  public String getComment() { return comment; }

  // === Visitor ===
  public void accept(IVisitorWithAdditions visitor) {
    visitor.visitScenarioDescription(this, name, actions, comment, getLocation());
  }

  // === Others ===
  @Override
  public ScenarioDescription clone() {
    String newName = name;
    List<LabelledAction> newActions = actions;
    String newComment = comment;
    return ScenarioDescription.mk(newName, newActions, newComment, getLocation());
  }

  @Override
  public String toString() {
    return StringUtil.prettyPrint(this);
  }
}

