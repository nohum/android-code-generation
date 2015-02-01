/**
 */
package at.fhj.gaar.androidapp.appDsl.util;

import at.fhj.gaar.androidapp.appDsl.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see at.fhj.gaar.androidapp.appDsl.AppDslPackage
 * @generated
 */
public class AppDslAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static AppDslPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AppDslAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = AppDslPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AppDslSwitch<Adapter> modelSwitch =
    new AppDslSwitch<Adapter>()
    {
      @Override
      public Adapter caseAndroidAppProject(AndroidAppProject object)
      {
        return createAndroidAppProjectAdapter();
      }
      @Override
      public Adapter caseApplication(Application object)
      {
        return createApplicationAdapter();
      }
      @Override
      public Adapter caseApplicationAttribute(ApplicationAttribute object)
      {
        return createApplicationAttributeAdapter();
      }
      @Override
      public Adapter caseApplicationTitle(ApplicationTitle object)
      {
        return createApplicationTitleAdapter();
      }
      @Override
      public Adapter caseApplicationMinSdk(ApplicationMinSdk object)
      {
        return createApplicationMinSdkAdapter();
      }
      @Override
      public Adapter caseApplicationTargetSdk(ApplicationTargetSdk object)
      {
        return createApplicationTargetSdkAdapter();
      }
      @Override
      public Adapter caseApplicationCompileSdk(ApplicationCompileSdk object)
      {
        return createApplicationCompileSdkAdapter();
      }
      @Override
      public Adapter caseApplicationPermissionList(ApplicationPermissionList object)
      {
        return createApplicationPermissionListAdapter();
      }
      @Override
      public Adapter caseApplicationElementList(ApplicationElementList object)
      {
        return createApplicationElementListAdapter();
      }
      @Override
      public Adapter caseApplicationMainActivity(ApplicationMainActivity object)
      {
        return createApplicationMainActivityAdapter();
      }
      @Override
      public Adapter caseApplicationElement(ApplicationElement object)
      {
        return createApplicationElementAdapter();
      }
      @Override
      public Adapter caseActivity(Activity object)
      {
        return createActivityAdapter();
      }
      @Override
      public Adapter caseBroadcastReceiver(BroadcastReceiver object)
      {
        return createBroadcastReceiverAdapter();
      }
      @Override
      public Adapter caseService(Service object)
      {
        return createServiceAdapter();
      }
      @Override
      public Adapter caseActivityAttribute(ActivityAttribute object)
      {
        return createActivityAttributeAdapter();
      }
      @Override
      public Adapter caseBroadcastReceiverAttribute(BroadcastReceiverAttribute object)
      {
        return createBroadcastReceiverAttributeAdapter();
      }
      @Override
      public Adapter caseServiceAttribute(ServiceAttribute object)
      {
        return createServiceAttributeAdapter();
      }
      @Override
      public Adapter caseElementEnabledAttribute(ElementEnabledAttribute object)
      {
        return createElementEnabledAttributeAdapter();
      }
      @Override
      public Adapter caseElementExportedAttribute(ElementExportedAttribute object)
      {
        return createElementExportedAttributeAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link at.fhj.gaar.androidapp.appDsl.AndroidAppProject <em>Android App Project</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.fhj.gaar.androidapp.appDsl.AndroidAppProject
   * @generated
   */
  public Adapter createAndroidAppProjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.fhj.gaar.androidapp.appDsl.Application <em>Application</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.fhj.gaar.androidapp.appDsl.Application
   * @generated
   */
  public Adapter createApplicationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.fhj.gaar.androidapp.appDsl.ApplicationAttribute <em>Application Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.fhj.gaar.androidapp.appDsl.ApplicationAttribute
   * @generated
   */
  public Adapter createApplicationAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.fhj.gaar.androidapp.appDsl.ApplicationTitle <em>Application Title</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.fhj.gaar.androidapp.appDsl.ApplicationTitle
   * @generated
   */
  public Adapter createApplicationTitleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.fhj.gaar.androidapp.appDsl.ApplicationMinSdk <em>Application Min Sdk</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.fhj.gaar.androidapp.appDsl.ApplicationMinSdk
   * @generated
   */
  public Adapter createApplicationMinSdkAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.fhj.gaar.androidapp.appDsl.ApplicationTargetSdk <em>Application Target Sdk</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.fhj.gaar.androidapp.appDsl.ApplicationTargetSdk
   * @generated
   */
  public Adapter createApplicationTargetSdkAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.fhj.gaar.androidapp.appDsl.ApplicationCompileSdk <em>Application Compile Sdk</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.fhj.gaar.androidapp.appDsl.ApplicationCompileSdk
   * @generated
   */
  public Adapter createApplicationCompileSdkAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.fhj.gaar.androidapp.appDsl.ApplicationPermissionList <em>Application Permission List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.fhj.gaar.androidapp.appDsl.ApplicationPermissionList
   * @generated
   */
  public Adapter createApplicationPermissionListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.fhj.gaar.androidapp.appDsl.ApplicationElementList <em>Application Element List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.fhj.gaar.androidapp.appDsl.ApplicationElementList
   * @generated
   */
  public Adapter createApplicationElementListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.fhj.gaar.androidapp.appDsl.ApplicationMainActivity <em>Application Main Activity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.fhj.gaar.androidapp.appDsl.ApplicationMainActivity
   * @generated
   */
  public Adapter createApplicationMainActivityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.fhj.gaar.androidapp.appDsl.ApplicationElement <em>Application Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.fhj.gaar.androidapp.appDsl.ApplicationElement
   * @generated
   */
  public Adapter createApplicationElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.fhj.gaar.androidapp.appDsl.Activity <em>Activity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.fhj.gaar.androidapp.appDsl.Activity
   * @generated
   */
  public Adapter createActivityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.fhj.gaar.androidapp.appDsl.BroadcastReceiver <em>Broadcast Receiver</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.fhj.gaar.androidapp.appDsl.BroadcastReceiver
   * @generated
   */
  public Adapter createBroadcastReceiverAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.fhj.gaar.androidapp.appDsl.Service <em>Service</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.fhj.gaar.androidapp.appDsl.Service
   * @generated
   */
  public Adapter createServiceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.fhj.gaar.androidapp.appDsl.ActivityAttribute <em>Activity Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.fhj.gaar.androidapp.appDsl.ActivityAttribute
   * @generated
   */
  public Adapter createActivityAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.fhj.gaar.androidapp.appDsl.BroadcastReceiverAttribute <em>Broadcast Receiver Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.fhj.gaar.androidapp.appDsl.BroadcastReceiverAttribute
   * @generated
   */
  public Adapter createBroadcastReceiverAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.fhj.gaar.androidapp.appDsl.ServiceAttribute <em>Service Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.fhj.gaar.androidapp.appDsl.ServiceAttribute
   * @generated
   */
  public Adapter createServiceAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.fhj.gaar.androidapp.appDsl.ElementEnabledAttribute <em>Element Enabled Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.fhj.gaar.androidapp.appDsl.ElementEnabledAttribute
   * @generated
   */
  public Adapter createElementEnabledAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.fhj.gaar.androidapp.appDsl.ElementExportedAttribute <em>Element Exported Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.fhj.gaar.androidapp.appDsl.ElementExportedAttribute
   * @generated
   */
  public Adapter createElementExportedAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //AppDslAdapterFactory
