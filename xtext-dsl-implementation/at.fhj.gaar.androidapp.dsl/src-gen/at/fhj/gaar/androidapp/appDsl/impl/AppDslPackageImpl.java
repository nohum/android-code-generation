/**
 */
package at.fhj.gaar.androidapp.appDsl.impl;

import at.fhj.gaar.androidapp.appDsl.AndroidAppProject;
import at.fhj.gaar.androidapp.appDsl.AppDslFactory;
import at.fhj.gaar.androidapp.appDsl.AppDslPackage;
import at.fhj.gaar.androidapp.appDsl.Application;
import at.fhj.gaar.androidapp.appDsl.ApplicationAttribute;
import at.fhj.gaar.androidapp.appDsl.ApplicationCompileSdk;
import at.fhj.gaar.androidapp.appDsl.ApplicationElementList;
import at.fhj.gaar.androidapp.appDsl.ApplicationMainActivity;
import at.fhj.gaar.androidapp.appDsl.ApplicationMinSdk;
import at.fhj.gaar.androidapp.appDsl.ApplicationPermissionList;
import at.fhj.gaar.androidapp.appDsl.ApplicationTargetSdk;
import at.fhj.gaar.androidapp.appDsl.ApplicationTitle;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AppDslPackageImpl extends EPackageImpl implements AppDslPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass androidAppProjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass applicationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass applicationAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass applicationTitleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass applicationMinSdkEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass applicationTargetSdkEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass applicationCompileSdkEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass applicationPermissionListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass applicationElementListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass applicationMainActivityEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see at.fhj.gaar.androidapp.appDsl.AppDslPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private AppDslPackageImpl()
  {
    super(eNS_URI, AppDslFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link AppDslPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static AppDslPackage init()
  {
    if (isInited) return (AppDslPackage)EPackage.Registry.INSTANCE.getEPackage(AppDslPackage.eNS_URI);

    // Obtain or create and register package
    AppDslPackageImpl theAppDslPackage = (AppDslPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AppDslPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AppDslPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theAppDslPackage.createPackageContents();

    // Initialize created meta-data
    theAppDslPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theAppDslPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(AppDslPackage.eNS_URI, theAppDslPackage);
    return theAppDslPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAndroidAppProject()
  {
    return androidAppProjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAndroidAppProject_Applications()
  {
    return (EReference)androidAppProjectEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getApplication()
  {
    return applicationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getApplication_PackageName()
  {
    return (EAttribute)applicationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getApplication_Attributes()
  {
    return (EReference)applicationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getApplicationAttribute()
  {
    return applicationAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getApplicationTitle()
  {
    return applicationTitleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getApplicationTitle_Title()
  {
    return (EAttribute)applicationTitleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getApplicationMinSdk()
  {
    return applicationMinSdkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getApplicationMinSdk_MinSdk()
  {
    return (EAttribute)applicationMinSdkEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getApplicationTargetSdk()
  {
    return applicationTargetSdkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getApplicationTargetSdk_TargetSdk()
  {
    return (EAttribute)applicationTargetSdkEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getApplicationCompileSdk()
  {
    return applicationCompileSdkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getApplicationCompileSdk_CompileSdk()
  {
    return (EAttribute)applicationCompileSdkEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getApplicationPermissionList()
  {
    return applicationPermissionListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getApplicationPermissionList_Permissions()
  {
    return (EAttribute)applicationPermissionListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getApplicationElementList()
  {
    return applicationElementListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getApplicationElementList_Elements()
  {
    return (EAttribute)applicationElementListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getApplicationMainActivity()
  {
    return applicationMainActivityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getApplicationMainActivity_LauncherActivity()
  {
    return (EAttribute)applicationMainActivityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AppDslFactory getAppDslFactory()
  {
    return (AppDslFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    androidAppProjectEClass = createEClass(ANDROID_APP_PROJECT);
    createEReference(androidAppProjectEClass, ANDROID_APP_PROJECT__APPLICATIONS);

    applicationEClass = createEClass(APPLICATION);
    createEAttribute(applicationEClass, APPLICATION__PACKAGE_NAME);
    createEReference(applicationEClass, APPLICATION__ATTRIBUTES);

    applicationAttributeEClass = createEClass(APPLICATION_ATTRIBUTE);

    applicationTitleEClass = createEClass(APPLICATION_TITLE);
    createEAttribute(applicationTitleEClass, APPLICATION_TITLE__TITLE);

    applicationMinSdkEClass = createEClass(APPLICATION_MIN_SDK);
    createEAttribute(applicationMinSdkEClass, APPLICATION_MIN_SDK__MIN_SDK);

    applicationTargetSdkEClass = createEClass(APPLICATION_TARGET_SDK);
    createEAttribute(applicationTargetSdkEClass, APPLICATION_TARGET_SDK__TARGET_SDK);

    applicationCompileSdkEClass = createEClass(APPLICATION_COMPILE_SDK);
    createEAttribute(applicationCompileSdkEClass, APPLICATION_COMPILE_SDK__COMPILE_SDK);

    applicationPermissionListEClass = createEClass(APPLICATION_PERMISSION_LIST);
    createEAttribute(applicationPermissionListEClass, APPLICATION_PERMISSION_LIST__PERMISSIONS);

    applicationElementListEClass = createEClass(APPLICATION_ELEMENT_LIST);
    createEAttribute(applicationElementListEClass, APPLICATION_ELEMENT_LIST__ELEMENTS);

    applicationMainActivityEClass = createEClass(APPLICATION_MAIN_ACTIVITY);
    createEAttribute(applicationMainActivityEClass, APPLICATION_MAIN_ACTIVITY__LAUNCHER_ACTIVITY);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    applicationTitleEClass.getESuperTypes().add(this.getApplicationAttribute());
    applicationMinSdkEClass.getESuperTypes().add(this.getApplicationAttribute());
    applicationTargetSdkEClass.getESuperTypes().add(this.getApplicationAttribute());
    applicationCompileSdkEClass.getESuperTypes().add(this.getApplicationAttribute());
    applicationPermissionListEClass.getESuperTypes().add(this.getApplicationAttribute());
    applicationElementListEClass.getESuperTypes().add(this.getApplicationAttribute());
    applicationMainActivityEClass.getESuperTypes().add(this.getApplicationAttribute());

    // Initialize classes and features; add operations and parameters
    initEClass(androidAppProjectEClass, AndroidAppProject.class, "AndroidAppProject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAndroidAppProject_Applications(), this.getApplication(), null, "applications", null, 0, -1, AndroidAppProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(applicationEClass, Application.class, "Application", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getApplication_PackageName(), ecorePackage.getEString(), "packageName", null, 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getApplication_Attributes(), this.getApplicationAttribute(), null, "attributes", null, 0, -1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(applicationAttributeEClass, ApplicationAttribute.class, "ApplicationAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(applicationTitleEClass, ApplicationTitle.class, "ApplicationTitle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getApplicationTitle_Title(), ecorePackage.getEString(), "title", null, 0, 1, ApplicationTitle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(applicationMinSdkEClass, ApplicationMinSdk.class, "ApplicationMinSdk", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getApplicationMinSdk_MinSdk(), ecorePackage.getEInt(), "minSdk", null, 0, 1, ApplicationMinSdk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(applicationTargetSdkEClass, ApplicationTargetSdk.class, "ApplicationTargetSdk", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getApplicationTargetSdk_TargetSdk(), ecorePackage.getEInt(), "targetSdk", null, 0, 1, ApplicationTargetSdk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(applicationCompileSdkEClass, ApplicationCompileSdk.class, "ApplicationCompileSdk", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getApplicationCompileSdk_CompileSdk(), ecorePackage.getEInt(), "compileSdk", null, 0, 1, ApplicationCompileSdk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(applicationPermissionListEClass, ApplicationPermissionList.class, "ApplicationPermissionList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getApplicationPermissionList_Permissions(), ecorePackage.getEString(), "permissions", null, 0, -1, ApplicationPermissionList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(applicationElementListEClass, ApplicationElementList.class, "ApplicationElementList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getApplicationElementList_Elements(), ecorePackage.getEString(), "elements", null, 0, -1, ApplicationElementList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(applicationMainActivityEClass, ApplicationMainActivity.class, "ApplicationMainActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getApplicationMainActivity_LauncherActivity(), ecorePackage.getEString(), "launcherActivity", null, 0, 1, ApplicationMainActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //AppDslPackageImpl
