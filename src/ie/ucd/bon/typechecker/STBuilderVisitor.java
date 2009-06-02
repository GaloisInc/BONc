package ie.ucd.bon.typechecker;

import ie.ucd.bon.ast.AbstractVisitor;
import ie.ucd.bon.ast.BONType;
import ie.ucd.bon.ast.ClassInterface;
import ie.ucd.bon.ast.Clazz;
import ie.ucd.bon.ast.Cluster;
import ie.ucd.bon.ast.Expression;
import ie.ucd.bon.ast.Feature;
import ie.ucd.bon.ast.FormalGeneric;
import ie.ucd.bon.ast.IVisitor;
import ie.ucd.bon.ast.Indexing;
import ie.ucd.bon.ast.StaticComponent;
import ie.ucd.bon.ast.Clazz.Mod;
import ie.ucd.bon.errorreporting.Problems;
import ie.ucd.bon.source.SourceLocation;
import ie.ucd.bon.typechecker.errors.DuplicateClassDefinitionError;
import ie.ucd.bon.typechecker.errors.DuplicateClusterDefinitionError;
import ie.ucd.bon.typechecker.errors.NameNotUniqueError;

import java.util.List;

public class STBuilderVisitor extends AbstractVisitor implements IVisitor {

  private final BONST st;
  private final Problems problems;
  private final VisitorContext context;

  public STBuilderVisitor() {
    st = new BONST();
    problems = new Problems();
    context = new VisitorContext();
  }

  public BONST getSt() {
    return st;
  }

  public Problems getProblems() {
    return problems;
  }

  @Override
  public void visitClazz(Clazz node, String name, List<FormalGeneric> generics,
      Mod mod, ClassInterface classInterface, Boolean reused,
      Boolean persistent, Boolean interfaced, String comment, SourceLocation loc) {
    Clazz clazz = st.classes.get(name);
    Cluster cluster = st.clusters.get(name);
    
    if (cluster != null) {
      problems.addProblem(new NameNotUniqueError(loc, "Class", name, "cluster", cluster.getLocation()));  
    } else if (clazz != null) {
      problems.addProblem(new DuplicateClassDefinitionError(loc, clazz));
    } else {
      st.classes.put(name, node);
      
      context.clazz = node;
      classInterface.accept(this);
      context.clazz = null;      
    }
  }

  @Override
  public void visitCluster(Cluster node, String name,
      List<StaticComponent> components, Boolean reused, String comment, SourceLocation loc) {
    Clazz clazz = st.classes.get(name);
    Cluster cluster = st.clusters.get(name);
    
    if (clazz != null) {
      problems.addProblem(new NameNotUniqueError(loc, "Cluster", name, "class", clazz.getLocation()));  
    } else if (cluster != null) {
      problems.addProblem(new DuplicateClusterDefinitionError(loc, cluster));
    } else {
      st.clusters.put(name, node);
    }
    
  }

  @Override
  public void visitClassInterface(ClassInterface node, List<Feature> features,
      List<BONType> parents, List<Expression> invariant, Indexing indexing,
      SourceLocation loc) {
    
    for (BONType parent : parents) {
      st.classInheritanceGraph.addEdge(context.clazz.getName(), parent);
      st.simpleClassInheritanceGraph.addEdge(context.clazz.getName(), parent.getIdentifier());
    }
    
    st.indexing.put(context.clazz, indexing);
  }



}