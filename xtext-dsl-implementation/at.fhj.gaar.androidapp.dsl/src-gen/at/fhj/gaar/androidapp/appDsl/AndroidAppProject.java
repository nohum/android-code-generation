/**
 */
package at.fhj.gaar.androidapp.appDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Android App Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.fhj.gaar.androidapp.appDsl.AndroidAppProject#getApplications <em>Applications</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.fhj.gaar.androidapp.appDsl.AppDslPackage#getAndroidAppProject()
 * @model
 * @generated
 */
public interface AndroidAppProject extends EObject
{
  /**
   * Returns the value of the '<em><b>Applications</b></em>' containment reference list.
   * The list contents are of type {@link at.fhj.gaar.androidapp.appDsl.Application}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Applications</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Applications</em>' containment reference list.
   * @see at.fhj.gaar.androidapp.appDsl.AppDslPackage#getAndroidAppProject_Applications()
   * @model containment="true"
   * @generated
   */
  EList<Application> getApplications();

} // AndroidAppProject
