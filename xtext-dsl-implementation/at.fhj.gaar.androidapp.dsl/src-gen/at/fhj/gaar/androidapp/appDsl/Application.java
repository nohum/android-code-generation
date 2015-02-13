/**
 */
package at.fhj.gaar.androidapp.appDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.fhj.gaar.androidapp.appDsl.Application#getName <em>Name</em>}</li>
 *   <li>{@link at.fhj.gaar.androidapp.appDsl.Application#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.fhj.gaar.androidapp.appDsl.AppDslPackage#getApplication()
 * @model
 * @generated
 */
public interface Application extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' containment reference.
   * @see #setName(PackageName)
   * @see at.fhj.gaar.androidapp.appDsl.AppDslPackage#getApplication_Name()
   * @model containment="true"
   * @generated
   */
  PackageName getName();

  /**
   * Sets the value of the '{@link at.fhj.gaar.androidapp.appDsl.Application#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(PackageName value);

  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
   * The list contents are of type {@link at.fhj.gaar.androidapp.appDsl.ApplicationAttribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference list.
   * @see at.fhj.gaar.androidapp.appDsl.AppDslPackage#getApplication_Attributes()
   * @model containment="true"
   * @generated
   */
  EList<ApplicationAttribute> getAttributes();

} // Application
