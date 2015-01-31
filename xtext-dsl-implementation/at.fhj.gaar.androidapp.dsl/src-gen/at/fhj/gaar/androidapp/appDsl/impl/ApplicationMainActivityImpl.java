/**
 */
package at.fhj.gaar.androidapp.appDsl.impl;

import at.fhj.gaar.androidapp.appDsl.AppDslPackage;
import at.fhj.gaar.androidapp.appDsl.ApplicationMainActivity;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application Main Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.fhj.gaar.androidapp.appDsl.impl.ApplicationMainActivityImpl#getLauncherActivity <em>Launcher Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplicationMainActivityImpl extends ApplicationAttributeImpl implements ApplicationMainActivity
{
  /**
   * The default value of the '{@link #getLauncherActivity() <em>Launcher Activity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLauncherActivity()
   * @generated
   * @ordered
   */
  protected static final String LAUNCHER_ACTIVITY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLauncherActivity() <em>Launcher Activity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLauncherActivity()
   * @generated
   * @ordered
   */
  protected String launcherActivity = LAUNCHER_ACTIVITY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ApplicationMainActivityImpl()
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
    return AppDslPackage.Literals.APPLICATION_MAIN_ACTIVITY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLauncherActivity()
  {
    return launcherActivity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLauncherActivity(String newLauncherActivity)
  {
    String oldLauncherActivity = launcherActivity;
    launcherActivity = newLauncherActivity;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AppDslPackage.APPLICATION_MAIN_ACTIVITY__LAUNCHER_ACTIVITY, oldLauncherActivity, launcherActivity));
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
      case AppDslPackage.APPLICATION_MAIN_ACTIVITY__LAUNCHER_ACTIVITY:
        return getLauncherActivity();
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
      case AppDslPackage.APPLICATION_MAIN_ACTIVITY__LAUNCHER_ACTIVITY:
        setLauncherActivity((String)newValue);
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
      case AppDslPackage.APPLICATION_MAIN_ACTIVITY__LAUNCHER_ACTIVITY:
        setLauncherActivity(LAUNCHER_ACTIVITY_EDEFAULT);
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
      case AppDslPackage.APPLICATION_MAIN_ACTIVITY__LAUNCHER_ACTIVITY:
        return LAUNCHER_ACTIVITY_EDEFAULT == null ? launcherActivity != null : !LAUNCHER_ACTIVITY_EDEFAULT.equals(launcherActivity);
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
    result.append(" (launcherActivity: ");
    result.append(launcherActivity);
    result.append(')');
    return result.toString();
  }

} //ApplicationMainActivityImpl
