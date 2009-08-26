package ie.ucd.bon.ast;

import ie.ucd.bon.source.SourceLocation;

public class CompactedIndirectionElementImpl extends
    CompactedIndirectionElement {

  public CompactedIndirectionElementImpl(SourceLocation location) {
    super(location);
  }

  public static CompactedIndirectionElementImpl mk(SourceLocation location) {
    return new CompactedIndirectionElementImpl(location);
  }
  
  @Override
  public CompactedIndirectionElement clone() {
    return new CompactedIndirectionElementImpl(getLocation());
  }

  @Override
  public void accept(IVisitorWithAdditions visitor) {
    visitor.visitCompactedIndirectionElement(this, getLocation());
  }

}
