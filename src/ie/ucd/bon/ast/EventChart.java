
/**
  This class is generated automatically from normal_classes.tpl. 
  Do not edit.
 */
package ie.ucd.bon.ast;

import java.util.List;
import ie.ucd.bon.source.SourceLocation;
import ie.ucd.bon.ast.AstNode;

public class EventChart extends InformalChart {


  private final Indexing indexing;

  private final String systemName;
  private final Boolean incoming;
  private final Boolean outgoing;
  private final List<EventEntry> entries;
  private final String explanation;
  private final String part;

private final SourceLocation location;

  // === Constructors and Factories ===
  protected EventChart(String systemName, Boolean incoming, Boolean outgoing, List<EventEntry> entries, Indexing indexing, String explanation, String part) {
    this(systemName,incoming,outgoing,entries,indexing,explanation,part, null);    
  }

  protected EventChart(String systemName, Boolean incoming, Boolean outgoing, List<EventEntry> entries, Indexing indexing, String explanation, String part, SourceLocation location) {
    
    assert location != null;
    this.location = location;
    this.systemName = systemName; assert systemName != null;
    this.incoming = incoming; assert incoming != null;
    this.outgoing = outgoing; assert outgoing != null;
    this.entries = entries; assert entries != null;
    this.indexing = indexing; 
    this.explanation = explanation; 
    this.part = part; 
    
  }
  
  public static EventChart mk(String systemName, Boolean incoming, Boolean outgoing, List<EventEntry> entries, Indexing indexing, String explanation, String part) {
    return new EventChart(systemName, incoming, outgoing, entries, indexing, explanation, part);
  }

  public static EventChart mk(String systemName, Boolean incoming, Boolean outgoing, List<EventEntry> entries, Indexing indexing, String explanation, String part, SourceLocation location) {
    return new EventChart(systemName, incoming, outgoing, entries, indexing, explanation, part, location);
  }

  // === Accessors ===

  public String getSystemName() { return systemName; }
  public Boolean getIncoming() { return incoming; }
  public Boolean getOutgoing() { return outgoing; }
  public List<EventEntry> getEntries() { return entries; }
  public Indexing getIndexing() { return indexing; }
  public String getExplanation() { return explanation; }
  public String getPart() { return part; }

  // === Others ===
  @Override
  public EventChart clone() {
    String newSystemName = systemName;
    Boolean newIncoming = incoming;
    Boolean newOutgoing = outgoing;
    List<EventEntry> newEntries = entries;
    Indexing newIndexing = indexing == null ? null : indexing.clone();
    String newExplanation = explanation;
    String newPart = part;
    
    return EventChart.mk(newSystemName, newIncoming, newOutgoing, newEntries, newIndexing, newExplanation, newPart, location);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("EventChart ast node: ");
    
    sb.append("systemName = ");
    sb.append(systemName);
    sb.append(", ");
    
    sb.append("incoming = ");
    sb.append(incoming);
    sb.append(", ");
    
    sb.append("outgoing = ");
    sb.append(outgoing);
    sb.append(", ");
    
    sb.append("entries = ");
    sb.append(entries);
    sb.append(", ");
    
    sb.append("indexing = ");
    sb.append(indexing);
    sb.append(", ");
    
    sb.append("explanation = ");
    sb.append(explanation);
    sb.append(", ");
    
    sb.append("part = ");
    sb.append(part);
    sb.append(", ");
    
    if (sb.length() >= 2) {
      sb.delete(sb.length()-2,sb.length());
    }
    return sb.toString();
  }
}
