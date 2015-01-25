/**
 */
package at.fhj.androidappmeta.androidappmeta.util;

import at.fhj.androidappmeta.androidappmeta.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see at.fhj.androidappmeta.androidappmeta.AndroidappmetaPackage
 * @generated
 */
public class AndroidappmetaSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AndroidappmetaPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AndroidappmetaSwitch() {
		if (modelPackage == null) {
			modelPackage = AndroidappmetaPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case AndroidappmetaPackage.MAPPLICATION: {
				MApplication mApplication = (MApplication)theEObject;
				T result = caseMApplication(mApplication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AndroidappmetaPackage.MPERMISSION: {
				MPermission mPermission = (MPermission)theEObject;
				T result = caseMPermission(mPermission);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AndroidappmetaPackage.MINTENT: {
				MIntent mIntent = (MIntent)theEObject;
				T result = caseMIntent(mIntent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AndroidappmetaPackage.MINTENT_STARTABLE: {
				MIntentStartable mIntentStartable = (MIntentStartable)theEObject;
				T result = caseMIntentStartable(mIntentStartable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AndroidappmetaPackage.MACTIVITY: {
				MActivity mActivity = (MActivity)theEObject;
				T result = caseMActivity(mActivity);
				if (result == null) result = caseMIntentStartable(mActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AndroidappmetaPackage.MSERVICE: {
				MService mService = (MService)theEObject;
				T result = caseMService(mService);
				if (result == null) result = caseMIntentStartable(mService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AndroidappmetaPackage.MBROADCAST_RECEIVER: {
				MBroadcastReceiver mBroadcastReceiver = (MBroadcastReceiver)theEObject;
				T result = caseMBroadcastReceiver(mBroadcastReceiver);
				if (result == null) result = caseMIntentStartable(mBroadcastReceiver);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MApplication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MApplication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMApplication(MApplication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MPermission</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MPermission</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMPermission(MPermission object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MIntent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MIntent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMIntent(MIntent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MIntent Startable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MIntent Startable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMIntentStartable(MIntentStartable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MActivity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MActivity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMActivity(MActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MService</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MService</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMService(MService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MBroadcast Receiver</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MBroadcast Receiver</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMBroadcastReceiver(MBroadcastReceiver object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //AndroidappmetaSwitch
