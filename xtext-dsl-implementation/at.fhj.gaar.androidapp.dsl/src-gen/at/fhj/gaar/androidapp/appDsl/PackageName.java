/**
 */
package at.fhj.gaar.androidapp.appDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.fhj.gaar.androidapp.appDsl.PackageName#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.fhj.gaar.androidapp.appDsl.AppDslPackage#getPackageName()
 * @model
 * @generated
 */
public interface PackageName extends EObject
{
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
   * @see at.fhj.gaar.androidapp.appDsl.AppDslPackage#getPackageName_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link at.fhj.gaar.androidapp.appDsl.PackageName#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // PackageName
