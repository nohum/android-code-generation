/**
 */
package at.fhj.gaar.androidapp.appDsl.impl;

import at.fhj.gaar.androidapp.appDsl.AppDslPackage;
import at.fhj.gaar.androidapp.appDsl.ApplicationMinSdk;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application Min Sdk</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.fhj.gaar.androidapp.appDsl.impl.ApplicationMinSdkImpl#getMinSdk <em>Min Sdk</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplicationMinSdkImpl extends ApplicationAttributeImpl implements ApplicationMinSdk
{
  /**
   * The default value of the '{@link #getMinSdk() <em>Min Sdk</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinSdk()
   * @generated
   * @ordered
   */
  protected static final int MIN_SDK_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMinSdk() <em>Min Sdk</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinSdk()
   * @generated
   * @ordered
   */
  protected int minSdk = MIN_SDK_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ApplicationMinSdkImpl()
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
    return AppDslPackage.Literals.APPLICATION_MIN_SDK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getMinSdk()
  {
    return minSdk;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMinSdk(int newMinSdk)
  {
    int oldMinSdk = minSdk;
    minSdk = newMinSdk;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AppDslPackage.APPLICATION_MIN_SDK__MIN_SDK, oldMinSdk, minSdk));
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
      case AppDslPackage.APPLICATION_MIN_SDK__MIN_SDK:
        return getMinSdk();
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
      case AppDslPackage.APPLICATION_MIN_SDK__MIN_SDK:
        setMinSdk((Integer)newValue);
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
      case AppDslPackage.APPLICATION_MIN_SDK__MIN_SDK:
        setMinSdk(MIN_SDK_EDEFAULT);
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
      case AppDslPackage.APPLICATION_MIN_SDK__MIN_SDK:
        return minSdk != MIN_SDK_EDEFAULT;
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
    result.append(" (minSdk: ");
    result.append(minSdk);
    result.append(')');
    return result.toString();
  }

} //ApplicationMinSdkImpl
