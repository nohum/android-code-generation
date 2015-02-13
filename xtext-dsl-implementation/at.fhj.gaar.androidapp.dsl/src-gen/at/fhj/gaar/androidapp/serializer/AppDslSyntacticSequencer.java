package at.fhj.gaar.androidapp.serializer;

import at.fhj.gaar.androidapp.services.AppDslGrammarAccess;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class AppDslSyntacticSequencer extends AbstractSyntacticSequencer {

	protected AppDslGrammarAccess grammarAccess;
	protected AbstractElementAlias match_PackageName___FullStopKeyword_1_1_0_IDTerminalRuleCall_1_1_1__a;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (AppDslGrammarAccess) access;
		match_PackageName___FullStopKeyword_1_1_0_IDTerminalRuleCall_1_1_1__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getPackageNameAccess().getFullStopKeyword_1_1_0()), new TokenAlias(false, false, grammarAccess.getPackageNameAccess().getIDTerminalRuleCall_1_1_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getIDRule())
			return getIDToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getSpacerRule())
			return getSpacerToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal ID  		: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	 */
	protected String getIDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * Spacer:
	 * 	'spacer'
	 * ;
	 */
	protected String getSpacerToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "spacer";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_PackageName___FullStopKeyword_1_1_0_IDTerminalRuleCall_1_1_1__a.equals(syntax))
				emit_PackageName___FullStopKeyword_1_1_0_IDTerminalRuleCall_1_1_1__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ('.' ID)*
	 */
	protected void emit_PackageName___FullStopKeyword_1_1_0_IDTerminalRuleCall_1_1_1__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
