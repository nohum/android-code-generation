/**
 */
package at.fhj.gaar.androidapp.appDsl.impl;

import at.fhj.gaar.androidapp.appDsl.Activity;
import at.fhj.gaar.androidapp.appDsl.ActivityParentAttribute;
import at.fhj.gaar.androidapp.appDsl.AppDslPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Parent Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.fhj.gaar.androidapp.appDsl.impl.ActivityParentAttributeImpl#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityParentAttributeImpl extends ActivityAttributeImpl implements ActivityParentAttribute
{
  /**
   * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParent()
   * @generated
   * @ordered
   */
  protected Activity parent;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ActivityParentAttributeImpl()
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
    return AppDslPackage.Literals.ACTIVITY_PARENT_ATTRIBUTE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Activity getParent()
  {
    if (parent != null && parent.eIsProxy())
    {
      InternalEObject oldParent = (InternalEObject)parent;
      parent = (Activity)eResolveProxy(oldParent);
      if (parent != oldParent)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AppDslPackage.ACTIVITY_PARENT_ATTRIBUTE__PARENT, oldParent, parent));
      }
    }
    return parent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Activity basicGetParent()
  {
    return parent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParent(Activity newParent)
  {
    Activity oldParent = parent;
    parent = newParent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AppDslPackage.ACTIVITY_PARENT_ATTRIBUTE__PARENT, oldParent, parent));
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
      case AppDslPackage.ACTIVITY_PARENT_ATTRIBUTE__PARENT:
        if (resolve) return getParent();
        return basicGetParent();
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
      case AppDslPackage.ACTIVITY_PARENT_ATTRIBUTE__PARENT:
        setParent((Activity)newValue);
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
      case AppDslPackage.ACTIVITY_PARENT_ATTRIBUTE__PARENT:
        setParent((Activity)null);
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
      case AppDslPackage.ACTIVITY_PARENT_ATTRIBUTE__PARENT:
        return parent != null;
    }
    return super.eIsSet(featureID);
  }

} //ActivityParentAttributeImpl
