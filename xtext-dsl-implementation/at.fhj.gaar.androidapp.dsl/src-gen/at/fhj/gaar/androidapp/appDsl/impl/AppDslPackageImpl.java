/**
 */
package at.fhj.gaar.androidapp.appDsl.impl;

import at.fhj.gaar.androidapp.appDsl.ActionShowToast;
import at.fhj.gaar.androidapp.appDsl.ActionStartActivity;
import at.fhj.gaar.androidapp.appDsl.ActionStartService;
import at.fhj.gaar.androidapp.appDsl.Activity;
import at.fhj.gaar.androidapp.appDsl.ActivityAttribute;
import at.fhj.gaar.androidapp.appDsl.ActivityLayoutAttribute;
import at.fhj.gaar.androidapp.appDsl.ActivityParentAttribute;
import at.fhj.gaar.androidapp.appDsl.AndroidAppProject;
import at.fhj.gaar.androidapp.appDsl.AppDslFactory;
import at.fhj.gaar.androidapp.appDsl.AppDslPackage;
import at.fhj.gaar.androidapp.appDsl.Application;
import at.fhj.gaar.androidapp.appDsl.ApplicationAttribute;
import at.fhj.gaar.androidapp.appDsl.ApplicationCompileSdk;
import at.fhj.gaar.androidapp.appDsl.ApplicationElement;
import at.fhj.gaar.androidapp.appDsl.ApplicationElementList;
import at.fhj.gaar.androidapp.appDsl.ApplicationMainActivity;
import at.fhj.gaar.androidapp.appDsl.ApplicationMinSdk;
import at.fhj.gaar.androidapp.appDsl.ApplicationPermissionList;
import at.fhj.gaar.androidapp.appDsl.ApplicationTargetSdk;
import at.fhj.gaar.androidapp.appDsl.BroadcastReceiver;
import at.fhj.gaar.androidapp.appDsl.BroadcastReceiverAction;
import at.fhj.gaar.androidapp.appDsl.BroadcastReceiverActionAttribute;
import at.fhj.gaar.androidapp.appDsl.BroadcastReceiverAttribute;
import at.fhj.gaar.androidapp.appDsl.Button;
import at.fhj.gaar.androidapp.appDsl.ButtonActionAttribute;
import at.fhj.gaar.androidapp.appDsl.ButtonAttribute;
import at.fhj.gaar.androidapp.appDsl.ButtonLabelAttribute;
import at.fhj.gaar.androidapp.appDsl.ElementEnabledAttribute;
import at.fhj.gaar.androidapp.appDsl.ElementExportedAttribute;
import at.fhj.gaar.androidapp.appDsl.ElementIntentList;
import at.fhj.gaar.androidapp.appDsl.ElementLabelAttribute;
import at.fhj.gaar.androidapp.appDsl.LayoutElement;
import at.fhj.gaar.androidapp.appDsl.LayoutElementClickAction;
import at.fhj.gaar.androidapp.appDsl.Service;
import at.fhj.gaar.androidapp.appDsl.ServiceAttribute;
import at.fhj.gaar.androidapp.appDsl.Text;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass applicationElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass activityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass broadcastReceiverEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass serviceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass activityAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass broadcastReceiverAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass serviceAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass elementEnabledAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass elementExportedAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass elementLabelAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass elementIntentListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass activityParentAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass activityLayoutAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass layoutElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass buttonEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass buttonAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass buttonLabelAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass buttonActionAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass textEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass layoutElementClickActionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass broadcastReceiverActionAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass broadcastReceiverActionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass actionShowToastEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass actionStartActivityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass actionStartServiceEClass = null;

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
  public EAttribute getApplication_Name()
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
  public EReference getApplicationElementList_Elements()
  {
    return (EReference)applicationElementListEClass.getEStructuralFeatures().get(0);
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
  public EReference getApplicationMainActivity_LauncherActivity()
  {
    return (EReference)applicationMainActivityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getApplicationElement()
  {
    return applicationElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getApplicationElement_Name()
  {
    return (EAttribute)applicationElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getActivity()
  {
    return activityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActivity_Attributes()
  {
    return (EReference)activityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBroadcastReceiver()
  {
    return broadcastReceiverEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBroadcastReceiver_Attributes()
  {
    return (EReference)broadcastReceiverEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getService()
  {
    return serviceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getService_Attributes()
  {
    return (EReference)serviceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getActivityAttribute()
  {
    return activityAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBroadcastReceiverAttribute()
  {
    return broadcastReceiverAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getServiceAttribute()
  {
    return serviceAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getElementEnabledAttribute()
  {
    return elementEnabledAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getElementEnabledAttribute_Enabled()
  {
    return (EAttribute)elementEnabledAttributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getElementExportedAttribute()
  {
    return elementExportedAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getElementExportedAttribute_Exported()
  {
    return (EAttribute)elementExportedAttributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getElementLabelAttribute()
  {
    return elementLabelAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getElementLabelAttribute_Title()
  {
    return (EAttribute)elementLabelAttributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getElementIntentList()
  {
    return elementIntentListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getElementIntentList_Intents()
  {
    return (EAttribute)elementIntentListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getActivityParentAttribute()
  {
    return activityParentAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActivityParentAttribute_Parent()
  {
    return (EReference)activityParentAttributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getActivityLayoutAttribute()
  {
    return activityLayoutAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActivityLayoutAttribute_LayoutElements()
  {
    return (EReference)activityLayoutAttributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLayoutElement()
  {
    return layoutElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getButton()
  {
    return buttonEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getButton_Name()
  {
    return (EAttribute)buttonEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getButton_Attributes()
  {
    return (EReference)buttonEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getButtonAttribute()
  {
    return buttonAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getButtonLabelAttribute()
  {
    return buttonLabelAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getButtonLabelAttribute_Title()
  {
    return (EAttribute)buttonLabelAttributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getButtonActionAttribute()
  {
    return buttonActionAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getButtonActionAttribute_Action()
  {
    return (EReference)buttonActionAttributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getText()
  {
    return textEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getText_Text()
  {
    return (EAttribute)textEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLayoutElementClickAction()
  {
    return layoutElementClickActionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBroadcastReceiverActionAttribute()
  {
    return broadcastReceiverActionAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBroadcastReceiverActionAttribute_Action()
  {
    return (EReference)broadcastReceiverActionAttributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBroadcastReceiverAction()
  {
    return broadcastReceiverActionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getActionShowToast()
  {
    return actionShowToastEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getActionShowToast_ToastText()
  {
    return (EAttribute)actionShowToastEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getActionStartActivity()
  {
    return actionStartActivityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActionStartActivity_Activity()
  {
    return (EReference)actionStartActivityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getActionStartService()
  {
    return actionStartServiceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActionStartService_Service()
  {
    return (EReference)actionStartServiceEClass.getEStructuralFeatures().get(0);
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
    createEAttribute(applicationEClass, APPLICATION__NAME);
    createEReference(applicationEClass, APPLICATION__ATTRIBUTES);

    applicationAttributeEClass = createEClass(APPLICATION_ATTRIBUTE);

    applicationMinSdkEClass = createEClass(APPLICATION_MIN_SDK);
    createEAttribute(applicationMinSdkEClass, APPLICATION_MIN_SDK__MIN_SDK);

    applicationTargetSdkEClass = createEClass(APPLICATION_TARGET_SDK);
    createEAttribute(applicationTargetSdkEClass, APPLICATION_TARGET_SDK__TARGET_SDK);

    applicationCompileSdkEClass = createEClass(APPLICATION_COMPILE_SDK);
    createEAttribute(applicationCompileSdkEClass, APPLICATION_COMPILE_SDK__COMPILE_SDK);

    applicationPermissionListEClass = createEClass(APPLICATION_PERMISSION_LIST);
    createEAttribute(applicationPermissionListEClass, APPLICATION_PERMISSION_LIST__PERMISSIONS);

    applicationElementListEClass = createEClass(APPLICATION_ELEMENT_LIST);
    createEReference(applicationElementListEClass, APPLICATION_ELEMENT_LIST__ELEMENTS);

    applicationMainActivityEClass = createEClass(APPLICATION_MAIN_ACTIVITY);
    createEReference(applicationMainActivityEClass, APPLICATION_MAIN_ACTIVITY__LAUNCHER_ACTIVITY);

    applicationElementEClass = createEClass(APPLICATION_ELEMENT);
    createEAttribute(applicationElementEClass, APPLICATION_ELEMENT__NAME);

    activityEClass = createEClass(ACTIVITY);
    createEReference(activityEClass, ACTIVITY__ATTRIBUTES);

    broadcastReceiverEClass = createEClass(BROADCAST_RECEIVER);
    createEReference(broadcastReceiverEClass, BROADCAST_RECEIVER__ATTRIBUTES);

    serviceEClass = createEClass(SERVICE);
    createEReference(serviceEClass, SERVICE__ATTRIBUTES);

    activityAttributeEClass = createEClass(ACTIVITY_ATTRIBUTE);

    broadcastReceiverAttributeEClass = createEClass(BROADCAST_RECEIVER_ATTRIBUTE);

    serviceAttributeEClass = createEClass(SERVICE_ATTRIBUTE);

    elementEnabledAttributeEClass = createEClass(ELEMENT_ENABLED_ATTRIBUTE);
    createEAttribute(elementEnabledAttributeEClass, ELEMENT_ENABLED_ATTRIBUTE__ENABLED);

    elementExportedAttributeEClass = createEClass(ELEMENT_EXPORTED_ATTRIBUTE);
    createEAttribute(elementExportedAttributeEClass, ELEMENT_EXPORTED_ATTRIBUTE__EXPORTED);

    elementLabelAttributeEClass = createEClass(ELEMENT_LABEL_ATTRIBUTE);
    createEAttribute(elementLabelAttributeEClass, ELEMENT_LABEL_ATTRIBUTE__TITLE);

    elementIntentListEClass = createEClass(ELEMENT_INTENT_LIST);
    createEAttribute(elementIntentListEClass, ELEMENT_INTENT_LIST__INTENTS);

    activityParentAttributeEClass = createEClass(ACTIVITY_PARENT_ATTRIBUTE);
    createEReference(activityParentAttributeEClass, ACTIVITY_PARENT_ATTRIBUTE__PARENT);

    activityLayoutAttributeEClass = createEClass(ACTIVITY_LAYOUT_ATTRIBUTE);
    createEReference(activityLayoutAttributeEClass, ACTIVITY_LAYOUT_ATTRIBUTE__LAYOUT_ELEMENTS);

    layoutElementEClass = createEClass(LAYOUT_ELEMENT);

    buttonEClass = createEClass(BUTTON);
    createEAttribute(buttonEClass, BUTTON__NAME);
    createEReference(buttonEClass, BUTTON__ATTRIBUTES);

    buttonAttributeEClass = createEClass(BUTTON_ATTRIBUTE);

    buttonLabelAttributeEClass = createEClass(BUTTON_LABEL_ATTRIBUTE);
    createEAttribute(buttonLabelAttributeEClass, BUTTON_LABEL_ATTRIBUTE__TITLE);

    buttonActionAttributeEClass = createEClass(BUTTON_ACTION_ATTRIBUTE);
    createEReference(buttonActionAttributeEClass, BUTTON_ACTION_ATTRIBUTE__ACTION);

    textEClass = createEClass(TEXT);
    createEAttribute(textEClass, TEXT__TEXT);

    layoutElementClickActionEClass = createEClass(LAYOUT_ELEMENT_CLICK_ACTION);

    broadcastReceiverActionAttributeEClass = createEClass(BROADCAST_RECEIVER_ACTION_ATTRIBUTE);
    createEReference(broadcastReceiverActionAttributeEClass, BROADCAST_RECEIVER_ACTION_ATTRIBUTE__ACTION);

    broadcastReceiverActionEClass = createEClass(BROADCAST_RECEIVER_ACTION);

    actionShowToastEClass = createEClass(ACTION_SHOW_TOAST);
    createEAttribute(actionShowToastEClass, ACTION_SHOW_TOAST__TOAST_TEXT);

    actionStartActivityEClass = createEClass(ACTION_START_ACTIVITY);
    createEReference(actionStartActivityEClass, ACTION_START_ACTIVITY__ACTIVITY);

    actionStartServiceEClass = createEClass(ACTION_START_SERVICE);
    createEReference(actionStartServiceEClass, ACTION_START_SERVICE__SERVICE);
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
    applicationMinSdkEClass.getESuperTypes().add(this.getApplicationAttribute());
    applicationTargetSdkEClass.getESuperTypes().add(this.getApplicationAttribute());
    applicationCompileSdkEClass.getESuperTypes().add(this.getApplicationAttribute());
    applicationPermissionListEClass.getESuperTypes().add(this.getApplicationAttribute());
    applicationElementListEClass.getESuperTypes().add(this.getApplicationAttribute());
    applicationMainActivityEClass.getESuperTypes().add(this.getApplicationAttribute());
    activityEClass.getESuperTypes().add(this.getApplicationElement());
    broadcastReceiverEClass.getESuperTypes().add(this.getApplicationElement());
    serviceEClass.getESuperTypes().add(this.getApplicationElement());
    elementEnabledAttributeEClass.getESuperTypes().add(this.getActivityAttribute());
    elementEnabledAttributeEClass.getESuperTypes().add(this.getBroadcastReceiverAttribute());
    elementEnabledAttributeEClass.getESuperTypes().add(this.getServiceAttribute());
    elementExportedAttributeEClass.getESuperTypes().add(this.getActivityAttribute());
    elementExportedAttributeEClass.getESuperTypes().add(this.getBroadcastReceiverAttribute());
    elementExportedAttributeEClass.getESuperTypes().add(this.getServiceAttribute());
    elementLabelAttributeEClass.getESuperTypes().add(this.getApplicationAttribute());
    elementLabelAttributeEClass.getESuperTypes().add(this.getActivityAttribute());
    elementLabelAttributeEClass.getESuperTypes().add(this.getBroadcastReceiverAttribute());
    elementLabelAttributeEClass.getESuperTypes().add(this.getServiceAttribute());
    elementIntentListEClass.getESuperTypes().add(this.getActivityAttribute());
    elementIntentListEClass.getESuperTypes().add(this.getBroadcastReceiverAttribute());
    elementIntentListEClass.getESuperTypes().add(this.getServiceAttribute());
    activityParentAttributeEClass.getESuperTypes().add(this.getActivityAttribute());
    activityLayoutAttributeEClass.getESuperTypes().add(this.getActivityAttribute());
    buttonEClass.getESuperTypes().add(this.getLayoutElement());
    buttonLabelAttributeEClass.getESuperTypes().add(this.getButtonAttribute());
    buttonActionAttributeEClass.getESuperTypes().add(this.getButtonAttribute());
    textEClass.getESuperTypes().add(this.getLayoutElement());
    broadcastReceiverActionAttributeEClass.getESuperTypes().add(this.getBroadcastReceiverAttribute());
    actionShowToastEClass.getESuperTypes().add(this.getLayoutElementClickAction());
    actionShowToastEClass.getESuperTypes().add(this.getBroadcastReceiverAction());
    actionStartActivityEClass.getESuperTypes().add(this.getLayoutElementClickAction());
    actionStartActivityEClass.getESuperTypes().add(this.getBroadcastReceiverAction());
    actionStartServiceEClass.getESuperTypes().add(this.getLayoutElementClickAction());
    actionStartServiceEClass.getESuperTypes().add(this.getBroadcastReceiverAction());

    // Initialize classes and features; add operations and parameters
    initEClass(androidAppProjectEClass, AndroidAppProject.class, "AndroidAppProject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAndroidAppProject_Applications(), this.getApplication(), null, "applications", null, 0, -1, AndroidAppProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(applicationEClass, Application.class, "Application", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getApplication_Name(), ecorePackage.getEString(), "name", null, 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getApplication_Attributes(), this.getApplicationAttribute(), null, "attributes", null, 0, -1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(applicationAttributeEClass, ApplicationAttribute.class, "ApplicationAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(applicationMinSdkEClass, ApplicationMinSdk.class, "ApplicationMinSdk", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getApplicationMinSdk_MinSdk(), ecorePackage.getEInt(), "minSdk", null, 0, 1, ApplicationMinSdk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(applicationTargetSdkEClass, ApplicationTargetSdk.class, "ApplicationTargetSdk", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getApplicationTargetSdk_TargetSdk(), ecorePackage.getEInt(), "targetSdk", null, 0, 1, ApplicationTargetSdk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(applicationCompileSdkEClass, ApplicationCompileSdk.class, "ApplicationCompileSdk", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getApplicationCompileSdk_CompileSdk(), ecorePackage.getEInt(), "compileSdk", null, 0, 1, ApplicationCompileSdk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(applicationPermissionListEClass, ApplicationPermissionList.class, "ApplicationPermissionList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getApplicationPermissionList_Permissions(), ecorePackage.getEString(), "permissions", null, 0, -1, ApplicationPermissionList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(applicationElementListEClass, ApplicationElementList.class, "ApplicationElementList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getApplicationElementList_Elements(), this.getApplicationElement(), null, "elements", null, 0, -1, ApplicationElementList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(applicationMainActivityEClass, ApplicationMainActivity.class, "ApplicationMainActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getApplicationMainActivity_LauncherActivity(), this.getActivity(), null, "launcherActivity", null, 0, 1, ApplicationMainActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(applicationElementEClass, ApplicationElement.class, "ApplicationElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getApplicationElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, ApplicationElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(activityEClass, Activity.class, "Activity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getActivity_Attributes(), this.getActivityAttribute(), null, "attributes", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(broadcastReceiverEClass, BroadcastReceiver.class, "BroadcastReceiver", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBroadcastReceiver_Attributes(), this.getBroadcastReceiverAttribute(), null, "attributes", null, 0, -1, BroadcastReceiver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(serviceEClass, Service.class, "Service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getService_Attributes(), this.getServiceAttribute(), null, "attributes", null, 0, -1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(activityAttributeEClass, ActivityAttribute.class, "ActivityAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(broadcastReceiverAttributeEClass, BroadcastReceiverAttribute.class, "BroadcastReceiverAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(serviceAttributeEClass, ServiceAttribute.class, "ServiceAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(elementEnabledAttributeEClass, ElementEnabledAttribute.class, "ElementEnabledAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getElementEnabledAttribute_Enabled(), ecorePackage.getEBoolean(), "enabled", null, 0, 1, ElementEnabledAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(elementExportedAttributeEClass, ElementExportedAttribute.class, "ElementExportedAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getElementExportedAttribute_Exported(), ecorePackage.getEBoolean(), "exported", null, 0, 1, ElementExportedAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(elementLabelAttributeEClass, ElementLabelAttribute.class, "ElementLabelAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getElementLabelAttribute_Title(), ecorePackage.getEString(), "title", null, 0, 1, ElementLabelAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(elementIntentListEClass, ElementIntentList.class, "ElementIntentList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getElementIntentList_Intents(), ecorePackage.getEString(), "intents", null, 0, -1, ElementIntentList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(activityParentAttributeEClass, ActivityParentAttribute.class, "ActivityParentAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getActivityParentAttribute_Parent(), this.getActivity(), null, "parent", null, 0, 1, ActivityParentAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(activityLayoutAttributeEClass, ActivityLayoutAttribute.class, "ActivityLayoutAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getActivityLayoutAttribute_LayoutElements(), this.getLayoutElement(), null, "layoutElements", null, 0, -1, ActivityLayoutAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(layoutElementEClass, LayoutElement.class, "LayoutElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(buttonEClass, Button.class, "Button", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getButton_Name(), ecorePackage.getEString(), "name", null, 0, 1, Button.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getButton_Attributes(), this.getButtonAttribute(), null, "attributes", null, 0, -1, Button.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(buttonAttributeEClass, ButtonAttribute.class, "ButtonAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(buttonLabelAttributeEClass, ButtonLabelAttribute.class, "ButtonLabelAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getButtonLabelAttribute_Title(), ecorePackage.getEString(), "title", null, 0, 1, ButtonLabelAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(buttonActionAttributeEClass, ButtonActionAttribute.class, "ButtonActionAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getButtonActionAttribute_Action(), this.getLayoutElementClickAction(), null, "action", null, 0, 1, ButtonActionAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(textEClass, Text.class, "Text", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getText_Text(), ecorePackage.getEString(), "text", null, 0, 1, Text.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(layoutElementClickActionEClass, LayoutElementClickAction.class, "LayoutElementClickAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(broadcastReceiverActionAttributeEClass, BroadcastReceiverActionAttribute.class, "BroadcastReceiverActionAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBroadcastReceiverActionAttribute_Action(), this.getBroadcastReceiverAction(), null, "action", null, 0, 1, BroadcastReceiverActionAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(broadcastReceiverActionEClass, BroadcastReceiverAction.class, "BroadcastReceiverAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(actionShowToastEClass, ActionShowToast.class, "ActionShowToast", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getActionShowToast_ToastText(), ecorePackage.getEString(), "toastText", null, 0, 1, ActionShowToast.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(actionStartActivityEClass, ActionStartActivity.class, "ActionStartActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getActionStartActivity_Activity(), this.getActivity(), null, "activity", null, 0, 1, ActionStartActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(actionStartServiceEClass, ActionStartService.class, "ActionStartService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getActionStartService_Service(), this.getService(), null, "service", null, 0, 1, ActionStartService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //AppDslPackageImpl
