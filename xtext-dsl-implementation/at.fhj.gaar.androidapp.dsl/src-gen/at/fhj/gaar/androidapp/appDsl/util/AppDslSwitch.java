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
      case AppDslPackage.APPLICATION_ATTRIBUTE:
      {
        ApplicationAttribute applicationAttribute = (ApplicationAttribute)theEObject;
        T result = caseApplicationAttribute(applicationAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AppDslPackage.APPLICATION_TITLE:
      {
        ApplicationTitle applicationTitle = (ApplicationTitle)theEObject;
        T result = caseApplicationTitle(applicationTitle);
        if (result == null) result = caseApplicationAttribute(applicationTitle);
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
   * Returns the result of interpreting the object as an instance of '<em>Application Title</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Application Title</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseApplicationTitle(ApplicationTitle object)
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
