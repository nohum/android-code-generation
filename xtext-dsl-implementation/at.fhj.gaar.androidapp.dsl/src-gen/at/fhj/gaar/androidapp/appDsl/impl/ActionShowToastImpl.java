/**
 */
package at.fhj.gaar.androidapp.appDsl.impl;

import at.fhj.gaar.androidapp.appDsl.ActionShowToast;
import at.fhj.gaar.androidapp.appDsl.AppDslPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Show Toast</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.fhj.gaar.androidapp.appDsl.impl.ActionShowToastImpl#getToastText <em>Toast Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActionShowToastImpl extends LayoutElementClickActionImpl implements ActionShowToast
{
  /**
   * The default value of the '{@link #getToastText() <em>Toast Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getToastText()
   * @generated
   * @ordered
   */
  protected static final String TOAST_TEXT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getToastText() <em>Toast Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getToastText()
   * @generated
   * @ordered
   */
  protected String toastText = TOAST_TEXT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ActionShowToastImpl()
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
    return AppDslPackage.Literals.ACTION_SHOW_TOAST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getToastText()
  {
    return toastText;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setToastText(String newToastText)
  {
    String oldToastText = toastText;
    toastText = newToastText;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AppDslPackage.ACTION_SHOW_TOAST__TOAST_TEXT, oldToastText, toastText));
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
      case AppDslPackage.ACTION_SHOW_TOAST__TOAST_TEXT:
        return getToastText();
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
      case AppDslPackage.ACTION_SHOW_TOAST__TOAST_TEXT:
        setToastText((String)newValue);
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
      case AppDslPackage.ACTION_SHOW_TOAST__TOAST_TEXT:
        setToastText(TOAST_TEXT_EDEFAULT);
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
      case AppDslPackage.ACTION_SHOW_TOAST__TOAST_TEXT:
        return TOAST_TEXT_EDEFAULT == null ? toastText != null : !TOAST_TEXT_EDEFAULT.equals(toastText);
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
    result.append(" (toastText: ");
    result.append(toastText);
    result.append(')');
    return result.toString();
  }

} //ActionShowToastImpl
