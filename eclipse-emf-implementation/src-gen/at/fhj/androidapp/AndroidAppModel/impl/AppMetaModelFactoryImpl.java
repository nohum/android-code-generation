/**
 */
package at.fhj.androidapp.AndroidAppModel.impl;

import at.fhj.androidapp.AndroidAppModel.*;

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
public class AppMetaModelFactoryImpl extends EFactoryImpl implements AppMetaModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AppMetaModelFactory init() {
		try {
			AppMetaModelFactory theAppMetaModelFactory = (AppMetaModelFactory)EPackage.Registry.INSTANCE.getEFactory(AppMetaModelPackage.eNS_URI);
			if (theAppMetaModelFactory != null) {
				return theAppMetaModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AppMetaModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppMetaModelFactoryImpl() {
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
			case AppMetaModelPackage.MAPPLICATION: return createMApplication();
			case AppMetaModelPackage.MPERMISSION: return createMPermission();
			case AppMetaModelPackage.MINTENT: return createMIntent();
			case AppMetaModelPackage.MINTENT_STARTABLE: return createMIntentStartable();
			case AppMetaModelPackage.MACTIVITY: return createMActivity();
			case AppMetaModelPackage.MSERVICE: return createMService();
			case AppMetaModelPackage.MBROADCAST_RECEIVER: return createMBroadcastReceiver();
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
	public AppMetaModelPackage getAppMetaModelPackage() {
		return (AppMetaModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AppMetaModelPackage getPackage() {
		return AppMetaModelPackage.eINSTANCE;
	}

} //AppMetaModelFactoryImpl
