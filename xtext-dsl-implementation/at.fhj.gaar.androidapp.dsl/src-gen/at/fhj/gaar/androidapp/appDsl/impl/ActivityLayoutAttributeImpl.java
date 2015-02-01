/**
 */
package at.fhj.gaar.androidapp.appDsl.impl;

import at.fhj.gaar.androidapp.appDsl.ActivityLayoutAttribute;
import at.fhj.gaar.androidapp.appDsl.AppDslPackage;
import at.fhj.gaar.androidapp.appDsl.LayoutElement;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Layout Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.fhj.gaar.androidapp.appDsl.impl.ActivityLayoutAttributeImpl#getLayoutElements <em>Layout Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityLayoutAttributeImpl extends ActivityAttributeImpl implements ActivityLayoutAttribute
{
  /**
   * The cached value of the '{@link #getLayoutElements() <em>Layout Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLayoutElements()
   * @generated
   * @ordered
   */
  protected EList<LayoutElement> layoutElements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ActivityLayoutAttributeImpl()
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
    return AppDslPackage.Literals.ACTIVITY_LAYOUT_ATTRIBUTE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<LayoutElement> getLayoutElements()
  {
    if (layoutElements == null)
    {
      layoutElements = new EObjectContainmentEList<LayoutElement>(LayoutElement.class, this, AppDslPackage.ACTIVITY_LAYOUT_ATTRIBUTE__LAYOUT_ELEMENTS);
    }
    return layoutElements;
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
      case AppDslPackage.ACTIVITY_LAYOUT_ATTRIBUTE__LAYOUT_ELEMENTS:
        return ((InternalEList<?>)getLayoutElements()).basicRemove(otherEnd, msgs);
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
      case AppDslPackage.ACTIVITY_LAYOUT_ATTRIBUTE__LAYOUT_ELEMENTS:
        return getLayoutElements();
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
      case AppDslPackage.ACTIVITY_LAYOUT_ATTRIBUTE__LAYOUT_ELEMENTS:
        getLayoutElements().clear();
        getLayoutElements().addAll((Collection<? extends LayoutElement>)newValue);
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
      case AppDslPackage.ACTIVITY_LAYOUT_ATTRIBUTE__LAYOUT_ELEMENTS:
        getLayoutElements().clear();
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
      case AppDslPackage.ACTIVITY_LAYOUT_ATTRIBUTE__LAYOUT_ELEMENTS:
        return layoutElements != null && !layoutElements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ActivityLayoutAttributeImpl
