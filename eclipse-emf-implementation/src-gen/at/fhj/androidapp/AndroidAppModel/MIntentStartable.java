/**
 */
package at.fhj.androidapp.AndroidAppModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MIntent Startable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.fhj.androidapp.AndroidAppModel.MIntentStartable#getIntentFilter <em>Intent Filter</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.fhj.androidapp.AndroidAppModel.AppMetaModelPackage#getMIntentStartable()
 * @model
 * @generated
 */
public interface MIntentStartable extends EObject {
	/**
	 * Returns the value of the '<em><b>Intent Filter</b></em>' reference list.
	 * The list contents are of type {@link at.fhj.androidapp.AndroidAppModel.MIntent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intent Filter</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intent Filter</em>' reference list.
	 * @see at.fhj.androidapp.AndroidAppModel.AppMetaModelPackage#getMIntentStartable_IntentFilter()
	 * @model
	 * @generated
	 */
	EList<MIntent> getIntentFilter();

} // MIntentStartable
