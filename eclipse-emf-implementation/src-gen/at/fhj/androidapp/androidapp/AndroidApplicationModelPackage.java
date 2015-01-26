/**
 */
package at.fhj.androidapp.androidapp;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see at.fhj.androidapp.androidapp.AndroidApplicationModelFactory
 * @model kind="package"
 * @generated
 */
public interface AndroidApplicationModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "androidapp";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://at/fhj/android/metamodeling";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "at.fhj.android.metamodeling";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AndroidApplicationModelPackage eINSTANCE = at.fhj.androidapp.androidapp.impl.AndroidApplicationModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link at.fhj.androidapp.androidapp.impl.MAndroidAppProjectImpl <em>MAndroid App Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.fhj.androidapp.androidapp.impl.MAndroidAppProjectImpl
	 * @see at.fhj.androidapp.androidapp.impl.AndroidApplicationModelPackageImpl#getMAndroidAppProject()
	 * @generated
	 */
	int MANDROID_APP_PROJECT = 0;

	/**
	 * The feature id for the '<em><b>Application</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDROID_APP_PROJECT__APPLICATION = 0;

	/**
	 * The number of structural features of the '<em>MAndroid App Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDROID_APP_PROJECT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>MAndroid App Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDROID_APP_PROJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.fhj.androidapp.androidapp.impl.MApplicationImpl <em>MApplication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.fhj.androidapp.androidapp.impl.MApplicationImpl
	 * @see at.fhj.androidapp.androidapp.impl.AndroidApplicationModelPackageImpl#getMApplication()
	 * @generated
	 */
	int MAPPLICATION = 1;

	/**
	 * The feature id for the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPLICATION__PACKAGE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Permissions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPLICATION__PERMISSIONS = 1;

	/**
	 * The feature id for the '<em><b>Min Sdk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPLICATION__MIN_SDK = 2;

	/**
	 * The feature id for the '<em><b>Target Sdk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPLICATION__TARGET_SDK = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPLICATION__NAME = 4;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPLICATION__ELEMENTS = 5;

	/**
	 * The feature id for the '<em><b>Launcher Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPLICATION__LAUNCHER_ACTIVITY = 6;

	/**
	 * The number of structural features of the '<em>MApplication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPLICATION_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>MApplication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPLICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.fhj.androidapp.androidapp.impl.MPermissionImpl <em>MPermission</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.fhj.androidapp.androidapp.impl.MPermissionImpl
	 * @see at.fhj.androidapp.androidapp.impl.AndroidApplicationModelPackageImpl#getMPermission()
	 * @generated
	 */
	int MPERMISSION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPERMISSION__NAME = 0;

	/**
	 * The number of structural features of the '<em>MPermission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPERMISSION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>MPermission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPERMISSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.fhj.androidapp.androidapp.impl.MIntentImpl <em>MIntent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.fhj.androidapp.androidapp.impl.MIntentImpl
	 * @see at.fhj.androidapp.androidapp.impl.AndroidApplicationModelPackageImpl#getMIntent()
	 * @generated
	 */
	int MINTENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINTENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>MIntent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINTENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>MIntent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINTENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.fhj.androidapp.androidapp.impl.MIntentStartableImpl <em>MIntent Startable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.fhj.androidapp.androidapp.impl.MIntentStartableImpl
	 * @see at.fhj.androidapp.androidapp.impl.AndroidApplicationModelPackageImpl#getMIntentStartable()
	 * @generated
	 */
	int MINTENT_STARTABLE = 4;

	/**
	 * The feature id for the '<em><b>Intent Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINTENT_STARTABLE__INTENT_FILTER = 0;

	/**
	 * The number of structural features of the '<em>MIntent Startable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINTENT_STARTABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>MIntent Startable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINTENT_STARTABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.fhj.androidapp.androidapp.impl.MActivityImpl <em>MActivity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.fhj.androidapp.androidapp.impl.MActivityImpl
	 * @see at.fhj.androidapp.androidapp.impl.AndroidApplicationModelPackageImpl#getMActivity()
	 * @generated
	 */
	int MACTIVITY = 5;

	/**
	 * The feature id for the '<em><b>Intent Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACTIVITY__INTENT_FILTER = MINTENT_STARTABLE__INTENT_FILTER;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACTIVITY__TITLE = MINTENT_STARTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACTIVITY__PARENT = MINTENT_STARTABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>MActivity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACTIVITY_FEATURE_COUNT = MINTENT_STARTABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>MActivity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACTIVITY_OPERATION_COUNT = MINTENT_STARTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.fhj.androidapp.androidapp.impl.MServiceImpl <em>MService</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.fhj.androidapp.androidapp.impl.MServiceImpl
	 * @see at.fhj.androidapp.androidapp.impl.AndroidApplicationModelPackageImpl#getMService()
	 * @generated
	 */
	int MSERVICE = 6;

	/**
	 * The feature id for the '<em><b>Intent Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSERVICE__INTENT_FILTER = MINTENT_STARTABLE__INTENT_FILTER;

	/**
	 * The number of structural features of the '<em>MService</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSERVICE_FEATURE_COUNT = MINTENT_STARTABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>MService</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSERVICE_OPERATION_COUNT = MINTENT_STARTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.fhj.androidapp.androidapp.impl.MBroadcastReceiverImpl <em>MBroadcast Receiver</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.fhj.androidapp.androidapp.impl.MBroadcastReceiverImpl
	 * @see at.fhj.androidapp.androidapp.impl.AndroidApplicationModelPackageImpl#getMBroadcastReceiver()
	 * @generated
	 */
	int MBROADCAST_RECEIVER = 7;

	/**
	 * The feature id for the '<em><b>Intent Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBROADCAST_RECEIVER__INTENT_FILTER = MINTENT_STARTABLE__INTENT_FILTER;

	/**
	 * The number of structural features of the '<em>MBroadcast Receiver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBROADCAST_RECEIVER_FEATURE_COUNT = MINTENT_STARTABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>MBroadcast Receiver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBROADCAST_RECEIVER_OPERATION_COUNT = MINTENT_STARTABLE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link at.fhj.androidapp.androidapp.MAndroidAppProject <em>MAndroid App Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MAndroid App Project</em>'.
	 * @see at.fhj.androidapp.androidapp.MAndroidAppProject
	 * @generated
	 */
	EClass getMAndroidAppProject();

	/**
	 * Returns the meta object for the containment reference '{@link at.fhj.androidapp.androidapp.MAndroidAppProject#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Application</em>'.
	 * @see at.fhj.androidapp.androidapp.MAndroidAppProject#getApplication()
	 * @see #getMAndroidAppProject()
	 * @generated
	 */
	EReference getMAndroidAppProject_Application();

	/**
	 * Returns the meta object for class '{@link at.fhj.androidapp.androidapp.MApplication <em>MApplication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MApplication</em>'.
	 * @see at.fhj.androidapp.androidapp.MApplication
	 * @generated
	 */
	EClass getMApplication();

	/**
	 * Returns the meta object for the attribute '{@link at.fhj.androidapp.androidapp.MApplication#getPackageName <em>Package Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package Name</em>'.
	 * @see at.fhj.androidapp.androidapp.MApplication#getPackageName()
	 * @see #getMApplication()
	 * @generated
	 */
	EAttribute getMApplication_PackageName();

	/**
	 * Returns the meta object for the containment reference list '{@link at.fhj.androidapp.androidapp.MApplication#getPermissions <em>Permissions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Permissions</em>'.
	 * @see at.fhj.androidapp.androidapp.MApplication#getPermissions()
	 * @see #getMApplication()
	 * @generated
	 */
	EReference getMApplication_Permissions();

	/**
	 * Returns the meta object for the attribute '{@link at.fhj.androidapp.androidapp.MApplication#getMinSdk <em>Min Sdk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Sdk</em>'.
	 * @see at.fhj.androidapp.androidapp.MApplication#getMinSdk()
	 * @see #getMApplication()
	 * @generated
	 */
	EAttribute getMApplication_MinSdk();

	/**
	 * Returns the meta object for the attribute '{@link at.fhj.androidapp.androidapp.MApplication#getTargetSdk <em>Target Sdk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Sdk</em>'.
	 * @see at.fhj.androidapp.androidapp.MApplication#getTargetSdk()
	 * @see #getMApplication()
	 * @generated
	 */
	EAttribute getMApplication_TargetSdk();

	/**
	 * Returns the meta object for the attribute '{@link at.fhj.androidapp.androidapp.MApplication#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see at.fhj.androidapp.androidapp.MApplication#getName()
	 * @see #getMApplication()
	 * @generated
	 */
	EAttribute getMApplication_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link at.fhj.androidapp.androidapp.MApplication#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see at.fhj.androidapp.androidapp.MApplication#getElements()
	 * @see #getMApplication()
	 * @generated
	 */
	EReference getMApplication_Elements();

	/**
	 * Returns the meta object for the containment reference '{@link at.fhj.androidapp.androidapp.MApplication#getLauncherActivity <em>Launcher Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Launcher Activity</em>'.
	 * @see at.fhj.androidapp.androidapp.MApplication#getLauncherActivity()
	 * @see #getMApplication()
	 * @generated
	 */
	EReference getMApplication_LauncherActivity();

	/**
	 * Returns the meta object for class '{@link at.fhj.androidapp.androidapp.MPermission <em>MPermission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MPermission</em>'.
	 * @see at.fhj.androidapp.androidapp.MPermission
	 * @generated
	 */
	EClass getMPermission();

	/**
	 * Returns the meta object for the attribute '{@link at.fhj.androidapp.androidapp.MPermission#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see at.fhj.androidapp.androidapp.MPermission#getName()
	 * @see #getMPermission()
	 * @generated
	 */
	EAttribute getMPermission_Name();

	/**
	 * Returns the meta object for class '{@link at.fhj.androidapp.androidapp.MIntent <em>MIntent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MIntent</em>'.
	 * @see at.fhj.androidapp.androidapp.MIntent
	 * @generated
	 */
	EClass getMIntent();

	/**
	 * Returns the meta object for the attribute '{@link at.fhj.androidapp.androidapp.MIntent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see at.fhj.androidapp.androidapp.MIntent#getName()
	 * @see #getMIntent()
	 * @generated
	 */
	EAttribute getMIntent_Name();

	/**
	 * Returns the meta object for class '{@link at.fhj.androidapp.androidapp.MIntentStartable <em>MIntent Startable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MIntent Startable</em>'.
	 * @see at.fhj.androidapp.androidapp.MIntentStartable
	 * @generated
	 */
	EClass getMIntentStartable();

	/**
	 * Returns the meta object for the containment reference list '{@link at.fhj.androidapp.androidapp.MIntentStartable#getIntentFilter <em>Intent Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Intent Filter</em>'.
	 * @see at.fhj.androidapp.androidapp.MIntentStartable#getIntentFilter()
	 * @see #getMIntentStartable()
	 * @generated
	 */
	EReference getMIntentStartable_IntentFilter();

	/**
	 * Returns the meta object for class '{@link at.fhj.androidapp.androidapp.MActivity <em>MActivity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MActivity</em>'.
	 * @see at.fhj.androidapp.androidapp.MActivity
	 * @generated
	 */
	EClass getMActivity();

	/**
	 * Returns the meta object for the attribute '{@link at.fhj.androidapp.androidapp.MActivity#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see at.fhj.androidapp.androidapp.MActivity#getTitle()
	 * @see #getMActivity()
	 * @generated
	 */
	EAttribute getMActivity_Title();

	/**
	 * Returns the meta object for the containment reference '{@link at.fhj.androidapp.androidapp.MActivity#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parent</em>'.
	 * @see at.fhj.androidapp.androidapp.MActivity#getParent()
	 * @see #getMActivity()
	 * @generated
	 */
	EReference getMActivity_Parent();

	/**
	 * Returns the meta object for class '{@link at.fhj.androidapp.androidapp.MService <em>MService</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MService</em>'.
	 * @see at.fhj.androidapp.androidapp.MService
	 * @generated
	 */
	EClass getMService();

	/**
	 * Returns the meta object for class '{@link at.fhj.androidapp.androidapp.MBroadcastReceiver <em>MBroadcast Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MBroadcast Receiver</em>'.
	 * @see at.fhj.androidapp.androidapp.MBroadcastReceiver
	 * @generated
	 */
	EClass getMBroadcastReceiver();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AndroidApplicationModelFactory getAndroidApplicationModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link at.fhj.androidapp.androidapp.impl.MAndroidAppProjectImpl <em>MAndroid App Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.fhj.androidapp.androidapp.impl.MAndroidAppProjectImpl
		 * @see at.fhj.androidapp.androidapp.impl.AndroidApplicationModelPackageImpl#getMAndroidAppProject()
		 * @generated
		 */
		EClass MANDROID_APP_PROJECT = eINSTANCE.getMAndroidAppProject();

		/**
		 * The meta object literal for the '<em><b>Application</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANDROID_APP_PROJECT__APPLICATION = eINSTANCE.getMAndroidAppProject_Application();

		/**
		 * The meta object literal for the '{@link at.fhj.androidapp.androidapp.impl.MApplicationImpl <em>MApplication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.fhj.androidapp.androidapp.impl.MApplicationImpl
		 * @see at.fhj.androidapp.androidapp.impl.AndroidApplicationModelPackageImpl#getMApplication()
		 * @generated
		 */
		EClass MAPPLICATION = eINSTANCE.getMApplication();

		/**
		 * The meta object literal for the '<em><b>Package Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPLICATION__PACKAGE_NAME = eINSTANCE.getMApplication_PackageName();

		/**
		 * The meta object literal for the '<em><b>Permissions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPLICATION__PERMISSIONS = eINSTANCE.getMApplication_Permissions();

		/**
		 * The meta object literal for the '<em><b>Min Sdk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPLICATION__MIN_SDK = eINSTANCE.getMApplication_MinSdk();

		/**
		 * The meta object literal for the '<em><b>Target Sdk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPLICATION__TARGET_SDK = eINSTANCE.getMApplication_TargetSdk();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPLICATION__NAME = eINSTANCE.getMApplication_Name();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPLICATION__ELEMENTS = eINSTANCE.getMApplication_Elements();

		/**
		 * The meta object literal for the '<em><b>Launcher Activity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPLICATION__LAUNCHER_ACTIVITY = eINSTANCE.getMApplication_LauncherActivity();

		/**
		 * The meta object literal for the '{@link at.fhj.androidapp.androidapp.impl.MPermissionImpl <em>MPermission</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.fhj.androidapp.androidapp.impl.MPermissionImpl
		 * @see at.fhj.androidapp.androidapp.impl.AndroidApplicationModelPackageImpl#getMPermission()
		 * @generated
		 */
		EClass MPERMISSION = eINSTANCE.getMPermission();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MPERMISSION__NAME = eINSTANCE.getMPermission_Name();

		/**
		 * The meta object literal for the '{@link at.fhj.androidapp.androidapp.impl.MIntentImpl <em>MIntent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.fhj.androidapp.androidapp.impl.MIntentImpl
		 * @see at.fhj.androidapp.androidapp.impl.AndroidApplicationModelPackageImpl#getMIntent()
		 * @generated
		 */
		EClass MINTENT = eINSTANCE.getMIntent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MINTENT__NAME = eINSTANCE.getMIntent_Name();

		/**
		 * The meta object literal for the '{@link at.fhj.androidapp.androidapp.impl.MIntentStartableImpl <em>MIntent Startable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.fhj.androidapp.androidapp.impl.MIntentStartableImpl
		 * @see at.fhj.androidapp.androidapp.impl.AndroidApplicationModelPackageImpl#getMIntentStartable()
		 * @generated
		 */
		EClass MINTENT_STARTABLE = eINSTANCE.getMIntentStartable();

		/**
		 * The meta object literal for the '<em><b>Intent Filter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINTENT_STARTABLE__INTENT_FILTER = eINSTANCE.getMIntentStartable_IntentFilter();

		/**
		 * The meta object literal for the '{@link at.fhj.androidapp.androidapp.impl.MActivityImpl <em>MActivity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.fhj.androidapp.androidapp.impl.MActivityImpl
		 * @see at.fhj.androidapp.androidapp.impl.AndroidApplicationModelPackageImpl#getMActivity()
		 * @generated
		 */
		EClass MACTIVITY = eINSTANCE.getMActivity();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACTIVITY__TITLE = eINSTANCE.getMActivity_Title();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MACTIVITY__PARENT = eINSTANCE.getMActivity_Parent();

		/**
		 * The meta object literal for the '{@link at.fhj.androidapp.androidapp.impl.MServiceImpl <em>MService</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.fhj.androidapp.androidapp.impl.MServiceImpl
		 * @see at.fhj.androidapp.androidapp.impl.AndroidApplicationModelPackageImpl#getMService()
		 * @generated
		 */
		EClass MSERVICE = eINSTANCE.getMService();

		/**
		 * The meta object literal for the '{@link at.fhj.androidapp.androidapp.impl.MBroadcastReceiverImpl <em>MBroadcast Receiver</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.fhj.androidapp.androidapp.impl.MBroadcastReceiverImpl
		 * @see at.fhj.androidapp.androidapp.impl.AndroidApplicationModelPackageImpl#getMBroadcastReceiver()
		 * @generated
		 */
		EClass MBROADCAST_RECEIVER = eINSTANCE.getMBroadcastReceiver();

	}

} //AndroidApplicationModelPackage
