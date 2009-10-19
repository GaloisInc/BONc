/**
 * Copyright (c) 2007-2009, Fintan Fairmichael, University College Dublin under the BSD licence.
 * See LICENCE.TXT for details.
 */
package ie.ucd.bon.graph;

import ie.ucd.bon.Main;
import ie.ucd.bon.parser.tracker.ParsingTracker;

public class Grapher {

  private static final String NEW_LINE = System.getProperty("line.separator");
  private static void appendLine(final StringBuilder sb) {
    sb.append(NEW_LINE);
  }
  private static void appendLine(final String line, final StringBuilder sb) {
    sb.append(line);
    sb.append(NEW_LINE);
  }


  public static String graphInformalClassInheritance(final ParsingTracker parseTracker) {
    Main.logDebug("Printing informal class inheritance graph");
    StringBuilder sb = new StringBuilder();

    //TODO fix!

    //InformalTypingInformation informalTypingInfo = parseTracker.getInformalTypingInformation();

//    printGraphName(informalTypingInfo, sb);
//
//    Graph<String,String> classInheritanceGraph = informalTypingInfo.getClassInheritanceGraph();
//
//    printInformalClasses(informalTypingInfo, sb);

//    appendLine("//Class inheritance links", sb);
//    for (String subclassName : classInheritanceGraph.keys()) {
//      for (String parentClassName : classInheritanceGraph.get(subclassName)) {
//        printClassInheritanceLink(subclassName, parentClassName, sb);
//      }
//    }
//    appendLine(sb);
//
//    appendLine("}", sb);
    return sb.toString();
  }

