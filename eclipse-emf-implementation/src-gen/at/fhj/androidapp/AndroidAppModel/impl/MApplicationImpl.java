/**
 */
package at.fhj.androidapp.AndroidAppModel.impl;

import at.fhj.androidapp.AndroidAppModel.AppMetaModelPackage;
import at.fhj.androidapp.AndroidAppModel.MActivity;
import at.fhj.androidapp.AndroidAppModel.MApplication;
import at.fhj.androidapp.AndroidAppModel.MIntentStartable;
import at.fhj.androidapp.AndroidAppModel.MPermission;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MApplication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.fhj.androidapp.AndroidAppModel.impl.MApplicationImpl#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link at.fhj.androidapp.AndroidAppModel.impl.MApplicationImpl#getPermissions <em>Permissions</em>}</li>
 *   <li>{@link at.fhj.androidapp.AndroidAppModel.impl.MApplicationImpl#getMinSdk <em>Min Sdk</em>}</li>
 *   <li>{@link at.fhj.androidapp.AndroidAppModel.impl.MApplicationImpl#getTargetSdk <em>Target Sdk</em>}</li>
 *   <li>{@link at.fhj.androidapp.AndroidAppModel.impl.MApplicationImpl#getName <em>Name</em>}</li>
 *   <li>{@link at.fhj.androidapp.AndroidAppModel.impl.MApplicationImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link at.fhj.androidapp.AndroidAppModel.impl.MApplicationImpl#getLauncherActivity <em>Launcher Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MApplicationImpl extends MinimalEObjectImpl.Container implements MApplication {
	/**
	 * The default value of the '{@link #getPackageName() <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageName()
	 * @generated
	 * @ordered
	 */
	protected static final String PACKAGE_NAME_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getPackageName() <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageName()
	 * @generated
	 * @ordered
	 */
	protected String packageName = PACKAGE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPermissions() <em>Permissions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermissions()
	 * @generated
	 * @ordered
	 */
	protected EList<MPermission> permissions;

	/**
	 * The default value of the '{@link #getMinSdk() <em>Min Sdk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinSdk()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_SDK_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinSdk() <em>Min Sdk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinSdk()
	 * @generated
	 * @ordered
	 */
	protected int minSdk = MIN_SDK_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetSdk() <em>Target Sdk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetSdk()
	 * @generated
	 * @ordered
	 */
	protected static final int TARGET_SDK_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTargetSdk() <em>Target Sdk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetSdk()
	 * @generated
	 * @ordered
	 */
	protected int targetSdk = TARGET_SDK_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<MIntentStartable> elements;

	/**
	 * The cached value of the '{@link #getLauncherActivity() <em>Launcher Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLauncherActivity()
	 * @generated
	 * @ordered
	 */
	protected MActivity launcherActivity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MApplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AppMetaModelPackage.Literals.MAPPLICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPackageName() {
		return packageName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackageName(String newPackageName) {
		String oldPackageName = packageName;
		packageName = newPackageName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppMetaModelPackage.MAPPLICATION__PACKAGE_NAME, oldPackageName, packageName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MPermission> getPermissions() {
		if (permissions == null) {
			permissions = new EObjectResolvingEList<MPermission>(MPermission.class, this, AppMetaModelPackage.MAPPLICATION__PERMISSIONS);
		}
		return permissions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinSdk() {
		return minSdk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinSdk(int newMinSdk) {
		int oldMinSdk = minSdk;
		minSdk = newMinSdk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppMetaModelPackage.MAPPLICATION__MIN_SDK, oldMinSdk, minSdk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTargetSdk() {
		return targetSdk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetSdk(int newTargetSdk) {
		int oldTargetSdk = targetSdk;
		targetSdk = newTargetSdk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppMetaModelPackage.MAPPLICATION__TARGET_SDK, oldTargetSdk, targetSdk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppMetaModelPackage.MAPPLICATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MIntentStartable> getElements() {
		if (elements == null) {
			elements = new EObjectResolvingEList<MIntentStartable>(MIntentStartable.class, this, AppMetaModelPackage.MAPPLICATION__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MActivity getLauncherActivity() {
		if (launcherActivity != null && launcherActivity.eIsProxy()) {
			InternalEObject oldLauncherActivity = (InternalEObject)launcherActivity;
			launcherActivity = (MActivity)eResolveProxy(oldLauncherActivity);
			if (launcherActivity != oldLauncherActivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AppMetaModelPackage.MAPPLICATION__LAUNCHER_ACTIVITY, oldLauncherActivity, launcherActivity));
			}
		}
		return launcherActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MActivity basicGetLauncherActivity() {
		return launcherActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLauncherActivity(MActivity newLauncherActivity) {
		MActivity oldLauncherActivity = launcherActivity;
		launcherActivity = newLauncherActivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppMetaModelPackage.MAPPLICATION__LAUNCHER_ACTIVITY, oldLauncherActivity, launcherActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AppMetaModelPackage.MAPPLICATION__PACKAGE_NAME:
				return getPackageName();
			case AppMetaModelPackage.MAPPLICATION__PERMISSIONS:
				return getPermissions();
			case AppMetaModelPackage.MAPPLICATION__MIN_SDK:
				return getMinSdk();
			case AppMetaModelPackage.MAPPLICATION__TARGET_SDK:
				return getTargetSdk();
			case AppMetaModelPackage.MAPPLICATION__NAME:
				return getName();
			case AppMetaModelPackage.MAPPLICATION__ELEMENTS:
				return getElements();
			case AppMetaModelPackage.MAPPLICATION__LAUNCHER_ACTIVITY:
				if (resolve) return getLauncherActivity();
				return basicGetLauncherActivity();
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
			case AppMetaModelPackage.MAPPLICATION__PACKAGE_NAME:
				setPackageName((String)newValue);
				return;
			case AppMetaModelPackage.MAPPLICATION__PERMISSIONS:
				getPermissions().clear();
				getPermissions().addAll((Collection<? extends MPermission>)newValue);
				return;
			case AppMetaModelPackage.MAPPLICATION__MIN_SDK:
				setMinSdk((Integer)newValue);
				return;
			case AppMetaModelPackage.MAPPLICATION__TARGET_SDK:
				setTargetSdk((Integer)newValue);
				return;
			case AppMetaModelPackage.MAPPLICATION__NAME:
				setName((String)newValue);
				return;
			case AppMetaModelPackage.MAPPLICATION__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends MIntentStartable>)newValue);
				return;
			case AppMetaModelPackage.MAPPLICATION__LAUNCHER_ACTIVITY:
				setLauncherActivity((MActivity)newValue);
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
			case AppMetaModelPackage.MAPPLICATION__PACKAGE_NAME:
				setPackageName(PACKAGE_NAME_EDEFAULT);
				return;
			case AppMetaModelPackage.MAPPLICATION__PERMISSIONS:
				getPermissions().clear();
				return;
			case AppMetaModelPackage.MAPPLICATION__MIN_SDK:
				setMinSdk(MIN_SDK_EDEFAULT);
				return;
			case AppMetaModelPackage.MAPPLICATION__TARGET_SDK:
				setTargetSdk(TARGET_SDK_EDEFAULT);
				return;
			case AppMetaModelPackage.MAPPLICATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AppMetaModelPackage.MAPPLICATION__ELEMENTS:
				getElements().clear();
				return;
			case AppMetaModelPackage.MAPPLICATION__LAUNCHER_ACTIVITY:
				setLauncherActivity((MActivity)null);
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
			case AppMetaModelPackage.MAPPLICATION__PACKAGE_NAME:
				return PACKAGE_NAME_EDEFAULT == null ? packageName != null : !PACKAGE_NAME_EDEFAULT.equals(packageName);
			case AppMetaModelPackage.MAPPLICATION__PERMISSIONS:
				return permissions != null && !permissions.isEmpty();
			case AppMetaModelPackage.MAPPLICATION__MIN_SDK:
				return minSdk != MIN_SDK_EDEFAULT;
			case AppMetaModelPackage.MAPPLICATION__TARGET_SDK:
				return targetSdk != TARGET_SDK_EDEFAULT;
			case AppMetaModelPackage.MAPPLICATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AppMetaModelPackage.MAPPLICATION__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case AppMetaModelPackage.MAPPLICATION__LAUNCHER_ACTIVITY:
				return launcherActivity != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (packageName: ");
		result.append(packageName);
		result.append(", minSdk: ");
		result.append(minSdk);
		result.append(", targetSdk: ");
		result.append(targetSdk);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //MApplicationImpl
