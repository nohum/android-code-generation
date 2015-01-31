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
      case AppDslPackage.APPLICATION_TITLE: return createApplicationTitle();
      case AppDslPackage.APPLICATION_MIN_SDK: return createApplicationMinSdk();
      case AppDslPackage.APPLICATION_TARGET_SDK: return createApplicationTargetSdk();
      case AppDslPackage.APPLICATION_COMPILE_SDK: return createApplicationCompileSdk();
      case AppDslPackage.APPLICATION_PERMISSION_LIST: return createApplicationPermissionList();
      case AppDslPackage.APPLICATION_ELEMENT_LIST: return createApplicationElementList();
      case AppDslPackage.APPLICATION_MAIN_ACTIVITY: return createApplicationMainActivity();
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
  public ApplicationTitle createApplicationTitle()
  {
    ApplicationTitleImpl applicationTitle = new ApplicationTitleImpl();
    return applicationTitle;
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
