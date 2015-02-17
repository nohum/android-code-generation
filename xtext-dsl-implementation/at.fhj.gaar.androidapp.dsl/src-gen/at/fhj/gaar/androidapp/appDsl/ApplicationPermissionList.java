/**
 */
package at.fhj.gaar.androidapp.appDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application Permission List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.fhj.gaar.androidapp.appDsl.ApplicationPermissionList#getPermissions <em>Permissions</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.fhj.gaar.androidapp.appDsl.AppDslPackage#getApplicationPermissionList()
 * @model
 * @generated
 */
public interface ApplicationPermissionList extends ApplicationAttribute
{
  /**
   * Returns the value of the '<em><b>Permissions</b></em>' containment reference list.
   * The list contents are of type {@link at.fhj.gaar.androidapp.appDsl.Permission}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Permissions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Permissions</em>' containment reference list.
   * @see at.fhj.gaar.androidapp.appDsl.AppDslPackage#getApplicationPermissionList_Permissions()
   * @model containment="true"
   * @generated
   */
  EList<Permission> getPermissions();

} // ApplicationPermissionList
