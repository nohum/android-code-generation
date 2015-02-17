/**
 */
package at.fhj.gaar.androidapp.appDsl.impl;

import at.fhj.gaar.androidapp.appDsl.AppDslPackage;
import at.fhj.gaar.androidapp.appDsl.ApplicationPermissionList;
import at.fhj.gaar.androidapp.appDsl.Permission;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application Permission List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.fhj.gaar.androidapp.appDsl.impl.ApplicationPermissionListImpl#getPermissions <em>Permissions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplicationPermissionListImpl extends ApplicationAttributeImpl implements ApplicationPermissionList
{
  /**
   * The cached value of the '{@link #getPermissions() <em>Permissions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPermissions()
   * @generated
   * @ordered
   */
  protected EList<Permission> permissions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ApplicationPermissionListImpl()
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
    return AppDslPackage.Literals.APPLICATION_PERMISSION_LIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Permission> getPermissions()
  {
    if (permissions == null)
    {
      permissions = new EObjectContainmentEList<Permission>(Permission.class, this, AppDslPackage.APPLICATION_PERMISSION_LIST__PERMISSIONS);
    }
    return permissions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case AppDslPackage.APPLICATION_PERMISSION_LIST__PERMISSIONS:
        return ((InternalEList<?>)getPermissions()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case AppDslPackage.APPLICATION_PERMISSION_LIST__PERMISSIONS:
        return getPermissions();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AppDslPackage.APPLICATION_PERMISSION_LIST__PERMISSIONS:
        getPermissions().clear();
        getPermissions().addAll((Collection<? extends Permission>)newValue);
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
      case AppDslPackage.APPLICATION_PERMISSION_LIST__PERMISSIONS:
        getPermissions().clear();
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
      case AppDslPackage.APPLICATION_PERMISSION_LIST__PERMISSIONS:
        return permissions != null && !permissions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ApplicationPermissionListImpl
