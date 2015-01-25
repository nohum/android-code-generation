/**
 */
package at.fhj.androidapp.AndroidAppModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MActivity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.fhj.androidapp.AndroidAppModel.MActivity#getTitle <em>Title</em>}</li>
 *   <li>{@link at.fhj.androidapp.AndroidAppModel.MActivity#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.fhj.androidapp.AndroidAppModel.AppMetaModelPackage#getMActivity()
 * @model
 * @generated
 */
public interface MActivity extends MIntentStartable {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see at.fhj.androidapp.AndroidAppModel.AppMetaModelPackage#getMActivity_Title()
	 * @model required="true"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link at.fhj.androidapp.AndroidAppModel.MActivity#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(MActivity)
	 * @see at.fhj.androidapp.AndroidAppModel.AppMetaModelPackage#getMActivity_Parent()
	 * @model
	 * @generated
	 */
	MActivity getParent();

	/**
	 * Sets the value of the '{@link at.fhj.androidapp.AndroidAppModel.MActivity#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(MActivity value);

} // MActivity
