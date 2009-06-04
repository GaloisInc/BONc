
/** 
  This file is generated from abstract_visitor.tpl. Do not edit.
 */
package ie.ucd.bon.ast;

import java.util.List;
import ie.ucd.bon.source.SourceLocation;

public interface IVisitor {



  void visitBinaryExp(BinaryExp node, BinaryExp.Op op , Expression left , Expression right , SourceLocation loc);

  void visitBonSourceFile(BonSourceFile node, List<SpecificationElement> bonSpecification , Indexing indexing , SourceLocation loc);

  void visitBooleanConstant(BooleanConstant node, Boolean value , SourceLocation loc);

  void visitCallExp(CallExp node, Expression qualifier , List<UnqualifiedCall> callChain , SourceLocation loc);

  void visitCharacterConstant(CharacterConstant node, Character value , SourceLocation loc);

  void visitCharacterInterval(CharacterInterval node, Character start , Character stop , SourceLocation loc);

  void visitClassChart(ClassChart node, String name , List<String> inherits , List<String> queries , List<String> commands , List<String> constraints , Indexing indexing , String explanation , String part , SourceLocation loc);

  void visitClassDictionary(ClassDictionary node, String systemName , List<DictionaryEntry> entries , Indexing indexing , String explanation , String part , SourceLocation loc);

  void visitClassEntry(ClassEntry node, String name , String description , SourceLocation loc);

  void visitClassInterface(ClassInterface node, List<Feature> features , List<BONType> parents , List<Expression> invariant , Indexing indexing , SourceLocation loc);

  void visitClassName(ClassName node, String name , SourceLocation loc);

  void visitClazz(Clazz node, String name , List<FormalGeneric> generics , Clazz.Mod mod , ClassInterface classInterface , Boolean reused , Boolean persistent , Boolean interfaced , String comment , SourceLocation loc);

  void visitClientEntityList(ClientEntityList node, List<ClientEntity> entities , SourceLocation loc);

  void visitClientRelation(ClientRelation node, BONType client , BONType supplier , ClientEntityExpression clientEntities , TypeMark typeMark , String semanticLabel , SourceLocation loc);

  void visitCluster(Cluster node, String name , List<StaticComponent> components , Boolean reused , String comment , SourceLocation loc);

  void visitClusterChart(ClusterChart node, String name , Boolean isSystem , List<ClassEntry> classes , List<ClusterEntry> clusters , Indexing indexing , String explanation , String part , SourceLocation loc);

  void visitClusterEntry(ClusterEntry node, String name , String description , SourceLocation loc);

  void visitContractClause(ContractClause node, List<Expression> preconditions , List<Expression> postconditions , SourceLocation loc);

  void visitCreationChart(CreationChart node, String name , List<CreationEntry> entries , Indexing indexing , String explanation , String part , SourceLocation loc);

  void visitCreationEntry(CreationEntry node, String name , List<String> types , SourceLocation loc);

  void visitDictionaryEntry(DictionaryEntry node, String name , List<String> clusters , String description , SourceLocation loc);

  void visitDynamicDiagram(DynamicDiagram node, List<DynamicComponent> components , String extendedId , String comment , SourceLocation loc);

  void visitEventChart(EventChart node, String systemName , Boolean incoming , Boolean outgoing , List<EventEntry> entries , Indexing indexing , String explanation , String part , SourceLocation loc);

  void visitEventEntry(EventEntry node, String name , List<String> involved , SourceLocation loc);

  void visitFeature(Feature node, List<FeatureSpecification> featureSpecifications , List<String> selectiveExport , String comment , SourceLocation loc);

  void visitFeatureArgument(FeatureArgument node, String identifier , BONType type , SourceLocation loc);

  void visitFeatureSpecification(FeatureSpecification node, FeatureSpecification.Modifier modifier , List<String> featureNames , List<FeatureArgument> arguments , ContractClause contracts , HasType hasType , RenameClause renaming , String comment , SourceLocation loc);

