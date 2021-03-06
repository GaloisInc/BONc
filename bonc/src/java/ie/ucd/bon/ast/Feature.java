
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

public class Feature extends AstNode {



  public final List<FeatureSpecification> featureSpecifications;
  public final List<ClassName> selectiveExport;
  public final String comment;


  // === Constructors and Factories ===
  protected Feature(List<FeatureSpecification> featureSpecifications, List<ClassName> selectiveExport, String comment, SourceLocation location) {
    super(location);
    this.featureSpecifications = featureSpecifications; assert featureSpecifications != null;
    this.selectiveExport = selectiveExport; 
    this.comment = comment; 
  }

  public static Feature mk(List<FeatureSpecification> featureSpecifications, List<ClassName> selectiveExport, String comment, SourceLocation location) {
    return new Feature(featureSpecifications, selectiveExport, comment, location);
  }

  // === Accessors ===

  public List<FeatureSpecification> getFeatureSpecifications() { return featureSpecifications; }
  public List<ClassName> getSelectiveExport() { return selectiveExport; }
  public String getComment() { return comment; }

  // === Visitor ===
  public void accept(IVisitorWithAdditions visitor) {
    visitor.visitFeature(this, featureSpecifications, selectiveExport, comment, getLocation());
  }

  // === Others ===
  @Override
  public Feature clone() {
    List<FeatureSpecification> newFeatureSpecifications = featureSpecifications;
    List<ClassName> newSelectiveExport = selectiveExport;
    String newComment = comment;
    return Feature.mk(newFeatureSpecifications, newSelectiveExport, newComment, getLocation());
  }

  @Override
  public String toString() {
    return StringUtil.prettyPrint(this);
  }
}

