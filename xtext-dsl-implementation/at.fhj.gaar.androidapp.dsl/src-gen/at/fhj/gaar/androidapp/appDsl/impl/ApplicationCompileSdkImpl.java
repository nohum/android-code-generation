/**
 */
package at.fhj.gaar.androidapp.appDsl.impl;

import at.fhj.gaar.androidapp.appDsl.AppDslPackage;
import at.fhj.gaar.androidapp.appDsl.ApplicationCompileSdk;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application Compile Sdk</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.fhj.gaar.androidapp.appDsl.impl.ApplicationCompileSdkImpl#getCompileSdk <em>Compile Sdk</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplicationCompileSdkImpl extends ApplicationAttributeImpl implements ApplicationCompileSdk
{
  /**
   * The default value of the '{@link #getCompileSdk() <em>Compile Sdk</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCompileSdk()
   * @generated
   * @ordered
   */
  protected static final int COMPILE_SDK_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getCompileSdk() <em>Compile Sdk</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCompileSdk()
   * @generated
   * @ordered
   */
  protected int compileSdk = COMPILE_SDK_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ApplicationCompileSdkImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return AppDslPackage.Literals.APPLICATION_COMPILE_SDK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getCompileSdk()
  {
    return compileSdk;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCompileSdk(int newCompileSdk)
  {
    int oldCompileSdk = compileSdk;
    compileSdk = newCompileSdk;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AppDslPackage.APPLICATION_COMPILE_SDK__COMPILE_SDK, oldCompileSdk, compileSdk));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case AppDslPackage.APPLICATION_COMPILE_SDK__COMPILE_SDK:
        return getCompileSdk();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AppDslPackage.APPLICATION_COMPILE_SDK__COMPILE_SDK:
        setCompileSdk((Integer)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case AppDslPackage.APPLICATION_COMPILE_SDK__COMPILE_SDK:
        setCompileSdk(COMPILE_SDK_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case AppDslPackage.APPLICATION_COMPILE_SDK__COMPILE_SDK:
        return compileSdk != COMPILE_SDK_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (compileSdk: ");
    result.append(compileSdk);
    result.append(')');
    return result.toString();
  }

} //ApplicationCompileSdkImpl
