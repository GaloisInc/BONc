
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

public class ObjectInstance extends DynamicComponent {


  public final ObjectName name;

  public final String comment;


  // === Constructors and Factories ===
  protected ObjectInstance(ObjectName name, String comment, SourceLocation location) {
    super(location);
    this.name = name; assert name != null;
    this.comment = comment; 
  }

  public static ObjectInstance mk(ObjectName name, String comment, SourceLocation location) {
    return new ObjectInstance(name, comment, location);
  }

  // === Accessors ===

  public ObjectName getName() { return name; }
  public String getComment() { return comment; }

  // === Visitor ===
  public void accept(IVisitorWithAdditions visitor) {
    visitor.visitObjectInstance(this, name, comment, getLocation());
  }

  // === Others ===
  @Override
  public ObjectInstance clone() {
    ObjectName newName = name == null ? null : name.clone();
    String newComment = comment;
    return ObjectInstance.mk(newName, newComment, getLocation());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("ObjectInstance ast node: ");
    sb.append("name = ");
    sb.append(name);
    sb.append(", ");
        sb.append("comment = ");
    sb.append(comment);
    sb.append(", ");
    if (sb.length() >= 2) {
      sb.delete(sb.length()-2, sb.length());
    }
    return sb.toString();
  }
}

