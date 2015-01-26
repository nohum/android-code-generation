/**
 */
package at.fhj.androidapp.androidapp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MApplication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.fhj.androidapp.androidapp.MApplication#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link at.fhj.androidapp.androidapp.MApplication#getPermissions <em>Permissions</em>}</li>
 *   <li>{@link at.fhj.androidapp.androidapp.MApplication#getMinSdk <em>Min Sdk</em>}</li>
 *   <li>{@link at.fhj.androidapp.androidapp.MApplication#getTargetSdk <em>Target Sdk</em>}</li>
 *   <li>{@link at.fhj.androidapp.androidapp.MApplication#getName <em>Name</em>}</li>
 *   <li>{@link at.fhj.androidapp.androidapp.MApplication#getElements <em>Elements</em>}</li>
 *   <li>{@link at.fhj.androidapp.androidapp.MApplication#getLauncherActivity <em>Launcher Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.fhj.androidapp.androidapp.AndroidApplicationModelPackage#getMApplication()
 * @model
 * @generated
 */
public interface MApplication extends EObject {
	/**
	 * Returns the value of the '<em><b>Package Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Name</em>' attribute.
	 * @see #setPackageName(String)
	 * @see at.fhj.androidapp.androidapp.AndroidApplicationModelPackage#getMApplication_PackageName()
	 * @model default="" required="true"
	 * @generated
	 */
	String getPackageName();

	/**
	 * Sets the value of the '{@link at.fhj.androidapp.androidapp.MApplication#getPackageName <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Name</em>' attribute.
	 * @see #getPackageName()
	 * @generated
	 */
	void setPackageName(String value);

	/**
	 * Returns the value of the '<em><b>Permissions</b></em>' containment reference list.
	 * The list contents are of type {@link at.fhj.androidapp.androidapp.MPermission}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Permissions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permissions</em>' containment reference list.
	 * @see at.fhj.androidapp.androidapp.AndroidApplicationModelPackage#getMApplication_Permissions()
	 * @model containment="true"
	 * @generated
	 */
	EList<MPermission> getPermissions();

	/**
	 * Returns the value of the '<em><b>Min Sdk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Sdk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Sdk</em>' attribute.
	 * @see #setMinSdk(int)
	 * @see at.fhj.androidapp.androidapp.AndroidApplicationModelPackage#getMApplication_MinSdk()
	 * @model required="true"
	 * @generated
	 */
	int getMinSdk();

	/**
	 * Sets the value of the '{@link at.fhj.androidapp.androidapp.MApplication#getMinSdk <em>Min Sdk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Sdk</em>' attribute.
	 * @see #getMinSdk()
	 * @generated
	 */
	void setMinSdk(int value);

	/**
	 * Returns the value of the '<em><b>Target Sdk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Sdk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Sdk</em>' attribute.
	 * @see #setTargetSdk(int)
	 * @see at.fhj.androidapp.androidapp.AndroidApplicationModelPackage#getMApplication_TargetSdk()
	 * @model required="true"
	 * @generated
	 */
	int getTargetSdk();

	/**
	 * Sets the value of the '{@link at.fhj.androidapp.androidapp.MApplication#getTargetSdk <em>Target Sdk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Sdk</em>' attribute.
	 * @see #getTargetSdk()
	 * @generated
	 */
	void setTargetSdk(int value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see at.fhj.androidapp.androidapp.AndroidApplicationModelPackage#getMApplication_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link at.fhj.androidapp.androidapp.MApplication#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link at.fhj.androidapp.androidapp.MIntentStartable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see at.fhj.androidapp.androidapp.AndroidApplicationModelPackage#getMApplication_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<MIntentStartable> getElements();

	/**
	 * Returns the value of the '<em><b>Launcher Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Launcher Activity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Launcher Activity</em>' containment reference.
	 * @see #setLauncherActivity(MActivity)
	 * @see at.fhj.androidapp.androidapp.AndroidApplicationModelPackage#getMApplication_LauncherActivity()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MActivity getLauncherActivity();

	/**
	 * Sets the value of the '{@link at.fhj.androidapp.androidapp.MApplication#getLauncherActivity <em>Launcher Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Launcher Activity</em>' containment reference.
	 * @see #getLauncherActivity()
	 * @generated
	 */
	void setLauncherActivity(MActivity value);

} // MApplication
