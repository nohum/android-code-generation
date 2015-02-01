/**
 */
package at.fhj.gaar.androidapp.appDsl.impl;

import at.fhj.gaar.androidapp.appDsl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AppDslFactoryImpl extends EFactoryImpl implements AppDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static AppDslFactory init()
  {
    try
    {
      AppDslFactory theAppDslFactory = (AppDslFactory)EPackage.Registry.INSTANCE.getEFactory(AppDslPackage.eNS_URI);
      if (theAppDslFactory != null)
      {
        return theAppDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new AppDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AppDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case AppDslPackage.ANDROID_APP_PROJECT: return createAndroidAppProject();
      case AppDslPackage.APPLICATION: return createApplication();
      case AppDslPackage.APPLICATION_ATTRIBUTE: return createApplicationAttribute();
      case AppDslPackage.APPLICATION_MIN_SDK: return createApplicationMinSdk();
      case AppDslPackage.APPLICATION_TARGET_SDK: return createApplicationTargetSdk();
      case AppDslPackage.APPLICATION_COMPILE_SDK: return createApplicationCompileSdk();
      case AppDslPackage.APPLICATION_PERMISSION_LIST: return createApplicationPermissionList();
      case AppDslPackage.APPLICATION_ELEMENT_LIST: return createApplicationElementList();
      case AppDslPackage.APPLICATION_MAIN_ACTIVITY: return createApplicationMainActivity();
      case AppDslPackage.APPLICATION_ELEMENT: return createApplicationElement();
      case AppDslPackage.ACTIVITY: return createActivity();
      case AppDslPackage.BROADCAST_RECEIVER: return createBroadcastReceiver();
      case AppDslPackage.SERVICE: return createService();
      case AppDslPackage.ACTIVITY_ATTRIBUTE: return createActivityAttribute();
      case AppDslPackage.BROADCAST_RECEIVER_ATTRIBUTE: return createBroadcastReceiverAttribute();
      case AppDslPackage.SERVICE_ATTRIBUTE: return createServiceAttribute();
      case AppDslPackage.ELEMENT_ENABLED_ATTRIBUTE: return createElementEnabledAttribute();
      case AppDslPackage.ELEMENT_EXPORTED_ATTRIBUTE: return createElementExportedAttribute();
      case AppDslPackage.ELEMENT_LABEL_ATTRIBUTE: return createElementLabelAttribute();
      case AppDslPackage.ELEMENT_INTENT_LIST: return createElementIntentList();
      case AppDslPackage.ACTIVITY_PARENT_ATTRIBUTE: return createActivityParentAttribute();
      case AppDslPackage.ACTIVITY_LAYOUT_ATTRIBUTE: return createActivityLayoutAttribute();
      case AppDslPackage.LAYOUT_ELEMENT: return createLayoutElement();
      case AppDslPackage.BUTTON: return createButton();
      case AppDslPackage.BUTTON_ATTRIBUTE: return createButtonAttribute();
      case AppDslPackage.BUTTON_LABEL_ATTRIBUTE: return createButtonLabelAttribute();
      case AppDslPackage.BUTTON_ACTION_ATTRIBUTE: return createButtonActionAttribute();
      case AppDslPackage.TEXT: return createText();
      case AppDslPackage.LAYOUT_ELEMENT_CLICK_ACTION: return createLayoutElementClickAction();
      case AppDslPackage.BROADCAST_RECEIVER_ACTION_ATTRIBUTE: return createBroadcastReceiverActionAttribute();
      case AppDslPackage.BROADCAST_RECEIVER_ACTION: return createBroadcastReceiverAction();
      case AppDslPackage.ACTION_SHOW_TOAST: return createActionShowToast();
      case AppDslPackage.ACTION_START_ACTIVITY: return createActionStartActivity();
      case AppDslPackage.ACTION_START_SERVICE: return createActionStartService();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AndroidAppProject createAndroidAppProject()
  {
    AndroidAppProjectImpl androidAppProject = new AndroidAppProjectImpl();
    return androidAppProject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Application createApplication()
  {
    ApplicationImpl application = new ApplicationImpl();
    return application;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ApplicationAttribute createApplicationAttribute()
  {
    ApplicationAttributeImpl applicationAttribute = new ApplicationAttributeImpl();
    return applicationAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ApplicationMinSdk createApplicationMinSdk()
  {
    ApplicationMinSdkImpl applicationMinSdk = new ApplicationMinSdkImpl();
    return applicationMinSdk;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ApplicationTargetSdk createApplicationTargetSdk()
  {
    ApplicationTargetSdkImpl applicationTargetSdk = new ApplicationTargetSdkImpl();
    return applicationTargetSdk;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ApplicationCompileSdk createApplicationCompileSdk()
  {
    ApplicationCompileSdkImpl applicationCompileSdk = new ApplicationCompileSdkImpl();
    return applicationCompileSdk;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ApplicationPermissionList createApplicationPermissionList()
  {
    ApplicationPermissionListImpl applicationPermissionList = new ApplicationPermissionListImpl();
    return applicationPermissionList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ApplicationElementList createApplicationElementList()
  {
    ApplicationElementListImpl applicationElementList = new ApplicationElementListImpl();
    return applicationElementList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ApplicationMainActivity createApplicationMainActivity()
  {
    ApplicationMainActivityImpl applicationMainActivity = new ApplicationMainActivityImpl();
    return applicationMainActivity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ApplicationElement createApplicationElement()
  {
    ApplicationElementImpl applicationElement = new ApplicationElementImpl();
    return applicationElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Activity createActivity()
  {
    ActivityImpl activity = new ActivityImpl();
    return activity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BroadcastReceiver createBroadcastReceiver()
  {
    BroadcastReceiverImpl broadcastReceiver = new BroadcastReceiverImpl();
    return broadcastReceiver;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Service createService()
  {
    ServiceImpl service = new ServiceImpl();
    return service;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActivityAttribute createActivityAttribute()
  {
    ActivityAttributeImpl activityAttribute = new ActivityAttributeImpl();
    return activityAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BroadcastReceiverAttribute createBroadcastReceiverAttribute()
  {
    BroadcastReceiverAttributeImpl broadcastReceiverAttribute = new BroadcastReceiverAttributeImpl();
    return broadcastReceiverAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServiceAttribute createServiceAttribute()
  {
    ServiceAttributeImpl serviceAttribute = new ServiceAttributeImpl();
    return serviceAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementEnabledAttribute createElementEnabledAttribute()
  {
    ElementEnabledAttributeImpl elementEnabledAttribute = new ElementEnabledAttributeImpl();
    return elementEnabledAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementExportedAttribute createElementExportedAttribute()
  {
    ElementExportedAttributeImpl elementExportedAttribute = new ElementExportedAttributeImpl();
    return elementExportedAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementLabelAttribute createElementLabelAttribute()
  {
    ElementLabelAttributeImpl elementLabelAttribute = new ElementLabelAttributeImpl();
    return elementLabelAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementIntentList createElementIntentList()
  {
    ElementIntentListImpl elementIntentList = new ElementIntentListImpl();
    return elementIntentList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActivityParentAttribute createActivityParentAttribute()
  {
    ActivityParentAttributeImpl activityParentAttribute = new ActivityParentAttributeImpl();
    return activityParentAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActivityLayoutAttribute createActivityLayoutAttribute()
  {
    ActivityLayoutAttributeImpl activityLayoutAttribute = new ActivityLayoutAttributeImpl();
    return activityLayoutAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LayoutElement createLayoutElement()
  {
    LayoutElementImpl layoutElement = new LayoutElementImpl();
    return layoutElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Button createButton()
  {
    ButtonImpl button = new ButtonImpl();
    return button;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ButtonAttribute createButtonAttribute()
  {
    ButtonAttributeImpl buttonAttribute = new ButtonAttributeImpl();
    return buttonAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ButtonLabelAttribute createButtonLabelAttribute()
  {
    ButtonLabelAttributeImpl buttonLabelAttribute = new ButtonLabelAttributeImpl();
    return buttonLabelAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ButtonActionAttribute createButtonActionAttribute()
  {
    ButtonActionAttributeImpl buttonActionAttribute = new ButtonActionAttributeImpl();
    return buttonActionAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Text createText()
  {
    TextImpl text = new TextImpl();
    return text;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LayoutElementClickAction createLayoutElementClickAction()
  {
    LayoutElementClickActionImpl layoutElementClickAction = new LayoutElementClickActionImpl();
    return layoutElementClickAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BroadcastReceiverActionAttribute createBroadcastReceiverActionAttribute()
  {
    BroadcastReceiverActionAttributeImpl broadcastReceiverActionAttribute = new BroadcastReceiverActionAttributeImpl();
    return broadcastReceiverActionAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BroadcastReceiverAction createBroadcastReceiverAction()
  {
    BroadcastReceiverActionImpl broadcastReceiverAction = new BroadcastReceiverActionImpl();
    return broadcastReceiverAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionShowToast createActionShowToast()
  {
    ActionShowToastImpl actionShowToast = new ActionShowToastImpl();
    return actionShowToast;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionStartActivity createActionStartActivity()
  {
    ActionStartActivityImpl actionStartActivity = new ActionStartActivityImpl();
    return actionStartActivity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionStartService createActionStartService()
  {
    ActionStartServiceImpl actionStartService = new ActionStartServiceImpl();
    return actionStartService;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AppDslPackage getAppDslPackage()
  {
    return (AppDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static AppDslPackage getPackage()
  {
    return AppDslPackage.eINSTANCE;
  }

} //AppDslFactoryImpl
