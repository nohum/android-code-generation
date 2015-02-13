/**
 */
package at.fhj.gaar.androidapp.appDsl.util;

import at.fhj.gaar.androidapp.appDsl.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see at.fhj.gaar.androidapp.appDsl.AppDslPackage
 * @generated
 */
public class AppDslSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static AppDslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AppDslSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = AppDslPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case AppDslPackage.ANDROID_APP_PROJECT:
      {
        AndroidAppProject androidAppProject = (AndroidAppProject)theEObject;
        T result = caseAndroidAppProject(androidAppProject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppDslPackage.APPLICATION:
      {
        Application application = (Application)theEObject;
        T result = caseApplication(application);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppDslPackage.PACKAGE_NAME:
      {
        PackageName packageName = (PackageName)theEObject;
        T result = casePackageName(packageName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppDslPackage.APPLICATION_ATTRIBUTE:
      {
        ApplicationAttribute applicationAttribute = (ApplicationAttribute)theEObject;
        T result = caseApplicationAttribute(applicationAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppDslPackage.APPLICATION_MIN_SDK:
      {
        ApplicationMinSdk applicationMinSdk = (ApplicationMinSdk)theEObject;
        T result = caseApplicationMinSdk(applicationMinSdk);
        if (result == null) result = caseApplicationAttribute(applicationMinSdk);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppDslPackage.APPLICATION_TARGET_SDK:
      {
        ApplicationTargetSdk applicationTargetSdk = (ApplicationTargetSdk)theEObject;
        T result = caseApplicationTargetSdk(applicationTargetSdk);
        if (result == null) result = caseApplicationAttribute(applicationTargetSdk);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppDslPackage.APPLICATION_COMPILE_SDK:
      {
        ApplicationCompileSdk applicationCompileSdk = (ApplicationCompileSdk)theEObject;
        T result = caseApplicationCompileSdk(applicationCompileSdk);
        if (result == null) result = caseApplicationAttribute(applicationCompileSdk);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppDslPackage.APPLICATION_PERMISSION_LIST:
      {
        ApplicationPermissionList applicationPermissionList = (ApplicationPermissionList)theEObject;
        T result = caseApplicationPermissionList(applicationPermissionList);
        if (result == null) result = caseApplicationAttribute(applicationPermissionList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppDslPackage.APPLICATION_ELEMENT_LIST:
      {
        ApplicationElementList applicationElementList = (ApplicationElementList)theEObject;
        T result = caseApplicationElementList(applicationElementList);
        if (result == null) result = caseApplicationAttribute(applicationElementList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppDslPackage.APPLICATION_MAIN_ACTIVITY:
      {
        ApplicationMainActivity applicationMainActivity = (ApplicationMainActivity)theEObject;
        T result = caseApplicationMainActivity(applicationMainActivity);
        if (result == null) result = caseApplicationAttribute(applicationMainActivity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppDslPackage.APPLICATION_ELEMENT:
      {
        ApplicationElement applicationElement = (ApplicationElement)theEObject;
        T result = caseApplicationElement(applicationElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppDslPackage.ACTIVITY:
      {
        Activity activity = (Activity)theEObject;
        T result = caseActivity(activity);
        if (result == null) result = caseApplicationElement(activity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppDslPackage.BROADCAST_RECEIVER:
      {
        BroadcastReceiver broadcastReceiver = (BroadcastReceiver)theEObject;
        T result = caseBroadcastReceiver(broadcastReceiver);
        if (result == null) result = caseApplicationElement(broadcastReceiver);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppDslPackage.SERVICE:
      {
        Service service = (Service)theEObject;
        T result = caseService(service);
        if (result == null) result = caseApplicationElement(service);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppDslPackage.ACTIVITY_ATTRIBUTE:
      {
        ActivityAttribute activityAttribute = (ActivityAttribute)theEObject;
        T result = caseActivityAttribute(activityAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppDslPackage.BROADCAST_RECEIVER_ATTRIBUTE:
      {
        BroadcastReceiverAttribute broadcastReceiverAttribute = (BroadcastReceiverAttribute)theEObject;
        T result = caseBroadcastReceiverAttribute(broadcastReceiverAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppDslPackage.SERVICE_ATTRIBUTE:
      {
        ServiceAttribute serviceAttribute = (ServiceAttribute)theEObject;
        T result = caseServiceAttribute(serviceAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppDslPackage.ELEMENT_ENABLED_ATTRIBUTE:
      {
        ElementEnabledAttribute elementEnabledAttribute = (ElementEnabledAttribute)theEObject;
        T result = caseElementEnabledAttribute(elementEnabledAttribute);
        if (result == null) result = caseActivityAttribute(elementEnabledAttribute);
        if (result == null) result = caseBroadcastReceiverAttribute(elementEnabledAttribute);
        if (result == null) result = caseServiceAttribute(elementEnabledAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppDslPackage.ELEMENT_EXPORTED_ATTRIBUTE:
      {
        ElementExportedAttribute elementExportedAttribute = (ElementExportedAttribute)theEObject;
        T result = caseElementExportedAttribute(elementExportedAttribute);
        if (result == null) result = caseActivityAttribute(elementExportedAttribute);
        if (result == null) result = caseBroadcastReceiverAttribute(elementExportedAttribute);
        if (result == null) result = caseServiceAttribute(elementExportedAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppDslPackage.ELEMENT_LABEL_ATTRIBUTE:
      {
        ElementLabelAttribute elementLabelAttribute = (ElementLabelAttribute)theEObject;
        T result = caseElementLabelAttribute(elementLabelAttribute);
        if (result == null) result = caseApplicationAttribute(elementLabelAttribute);
        if (result == null) result = caseActivityAttribute(elementLabelAttribute);
        if (result == null) result = caseBroadcastReceiverAttribute(elementLabelAttribute);
        if (result == null) result = caseServiceAttribute(elementLabelAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppDslPackage.ELEMENT_INTENT_LIST:
      {
        ElementIntentList elementIntentList = (ElementIntentList)theEObject;
        T result = caseElementIntentList(elementIntentList);
        if (result == null) result = caseActivityAttribute(elementIntentList);
        if (result == null) result = caseBroadcastReceiverAttribute(elementIntentList);
        if (result == null) result = caseServiceAttribute(elementIntentList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppDslPackage.ACTIVITY_PARENT_ATTRIBUTE:
      {
        ActivityParentAttribute activityParentAttribute = (ActivityParentAttribute)theEObject;
        T result = caseActivityParentAttribute(activityParentAttribute);
        if (result == null) result = caseActivityAttribute(activityParentAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppDslPackage.ACTIVITY_LAYOUT_ATTRIBUTE:
      {
        ActivityLayoutAttribute activityLayoutAttribute = (ActivityLayoutAttribute)theEObject;
        T result = caseActivityLayoutAttribute(activityLayoutAttribute);
        if (result == null) result = caseActivityAttribute(activityLayoutAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppDslPackage.LAYOUT_ELEMENT:
      {
        LayoutElement layoutElement = (LayoutElement)theEObject;
        T result = caseLayoutElement(layoutElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppDslPackage.BUTTON:
      {
        Button button = (Button)theEObject;
        T result = caseButton(button);
        if (result == null) result = caseLayoutElement(button);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppDslPackage.BUTTON_ATTRIBUTE:
      {
        ButtonAttribute buttonAttribute = (ButtonAttribute)theEObject;
        T result = caseButtonAttribute(buttonAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppDslPackage.BUTTON_LABEL_ATTRIBUTE:
      {
        ButtonLabelAttribute buttonLabelAttribute = (ButtonLabelAttribute)theEObject;
        T result = caseButtonLabelAttribute(buttonLabelAttribute);
        if (result == null) result = caseButtonAttribute(buttonLabelAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppDslPackage.BUTTON_ACTION_ATTRIBUTE:
      {
        ButtonActionAttribute buttonActionAttribute = (ButtonActionAttribute)theEObject;
        T result = caseButtonActionAttribute(buttonActionAttribute);
        if (result == null) result = caseButtonAttribute(buttonActionAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppDslPackage.TEXT:
      {
        Text text = (Text)theEObject;
        T result = caseText(text);
        if (result == null) result = caseLayoutElement(text);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppDslPackage.LAYOUT_ELEMENT_CLICK_ACTION:
      {
        LayoutElementClickAction layoutElementClickAction = (LayoutElementClickAction)theEObject;
        T result = caseLayoutElementClickAction(layoutElementClickAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppDslPackage.BROADCAST_RECEIVER_ACTION_ATTRIBUTE:
      {
        BroadcastReceiverActionAttribute broadcastReceiverActionAttribute = (BroadcastReceiverActionAttribute)theEObject;
        T result = caseBroadcastReceiverActionAttribute(broadcastReceiverActionAttribute);
        if (result == null) result = caseBroadcastReceiverAttribute(broadcastReceiverActionAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppDslPackage.BROADCAST_RECEIVER_ACTION:
      {
        BroadcastReceiverAction broadcastReceiverAction = (BroadcastReceiverAction)theEObject;
        T result = caseBroadcastReceiverAction(broadcastReceiverAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppDslPackage.ACTION_SHOW_TOAST:
      {
        ActionShowToast actionShowToast = (ActionShowToast)theEObject;
        T result = caseActionShowToast(actionShowToast);
        if (result == null) result = caseLayoutElementClickAction(actionShowToast);
        if (result == null) result = caseBroadcastReceiverAction(actionShowToast);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppDslPackage.ACTION_START_ACTIVITY:
      {
        ActionStartActivity actionStartActivity = (ActionStartActivity)theEObject;
        T result = caseActionStartActivity(actionStartActivity);
        if (result == null) result = caseLayoutElementClickAction(actionStartActivity);
        if (result == null) result = caseBroadcastReceiverAction(actionStartActivity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppDslPackage.ACTION_START_SERVICE:
      {
        ActionStartService actionStartService = (ActionStartService)theEObject;
        T result = caseActionStartService(actionStartService);
        if (result == null) result = caseLayoutElementClickAction(actionStartService);
        if (result == null) result = caseBroadcastReceiverAction(actionStartService);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Android App Project</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Android App Project</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAndroidAppProject(AndroidAppProject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Application</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Application</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseApplication(Application object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Package Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Package Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePackageName(PackageName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Application Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Application Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseApplicationAttribute(ApplicationAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Application Min Sdk</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Application Min Sdk</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseApplicationMinSdk(ApplicationMinSdk object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Application Target Sdk</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Application Target Sdk</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseApplicationTargetSdk(ApplicationTargetSdk object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Application Compile Sdk</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Application Compile Sdk</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseApplicationCompileSdk(ApplicationCompileSdk object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Application Permission List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Application Permission List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseApplicationPermissionList(ApplicationPermissionList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Application Element List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Application Element List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseApplicationElementList(ApplicationElementList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Application Main Activity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Application Main Activity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseApplicationMainActivity(ApplicationMainActivity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Application Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Application Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseApplicationElement(ApplicationElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Activity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Activity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActivity(Activity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Broadcast Receiver</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Broadcast Receiver</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBroadcastReceiver(BroadcastReceiver object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Service</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Service</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseService(Service object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Activity Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Activity Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActivityAttribute(ActivityAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Broadcast Receiver Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Broadcast Receiver Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBroadcastReceiverAttribute(BroadcastReceiverAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Service Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Service Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseServiceAttribute(ServiceAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Element Enabled Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element Enabled Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElementEnabledAttribute(ElementEnabledAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Element Exported Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element Exported Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElementExportedAttribute(ElementExportedAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Element Label Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element Label Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElementLabelAttribute(ElementLabelAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Element Intent List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element Intent List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElementIntentList(ElementIntentList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Activity Parent Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Activity Parent Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActivityParentAttribute(ActivityParentAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Activity Layout Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Activity Layout Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActivityLayoutAttribute(ActivityLayoutAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Layout Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Layout Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLayoutElement(LayoutElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Button</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Button</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseButton(Button object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Button Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Button Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseButtonAttribute(ButtonAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Button Label Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Button Label Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseButtonLabelAttribute(ButtonLabelAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Button Action Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Button Action Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseButtonActionAttribute(ButtonActionAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Text</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Text</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseText(Text object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Layout Element Click Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Layout Element Click Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLayoutElementClickAction(LayoutElementClickAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Broadcast Receiver Action Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Broadcast Receiver Action Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBroadcastReceiverActionAttribute(BroadcastReceiverActionAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Broadcast Receiver Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Broadcast Receiver Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBroadcastReceiverAction(BroadcastReceiverAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action Show Toast</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action Show Toast</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActionShowToast(ActionShowToast object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action Start Activity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action Start Activity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActionStartActivity(ActionStartActivity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action Start Service</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action Start Service</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActionStartService(ActionStartService object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //AppDslSwitch
