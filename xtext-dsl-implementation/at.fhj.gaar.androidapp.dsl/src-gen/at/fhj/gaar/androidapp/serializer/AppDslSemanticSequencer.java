package at.fhj.gaar.androidapp.serializer;

import at.fhj.gaar.androidapp.appDsl.ActionShowToast;
import at.fhj.gaar.androidapp.appDsl.ActionStartActivity;
import at.fhj.gaar.androidapp.appDsl.ActionStartService;
import at.fhj.gaar.androidapp.appDsl.Activity;
import at.fhj.gaar.androidapp.appDsl.ActivityLayoutAttribute;
import at.fhj.gaar.androidapp.appDsl.ActivityParentAttribute;
import at.fhj.gaar.androidapp.appDsl.AndroidAppProject;
import at.fhj.gaar.androidapp.appDsl.AppDslPackage;
import at.fhj.gaar.androidapp.appDsl.Application;
import at.fhj.gaar.androidapp.appDsl.ApplicationCompileSdk;
import at.fhj.gaar.androidapp.appDsl.ApplicationElementList;
import at.fhj.gaar.androidapp.appDsl.ApplicationMainActivity;
import at.fhj.gaar.androidapp.appDsl.ApplicationMinSdk;
import at.fhj.gaar.androidapp.appDsl.ApplicationPermissionList;
import at.fhj.gaar.androidapp.appDsl.ApplicationTargetSdk;
import at.fhj.gaar.androidapp.appDsl.BroadcastReceiver;
import at.fhj.gaar.androidapp.appDsl.BroadcastReceiverActionAttribute;
import at.fhj.gaar.androidapp.appDsl.Button;
import at.fhj.gaar.androidapp.appDsl.ButtonActionAttribute;
import at.fhj.gaar.androidapp.appDsl.ButtonLabelAttribute;
import at.fhj.gaar.androidapp.appDsl.ElementEnabledAttribute;
import at.fhj.gaar.androidapp.appDsl.ElementExportedAttribute;
import at.fhj.gaar.androidapp.appDsl.ElementIntentList;
import at.fhj.gaar.androidapp.appDsl.ElementLabelAttribute;
import at.fhj.gaar.androidapp.appDsl.PackageName;
import at.fhj.gaar.androidapp.appDsl.Service;
import at.fhj.gaar.androidapp.appDsl.Text;
import at.fhj.gaar.androidapp.services.AppDslGrammarAccess;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class AppDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private AppDslGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == AppDslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case AppDslPackage.ACTION_SHOW_TOAST:
				if(context == grammarAccess.getActionShowToastRule() ||
				   context == grammarAccess.getBroadcastReceiverActionRule() ||
				   context == grammarAccess.getLayoutElementClickActionRule()) {
					sequence_ActionShowToast(context, (ActionShowToast) semanticObject); 
					return; 
				}
				else break;
			case AppDslPackage.ACTION_START_ACTIVITY:
				if(context == grammarAccess.getActionStartActivityRule() ||
				   context == grammarAccess.getBroadcastReceiverActionRule() ||
				   context == grammarAccess.getLayoutElementClickActionRule()) {
					sequence_ActionStartActivity(context, (ActionStartActivity) semanticObject); 
					return; 
				}
				else break;
			case AppDslPackage.ACTION_START_SERVICE:
				if(context == grammarAccess.getActionStartServiceRule() ||
				   context == grammarAccess.getBroadcastReceiverActionRule() ||
				   context == grammarAccess.getLayoutElementClickActionRule()) {
					sequence_ActionStartService(context, (ActionStartService) semanticObject); 
					return; 
				}
				else break;
			case AppDslPackage.ACTIVITY:
				if(context == grammarAccess.getActivityRule() ||
				   context == grammarAccess.getApplicationElementRule()) {
					sequence_Activity(context, (Activity) semanticObject); 
					return; 
				}
				else break;
			case AppDslPackage.ACTIVITY_LAYOUT_ATTRIBUTE:
				if(context == grammarAccess.getActivityAttributeRule() ||
				   context == grammarAccess.getActivityLayoutAttributeRule()) {
					sequence_ActivityLayoutAttribute(context, (ActivityLayoutAttribute) semanticObject); 
					return; 
				}
				else break;
			case AppDslPackage.ACTIVITY_PARENT_ATTRIBUTE:
				if(context == grammarAccess.getActivityAttributeRule() ||
				   context == grammarAccess.getActivityParentAttributeRule()) {
					sequence_ActivityParentAttribute(context, (ActivityParentAttribute) semanticObject); 
					return; 
				}
				else break;
			case AppDslPackage.ANDROID_APP_PROJECT:
				if(context == grammarAccess.getAndroidAppProjectRule()) {
					sequence_AndroidAppProject(context, (AndroidAppProject) semanticObject); 
					return; 
				}
				else break;
			case AppDslPackage.APPLICATION:
				if(context == grammarAccess.getApplicationRule()) {
					sequence_Application(context, (Application) semanticObject); 
					return; 
				}
				else break;
			case AppDslPackage.APPLICATION_COMPILE_SDK:
				if(context == grammarAccess.getApplicationAttributeRule() ||
				   context == grammarAccess.getApplicationCompileSdkRule()) {
					sequence_ApplicationCompileSdk(context, (ApplicationCompileSdk) semanticObject); 
					return; 
				}
				else break;
			case AppDslPackage.APPLICATION_ELEMENT_LIST:
				if(context == grammarAccess.getApplicationAttributeRule() ||
				   context == grammarAccess.getApplicationElementListRule()) {
					sequence_ApplicationElementList(context, (ApplicationElementList) semanticObject); 
					return; 
				}
				else break;
			case AppDslPackage.APPLICATION_MAIN_ACTIVITY:
				if(context == grammarAccess.getApplicationAttributeRule() ||
				   context == grammarAccess.getApplicationMainActivityRule()) {
					sequence_ApplicationMainActivity(context, (ApplicationMainActivity) semanticObject); 
					return; 
				}
				else break;
			case AppDslPackage.APPLICATION_MIN_SDK:
				if(context == grammarAccess.getApplicationAttributeRule() ||
				   context == grammarAccess.getApplicationMinSdkRule()) {
					sequence_ApplicationMinSdk(context, (ApplicationMinSdk) semanticObject); 
					return; 
				}
				else break;
			case AppDslPackage.APPLICATION_PERMISSION_LIST:
				if(context == grammarAccess.getApplicationAttributeRule() ||
				   context == grammarAccess.getApplicationPermissionListRule()) {
					sequence_ApplicationPermissionList(context, (ApplicationPermissionList) semanticObject); 
					return; 
				}
				else break;
			case AppDslPackage.APPLICATION_TARGET_SDK:
				if(context == grammarAccess.getApplicationAttributeRule() ||
				   context == grammarAccess.getApplicationTargetSdkRule()) {
					sequence_ApplicationTargetSdk(context, (ApplicationTargetSdk) semanticObject); 
					return; 
				}
				else break;
			case AppDslPackage.BROADCAST_RECEIVER:
				if(context == grammarAccess.getApplicationElementRule() ||
				   context == grammarAccess.getBroadcastReceiverRule()) {
					sequence_BroadcastReceiver(context, (BroadcastReceiver) semanticObject); 
					return; 
				}
				else break;
			case AppDslPackage.BROADCAST_RECEIVER_ACTION_ATTRIBUTE:
				if(context == grammarAccess.getBroadcastReceiverActionAttributeRule() ||
				   context == grammarAccess.getBroadcastReceiverAttributeRule()) {
					sequence_BroadcastReceiverActionAttribute(context, (BroadcastReceiverActionAttribute) semanticObject); 
					return; 
				}
				else break;
			case AppDslPackage.BUTTON:
				if(context == grammarAccess.getButtonRule() ||
				   context == grammarAccess.getLayoutElementRule()) {
					sequence_Button(context, (Button) semanticObject); 
					return; 
				}
				else break;
			case AppDslPackage.BUTTON_ACTION_ATTRIBUTE:
				if(context == grammarAccess.getButtonActionAttributeRule() ||
				   context == grammarAccess.getButtonAttributeRule()) {
					sequence_ButtonActionAttribute(context, (ButtonActionAttribute) semanticObject); 
					return; 
				}
				else break;
			case AppDslPackage.BUTTON_LABEL_ATTRIBUTE:
				if(context == grammarAccess.getButtonAttributeRule() ||
				   context == grammarAccess.getButtonLabelAttributeRule()) {
					sequence_ButtonLabelAttribute(context, (ButtonLabelAttribute) semanticObject); 
					return; 
				}
				else break;
			case AppDslPackage.ELEMENT_ENABLED_ATTRIBUTE:
				if(context == grammarAccess.getActivityAttributeRule() ||
				   context == grammarAccess.getBroadcastReceiverAttributeRule() ||
				   context == grammarAccess.getElementEnabledAttributeRule() ||
				   context == grammarAccess.getServiceAttributeRule()) {
					sequence_ElementEnabledAttribute(context, (ElementEnabledAttribute) semanticObject); 
					return; 
				}
				else break;
			case AppDslPackage.ELEMENT_EXPORTED_ATTRIBUTE:
				if(context == grammarAccess.getActivityAttributeRule() ||
				   context == grammarAccess.getBroadcastReceiverAttributeRule() ||
				   context == grammarAccess.getElementExportedAttributeRule() ||
				   context == grammarAccess.getServiceAttributeRule()) {
					sequence_ElementExportedAttribute(context, (ElementExportedAttribute) semanticObject); 
					return; 
				}
				else break;
			case AppDslPackage.ELEMENT_INTENT_LIST:
				if(context == grammarAccess.getActivityAttributeRule() ||
				   context == grammarAccess.getBroadcastReceiverAttributeRule() ||
				   context == grammarAccess.getElementIntentListRule() ||
				   context == grammarAccess.getServiceAttributeRule()) {
					sequence_ElementIntentList(context, (ElementIntentList) semanticObject); 
					return; 
				}
				else break;
			case AppDslPackage.ELEMENT_LABEL_ATTRIBUTE:
				if(context == grammarAccess.getActivityAttributeRule() ||
				   context == grammarAccess.getApplicationAttributeRule() ||
				   context == grammarAccess.getBroadcastReceiverAttributeRule() ||
				   context == grammarAccess.getElementLabelAttributeRule() ||
				   context == grammarAccess.getServiceAttributeRule()) {
					sequence_ElementLabelAttribute(context, (ElementLabelAttribute) semanticObject); 
					return; 
				}
				else break;
			case AppDslPackage.PACKAGE_NAME:
				if(context == grammarAccess.getPackageNameRule()) {
					sequence_PackageName(context, (PackageName) semanticObject); 
					return; 
				}
				else break;
			case AppDslPackage.SERVICE:
				if(context == grammarAccess.getApplicationElementRule() ||
				   context == grammarAccess.getServiceRule()) {
					sequence_Service(context, (Service) semanticObject); 
					return; 
				}
				else break;
			case AppDslPackage.TEXT:
				if(context == grammarAccess.getLayoutElementRule() ||
				   context == grammarAccess.getTextRule()) {
					sequence_Text(context, (Text) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     toastText=STRING
	 */
	protected void sequence_ActionShowToast(EObject context, ActionShowToast semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AppDslPackage.Literals.ACTION_SHOW_TOAST__TOAST_TEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AppDslPackage.Literals.ACTION_SHOW_TOAST__TOAST_TEXT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getActionShowToastAccess().getToastTextSTRINGTerminalRuleCall_1_0(), semanticObject.getToastText());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     activity=[Activity|ID]
	 */
	protected void sequence_ActionStartActivity(EObject context, ActionStartActivity semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AppDslPackage.Literals.ACTION_START_ACTIVITY__ACTIVITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AppDslPackage.Literals.ACTION_START_ACTIVITY__ACTIVITY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getActionStartActivityAccess().getActivityActivityIDTerminalRuleCall_1_0_1(), semanticObject.getActivity());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     service=[Service|ID]
	 */
	protected void sequence_ActionStartService(EObject context, ActionStartService semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AppDslPackage.Literals.ACTION_START_SERVICE__SERVICE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AppDslPackage.Literals.ACTION_START_SERVICE__SERVICE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getActionStartServiceAccess().getServiceServiceIDTerminalRuleCall_1_0_1(), semanticObject.getService());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (layoutElements+=LayoutElement layoutElements+=LayoutElement*)
	 */
	protected void sequence_ActivityLayoutAttribute(EObject context, ActivityLayoutAttribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     parent=[Activity|ID]
	 */
	protected void sequence_ActivityParentAttribute(EObject context, ActivityParentAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AppDslPackage.Literals.ACTIVITY_PARENT_ATTRIBUTE__PARENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AppDslPackage.Literals.ACTIVITY_PARENT_ATTRIBUTE__PARENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getActivityParentAttributeAccess().getParentActivityIDTerminalRuleCall_1_0_1(), semanticObject.getParent());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID attributes+=ActivityAttribute attributes+=ActivityAttribute*)
	 */
	protected void sequence_Activity(EObject context, Activity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (applications+=Application applications+=Application*)
	 */
	protected void sequence_AndroidAppProject(EObject context, AndroidAppProject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     compileSdk=INT
	 */
	protected void sequence_ApplicationCompileSdk(EObject context, ApplicationCompileSdk semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AppDslPackage.Literals.APPLICATION_COMPILE_SDK__COMPILE_SDK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AppDslPackage.Literals.APPLICATION_COMPILE_SDK__COMPILE_SDK));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getApplicationCompileSdkAccess().getCompileSdkINTTerminalRuleCall_1_0(), semanticObject.getCompileSdk());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (elements+=ApplicationElement elements+=ApplicationElement*)
	 */
	protected void sequence_ApplicationElementList(EObject context, ApplicationElementList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     launcherActivity=[Activity|ID]
	 */
	protected void sequence_ApplicationMainActivity(EObject context, ApplicationMainActivity semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AppDslPackage.Literals.APPLICATION_MAIN_ACTIVITY__LAUNCHER_ACTIVITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AppDslPackage.Literals.APPLICATION_MAIN_ACTIVITY__LAUNCHER_ACTIVITY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getApplicationMainActivityAccess().getLauncherActivityActivityIDTerminalRuleCall_1_0_1(), semanticObject.getLauncherActivity());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     minSdk=INT
	 */
	protected void sequence_ApplicationMinSdk(EObject context, ApplicationMinSdk semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AppDslPackage.Literals.APPLICATION_MIN_SDK__MIN_SDK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AppDslPackage.Literals.APPLICATION_MIN_SDK__MIN_SDK));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getApplicationMinSdkAccess().getMinSdkINTTerminalRuleCall_1_0(), semanticObject.getMinSdk());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (permissions+=PackageName permissions+=PackageName*)
	 */
	protected void sequence_ApplicationPermissionList(EObject context, ApplicationPermissionList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     targetSdk=INT
	 */
	protected void sequence_ApplicationTargetSdk(EObject context, ApplicationTargetSdk semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AppDslPackage.Literals.APPLICATION_TARGET_SDK__TARGET_SDK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AppDslPackage.Literals.APPLICATION_TARGET_SDK__TARGET_SDK));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getApplicationTargetSdkAccess().getTargetSdkINTTerminalRuleCall_1_0(), semanticObject.getTargetSdk());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=PackageName attributes+=ApplicationAttribute attributes+=ApplicationAttribute*)
	 */
	protected void sequence_Application(EObject context, Application semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     action=BroadcastReceiverAction
	 */
	protected void sequence_BroadcastReceiverActionAttribute(EObject context, BroadcastReceiverActionAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AppDslPackage.Literals.BROADCAST_RECEIVER_ACTION_ATTRIBUTE__ACTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AppDslPackage.Literals.BROADCAST_RECEIVER_ACTION_ATTRIBUTE__ACTION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBroadcastReceiverActionAttributeAccess().getActionBroadcastReceiverActionParserRuleCall_1_0(), semanticObject.getAction());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID attributes+=BroadcastReceiverAttribute attributes+=BroadcastReceiverAttribute*)
	 */
	protected void sequence_BroadcastReceiver(EObject context, BroadcastReceiver semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     action=LayoutElementClickAction
	 */
	protected void sequence_ButtonActionAttribute(EObject context, ButtonActionAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AppDslPackage.Literals.BUTTON_ACTION_ATTRIBUTE__ACTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AppDslPackage.Literals.BUTTON_ACTION_ATTRIBUTE__ACTION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getButtonActionAttributeAccess().getActionLayoutElementClickActionParserRuleCall_1_0(), semanticObject.getAction());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     title=STRING
	 */
	protected void sequence_ButtonLabelAttribute(EObject context, ButtonLabelAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AppDslPackage.Literals.BUTTON_LABEL_ATTRIBUTE__TITLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AppDslPackage.Literals.BUTTON_LABEL_ATTRIBUTE__TITLE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getButtonLabelAttributeAccess().getTitleSTRINGTerminalRuleCall_1_0(), semanticObject.getTitle());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID attributes+=ButtonAttribute attributes+=ButtonAttribute*)
	 */
	protected void sequence_Button(EObject context, Button semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     enabled=BOOLEAN
	 */
	protected void sequence_ElementEnabledAttribute(EObject context, ElementEnabledAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AppDslPackage.Literals.ELEMENT_ENABLED_ATTRIBUTE__ENABLED) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AppDslPackage.Literals.ELEMENT_ENABLED_ATTRIBUTE__ENABLED));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getElementEnabledAttributeAccess().getEnabledBOOLEANTerminalRuleCall_1_0(), semanticObject.isEnabled());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     exported=BOOLEAN
	 */
	protected void sequence_ElementExportedAttribute(EObject context, ElementExportedAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AppDslPackage.Literals.ELEMENT_EXPORTED_ATTRIBUTE__EXPORTED) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AppDslPackage.Literals.ELEMENT_EXPORTED_ATTRIBUTE__EXPORTED));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getElementExportedAttributeAccess().getExportedBOOLEANTerminalRuleCall_1_0(), semanticObject.isExported());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (intents+=PackageName intents+=PackageName*)
	 */
	protected void sequence_ElementIntentList(EObject context, ElementIntentList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     title=STRING
	 */
	protected void sequence_ElementLabelAttribute(EObject context, ElementLabelAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AppDslPackage.Literals.ELEMENT_LABEL_ATTRIBUTE__TITLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AppDslPackage.Literals.ELEMENT_LABEL_ATTRIBUTE__TITLE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getElementLabelAttributeAccess().getTitleSTRINGTerminalRuleCall_1_0(), semanticObject.getTitle());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_PackageName(EObject context, PackageName semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AppDslPackage.Literals.PACKAGE_NAME__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AppDslPackage.Literals.PACKAGE_NAME__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPackageNameAccess().getNameIDTerminalRuleCall_1_0_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID attributes+=ServiceAttribute attributes+=ServiceAttribute*)
	 */
	protected void sequence_Service(EObject context, Service semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     text=STRING
	 */
	protected void sequence_Text(EObject context, Text semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AppDslPackage.Literals.TEXT__TEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AppDslPackage.Literals.TEXT__TEXT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTextAccess().getTextSTRINGTerminalRuleCall_1_0(), semanticObject.getText());
		feeder.finish();
	}
}
