/**
 */
package at.fhj.androidappmeta.androidappmeta.impl;

import at.fhj.androidappmeta.androidappmeta.AndroidappmetaFactory;
import at.fhj.androidappmeta.androidappmeta.AndroidappmetaPackage;
import at.fhj.androidappmeta.androidappmeta.MActivity;
import at.fhj.androidappmeta.androidappmeta.MApplication;
import at.fhj.androidappmeta.androidappmeta.MBroadcastReceiver;
import at.fhj.androidappmeta.androidappmeta.MIntent;
import at.fhj.androidappmeta.androidappmeta.MIntentStartable;
import at.fhj.androidappmeta.androidappmeta.MPermission;
import at.fhj.androidappmeta.androidappmeta.MService;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AndroidappmetaPackageImpl extends EPackageImpl implements AndroidappmetaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mApplicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mPermissionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mIntentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mIntentStartableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mBroadcastReceiverEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see at.fhj.androidappmeta.androidappmeta.AndroidappmetaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AndroidappmetaPackageImpl() {
		super(eNS_URI, AndroidappmetaFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link AndroidappmetaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AndroidappmetaPackage init() {
		if (isInited) return (AndroidappmetaPackage)EPackage.Registry.INSTANCE.getEPackage(AndroidappmetaPackage.eNS_URI);

		// Obtain or create and register package
		AndroidappmetaPackageImpl theAndroidappmetaPackage = (AndroidappmetaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AndroidappmetaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AndroidappmetaPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theAndroidappmetaPackage.createPackageContents();

		// Initialize created meta-data
		theAndroidappmetaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAndroidappmetaPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AndroidappmetaPackage.eNS_URI, theAndroidappmetaPackage);
		return theAndroidappmetaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMApplication() {
		return mApplicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMApplication_PackageName() {
		return (EAttribute)mApplicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMApplication_Permissions() {
		return (EReference)mApplicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMApplication_MinSdk() {
		return (EAttribute)mApplicationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMApplication_TargetSdk() {
		return (EAttribute)mApplicationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMApplication_Name() {
		return (EAttribute)mApplicationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMApplication_Elements() {
		return (EReference)mApplicationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMApplication_LauncherActivity() {
		return (EReference)mApplicationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMPermission() {
		return mPermissionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMPermission_Name() {
		return (EAttribute)mPermissionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMIntent() {
		return mIntentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMIntent_Name() {
		return (EAttribute)mIntentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMIntentStartable() {
		return mIntentStartableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMIntentStartable_IntentFilter() {
		return (EReference)mIntentStartableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMActivity() {
		return mActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMActivity_Title() {
		return (EAttribute)mActivityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMActivity_Parent() {
		return (EReference)mActivityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMService() {
		return mServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMBroadcastReceiver() {
		return mBroadcastReceiverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AndroidappmetaFactory getAndroidappmetaFactory() {
		return (AndroidappmetaFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		mApplicationEClass = createEClass(MAPPLICATION);
		createEAttribute(mApplicationEClass, MAPPLICATION__PACKAGE_NAME);
		createEReference(mApplicationEClass, MAPPLICATION__PERMISSIONS);
		createEAttribute(mApplicationEClass, MAPPLICATION__MIN_SDK);
		createEAttribute(mApplicationEClass, MAPPLICATION__TARGET_SDK);
		createEAttribute(mApplicationEClass, MAPPLICATION__NAME);
		createEReference(mApplicationEClass, MAPPLICATION__ELEMENTS);
		createEReference(mApplicationEClass, MAPPLICATION__LAUNCHER_ACTIVITY);

		mPermissionEClass = createEClass(MPERMISSION);
		createEAttribute(mPermissionEClass, MPERMISSION__NAME);

		mIntentEClass = createEClass(MINTENT);
		createEAttribute(mIntentEClass, MINTENT__NAME);

		mIntentStartableEClass = createEClass(MINTENT_STARTABLE);
		createEReference(mIntentStartableEClass, MINTENT_STARTABLE__INTENT_FILTER);

		mActivityEClass = createEClass(MACTIVITY);
		createEAttribute(mActivityEClass, MACTIVITY__TITLE);
		createEReference(mActivityEClass, MACTIVITY__PARENT);

		mServiceEClass = createEClass(MSERVICE);

		mBroadcastReceiverEClass = createEClass(MBROADCAST_RECEIVER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		mActivityEClass.getESuperTypes().add(this.getMIntentStartable());
		mServiceEClass.getESuperTypes().add(this.getMIntentStartable());
		mBroadcastReceiverEClass.getESuperTypes().add(this.getMIntentStartable());

		// Initialize classes, features, and operations; add parameters
		initEClass(mApplicationEClass, MApplication.class, "MApplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMApplication_PackageName(), ecorePackage.getEString(), "packageName", "", 1, 1, MApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMApplication_Permissions(), this.getMPermission(), null, "permissions", null, 0, -1, MApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMApplication_MinSdk(), ecorePackage.getEInt(), "minSdk", null, 1, 1, MApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMApplication_TargetSdk(), ecorePackage.getEInt(), "targetSdk", null, 1, 1, MApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMApplication_Name(), ecorePackage.getEString(), "name", null, 1, 1, MApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMApplication_Elements(), this.getMIntentStartable(), null, "elements", null, 0, -1, MApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMApplication_LauncherActivity(), this.getMActivity(), null, "launcherActivity", null, 1, 1, MApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mPermissionEClass, MPermission.class, "MPermission", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMPermission_Name(), ecorePackage.getEString(), "name", null, 1, 1, MPermission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mIntentEClass, MIntent.class, "MIntent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMIntent_Name(), ecorePackage.getEString(), "name", null, 1, 1, MIntent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mIntentStartableEClass, MIntentStartable.class, "MIntentStartable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMIntentStartable_IntentFilter(), this.getMIntent(), null, "intentFilter", null, 0, -1, MIntentStartable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mActivityEClass, MActivity.class, "MActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMActivity_Title(), ecorePackage.getEString(), "title", null, 1, 1, MActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMActivity_Parent(), this.getMActivity(), null, "parent", null, 0, 1, MActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mServiceEClass, MService.class, "MService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mBroadcastReceiverEClass, MBroadcastReceiver.class, "MBroadcastReceiver", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //AndroidappmetaPackageImpl
