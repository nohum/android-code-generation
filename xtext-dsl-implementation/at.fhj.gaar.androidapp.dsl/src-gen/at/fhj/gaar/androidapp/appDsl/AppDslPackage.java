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
   * The feature id for the '<em><b>Package Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__PACKAGE_NAME = 0;

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
   * The meta object id for the '{@link at.fhj.gaar.androidapp.appDsl.impl.ApplicationTitleImpl <em>Application Title</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.fhj.gaar.androidapp.appDsl.impl.ApplicationTitleImpl
   * @see at.fhj.gaar.androidapp.appDsl.impl.AppDslPackageImpl#getApplicationTitle()
   * @generated
   */
  int APPLICATION_TITLE = 3;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_TITLE__TITLE = APPLICATION_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Application Title</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_TITLE_FEATURE_COUNT = APPLICATION_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.fhj.gaar.androidapp.appDsl.impl.ApplicationMinSdkImpl <em>Application Min Sdk</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.fhj.gaar.androidapp.appDsl.impl.ApplicationMinSdkImpl
   * @see at.fhj.gaar.androidapp.appDsl.impl.AppDslPackageImpl#getApplicationMinSdk()
   * @generated
   */
  int APPLICATION_MIN_SDK = 4;

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
  int APPLICATION_TARGET_SDK = 5;

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
  int APPLICATION_COMPILE_SDK = 6;

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
  int APPLICATION_PERMISSION_LIST = 7;

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
  int APPLICATION_ELEMENT_LIST = 8;

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
  int APPLICATION_MAIN_ACTIVITY = 9;

  /**
   * The feature id for the '<em><b>Launcher Activity</b></em>' attribute.
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
  int APPLICATION_ELEMENT = 10;

  /**
   * The feature id for the '<em><b>Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_ELEMENT__CLASS_NAME = 0;

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
  int ACTIVITY = 11;

  /**
   * The feature id for the '<em><b>Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY__CLASS_NAME = APPLICATION_ELEMENT__CLASS_NAME;

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
  int BROADCAST_RECEIVER = 12;

  /**
   * The feature id for the '<em><b>Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BROADCAST_RECEIVER__CLASS_NAME = APPLICATION_ELEMENT__CLASS_NAME;

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
  int SERVICE = 13;

  /**
   * The feature id for the '<em><b>Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__CLASS_NAME = APPLICATION_ELEMENT__CLASS_NAME;

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
  int ACTIVITY_ATTRIBUTE = 14;

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
  int BROADCAST_RECEIVER_ATTRIBUTE = 15;

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
  int SERVICE_ATTRIBUTE = 16;

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
  int ELEMENT_ENABLED_ATTRIBUTE = 17;

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
  int ELEMENT_EXPORTED_ATTRIBUTE = 18;

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
   * Returns the meta object for the attribute '{@link at.fhj.gaar.androidapp.appDsl.Application#getPackageName <em>Package Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Package Name</em>'.
   * @see at.fhj.gaar.androidapp.appDsl.Application#getPackageName()
   * @see #getApplication()
   * @generated
   */
  EAttribute getApplication_PackageName();

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
   * Returns the meta object for class '{@link at.fhj.gaar.androidapp.appDsl.ApplicationTitle <em>Application Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Application Title</em>'.
   * @see at.fhj.gaar.androidapp.appDsl.ApplicationTitle
   * @generated
   */
  EClass getApplicationTitle();

  /**
   * Returns the meta object for the attribute '{@link at.fhj.gaar.androidapp.appDsl.ApplicationTitle#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see at.fhj.gaar.androidapp.appDsl.ApplicationTitle#getTitle()
   * @see #getApplicationTitle()
   * @generated
   */
  EAttribute getApplicationTitle_Title();

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
   * Returns the meta object for the attribute '{@link at.fhj.gaar.androidapp.appDsl.ApplicationMainActivity#getLauncherActivity <em>Launcher Activity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Launcher Activity</em>'.
   * @see at.fhj.gaar.androidapp.appDsl.ApplicationMainActivity#getLauncherActivity()
   * @see #getApplicationMainActivity()
   * @generated
   */
  EAttribute getApplicationMainActivity_LauncherActivity();

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
   * Returns the meta object for the attribute '{@link at.fhj.gaar.androidapp.appDsl.ApplicationElement#getClassName <em>Class Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class Name</em>'.
   * @see at.fhj.gaar.androidapp.appDsl.ApplicationElement#getClassName()
   * @see #getApplicationElement()
   * @generated
   */
  EAttribute getApplicationElement_ClassName();

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
     * The meta object literal for the '<em><b>Package Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute APPLICATION__PACKAGE_NAME = eINSTANCE.getApplication_PackageName();

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
     * The meta object literal for the '{@link at.fhj.gaar.androidapp.appDsl.impl.ApplicationTitleImpl <em>Application Title</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.fhj.gaar.androidapp.appDsl.impl.ApplicationTitleImpl
     * @see at.fhj.gaar.androidapp.appDsl.impl.AppDslPackageImpl#getApplicationTitle()
     * @generated
     */
    EClass APPLICATION_TITLE = eINSTANCE.getApplicationTitle();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute APPLICATION_TITLE__TITLE = eINSTANCE.getApplicationTitle_Title();

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
     * The meta object literal for the '<em><b>Launcher Activity</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute APPLICATION_MAIN_ACTIVITY__LAUNCHER_ACTIVITY = eINSTANCE.getApplicationMainActivity_LauncherActivity();

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
     * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute APPLICATION_ELEMENT__CLASS_NAME = eINSTANCE.getApplicationElement_ClassName();

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

  }

} //AppDslPackage