  void visitFormalGeneric(FormalGeneric node, String identifier , BONType type , SourceLocation loc);

  void visitGenericIndirection(GenericIndirection node, String indirectionElement , SourceLocation loc);

  void visitHasType(HasType node, TypeMark mark , BONType type , SourceLocation loc);

  void visitIndexClause(IndexClause node, String id , List<String> indexTerms , SourceLocation loc);

  void visitIndexing(Indexing node, List<IndexClause> indexes , SourceLocation loc);

  void visitIndirectionFeatureList(IndirectionFeatureList node, List<FeatureName> featureNames , SourceLocation loc);

  void visitInheritanceRelation(InheritanceRelation node, BONType child , BONType parent , Multiplicity multiplicity , String semanticLabel , SourceLocation loc);

  void visitIntegerConstant(IntegerConstant node, Integer value , SourceLocation loc);

  void visitIntegerInterval(IntegerInterval node, Integer start , Integer stop , SourceLocation loc);

  void visitKeywordConstant(KeywordConstant node, KeywordConstant.Constant constant , SourceLocation loc);

  void visitLabelledAction(LabelledAction node, String label , String description , SourceLocation loc);

  void visitMemberRange(MemberRange node, List<String> identifiers , Expression expression , SourceLocation loc);

  void visitMultiplicity(Multiplicity node, Integer multiplicity , SourceLocation loc);

  void visitNamedIndirection(NamedIndirection node, String className , List<IndirectionElement> indirectionElements , SourceLocation loc);

  void visitObjectGroup(ObjectGroup node, ObjectGroup.Nameless nameless , String name , List<DynamicComponent> components , String comment , SourceLocation loc);

  void visitObjectInstance(ObjectInstance node, ObjectName name , String comment , SourceLocation loc);

  void visitObjectName(ObjectName node, String className , String extendedId , SourceLocation loc);

  void visitObjectStack(ObjectStack node, ObjectName name , String comment , SourceLocation loc);

  void visitParentIndirection(ParentIndirection node, GenericIndirection genericIndirection , SourceLocation loc);

  void visitQuantification(Quantification node, Quantification.Quantifier quantifier , List<VariableRange> variableRanges , Expression restriction , Expression proposition , SourceLocation loc);

  void visitRealConstant(RealConstant node, Double value , SourceLocation loc);

  void visitRenameClause(RenameClause node, String className , String featureName , SourceLocation loc);

  void visitScenarioChart(ScenarioChart node, String systemName , List<ScenarioEntry> entries , Indexing indexing , String explanation , String part , SourceLocation loc);

  void visitScenarioDescription(ScenarioDescription node, String name , List<LabelledAction> actions , String comment , SourceLocation loc);

  void visitScenarioEntry(ScenarioEntry node, String name , String description , SourceLocation loc);

  void visitSetConstant(SetConstant node, List<EnumerationElement> enumerations , SourceLocation loc);

  void visitStaticDiagram(StaticDiagram node, List<StaticComponent> components , String extendedId , String comment , SourceLocation loc);

  void visitStringConstant(StringConstant node, String value , SourceLocation loc);

  void visitSupplierIndirection(SupplierIndirection node, IndirectionFeaturePart indirectionFeaturePart , GenericIndirection genericIndirection , SourceLocation loc);

  void visitType(Type node, String identifier , List<BONType> actualGenerics , String fullString , SourceLocation loc);

  void visitTypeMark(TypeMark node, TypeMark.Mark mark , Integer multiplicity , SourceLocation loc);

  void visitTypeRange(TypeRange node, List<String> identifiers , BONType type , SourceLocation loc);

  void visitUnaryExp(UnaryExp node, UnaryExp.Op op , Expression expression , SourceLocation loc);

  void visitUnqualifiedCall(UnqualifiedCall node, String id , List<Expression> args , SourceLocation loc);

}