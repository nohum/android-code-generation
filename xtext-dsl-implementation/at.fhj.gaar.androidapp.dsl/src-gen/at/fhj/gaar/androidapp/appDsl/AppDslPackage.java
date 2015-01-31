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
   * The feature id for the '<em><b>Elements</b></em>' attribute list.
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
   * Returns the meta object for the attribute list '{@link at.fhj.gaar.androidapp.appDsl.ApplicationElementList#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Elements</em>'.
   * @see at.fhj.gaar.androidapp.appDsl.ApplicationElementList#getElements()
   * @see #getApplicationElementList()
   * @generated
   */
  EAttribute getApplicationElementList_Elements();

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
     * The meta object literal for the '<em><b>Elements</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute APPLICATION_ELEMENT_LIST__ELEMENTS = eINSTANCE.getApplicationElementList_Elements();

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

  }

} //AppDslPackage
