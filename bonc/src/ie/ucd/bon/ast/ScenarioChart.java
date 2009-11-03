
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

public class ScenarioChart extends InformalChart {


  public final Indexing indexing;

  public final String systemName;
  public final List<ScenarioEntry> entries;
  public final String explanation;
  public final String part;


  // === Constructors and Factories ===
  protected ScenarioChart(String systemName, List<ScenarioEntry> entries, Indexing indexing, String explanation, String part, SourceLocation location) {
    super(location);
    this.systemName = systemName; assert systemName != null;
    this.entries = entries; assert entries != null;
    this.indexing = indexing; 
    this.explanation = explanation; 
    this.part = part; 
  }

  public static ScenarioChart mk(String systemName, List<ScenarioEntry> entries, Indexing indexing, String explanation, String part, SourceLocation location) {
    return new ScenarioChart(systemName, entries, indexing, explanation, part, location);
  }

  // === Accessors ===

  public String getSystemName() { return systemName; }
  public List<ScenarioEntry> getEntries() { return entries; }
  public Indexing getIndexing() { return indexing; }
  public String getExplanation() { return explanation; }
  public String getPart() { return part; }

  // === Visitor ===
  public void accept(IVisitorWithAdditions visitor) {
    visitor.visitScenarioChart(this, systemName, entries, indexing, explanation, part, getLocation());
  }

  // === Others ===
  @Override
  public ScenarioChart clone() {
    String newSystemName = systemName;
    List<ScenarioEntry> newEntries = entries;
    Indexing newIndexing = indexing == null ? null : indexing.clone();
    String newExplanation = explanation;
    String newPart = part;
    return ScenarioChart.mk(newSystemName, newEntries, newIndexing, newExplanation, newPart, getLocation());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("ScenarioChart ast node: ");
    sb.append("systemName = ");
    sb.append(systemName);
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
      sb.delete(sb.length()-2, sb.length());
    }
    return sb.toString();
  }
}

