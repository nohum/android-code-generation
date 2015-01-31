/**
 */
package at.fhj.androidapp.androidapp.impl;

import at.fhj.androidapp.androidapp.AndroidApplicationModelPackage;
import at.fhj.androidapp.androidapp.MBroadcastReceiver;

import at.fhj.androidapp.androidapp.MIntent;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MBroadcast Receiver</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.fhj.androidapp.androidapp.impl.MBroadcastReceiverImpl#getIntentFilter <em>Intent Filter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MBroadcastReceiverImpl extends MinimalEObjectImpl.Container implements MBroadcastReceiver {
	/**
	 * The cached value of the '{@link #getIntentFilter() <em>Intent Filter</em>}' containment reference list.
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
	protected MBroadcastReceiverImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AndroidApplicationModelPackage.Literals.MBROADCAST_RECEIVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MIntent> getIntentFilter() {
		if (intentFilter == null) {
			intentFilter = new EObjectContainmentEList<MIntent>(MIntent.class, this, AndroidApplicationModelPackage.MBROADCAST_RECEIVER__INTENT_FILTER);
		}
		return intentFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AndroidApplicationModelPackage.MBROADCAST_RECEIVER__INTENT_FILTER:
				return ((InternalEList<?>)getIntentFilter()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AndroidApplicationModelPackage.MBROADCAST_RECEIVER__INTENT_FILTER:
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
			case AndroidApplicationModelPackage.MBROADCAST_RECEIVER__INTENT_FILTER:
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
			case AndroidApplicationModelPackage.MBROADCAST_RECEIVER__INTENT_FILTER:
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
			case AndroidApplicationModelPackage.MBROADCAST_RECEIVER__INTENT_FILTER:
				return intentFilter != null && !intentFilter.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MBroadcastReceiverImpl
