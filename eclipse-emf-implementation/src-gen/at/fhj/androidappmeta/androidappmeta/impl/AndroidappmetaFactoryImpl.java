/**
 */
package at.fhj.androidappmeta.androidappmeta.impl;

import at.fhj.androidappmeta.androidappmeta.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AndroidappmetaFactoryImpl extends EFactoryImpl implements AndroidappmetaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AndroidappmetaFactory init() {
		try {
			AndroidappmetaFactory theAndroidappmetaFactory = (AndroidappmetaFactory)EPackage.Registry.INSTANCE.getEFactory(AndroidappmetaPackage.eNS_URI);
			if (theAndroidappmetaFactory != null) {
				return theAndroidappmetaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AndroidappmetaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AndroidappmetaFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AndroidappmetaPackage.MAPPLICATION: return createMApplication();
			case AndroidappmetaPackage.MPERMISSION: return createMPermission();
			case AndroidappmetaPackage.MINTENT: return createMIntent();
			case AndroidappmetaPackage.MINTENT_STARTABLE: return createMIntentStartable();
			case AndroidappmetaPackage.MACTIVITY: return createMActivity();
			case AndroidappmetaPackage.MSERVICE: return createMService();
			case AndroidappmetaPackage.MBROADCAST_RECEIVER: return createMBroadcastReceiver();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MApplication createMApplication() {
		MApplicationImpl mApplication = new MApplicationImpl();
		return mApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MPermission createMPermission() {
		MPermissionImpl mPermission = new MPermissionImpl();
		return mPermission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MIntent createMIntent() {
		MIntentImpl mIntent = new MIntentImpl();
		return mIntent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MIntentStartable createMIntentStartable() {
		MIntentStartableImpl mIntentStartable = new MIntentStartableImpl();
		return mIntentStartable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MActivity createMActivity() {
		MActivityImpl mActivity = new MActivityImpl();
		return mActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MService createMService() {
		MServiceImpl mService = new MServiceImpl();
		return mService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MBroadcastReceiver createMBroadcastReceiver() {
		MBroadcastReceiverImpl mBroadcastReceiver = new MBroadcastReceiverImpl();
		return mBroadcastReceiver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AndroidappmetaPackage getAndroidappmetaPackage() {
		return (AndroidappmetaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AndroidappmetaPackage getPackage() {
		return AndroidappmetaPackage.eINSTANCE;
	}

} //AndroidappmetaFactoryImpl
