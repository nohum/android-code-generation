/**
 */
package at.fhj.gaar.androidapp.appDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see at.fhj.gaar.androidapp.appDsl.AppDslFactory
 * @model kind="package"
 * @generated
 */
public interface AppDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "appDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.fhj.at/gaar/androidapp/AppDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "appDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AppDslPackage eINSTANCE = at.fhj.gaar.androidapp.appDsl.impl.AppDslPackageImpl.init();

  /**
   * The meta object id for the '{@link at.fhj.gaar.androidapp.appDsl.impl.AndroidAppProjectImpl <em>Android App Project</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.fhj.gaar.androidapp.appDsl.impl.AndroidAppProjectImpl
   * @see at.fhj.gaar.androidapp.appDsl.impl.AppDslPackageImpl#getAndroidAppProject()
   * @generated
   */
  int ANDROID_APP_PROJECT = 0;

  /**
   * The feature id for the '<em><b>Applications</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANDROID_APP_PROJECT__APPLICATIONS = 0;

  /**
   * The number of structural features of the '<em>Android App Project</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANDROID_APP_PROJECT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.fhj.gaar.androidapp.appDsl.impl.ApplicationImpl <em>Application</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.fhj.gaar.androidapp.appDsl.impl.ApplicationImpl
   * @see at.fhj.gaar.androidapp.appDsl.impl.AppDslPackageImpl#getApplication()
   * @generated
   */
  int APPLICATION = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__ATTRIBUTES = 1;

  /**
   * The number of structural features of the '<em>Application</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.fhj.gaar.androidapp.appDsl.impl.ApplicationAttributeImpl <em>Application Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.fhj.gaar.androidapp.appDsl.impl.ApplicationAttributeImpl
   * @see at.fhj.gaar.androidapp.appDsl.impl.AppDslPackageImpl#getApplicationAttribute()
   * @generated
   */
  int APPLICATION_ATTRIBUTE = 2;

  /**
   * The number of structural features of the '<em>Application Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_ATTRIBUTE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link at.fhj.gaar.androidapp.appDsl.impl.ApplicationMinSdkImpl <em>Application Min Sdk</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.fhj.gaar.androidapp.appDsl.impl.ApplicationMinSdkImpl
   * @see at.fhj.gaar.androidapp.appDsl.impl.AppDslPackageImpl#getApplicationMinSdk()
   * @generated
   */
  int APPLICATION_MIN_SDK = 3;

  /**
   * The feature id for the '<em><b>Min Sdk</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_MIN_SDK__MIN_SDK = APPLICATION_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Application Min Sdk</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_MIN_SDK_FEATURE_COUNT = APPLICATION_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.fhj.gaar.androidapp.appDsl.impl.ApplicationTargetSdkImpl <em>Application Target Sdk</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.fhj.gaar.androidapp.appDsl.impl.ApplicationTargetSdkImpl
   * @see at.fhj.gaar.androidapp.appDsl.impl.AppDslPackageImpl#getApplicationTargetSdk()
   * @generated
   */
  int APPLICATION_TARGET_SDK = 4;

  /**
   * The feature id for the '<em><b>Target Sdk</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_TARGET_SDK__TARGET_SDK = APPLICATION_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Application Target Sdk</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_TARGET_SDK_FEATURE_COUNT = APPLICATION_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.fhj.gaar.androidapp.appDsl.impl.ApplicationCompileSdkImpl <em>Application Compile Sdk</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.fhj.gaar.androidapp.appDsl.impl.ApplicationCompileSdkImpl
   * @see at.fhj.gaar.androidapp.appDsl.impl.AppDslPackageImpl#getApplicationCompileSdk()
   * @generated
   */
  int APPLICATION_COMPILE_SDK = 5;

  /**
   * The feature id for the '<em><b>Compile Sdk</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_COMPILE_SDK__COMPILE_SDK = APPLICATION_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Application Compile Sdk</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_COMPILE_SDK_FEATURE_COUNT = APPLICATION_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.fhj.gaar.androidapp.appDsl.impl.ApplicationPermissionListImpl <em>Application Permission List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.fhj.gaar.androidapp.appDsl.impl.ApplicationPermissionListImpl
   * @see at.fhj.gaar.androidapp.appDsl.impl.AppDslPackageImpl#getApplicationPermissionList()
   * @generated
   */
  int APPLICATION_PERMISSION_LIST = 6;

  /**
   * The feature id for the '<em><b>Permissions</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_PERMISSION_LIST__PERMISSIONS = APPLICATION_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Application Permission List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_PERMISSION_LIST_FEATURE_COUNT = APPLICATION_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.fhj.gaar.androidapp.appDsl.impl.ApplicationElementListImpl <em>Application Element List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.fhj.gaar.androidapp.appDsl.impl.ApplicationElementListImpl
   * @see at.fhj.gaar.androidapp.appDsl.impl.AppDslPackageImpl#getApplicationElementList()
   * @generated
   */
  int APPLICATION_ELEMENT_LIST = 7;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_ELEMENT_LIST__ELEMENTS = APPLICATION_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Application Element List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_ELEMENT_LIST_FEATURE_COUNT = APPLICATION_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.fhj.gaar.androidapp.appDsl.impl.ApplicationMainActivityImpl <em>Application Main Activity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.fhj.gaar.androidapp.appDsl.impl.ApplicationMainActivityImpl
   * @see at.fhj.gaar.androidapp.appDsl.impl.AppDslPackageImpl#getApplicationMainActivity()
   * @generated
   */
  int APPLICATION_MAIN_ACTIVITY = 8;

  /**
   * The feature id for the '<em><b>Launcher Activity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_MAIN_ACTIVITY__LAUNCHER_ACTIVITY = APPLICATION_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Application Main Activity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_MAIN_ACTIVITY_FEATURE_COUNT = APPLICATION_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.fhj.gaar.androidapp.appDsl.impl.ApplicationElementImpl <em>Application Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.fhj.gaar.androidapp.appDsl.impl.ApplicationElementImpl
   * @see at.fhj.gaar.androidapp.appDsl.impl.AppDslPackageImpl#getApplicationElement()
   * @generated
   */
  int APPLICATION_ELEMENT = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_ELEMENT__NAME = 0;

  /**
   * The number of structural features of the '<em>Application Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.fhj.gaar.androidapp.appDsl.impl.ActivityImpl <em>Activity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.fhj.gaar.androidapp.appDsl.impl.ActivityImpl
   * @see at.fhj.gaar.androidapp.appDsl.impl.AppDslPackageImpl#getActivity()
   * @generated
   */
  int ACTIVITY = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY__NAME = APPLICATION_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY__ATTRIBUTES = APPLICATION_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Activity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_FEATURE_COUNT = APPLICATION_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.fhj.gaar.androidapp.appDsl.impl.BroadcastReceiverImpl <em>Broadcast Receiver</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.fhj.gaar.androidapp.appDsl.impl.BroadcastReceiverImpl
   * @see at.fhj.gaar.androidapp.appDsl.impl.AppDslPackageImpl#getBroadcastReceiver()
   * @generated
   */
  int BROADCAST_RECEIVER = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BROADCAST_RECEIVER__NAME = APPLICATION_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BROADCAST_RECEIVER__ATTRIBUTES = APPLICATION_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Broadcast Receiver</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BROADCAST_RECEIVER_FEATURE_COUNT = APPLICATION_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.fhj.gaar.androidapp.appDsl.impl.ServiceImpl <em>Service</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.fhj.gaar.androidapp.appDsl.impl.ServiceImpl
   * @see at.fhj.gaar.androidapp.appDsl.impl.AppDslPackageImpl#getService()
   * @generated
   */
  int SERVICE = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__NAME = APPLICATION_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__ATTRIBUTES = APPLICATION_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Service</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_FEATURE_COUNT = APPLICATION_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.fhj.gaar.androidapp.appDsl.impl.ActivityAttributeImpl <em>Activity Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.fhj.gaar.androidapp.appDsl.impl.ActivityAttributeImpl
   * @see at.fhj.gaar.androidapp.appDsl.impl.AppDslPackageImpl#getActivityAttribute()
   * @generated
   */
  int ACTIVITY_ATTRIBUTE = 13;

  /**
   * The number of structural features of the '<em>Activity Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_ATTRIBUTE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link at.fhj.gaar.androidapp.appDsl.impl.BroadcastReceiverAttributeImpl <em>Broadcast Receiver Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.fhj.gaar.androidapp.appDsl.impl.BroadcastReceiverAttributeImpl
   * @see at.fhj.gaar.androidapp.appDsl.impl.AppDslPackageImpl#getBroadcastReceiverAttribute()
   * @generated
   */
  int BROADCAST_RECEIVER_ATTRIBUTE = 14;

  /**
   * The number of structural features of the '<em>Broadcast Receiver Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BROADCAST_RECEIVER_ATTRIBUTE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link at.fhj.gaar.androidapp.appDsl.impl.ServiceAttributeImpl <em>Service Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.fhj.gaar.androidapp.appDsl.impl.ServiceAttributeImpl
   * @see at.fhj.gaar.androidapp.appDsl.impl.AppDslPackageImpl#getServiceAttribute()
   * @generated
   */
  int SERVICE_ATTRIBUTE = 15;

  /**
   * The number of structural features of the '<em>Service Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_ATTRIBUTE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link at.fhj.gaar.androidapp.appDsl.impl.ElementEnabledAttributeImpl <em>Element Enabled Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.fhj.gaar.androidapp.appDsl.impl.ElementEnabledAttributeImpl
   * @see at.fhj.gaar.androidapp.appDsl.impl.AppDslPackageImpl#getElementEnabledAttribute()
   * @generated
   */
  int ELEMENT_ENABLED_ATTRIBUTE = 16;

  /**
   * The feature id for the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_ENABLED_ATTRIBUTE__ENABLED = ACTIVITY_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Element Enabled Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_ENABLED_ATTRIBUTE_FEATURE_COUNT = ACTIVITY_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.fhj.gaar.androidapp.appDsl.impl.ElementExportedAttributeImpl <em>Element Exported Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.fhj.gaar.androidapp.appDsl.impl.ElementExportedAttributeImpl
   * @see at.fhj.gaar.androidapp.appDsl.impl.AppDslPackageImpl#getElementExportedAttribute()
   * @generated
   */
  int ELEMENT_EXPORTED_ATTRIBUTE = 17;

  /**
   * The feature id for the '<em><b>Exported</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_EXPORTED_ATTRIBUTE__EXPORTED = ACTIVITY_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Element Exported Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_EXPORTED_ATTRIBUTE_FEATURE_COUNT = ACTIVITY_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.fhj.gaar.androidapp.appDsl.impl.ElementLabelAttributeImpl <em>Element Label Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.fhj.gaar.androidapp.appDsl.impl.ElementLabelAttributeImpl
   * @see at.fhj.gaar.androidapp.appDsl.impl.AppDslPackageImpl#getElementLabelAttribute()
   * @generated
   */
  int ELEMENT_LABEL_ATTRIBUTE = 18;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_LABEL_ATTRIBUTE__TITLE = APPLICATION_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Element Label Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_LABEL_ATTRIBUTE_FEATURE_COUNT = APPLICATION_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.fhj.gaar.androidapp.appDsl.impl.ElementIntentListImpl <em>Element Intent List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.fhj.gaar.androidapp.appDsl.impl.ElementIntentListImpl
   * @see at.fhj.gaar.androidapp.appDsl.impl.AppDslPackageImpl#getElementIntentList()
   * @generated
   */
  int ELEMENT_INTENT_LIST = 19;

  /**
   * The feature id for the '<em><b>Intents</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_INTENT_LIST__INTENTS = ACTIVITY_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Element Intent List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_INTENT_LIST_FEATURE_COUNT = ACTIVITY_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.fhj.gaar.androidapp.appDsl.impl.ActivityParentAttributeImpl <em>Activity Parent Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.fhj.gaar.androidapp.appDsl.impl.ActivityParentAttributeImpl
   * @see at.fhj.gaar.androidapp.appDsl.impl.AppDslPackageImpl#getActivityParentAttribute()
   * @generated
   */
  int ACTIVITY_PARENT_ATTRIBUTE = 20;

  /**
   * The feature id for the '<em><b>Parent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_PARENT_ATTRIBUTE__PARENT = ACTIVITY_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Activity Parent Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_PARENT_ATTRIBUTE_FEATURE_COUNT = ACTIVITY_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.fhj.gaar.androidapp.appDsl.impl.ActivityLayoutAttributeImpl <em>Activity Layout Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.fhj.gaar.androidapp.appDsl.impl.ActivityLayoutAttributeImpl
   * @see at.fhj.gaar.androidapp.appDsl.impl.AppDslPackageImpl#getActivityLayoutAttribute()
   * @generated
   */
  int ACTIVITY_LAYOUT_ATTRIBUTE = 21;

  /**
   * The feature id for the '<em><b>Layout Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_LAYOUT_ATTRIBUTE__LAYOUT_ELEMENTS = ACTIVITY_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Activity Layout Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_LAYOUT_ATTRIBUTE_FEATURE_COUNT = ACTIVITY_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.fhj.gaar.androidapp.appDsl.impl.LayoutElementImpl <em>Layout Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.fhj.gaar.androidapp.appDsl.impl.LayoutElementImpl
   * @see at.fhj.gaar.androidapp.appDsl.impl.AppDslPackageImpl#getLayoutElement()
   * @generated
   */
  int LAYOUT_ELEMENT = 22;

  /**
   * The number of structural features of the '<em>Layout Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYOUT_ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link at.fhj.gaar.androidapp.appDsl.impl.ButtonImpl <em>Button</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.fhj.gaar.androidapp.appDsl.impl.ButtonImpl
   * @see at.fhj.gaar.androidapp.appDsl.impl.AppDslPackageImpl#getButton()
   * @generated
   */
  int BUTTON = 23;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__NAME = LAYOUT_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__ATTRIBUTES = LAYOUT_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Button</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON_FEATURE_COUNT = LAYOUT_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.fhj.gaar.androidapp.appDsl.impl.ButtonAttributeImpl <em>Button Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.fhj.gaar.androidapp.appDsl.impl.ButtonAttributeImpl
   * @see at.fhj.gaar.androidapp.appDsl.impl.AppDslPackageImpl#getButtonAttribute()
   * @generated
   */
  int BUTTON_ATTRIBUTE = 24;

  /**
   * The number of structural features of the '<em>Button Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON_ATTRIBUTE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link at.fhj.gaar.androidapp.appDsl.impl.ButtonLabelAttributeImpl <em>Button Label Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.fhj.gaar.androidapp.appDsl.impl.ButtonLabelAttributeImpl
   * @see at.fhj.gaar.androidapp.appDsl.impl.AppDslPackageImpl#getButtonLabelAttribute()
   * @generated
   */
  int BUTTON_LABEL_ATTRIBUTE = 25;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON_LABEL_ATTRIBUTE__TITLE = BUTTON_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Button Label Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON_LABEL_ATTRIBUTE_FEATURE_COUNT = BUTTON_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.fhj.gaar.androidapp.appDsl.impl.ButtonActionAttributeImpl <em>Button Action Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.fhj.gaar.androidapp.appDsl.impl.ButtonActionAttributeImpl
   * @see at.fhj.gaar.androidapp.appDsl.impl.AppDslPackageImpl#getButtonActionAttribute()
   * @generated
   */
  int BUTTON_ACTION_ATTRIBUTE = 26;

  /**
   * The feature id for the '<em><b>Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON_ACTION_ATTRIBUTE__ACTION = BUTTON_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Button Action Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON_ACTION_ATTRIBUTE_FEATURE_COUNT = BUTTON_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.fhj.gaar.androidapp.appDsl.impl.TextImpl <em>Text</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.fhj.gaar.androidapp.appDsl.impl.TextImpl
   * @see at.fhj.gaar.androidapp.appDsl.impl.AppDslPackageImpl#getText()
   * @generated
   */
  int TEXT = 27;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT__TEXT = LAYOUT_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Text</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_FEATURE_COUNT = LAYOUT_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.fhj.gaar.androidapp.appDsl.impl.LayoutElementClickActionImpl <em>Layout Element Click Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.fhj.gaar.androidapp.appDsl.impl.LayoutElementClickActionImpl
   * @see at.fhj.gaar.androidapp.appDsl.impl.AppDslPackageImpl#getLayoutElementClickAction()
   * @generated
   */
  int LAYOUT_ELEMENT_CLICK_ACTION = 28;

  /**
   * The number of structural features of the '<em>Layout Element Click Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYOUT_ELEMENT_CLICK_ACTION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link at.fhj.gaar.androidapp.appDsl.impl.BroadcastReceiverActionAttributeImpl <em>Broadcast Receiver Action Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.fhj.gaar.androidapp.appDsl.impl.BroadcastReceiverActionAttributeImpl
   * @see at.fhj.gaar.androidapp.appDsl.impl.AppDslPackageImpl#getBroadcastReceiverActionAttribute()
   * @generated
   */
  int BROADCAST_RECEIVER_ACTION_ATTRIBUTE = 29;

  /**
   * The feature id for the '<em><b>Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BROADCAST_RECEIVER_ACTION_ATTRIBUTE__ACTION = BROADCAST_RECEIVER_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Broadcast Receiver Action Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BROADCAST_RECEIVER_ACTION_ATTRIBUTE_FEATURE_COUNT = BROADCAST_RECEIVER_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.fhj.gaar.androidapp.appDsl.impl.BroadcastReceiverActionImpl <em>Broadcast Receiver Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.fhj.gaar.androidapp.appDsl.impl.BroadcastReceiverActionImpl
   * @see at.fhj.gaar.androidapp.appDsl.impl.AppDslPackageImpl#getBroadcastReceiverAction()
   * @generated
   */
  int BROADCAST_RECEIVER_ACTION = 30;

  /**
   * The number of structural features of the '<em>Broadcast Receiver Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BROADCAST_RECEIVER_ACTION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link at.fhj.gaar.androidapp.appDsl.impl.ActionShowToastImpl <em>Action Show Toast</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.fhj.gaar.androidapp.appDsl.impl.ActionShowToastImpl
   * @see at.fhj.gaar.androidapp.appDsl.impl.AppDslPackageImpl#getActionShowToast()
   * @generated
   */
  int ACTION_SHOW_TOAST = 31;

  /**
   * The feature id for the '<em><b>Toast Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_SHOW_TOAST__TOAST_TEXT = LAYOUT_ELEMENT_CLICK_ACTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Action Show Toast</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_SHOW_TOAST_FEATURE_COUNT = LAYOUT_ELEMENT_CLICK_ACTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.fhj.gaar.androidapp.appDsl.impl.ActionStartActivityImpl <em>Action Start Activity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.fhj.gaar.androidapp.appDsl.impl.ActionStartActivityImpl
   * @see at.fhj.gaar.androidapp.appDsl.impl.AppDslPackageImpl#getActionStartActivity()
   * @generated
   */
  int ACTION_START_ACTIVITY = 32;

  /**
   * The feature id for the '<em><b>Activity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_START_ACTIVITY__ACTIVITY = LAYOUT_ELEMENT_CLICK_ACTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Action Start Activity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_START_ACTIVITY_FEATURE_COUNT = LAYOUT_ELEMENT_CLICK_ACTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.fhj.gaar.androidapp.appDsl.impl.ActionStartServiceImpl <em>Action Start Service</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.fhj.gaar.androidapp.appDsl.impl.ActionStartServiceImpl
   * @see at.fhj.gaar.androidapp.appDsl.impl.AppDslPackageImpl#getActionStartService()
   * @generated
   */
  int ACTION_START_SERVICE = 33;

  /**
   * The feature id for the '<em><b>Service</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_START_SERVICE__SERVICE = LAYOUT_ELEMENT_CLICK_ACTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Action Start Service</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_START_SERVICE_FEATURE_COUNT = LAYOUT_ELEMENT_CLICK_ACTION_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link at.fhj.gaar.androidapp.appDsl.AndroidAppProject <em>Android App Project</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Android App Project</em>'.
   * @see at.fhj.gaar.androidapp.appDsl.AndroidAppProject
   * @generated
   */
  EClass getAndroidAppProject();

  /**
   * Returns the meta object for the containment reference list '{@link at.fhj.gaar.androidapp.appDsl.AndroidAppProject#getApplications <em>Applications</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Applications</em>'.
   * @see at.fhj.gaar.androidapp.appDsl.AndroidAppProject#getApplications()
   * @see #getAndroidAppProject()
   * @generated
   */
  EReference getAndroidAppProject_Applications();

  /**
   * Returns the meta object for class '{@link at.fhj.gaar.androidapp.appDsl.Application <em>Application</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Application</em>'.
   * @see at.fhj.gaar.androidapp.appDsl.Application
   * @generated
   */
  EClass getApplication();

  /**
   * Returns the meta object for the attribute '{@link at.fhj.gaar.androidapp.appDsl.Application#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.fhj.gaar.androidapp.appDsl.Application#getName()
   * @see #getApplication()
   * @generated
   */
  EAttribute getApplication_Name();

  /**
   * Returns the meta object for the containment reference list '{@link at.fhj.gaar.androidapp.appDsl.Application#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see at.fhj.gaar.androidapp.appDsl.Application#getAttributes()
   * @see #getApplication()
   * @generated
   */
  EReference getApplication_Attributes();

  /**
   * Returns the meta object for class '{@link at.fhj.gaar.androidapp.appDsl.ApplicationAttribute <em>Application Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Application Attribute</em>'.
   * @see at.fhj.gaar.androidapp.appDsl.ApplicationAttribute
   * @generated
   */
  EClass getApplicationAttribute();

  /**
   * Returns the meta object for class '{@link at.fhj.gaar.androidapp.appDsl.ApplicationMinSdk <em>Application Min Sdk</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Application Min Sdk</em>'.
   * @see at.fhj.gaar.androidapp.appDsl.ApplicationMinSdk
   * @generated
   */
  EClass getApplicationMinSdk();

  /**
   * Returns the meta object for the attribute '{@link at.fhj.gaar.androidapp.appDsl.ApplicationMinSdk#getMinSdk <em>Min Sdk</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Min Sdk</em>'.
   * @see at.fhj.gaar.androidapp.appDsl.ApplicationMinSdk#getMinSdk()
   * @see #getApplicationMinSdk()
   * @generated
   */
  EAttribute getApplicationMinSdk_MinSdk();

  /**
   * Returns the meta object for class '{@link at.fhj.gaar.androidapp.appDsl.ApplicationTargetSdk <em>Application Target Sdk</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Application Target Sdk</em>'.
   * @see at.fhj.gaar.androidapp.appDsl.ApplicationTargetSdk
   * @generated
   */
  EClass getApplicationTargetSdk();

  /**
   * Returns the meta object for the attribute '{@link at.fhj.gaar.androidapp.appDsl.ApplicationTargetSdk#getTargetSdk <em>Target Sdk</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Target Sdk</em>'.
   * @see at.fhj.gaar.androidapp.appDsl.ApplicationTargetSdk#getTargetSdk()
   * @see #getApplicationTargetSdk()
   * @generated
   */
  EAttribute getApplicationTargetSdk_TargetSdk();

  /**
   * Returns the meta object for class '{@link at.fhj.gaar.androidapp.appDsl.ApplicationCompileSdk <em>Application Compile Sdk</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Application Compile Sdk</em>'.
   * @see at.fhj.gaar.androidapp.appDsl.ApplicationCompileSdk
   * @generated
   */
  EClass getApplicationCompileSdk();

  /**
   * Returns the meta object for the attribute '{@link at.fhj.gaar.androidapp.appDsl.ApplicationCompileSdk#getCompileSdk <em>Compile Sdk</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Compile Sdk</em>'.
   * @see at.fhj.gaar.androidapp.appDsl.ApplicationCompileSdk#getCompileSdk()
   * @see #getApplicationCompileSdk()
   * @generated
   */
  EAttribute getApplicationCompileSdk_CompileSdk();

  /**
   * Returns the meta object for class '{@link at.fhj.gaar.androidapp.appDsl.ApplicationPermissionList <em>Application Permission List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Application Permission List</em>'.
   * @see at.fhj.gaar.androidapp.appDsl.ApplicationPermissionList
   * @generated
   */
  EClass getApplicationPermissionList();

  /**
   * Returns the meta object for the attribute list '{@link at.fhj.gaar.androidapp.appDsl.ApplicationPermissionList#getPermissions <em>Permissions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Permissions</em>'.
   * @see at.fhj.gaar.androidapp.appDsl.ApplicationPermissionList#getPermissions()
   * @see #getApplicationPermissionList()
   * @generated
   */
  EAttribute getApplicationPermissionList_Permissions();

  /**
   * Returns the meta object for class '{@link at.fhj.gaar.androidapp.appDsl.ApplicationElementList <em>Application Element List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Application Element List</em>'.
   * @see at.fhj.gaar.androidapp.appDsl.ApplicationElementList
   * @generated
   */
  EClass getApplicationElementList();

  /**
   * Returns the meta object for the containment reference list '{@link at.fhj.gaar.androidapp.appDsl.ApplicationElementList#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see at.fhj.gaar.androidapp.appDsl.ApplicationElementList#getElements()
   * @see #getApplicationElementList()
   * @generated
   */
  EReference getApplicationElementList_Elements();

  /**
   * Returns the meta object for class '{@link at.fhj.gaar.androidapp.appDsl.ApplicationMainActivity <em>Application Main Activity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Application Main Activity</em>'.
   * @see at.fhj.gaar.androidapp.appDsl.ApplicationMainActivity
   * @generated
   */
  EClass getApplicationMainActivity();

  /**
   * Returns the meta object for the reference '{@link at.fhj.gaar.androidapp.appDsl.ApplicationMainActivity#getLauncherActivity <em>Launcher Activity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Launcher Activity</em>'.
   * @see at.fhj.gaar.androidapp.appDsl.ApplicationMainActivity#getLauncherActivity()
   * @see #getApplicationMainActivity()
   * @generated
   */
  EReference getApplicationMainActivity_LauncherActivity();

  /**
   * Returns the meta object for class '{@link at.fhj.gaar.androidapp.appDsl.ApplicationElement <em>Application Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Application Element</em>'.
   * @see at.fhj.gaar.androidapp.appDsl.ApplicationElement
   * @generated
   */
  EClass getApplicationElement();

  /**
   * Returns the meta object for the attribute '{@link at.fhj.gaar.androidapp.appDsl.ApplicationElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.fhj.gaar.androidapp.appDsl.ApplicationElement#getName()
   * @see #getApplicationElement()
   * @generated
   */
  EAttribute getApplicationElement_Name();

  /**
   * Returns the meta object for class '{@link at.fhj.gaar.androidapp.appDsl.Activity <em>Activity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Activity</em>'.
   * @see at.fhj.gaar.androidapp.appDsl.Activity
   * @generated
   */
  EClass getActivity();

  /**
   * Returns the meta object for the containment reference list '{@link at.fhj.gaar.androidapp.appDsl.Activity#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see at.fhj.gaar.androidapp.appDsl.Activity#getAttributes()
   * @see #getActivity()
   * @generated
   */
  EReference getActivity_Attributes();

  /**
   * Returns the meta object for class '{@link at.fhj.gaar.androidapp.appDsl.BroadcastReceiver <em>Broadcast Receiver</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Broadcast Receiver</em>'.
   * @see at.fhj.gaar.androidapp.appDsl.BroadcastReceiver
   * @generated
   */
  EClass getBroadcastReceiver();

  /**
   * Returns the meta object for the containment reference list '{@link at.fhj.gaar.androidapp.appDsl.BroadcastReceiver#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see at.fhj.gaar.androidapp.appDsl.BroadcastReceiver#getAttributes()
   * @see #getBroadcastReceiver()
   * @generated
   */
  EReference getBroadcastReceiver_Attributes();

  /**
   * Returns the meta object for class '{@link at.fhj.gaar.androidapp.appDsl.Service <em>Service</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Service</em>'.
   * @see at.fhj.gaar.androidapp.appDsl.Service
   * @generated
   */
  EClass getService();

  /**
   * Returns the meta object for the containment reference list '{@link at.fhj.gaar.androidapp.appDsl.Service#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see at.fhj.gaar.androidapp.appDsl.Service#getAttributes()
   * @see #getService()
   * @generated
   */
  EReference getService_Attributes();

  /**
   * Returns the meta object for class '{@link at.fhj.gaar.androidapp.appDsl.ActivityAttribute <em>Activity Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Activity Attribute</em>'.
   * @see at.fhj.gaar.androidapp.appDsl.ActivityAttribute
   * @generated
   */
  EClass getActivityAttribute();

  /**
   * Returns the meta object for class '{@link at.fhj.gaar.androidapp.appDsl.BroadcastReceiverAttribute <em>Broadcast Receiver Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Broadcast Receiver Attribute</em>'.
   * @see at.fhj.gaar.androidapp.appDsl.BroadcastReceiverAttribute
   * @generated
   */
  EClass getBroadcastReceiverAttribute();

  /**
   * Returns the meta object for class '{@link at.fhj.gaar.androidapp.appDsl.ServiceAttribute <em>Service Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Service Attribute</em>'.
   * @see at.fhj.gaar.androidapp.appDsl.ServiceAttribute
   * @generated
   */
  EClass getServiceAttribute();

  /**
   * Returns the meta object for class '{@link at.fhj.gaar.androidapp.appDsl.ElementEnabledAttribute <em>Element Enabled Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element Enabled Attribute</em>'.
   * @see at.fhj.gaar.androidapp.appDsl.ElementEnabledAttribute
   * @generated
   */
  EClass getElementEnabledAttribute();

  /**
   * Returns the meta object for the attribute '{@link at.fhj.gaar.androidapp.appDsl.ElementEnabledAttribute#isEnabled <em>Enabled</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Enabled</em>'.
   * @see at.fhj.gaar.androidapp.appDsl.ElementEnabledAttribute#isEnabled()
   * @see #getElementEnabledAttribute()
   * @generated
   */
  EAttribute getElementEnabledAttribute_Enabled();

  /**
   * Returns the meta object for class '{@link at.fhj.gaar.androidapp.appDsl.ElementExportedAttribute <em>Element Exported Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element Exported Attribute</em>'.
   * @see at.fhj.gaar.androidapp.appDsl.ElementExportedAttribute
   * @generated
   */
  EClass getElementExportedAttribute();

  /**
   * Returns the meta object for the attribute '{@link at.fhj.gaar.androidapp.appDsl.ElementExportedAttribute#isExported <em>Exported</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Exported</em>'.
   * @see at.fhj.gaar.androidapp.appDsl.ElementExportedAttribute#isExported()
   * @see #getElementExportedAttribute()
   * @generated
   */
  EAttribute getElementExportedAttribute_Exported();

  /**
   * Returns the meta object for class '{@link at.fhj.gaar.androidapp.appDsl.ElementLabelAttribute <em>Element Label Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element Label Attribute</em>'.
   * @see at.fhj.gaar.androidapp.appDsl.ElementLabelAttribute
   * @generated
   */
  EClass getElementLabelAttribute();

  /**
   * Returns the meta object for the attribute '{@link at.fhj.gaar.androidapp.appDsl.ElementLabelAttribute#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see at.fhj.gaar.androidapp.appDsl.ElementLabelAttribute#getTitle()
   * @see #getElementLabelAttribute()
   * @generated
   */
  EAttribute getElementLabelAttribute_Title();

  /**
   * Returns the meta object for class '{@link at.fhj.gaar.androidapp.appDsl.ElementIntentList <em>Element Intent List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element Intent List</em>'.
   * @see at.fhj.gaar.androidapp.appDsl.ElementIntentList
   * @generated
   */
  EClass getElementIntentList();

  /**
   * Returns the meta object for the attribute list '{@link at.fhj.gaar.androidapp.appDsl.ElementIntentList#getIntents <em>Intents</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Intents</em>'.
   * @see at.fhj.gaar.androidapp.appDsl.ElementIntentList#getIntents()
   * @see #getElementIntentList()
   * @generated
   */
  EAttribute getElementIntentList_Intents();

  /**
   * Returns the meta object for class '{@link at.fhj.gaar.androidapp.appDsl.ActivityParentAttribute <em>Activity Parent Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Activity Parent Attribute</em>'.
   * @see at.fhj.gaar.androidapp.appDsl.ActivityParentAttribute
   * @generated
   */
  EClass getActivityParentAttribute();

  /**
   * Returns the meta object for the reference '{@link at.fhj.gaar.androidapp.appDsl.ActivityParentAttribute#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Parent</em>'.
   * @see at.fhj.gaar.androidapp.appDsl.ActivityParentAttribute#getParent()
   * @see #getActivityParentAttribute()
   * @generated
   */
  EReference getActivityParentAttribute_Parent();

  /**
   * Returns the meta object for class '{@link at.fhj.gaar.androidapp.appDsl.ActivityLayoutAttribute <em>Activity Layout Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Activity Layout Attribute</em>'.
   * @see at.fhj.gaar.androidapp.appDsl.ActivityLayoutAttribute
   * @generated
   */
  EClass getActivityLayoutAttribute();

  /**
   * Returns the meta object for the containment reference list '{@link at.fhj.gaar.androidapp.appDsl.ActivityLayoutAttribute#getLayoutElements <em>Layout Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Layout Elements</em>'.
   * @see at.fhj.gaar.androidapp.appDsl.ActivityLayoutAttribute#getLayoutElements()
   * @see #getActivityLayoutAttribute()
   * @generated
   */
  EReference getActivityLayoutAttribute_LayoutElements();

  /**
   * Returns the meta object for class '{@link at.fhj.gaar.androidapp.appDsl.LayoutElement <em>Layout Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Layout Element</em>'.
   * @see at.fhj.gaar.androidapp.appDsl.LayoutElement
   * @generated
   */
  EClass getLayoutElement();

  /**
   * Returns the meta object for class '{@link at.fhj.gaar.androidapp.appDsl.Button <em>Button</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Button</em>'.
   * @see at.fhj.gaar.androidapp.appDsl.Button
   * @generated
   */
  EClass getButton();

  /**
   * Returns the meta object for the attribute '{@link at.fhj.gaar.androidapp.appDsl.Button#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.fhj.gaar.androidapp.appDsl.Button#getName()
   * @see #getButton()
   * @generated
   */
  EAttribute getButton_Name();

  /**
   * Returns the meta object for the containment reference list '{@link at.fhj.gaar.androidapp.appDsl.Button#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see at.fhj.gaar.androidapp.appDsl.Button#getAttributes()
   * @see #getButton()
   * @generated
   */
  EReference getButton_Attributes();

  /**
   * Returns the meta object for class '{@link at.fhj.gaar.androidapp.appDsl.ButtonAttribute <em>Button Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Button Attribute</em>'.
   * @see at.fhj.gaar.androidapp.appDsl.ButtonAttribute
   * @generated
   */
  EClass getButtonAttribute();

  /**
   * Returns the meta object for class '{@link at.fhj.gaar.androidapp.appDsl.ButtonLabelAttribute <em>Button Label Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Button Label Attribute</em>'.
   * @see at.fhj.gaar.androidapp.appDsl.ButtonLabelAttribute
   * @generated
   */
  EClass getButtonLabelAttribute();

  /**
   * Returns the meta object for the attribute '{@link at.fhj.gaar.androidapp.appDsl.ButtonLabelAttribute#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see at.fhj.gaar.androidapp.appDsl.ButtonLabelAttribute#getTitle()
   * @see #getButtonLabelAttribute()
   * @generated
   */
  EAttribute getButtonLabelAttribute_Title();

  /**
   * Returns the meta object for class '{@link at.fhj.gaar.androidapp.appDsl.ButtonActionAttribute <em>Button Action Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Button Action Attribute</em>'.
   * @see at.fhj.gaar.androidapp.appDsl.ButtonActionAttribute
   * @generated
   */
  EClass getButtonActionAttribute();

  /**
   * Returns the meta object for the containment reference '{@link at.fhj.gaar.androidapp.appDsl.ButtonActionAttribute#getAction <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Action</em>'.
   * @see at.fhj.gaar.androidapp.appDsl.ButtonActionAttribute#getAction()
   * @see #getButtonActionAttribute()
   * @generated
   */
  EReference getButtonActionAttribute_Action();

  /**
   * Returns the meta object for class '{@link at.fhj.gaar.androidapp.appDsl.Text <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Text</em>'.
   * @see at.fhj.gaar.androidapp.appDsl.Text
   * @generated
   */
  EClass getText();

  /**
   * Returns the meta object for the attribute '{@link at.fhj.gaar.androidapp.appDsl.Text#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see at.fhj.gaar.androidapp.appDsl.Text#getText()
   * @see #getText()
   * @generated
   */
  EAttribute getText_Text();

  /**
   * Returns the meta object for class '{@link at.fhj.gaar.androidapp.appDsl.LayoutElementClickAction <em>Layout Element Click Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Layout Element Click Action</em>'.
   * @see at.fhj.gaar.androidapp.appDsl.LayoutElementClickAction
   * @generated
   */
  EClass getLayoutElementClickAction();

  /**
   * Returns the meta object for class '{@link at.fhj.gaar.androidapp.appDsl.BroadcastReceiverActionAttribute <em>Broadcast Receiver Action Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Broadcast Receiver Action Attribute</em>'.
   * @see at.fhj.gaar.androidapp.appDsl.BroadcastReceiverActionAttribute
   * @generated
   */
  EClass getBroadcastReceiverActionAttribute();

  /**
   * Returns the meta object for the containment reference '{@link at.fhj.gaar.androidapp.appDsl.BroadcastReceiverActionAttribute#getAction <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Action</em>'.
   * @see at.fhj.gaar.androidapp.appDsl.BroadcastReceiverActionAttribute#getAction()
   * @see #getBroadcastReceiverActionAttribute()
   * @generated
   */
  EReference getBroadcastReceiverActionAttribute_Action();

  /**
   * Returns the meta object for class '{@link at.fhj.gaar.androidapp.appDsl.BroadcastReceiverAction <em>Broadcast Receiver Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Broadcast Receiver Action</em>'.
   * @see at.fhj.gaar.androidapp.appDsl.BroadcastReceiverAction
   * @generated
   */
  EClass getBroadcastReceiverAction();

  /**
   * Returns the meta object for class '{@link at.fhj.gaar.androidapp.appDsl.ActionShowToast <em>Action Show Toast</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action Show Toast</em>'.
   * @see at.fhj.gaar.androidapp.appDsl.ActionShowToast
   * @generated
   */
  EClass getActionShowToast();

  /**
   * Returns the meta object for the attribute '{@link at.fhj.gaar.androidapp.appDsl.ActionShowToast#getToastText <em>Toast Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Toast Text</em>'.
   * @see at.fhj.gaar.androidapp.appDsl.ActionShowToast#getToastText()
   * @see #getActionShowToast()
   * @generated
   */
  EAttribute getActionShowToast_ToastText();

  /**
   * Returns the meta object for class '{@link at.fhj.gaar.androidapp.appDsl.ActionStartActivity <em>Action Start Activity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action Start Activity</em>'.
   * @see at.fhj.gaar.androidapp.appDsl.ActionStartActivity
   * @generated
   */
  EClass getActionStartActivity();

  /**
   * Returns the meta object for the reference '{@link at.fhj.gaar.androidapp.appDsl.ActionStartActivity#getActivity <em>Activity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Activity</em>'.
   * @see at.fhj.gaar.androidapp.appDsl.ActionStartActivity#getActivity()
   * @see #getActionStartActivity()
   * @generated
   */
  EReference getActionStartActivity_Activity();

  /**
   * Returns the meta object for class '{@link at.fhj.gaar.androidapp.appDsl.ActionStartService <em>Action Start Service</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action Start Service</em>'.
   * @see at.fhj.gaar.androidapp.appDsl.ActionStartService
   * @generated
   */
  EClass getActionStartService();

  /**
   * Returns the meta object for the reference '{@link at.fhj.gaar.androidapp.appDsl.ActionStartService#getService <em>Service</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Service</em>'.
   * @see at.fhj.gaar.androidapp.appDsl.ActionStartService#getService()
   * @see #getActionStartService()
   * @generated
   */
  EReference getActionStartService_Service();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  AppDslFactory getAppDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link at.fhj.gaar.androidapp.appDsl.impl.AndroidAppProjectImpl <em>Android App Project</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.fhj.gaar.androidapp.appDsl.impl.AndroidAppProjectImpl
     * @see at.fhj.gaar.androidapp.appDsl.impl.AppDslPackageImpl#getAndroidAppProject()
     * @generated
     */
    EClass ANDROID_APP_PROJECT = eINSTANCE.getAndroidAppProject();

    /**
     * The meta object literal for the '<em><b>Applications</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANDROID_APP_PROJECT__APPLICATIONS = eINSTANCE.getAndroidAppProject_Applications();

    /**
     * The meta object literal for the '{@link at.fhj.gaar.androidapp.appDsl.impl.ApplicationImpl <em>Application</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.fhj.gaar.androidapp.appDsl.impl.ApplicationImpl
     * @see at.fhj.gaar.androidapp.appDsl.impl.AppDslPackageImpl#getApplication()
     * @generated
     */
    EClass APPLICATION = eINSTANCE.getApplication();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute APPLICATION__NAME = eINSTANCE.getApplication_Name();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLICATION__ATTRIBUTES = eINSTANCE.getApplication_Attributes();

    /**
     * The meta object literal for the '{@link at.fhj.gaar.androidapp.appDsl.impl.ApplicationAttributeImpl <em>Application Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.fhj.gaar.androidapp.appDsl.impl.ApplicationAttributeImpl
     * @see at.fhj.gaar.androidapp.appDsl.impl.AppDslPackageImpl#getApplicationAttribute()
     * @generated
     */
    EClass APPLICATION_ATTRIBUTE = eINSTANCE.getApplicationAttribute();

    /**
     * The meta object literal for the '{@link at.fhj.gaar.androidapp.appDsl.impl.ApplicationMinSdkImpl <em>Application Min Sdk</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.fhj.gaar.androidapp.appDsl.impl.ApplicationMinSdkImpl
     * @see at.fhj.gaar.androidapp.appDsl.impl.AppDslPackageImpl#getApplicationMinSdk()
     * @generated
     */
    EClass APPLICATION_MIN_SDK = eINSTANCE.getApplicationMinSdk();

    /**
     * The meta object literal for the '<em><b>Min Sdk</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute APPLICATION_MIN_SDK__MIN_SDK = eINSTANCE.getApplicationMinSdk_MinSdk();

    /**
     * The meta object literal for the '{@link at.fhj.gaar.androidapp.appDsl.impl.ApplicationTargetSdkImpl <em>Application Target Sdk</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.fhj.gaar.androidapp.appDsl.impl.ApplicationTargetSdkImpl
     * @see at.fhj.gaar.androidapp.appDsl.impl.AppDslPackageImpl#getApplicationTargetSdk()
     * @generated
     */
    EClass APPLICATION_TARGET_SDK = eINSTANCE.getApplicationTargetSdk();

    /**
     * The meta object literal for the '<em><b>Target Sdk</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute APPLICATION_TARGET_SDK__TARGET_SDK = eINSTANCE.getApplicationTargetSdk_TargetSdk();

    /**
     * The meta object literal for the '{@link at.fhj.gaar.androidapp.appDsl.impl.ApplicationCompileSdkImpl <em>Application Compile Sdk</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.fhj.gaar.androidapp.appDsl.impl.ApplicationCompileSdkImpl
     * @see at.fhj.gaar.androidapp.appDsl.impl.AppDslPackageImpl#getApplicationCompileSdk()
     * @generated
     */
    EClass APPLICATION_COMPILE_SDK = eINSTANCE.getApplicationCompileSdk();

    /**
     * The meta object literal for the '<em><b>Compile Sdk</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute APPLICATION_COMPILE_SDK__COMPILE_SDK = eINSTANCE.getApplicationCompileSdk_CompileSdk();

    /**
     * The meta object literal for the '{@link at.fhj.gaar.androidapp.appDsl.impl.ApplicationPermissionListImpl <em>Application Permission List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.fhj.gaar.androidapp.appDsl.impl.ApplicationPermissionListImpl
     * @see at.fhj.gaar.androidapp.appDsl.impl.AppDslPackageImpl#getApplicationPermissionList()
     * @generated
     */
    EClass APPLICATION_PERMISSION_LIST = eINSTANCE.getApplicationPermissionList();

    /**
     * The meta object literal for the '<em><b>Permissions</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute APPLICATION_PERMISSION_LIST__PERMISSIONS = eINSTANCE.getApplicationPermissionList_Permissions();

    /**
     * The meta object literal for the '{@link at.fhj.gaar.androidapp.appDsl.impl.ApplicationElementListImpl <em>Application Element List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.fhj.gaar.androidapp.appDsl.impl.ApplicationElementListImpl
     * @see at.fhj.gaar.androidapp.appDsl.impl.AppDslPackageImpl#getApplicationElementList()
     * @generated
     */
    EClass APPLICATION_ELEMENT_LIST = eINSTANCE.getApplicationElementList();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLICATION_ELEMENT_LIST__ELEMENTS = eINSTANCE.getApplicationElementList_Elements();

    /**
     * The meta object literal for the '{@link at.fhj.gaar.androidapp.appDsl.impl.ApplicationMainActivityImpl <em>Application Main Activity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.fhj.gaar.androidapp.appDsl.impl.ApplicationMainActivityImpl
     * @see at.fhj.gaar.androidapp.appDsl.impl.AppDslPackageImpl#getApplicationMainActivity()
     * @generated
     */
    EClass APPLICATION_MAIN_ACTIVITY = eINSTANCE.getApplicationMainActivity();

    /**
     * The meta object literal for the '<em><b>Launcher Activity</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLICATION_MAIN_ACTIVITY__LAUNCHER_ACTIVITY = eINSTANCE.getApplicationMainActivity_LauncherActivity();

    /**
     * The meta object literal for the '{@link at.fhj.gaar.androidapp.appDsl.impl.ApplicationElementImpl <em>Application Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.fhj.gaar.androidapp.appDsl.impl.ApplicationElementImpl
     * @see at.fhj.gaar.androidapp.appDsl.impl.AppDslPackageImpl#getApplicationElement()
     * @generated
     */
    EClass APPLICATION_ELEMENT = eINSTANCE.getApplicationElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute APPLICATION_ELEMENT__NAME = eINSTANCE.getApplicationElement_Name();

    /**
     * The meta object literal for the '{@link at.fhj.gaar.androidapp.appDsl.impl.ActivityImpl <em>Activity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.fhj.gaar.androidapp.appDsl.impl.ActivityImpl
     * @see at.fhj.gaar.androidapp.appDsl.impl.AppDslPackageImpl#getActivity()
     * @generated
     */
    EClass ACTIVITY = eINSTANCE.getActivity();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTIVITY__ATTRIBUTES = eINSTANCE.getActivity_Attributes();

    /**
     * The meta object literal for the '{@link at.fhj.gaar.androidapp.appDsl.impl.BroadcastReceiverImpl <em>Broadcast Receiver</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.fhj.gaar.androidapp.appDsl.impl.BroadcastReceiverImpl
     * @see at.fhj.gaar.androidapp.appDsl.impl.AppDslPackageImpl#getBroadcastReceiver()
     * @generated
     */
    EClass BROADCAST_RECEIVER = eINSTANCE.getBroadcastReceiver();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BROADCAST_RECEIVER__ATTRIBUTES = eINSTANCE.getBroadcastReceiver_Attributes();

    /**
     * The meta object literal for the '{@link at.fhj.gaar.androidapp.appDsl.impl.ServiceImpl <em>Service</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.fhj.gaar.androidapp.appDsl.impl.ServiceImpl
     * @see at.fhj.gaar.androidapp.appDsl.impl.AppDslPackageImpl#getService()
     * @generated
     */
    EClass SERVICE = eINSTANCE.getService();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE__ATTRIBUTES = eINSTANCE.getService_Attributes();

    /**
     * The meta object literal for the '{@link at.fhj.gaar.androidapp.appDsl.impl.ActivityAttributeImpl <em>Activity Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.fhj.gaar.androidapp.appDsl.impl.ActivityAttributeImpl
     * @see at.fhj.gaar.androidapp.appDsl.impl.AppDslPackageImpl#getActivityAttribute()
     * @generated
     */
    EClass ACTIVITY_ATTRIBUTE = eINSTANCE.getActivityAttribute();

    /**
     * The meta object literal for the '{@link at.fhj.gaar.androidapp.appDsl.impl.BroadcastReceiverAttributeImpl <em>Broadcast Receiver Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.fhj.gaar.androidapp.appDsl.impl.BroadcastReceiverAttributeImpl
     * @see at.fhj.gaar.androidapp.appDsl.impl.AppDslPackageImpl#getBroadcastReceiverAttribute()
     * @generated
     */
    EClass BROADCAST_RECEIVER_ATTRIBUTE = eINSTANCE.getBroadcastReceiverAttribute();

    /**
     * The meta object literal for the '{@link at.fhj.gaar.androidapp.appDsl.impl.ServiceAttributeImpl <em>Service Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.fhj.gaar.androidapp.appDsl.impl.ServiceAttributeImpl
     * @see at.fhj.gaar.androidapp.appDsl.impl.AppDslPackageImpl#getServiceAttribute()
     * @generated
     */
    EClass SERVICE_ATTRIBUTE = eINSTANCE.getServiceAttribute();

    /**
     * The meta object literal for the '{@link at.fhj.gaar.androidapp.appDsl.impl.ElementEnabledAttributeImpl <em>Element Enabled Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.fhj.gaar.androidapp.appDsl.impl.ElementEnabledAttributeImpl
     * @see at.fhj.gaar.androidapp.appDsl.impl.AppDslPackageImpl#getElementEnabledAttribute()
     * @generated
     */
    EClass ELEMENT_ENABLED_ATTRIBUTE = eINSTANCE.getElementEnabledAttribute();

    /**
     * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT_ENABLED_ATTRIBUTE__ENABLED = eINSTANCE.getElementEnabledAttribute_Enabled();

    /**
     * The meta object literal for the '{@link at.fhj.gaar.androidapp.appDsl.impl.ElementExportedAttributeImpl <em>Element Exported Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.fhj.gaar.androidapp.appDsl.impl.ElementExportedAttributeImpl
     * @see at.fhj.gaar.androidapp.appDsl.impl.AppDslPackageImpl#getElementExportedAttribute()
     * @generated
     */
    EClass ELEMENT_EXPORTED_ATTRIBUTE = eINSTANCE.getElementExportedAttribute();

    /**
     * The meta object literal for the '<em><b>Exported</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT_EXPORTED_ATTRIBUTE__EXPORTED = eINSTANCE.getElementExportedAttribute_Exported();

    /**
     * The meta object literal for the '{@link at.fhj.gaar.androidapp.appDsl.impl.ElementLabelAttributeImpl <em>Element Label Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.fhj.gaar.androidapp.appDsl.impl.ElementLabelAttributeImpl
     * @see at.fhj.gaar.androidapp.appDsl.impl.AppDslPackageImpl#getElementLabelAttribute()
     * @generated
     */
    EClass ELEMENT_LABEL_ATTRIBUTE = eINSTANCE.getElementLabelAttribute();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT_LABEL_ATTRIBUTE__TITLE = eINSTANCE.getElementLabelAttribute_Title();

    /**
     * The meta object literal for the '{@link at.fhj.gaar.androidapp.appDsl.impl.ElementIntentListImpl <em>Element Intent List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.fhj.gaar.androidapp.appDsl.impl.ElementIntentListImpl
     * @see at.fhj.gaar.androidapp.appDsl.impl.AppDslPackageImpl#getElementIntentList()
     * @generated
     */
    EClass ELEMENT_INTENT_LIST = eINSTANCE.getElementIntentList();

    /**
     * The meta object literal for the '<em><b>Intents</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT_INTENT_LIST__INTENTS = eINSTANCE.getElementIntentList_Intents();

    /**
     * The meta object literal for the '{@link at.fhj.gaar.androidapp.appDsl.impl.ActivityParentAttributeImpl <em>Activity Parent Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.fhj.gaar.androidapp.appDsl.impl.ActivityParentAttributeImpl
     * @see at.fhj.gaar.androidapp.appDsl.impl.AppDslPackageImpl#getActivityParentAttribute()
     * @generated
     */
    EClass ACTIVITY_PARENT_ATTRIBUTE = eINSTANCE.getActivityParentAttribute();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTIVITY_PARENT_ATTRIBUTE__PARENT = eINSTANCE.getActivityParentAttribute_Parent();

    /**
     * The meta object literal for the '{@link at.fhj.gaar.androidapp.appDsl.impl.ActivityLayoutAttributeImpl <em>Activity Layout Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.fhj.gaar.androidapp.appDsl.impl.ActivityLayoutAttributeImpl
     * @see at.fhj.gaar.androidapp.appDsl.impl.AppDslPackageImpl#getActivityLayoutAttribute()
     * @generated
     */
    EClass ACTIVITY_LAYOUT_ATTRIBUTE = eINSTANCE.getActivityLayoutAttribute();

    /**
     * The meta object literal for the '<em><b>Layout Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTIVITY_LAYOUT_ATTRIBUTE__LAYOUT_ELEMENTS = eINSTANCE.getActivityLayoutAttribute_LayoutElements();

    /**
     * The meta object literal for the '{@link at.fhj.gaar.androidapp.appDsl.impl.LayoutElementImpl <em>Layout Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.fhj.gaar.androidapp.appDsl.impl.LayoutElementImpl
     * @see at.fhj.gaar.androidapp.appDsl.impl.AppDslPackageImpl#getLayoutElement()
     * @generated
     */
    EClass LAYOUT_ELEMENT = eINSTANCE.getLayoutElement();

    /**
     * The meta object literal for the '{@link at.fhj.gaar.androidapp.appDsl.impl.ButtonImpl <em>Button</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.fhj.gaar.androidapp.appDsl.impl.ButtonImpl
     * @see at.fhj.gaar.androidapp.appDsl.impl.AppDslPackageImpl#getButton()
     * @generated
     */
    EClass BUTTON = eINSTANCE.getButton();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUTTON__NAME = eINSTANCE.getButton_Name();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUTTON__ATTRIBUTES = eINSTANCE.getButton_Attributes();

    /**
     * The meta object literal for the '{@link at.fhj.gaar.androidapp.appDsl.impl.ButtonAttributeImpl <em>Button Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.fhj.gaar.androidapp.appDsl.impl.ButtonAttributeImpl
     * @see at.fhj.gaar.androidapp.appDsl.impl.AppDslPackageImpl#getButtonAttribute()
     * @generated
     */
    EClass BUTTON_ATTRIBUTE = eINSTANCE.getButtonAttribute();

    /**
     * The meta object literal for the '{@link at.fhj.gaar.androidapp.appDsl.impl.ButtonLabelAttributeImpl <em>Button Label Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.fhj.gaar.androidapp.appDsl.impl.ButtonLabelAttributeImpl
     * @see at.fhj.gaar.androidapp.appDsl.impl.AppDslPackageImpl#getButtonLabelAttribute()
     * @generated
     */
    EClass BUTTON_LABEL_ATTRIBUTE = eINSTANCE.getButtonLabelAttribute();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUTTON_LABEL_ATTRIBUTE__TITLE = eINSTANCE.getButtonLabelAttribute_Title();

    /**
     * The meta object literal for the '{@link at.fhj.gaar.androidapp.appDsl.impl.ButtonActionAttributeImpl <em>Button Action Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.fhj.gaar.androidapp.appDsl.impl.ButtonActionAttributeImpl
     * @see at.fhj.gaar.androidapp.appDsl.impl.AppDslPackageImpl#getButtonActionAttribute()
     * @generated
     */
    EClass BUTTON_ACTION_ATTRIBUTE = eINSTANCE.getButtonActionAttribute();

    /**
     * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUTTON_ACTION_ATTRIBUTE__ACTION = eINSTANCE.getButtonActionAttribute_Action();

    /**
     * The meta object literal for the '{@link at.fhj.gaar.androidapp.appDsl.impl.TextImpl <em>Text</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.fhj.gaar.androidapp.appDsl.impl.TextImpl
     * @see at.fhj.gaar.androidapp.appDsl.impl.AppDslPackageImpl#getText()
     * @generated
     */
    EClass TEXT = eINSTANCE.getText();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEXT__TEXT = eINSTANCE.getText_Text();

    /**
     * The meta object literal for the '{@link at.fhj.gaar.androidapp.appDsl.impl.LayoutElementClickActionImpl <em>Layout Element Click Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.fhj.gaar.androidapp.appDsl.impl.LayoutElementClickActionImpl
     * @see at.fhj.gaar.androidapp.appDsl.impl.AppDslPackageImpl#getLayoutElementClickAction()
     * @generated
     */
    EClass LAYOUT_ELEMENT_CLICK_ACTION = eINSTANCE.getLayoutElementClickAction();

    /**
     * The meta object literal for the '{@link at.fhj.gaar.androidapp.appDsl.impl.BroadcastReceiverActionAttributeImpl <em>Broadcast Receiver Action Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.fhj.gaar.androidapp.appDsl.impl.BroadcastReceiverActionAttributeImpl
     * @see at.fhj.gaar.androidapp.appDsl.impl.AppDslPackageImpl#getBroadcastReceiverActionAttribute()
     * @generated
     */
    EClass BROADCAST_RECEIVER_ACTION_ATTRIBUTE = eINSTANCE.getBroadcastReceiverActionAttribute();

    /**
     * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BROADCAST_RECEIVER_ACTION_ATTRIBUTE__ACTION = eINSTANCE.getBroadcastReceiverActionAttribute_Action();

    /**
     * The meta object literal for the '{@link at.fhj.gaar.androidapp.appDsl.impl.BroadcastReceiverActionImpl <em>Broadcast Receiver Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.fhj.gaar.androidapp.appDsl.impl.BroadcastReceiverActionImpl
     * @see at.fhj.gaar.androidapp.appDsl.impl.AppDslPackageImpl#getBroadcastReceiverAction()
     * @generated
     */
    EClass BROADCAST_RECEIVER_ACTION = eINSTANCE.getBroadcastReceiverAction();

    /**
     * The meta object literal for the '{@link at.fhj.gaar.androidapp.appDsl.impl.ActionShowToastImpl <em>Action Show Toast</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.fhj.gaar.androidapp.appDsl.impl.ActionShowToastImpl
     * @see at.fhj.gaar.androidapp.appDsl.impl.AppDslPackageImpl#getActionShowToast()
     * @generated
     */
    EClass ACTION_SHOW_TOAST = eINSTANCE.getActionShowToast();

    /**
     * The meta object literal for the '<em><b>Toast Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION_SHOW_TOAST__TOAST_TEXT = eINSTANCE.getActionShowToast_ToastText();

    /**
     * The meta object literal for the '{@link at.fhj.gaar.androidapp.appDsl.impl.ActionStartActivityImpl <em>Action Start Activity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.fhj.gaar.androidapp.appDsl.impl.ActionStartActivityImpl
     * @see at.fhj.gaar.androidapp.appDsl.impl.AppDslPackageImpl#getActionStartActivity()
     * @generated
     */
    EClass ACTION_START_ACTIVITY = eINSTANCE.getActionStartActivity();

    /**
     * The meta object literal for the '<em><b>Activity</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION_START_ACTIVITY__ACTIVITY = eINSTANCE.getActionStartActivity_Activity();

    /**
     * The meta object literal for the '{@link at.fhj.gaar.androidapp.appDsl.impl.ActionStartServiceImpl <em>Action Start Service</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.fhj.gaar.androidapp.appDsl.impl.ActionStartServiceImpl
     * @see at.fhj.gaar.androidapp.appDsl.impl.AppDslPackageImpl#getActionStartService()
     * @generated
     */
    EClass ACTION_START_SERVICE = eINSTANCE.getActionStartService();

    /**
     * The meta object literal for the '<em><b>Service</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION_START_SERVICE__SERVICE = eINSTANCE.getActionStartService_Service();

  }

} //AppDslPackage
