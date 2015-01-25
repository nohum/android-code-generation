/**
 */
package at.fhj.androidapp.AndroidAppModel.impl;

import at.fhj.androidapp.AndroidAppModel.AppMetaModelPackage;
import at.fhj.androidapp.AndroidAppModel.MIntent;
import at.fhj.androidapp.AndroidAppModel.MIntentStartable;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MIntent Startable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.fhj.androidapp.AndroidAppModel.impl.MIntentStartableImpl#getIntentFilter <em>Intent Filter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MIntentStartableImpl extends MinimalEObjectImpl.Container implements MIntentStartable {
	/**
	 * The cached value of the '{@link #getIntentFilter() <em>Intent Filter</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntentFilter()
	 * @generated
	 * @ordered
	 */
	protected EList<MIntent> intentFilter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MIntentStartableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AppMetaModelPackage.Literals.MINTENT_STARTABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MIntent> getIntentFilter() {
		if (intentFilter == null) {
			intentFilter = new EObjectResolvingEList<MIntent>(MIntent.class, this, AppMetaModelPackage.MINTENT_STARTABLE__INTENT_FILTER);
		}
		return intentFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AppMetaModelPackage.MINTENT_STARTABLE__INTENT_FILTER:
				return getIntentFilter();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AppMetaModelPackage.MINTENT_STARTABLE__INTENT_FILTER:
				getIntentFilter().clear();
				getIntentFilter().addAll((Collection<? extends MIntent>)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case AppMetaModelPackage.MINTENT_STARTABLE__INTENT_FILTER:
				getIntentFilter().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AppMetaModelPackage.MINTENT_STARTABLE__INTENT_FILTER:
				return intentFilter != null && !intentFilter.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MIntentStartableImpl