  public static String graphInformalClusterContainment(final ParsingTracker parseTracker) {
    StringBuilder sb = new StringBuilder();
    //TODO fix!
    //InformalTypingInformation informalTypingInfo = parseTracker.getInformalTypingInformation();

//    printGraphName(informalTypingInfo, sb);
//
//    Graph<String,ClusterChartDefinition> classClusterGraph = informalTypingInfo.getClassClusterGraph();
//    Graph<String,ClusterChartDefinition> clusterClusterGraph = informalTypingInfo.getClusterClusterGraph();
//    Set<String> clustersInSystem = informalTypingInfo.getClustersInSystem();
//
//    printInformalClasses(informalTypingInfo, sb);
//    printInformalClusters(informalTypingInfo, sb);
//
//    ClusterChartDefinition sysDef = informalTypingInfo.getSystem();
//    if (sysDef != null) {
//      String systemName = sysDef.getName();
//      if (systemName != null) {
//        printSystemNode(systemName, sb);
//        appendLine("//Cluster-system links", sb);
//        for (String clusterName : clustersInSystem) {
//          printClusterSystemLink(clusterName, systemName, sb);
//        }
//        appendLine(sb);
//      }
//    }
//
//    appendLine("//Cluster-cluster links", sb);
//    for (String clusterName : clusterClusterGraph.keys()) {
//      Collection<ClusterChartDefinition> containingClusters = clusterClusterGraph.get(clusterName);
//      for (ClusterChartDefinition containingCluster : containingClusters) {
//        printClusterClusterLink(clusterName, containingCluster, sb);
//      }
//    }
//    appendLine(sb);
//
//    appendLine("//Class-cluster links", sb);
//    for (String className : classClusterGraph.keys()) {
//      Collection<ClusterChartDefinition> containingClusters = classClusterGraph.get(className);
//      for (ClusterChartDefinition containingCluster : containingClusters) {
//        printClassClusterLink(className, containingCluster, sb);
//      }
//    }
//    appendLine(sb);
//
//    appendLine("}", sb);
    return sb.toString();
  }
/*
  private static void printSystemNode(String systemName, StringBuilder sb) {
    appendLine("//System", sb);
    String comment = "System: " + systemName;
    //TODO Change shape for system?
    appendLine("\"" + systemName + "\" [shape=box,comment=\"" + comment + "\"];", sb);
    appendLine(sb);
  }

  private static void printInformalClasses(InformalTypingInformation informalTypingInfo, StringBuilder sb) {
    Map<String, ClassChartDefinition> classes = informalTypingInfo.getClasses();

    appendLine("//Classes", sb);
    for (ClassChartDefinition classDef : classes.values()) {
      printClass(classDef, sb);
    }
    appendLine(sb);
  }

  private static void printInformalClusters(InformalTypingInformation informalTypingInfo, StringBuilder sb) {
    Map<String, ClusterChartDefinition> clusters = informalTypingInfo.getClusters();

    appendLine("//Clusters", sb);
    for (ClusterChartDefinition clusterDef : clusters.values()) {
      printCluster(clusterDef, sb);
    }
    appendLine(sb);
  }

  private static void printCluster(final ClusterChartDefinition cluster, final StringBuilder sb) {
    String comment = "Cluster: " + cluster.getName();
    appendLine("\"" + cluster.getName() + "\" [shape=box,comment=\"" + comment + "\"];", sb);
  }

  private static void printClass(final ClassChartDefinition classDef, final StringBuilder sb) {
    String comment = "Class: " + classDef.getName();
    appendLine("\"" + classDef.getName() + "\" [shape=octagon,comment=\"" + comment + "\"];", sb);
  }

  private static void printClassClusterLink(final String className, final ClusterChartDefinition cluster, final StringBuilder sb) {
    appendLine("\"" + cluster.getName() + "\" -> \"" + className + "\";", sb);
  }

  private static void printClusterClusterLink(final String childClusterName, final ClusterChartDefinition parentCluster, final StringBuilder sb) {
    appendLine("\"" + parentCluster.getName() + "\" -> \"" + childClusterName + "\";", sb);
  }

  private static void printClusterSystemLink(final String clusterName, final String systemName, final StringBuilder sb) {
    appendLine("\"" + systemName + "\" -> \"" + clusterName + "\";", sb);
  }

  private static void printClassInheritanceLink(final String child, final String parent, final StringBuilder sb) {
    appendLine("\"" + parent + "\" -> \"" + child + "\";", sb);
  }

  private static void printGraphName(InformalTypingInformation iti, StringBuilder sb) {
    String graphName;
    ClusterChartDefinition sysDef = iti.getSystem();
    if (sysDef == null) {
      graphName = "System";
    } else {
      graphName = "System: " + sysDef.getName();
    }
    appendLine("digraph \"" + graphName + "\" {", sb);
    appendLine(sb);
  }

  public static String graphPrefuseInformalClusterContainment(ParsingTracker parseTracker) {
    //Output
    StringWriter sw = new StringWriter();
    XMLWriter xw = new XMLWriter(sw);
//TODO fix!
    //Relevant collected data
//    InformalTypingInformation informalTypingInfo = parseTracker.getInformalTypingInformation();
//    Graph<String,String> reverseClassClusterGraph = informalTypingInfo.getReverseClassClusterGraph();
//    Graph<String,String> reverseClusterClusterGraph = informalTypingInfo.getReverseClusterClusterGraph();
//    Set<String> clustersInSystem = informalTypingInfo.getClustersInSystem();
//
//    try {
//      //Start xml
//      xw.writeEntity("tree");
//      xw.writeEntity("declarations");
//
//      xw.writeEntity("attributeDecl");
//      xw.writeAttribute("name", "name");
//      xw.writeAttribute("type", "String");
//      xw.endEntity(); //attributeDecl
//
//      xw.writeEntity("attributeDecl");
//      xw.writeAttribute("name", "cluster");
//      xw.writeAttribute("type", "Boolean");
//      xw.endEntity(); //attributeDecl
//
//      xw.writeEntity("attributeDecl");
//      xw.writeAttribute("name", "class");
//      xw.writeAttribute("type", "Boolean");
//      xw.endEntity(); //attributeDecl
//
//      xw.writeEntity("attributeDecl");
//      xw.writeAttribute("name", "system");
//      xw.writeAttribute("type", "Boolean");
//      xw.endEntity(); //attributeDecl
//
//      xw.endEntity(); //declarations
//
//      //Top-level branch/system node
//      xw.writeEntity("branch");
//
//      ClusterChartDefinition sysDef = informalTypingInfo.getSystem();
//      if (sysDef == null) {
//        printPrefuseAttribute("name", "Unnamed System", xw);
//      } else {
//        printPrefuseAttribute("name", sysDef.getName(), xw);
//      }
//      printPrefuseAttribute("system", "true", xw);
//
//      clustersInSystem = new TreeSet<String>(clustersInSystem);
//      for (String clusterName : clustersInSystem) {
//        printPrefuseCluster(clusterName, reverseClusterClusterGraph, reverseClassClusterGraph, xw);
//      }
//
//      xw.endEntity(); //system node/top-level branch
//
//      xw.endEntity(); //tree
//      xw.close();
      return sw.toString();
//    } catch (IOException ioe) {
//      Main.logDebug("IOException while writing XML: " + ioe);
//      return "";
//    }
  }

  private static void printPrefuseCluster(String clusterName, Graph<String,String> reverseClusterClusterGraph, Graph<String,String> reverseClassClusterGraph, XMLWriter xw) throws IOException {

    Collection<String> clusters = reverseClusterClusterGraph.get(clusterName);
    Collection<String> classes = reverseClassClusterGraph.get(clusterName);

    if (clusters != null || classes != null) {
      xw.writeEntity("branch");

      printPrefuseAttribute("name", clusterName, xw);
      printPrefuseAttribute("cluster", "true", xw);

      if (clusters != null) {
        clusters = new TreeSet<String>(clusters);
        for (String childClusterName : clusters) {
          printPrefuseCluster(childClusterName, reverseClusterClusterGraph, reverseClassClusterGraph, xw);
        }
      }
      if (classes != null) {
        classes = new TreeSet<String>(classes);
        for (String childClassName : classes) {
          printPrefuseClass(childClassName, xw);
        }
      }
      xw.endEntity(); //branch
    } else {
      xw.writeEntity("leaf");
      printPrefuseAttribute("name", clusterName, xw);
      printPrefuseAttribute("cluster", "true", xw);
      xw.endEntity(); //leaf
    }

  }

  private static void printPrefuseClass(String className, XMLWriter xw) throws IOException {
    xw.writeEntity("leaf");
    printPrefuseAttribute("name", className, xw);
    printPrefuseAttribute("class", "true", xw);
    xw.endEntity(); //leaf
  }

  private static void printPrefuseAttribute(String name, String value, XMLWriter xw) throws IOException {
    xw.writeEntity("attribute");
    xw.writeAttribute("name", name);
    xw.writeAttribute("value", value);
    xw.endEntity();
  }

  public static String graphPrefuseInformalInheritance(ParsingTracker parseTracker) {
  //Output
    StringWriter sw = new StringWriter();
    XMLWriter xw = new XMLWriter(sw);
//TODO fix!
    //Relevant collected data
//    InformalTypingInformation informalTypingInfo = parseTracker.getInformalTypingInformation();
//    Set<String> classes = informalTypingInfo.getClasses().keySet();
//    Graph<String,String> inheritanceGraph = informalTypingInfo.getClassInheritanceGraph();
//    Graph<String,String> reverseInheritanceGraph = informalTypingInfo.getReverseClassInheritanceGraph();
//    Set<String> topLevel = new TreeSet<String>();
//
//    for (String className : classes) {
//      if (!inheritanceGraph.containsKey(className)) {
//        topLevel.add(className);
//      }
//    }
//
//    try {
//      //Start xml
//      xw.writeEntity("tree");
//      xw.writeEntity("declarations");
//
//      xw.writeEntity("attributeDecl");
//      xw.writeAttribute("name", "name");
//      xw.writeAttribute("type", "String");
//      xw.endEntity(); //attributeDecl
//
//      xw.writeEntity("attributeDecl");
//      xw.writeAttribute("name", "class");
//      xw.writeAttribute("type", "Boolean");
//      xw.endEntity(); //attributeDecl
//
//      xw.endEntity(); //declarations
//
//      //Top-level branch/system node
//      xw.writeEntity("branch");
//
//
//      printPrefuseAttribute("name", "BOTTOM", xw);
//
//      for (String className : topLevel) {
//        printPrefuseClassWithInheritance(className, reverseInheritanceGraph, xw);
//      }
//
//      xw.endEntity(); //system node/top-level branch
//
//      xw.endEntity(); //tree
//      xw.close();
      return sw.toString();
//    } catch (IOException ioe) {
//      Main.logDebug("IOException while writing XML: " + ioe);
//      return "";
//    }
  }

  private static void printPrefuseClassWithInheritance(String className, Graph<String,String> reverseInheritanceGraph, XMLWriter xw) throws IOException {

    Collection<String> subclasses = reverseInheritanceGraph.get(className);

    if (subclasses != null && subclasses.size() > 0) {
      xw.writeEntity("branch");

      printPrefuseAttribute("name", className, xw);
      printPrefuseAttribute("class", "true", xw);

      for (String subclassName : subclasses) {
        printPrefuseClassWithInheritance(subclassName, reverseInheritanceGraph, xw);
      }
      xw.endEntity(); //branch
    } else {
      xw.writeEntity("leaf");
      printPrefuseAttribute("name", className, xw);
      printPrefuseAttribute("class", "true", xw);
      xw.endEntity(); //leaf
    }
  }
  */

}
