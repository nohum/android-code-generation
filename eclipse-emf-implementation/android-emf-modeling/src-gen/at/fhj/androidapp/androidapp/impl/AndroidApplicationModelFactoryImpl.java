/**
 */
package at.fhj.androidapp.androidapp.impl;

import at.fhj.androidapp.androidapp.*;

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
public class AndroidApplicationModelFactoryImpl extends EFactoryImpl implements AndroidApplicationModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AndroidApplicationModelFactory init() {
		try {
			AndroidApplicationModelFactory theAndroidApplicationModelFactory = (AndroidApplicationModelFactory)EPackage.Registry.INSTANCE.getEFactory(AndroidApplicationModelPackage.eNS_URI);
			if (theAndroidApplicationModelFactory != null) {
				return theAndroidApplicationModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AndroidApplicationModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AndroidApplicationModelFactoryImpl() {
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
			case AndroidApplicationModelPackage.MANDROID_APP_PROJECT: return createMAndroidAppProject();
			case AndroidApplicationModelPackage.MAPPLICATION: return createMApplication();
			case AndroidApplicationModelPackage.MPERMISSION: return createMPermission();
			case AndroidApplicationModelPackage.MINTENT: return createMIntent();
			case AndroidApplicationModelPackage.MACTIVITY: return createMActivity();
			case AndroidApplicationModelPackage.MSERVICE: return createMService();
			case AndroidApplicationModelPackage.MBROADCAST_RECEIVER: return createMBroadcastReceiver();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MAndroidAppProject createMAndroidAppProject() {
		MAndroidAppProjectImpl mAndroidAppProject = new MAndroidAppProjectImpl();
		return mAndroidAppProject;
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
	public AndroidApplicationModelPackage getAndroidApplicationModelPackage() {
		return (AndroidApplicationModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AndroidApplicationModelPackage getPackage() {
		return AndroidApplicationModelPackage.eINSTANCE;
	}

} //AndroidApplicationModelFactoryImpl
