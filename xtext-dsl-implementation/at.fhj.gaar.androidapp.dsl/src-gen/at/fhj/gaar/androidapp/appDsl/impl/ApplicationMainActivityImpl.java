/**
 */
package at.fhj.gaar.androidapp.appDsl.impl;

import at.fhj.gaar.androidapp.appDsl.Activity;
import at.fhj.gaar.androidapp.appDsl.AppDslPackage;
import at.fhj.gaar.androidapp.appDsl.ApplicationMainActivity;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

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
   * The cached value of the '{@link #getLauncherActivity() <em>Launcher Activity</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLauncherActivity()
   * @generated
   * @ordered
   */
  protected Activity launcherActivity;

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
  public Activity getLauncherActivity()
  {
    if (launcherActivity != null && launcherActivity.eIsProxy())
    {
      InternalEObject oldLauncherActivity = (InternalEObject)launcherActivity;
      launcherActivity = (Activity)eResolveProxy(oldLauncherActivity);
      if (launcherActivity != oldLauncherActivity)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AppDslPackage.APPLICATION_MAIN_ACTIVITY__LAUNCHER_ACTIVITY, oldLauncherActivity, launcherActivity));
      }
    }
    return launcherActivity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Activity basicGetLauncherActivity()
  {
    return launcherActivity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLauncherActivity(Activity newLauncherActivity)
  {
    Activity oldLauncherActivity = launcherActivity;
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
        if (resolve) return getLauncherActivity();
        return basicGetLauncherActivity();
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
        setLauncherActivity((Activity)newValue);
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
        setLauncherActivity((Activity)null);
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
        return launcherActivity != null;
    }
    return super.eIsSet(featureID);
  }

} //ApplicationMainActivityImpl
