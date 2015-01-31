/**
 */
package at.fhj.androidapp.androidapp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MAndroid App Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.fhj.androidapp.androidapp.MAndroidAppProject#getApplication <em>Application</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.fhj.androidapp.androidapp.AndroidApplicationModelPackage#getMAndroidAppProject()
 * @model
 * @generated
 */
public interface MAndroidAppProject extends EObject {
	/**
	 * Returns the value of the '<em><b>Application</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application</em>' containment reference.
	 * @see #setApplication(MApplication)
	 * @see at.fhj.androidapp.androidapp.AndroidApplicationModelPackage#getMAndroidAppProject_Application()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MApplication getApplication();

	/**
	 * Sets the value of the '{@link at.fhj.androidapp.androidapp.MAndroidAppProject#getApplication <em>Application</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application</em>' containment reference.
	 * @see #getApplication()
	 * @generated
	 */
	void setApplication(MApplication value);

} // MAndroidAppProject
