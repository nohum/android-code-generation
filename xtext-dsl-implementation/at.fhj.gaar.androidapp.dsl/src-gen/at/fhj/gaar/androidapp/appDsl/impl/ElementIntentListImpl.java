/**
 */
package at.fhj.gaar.androidapp.appDsl.impl;

import at.fhj.gaar.androidapp.appDsl.AppDslPackage;
import at.fhj.gaar.androidapp.appDsl.ElementIntentList;
import at.fhj.gaar.androidapp.appDsl.Intent;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Intent List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.fhj.gaar.androidapp.appDsl.impl.ElementIntentListImpl#getIntents <em>Intents</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ElementIntentListImpl extends ActivityAttributeImpl implements ElementIntentList
{
  /**
   * The cached value of the '{@link #getIntents() <em>Intents</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntents()
   * @generated
   * @ordered
   */
  protected EList<Intent> intents;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ElementIntentListImpl()
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
    return AppDslPackage.Literals.ELEMENT_INTENT_LIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Intent> getIntents()
  {
    if (intents == null)
    {
      intents = new EObjectContainmentEList<Intent>(Intent.class, this, AppDslPackage.ELEMENT_INTENT_LIST__INTENTS);
    }
    return intents;
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
      case AppDslPackage.ELEMENT_INTENT_LIST__INTENTS:
        return ((InternalEList<?>)getIntents()).basicRemove(otherEnd, msgs);
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
      case AppDslPackage.ELEMENT_INTENT_LIST__INTENTS:
        return getIntents();
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
      case AppDslPackage.ELEMENT_INTENT_LIST__INTENTS:
        getIntents().clear();
        getIntents().addAll((Collection<? extends Intent>)newValue);
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
      case AppDslPackage.ELEMENT_INTENT_LIST__INTENTS:
        getIntents().clear();
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
      case AppDslPackage.ELEMENT_INTENT_LIST__INTENTS:
        return intents != null && !intents.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ElementIntentListImpl
