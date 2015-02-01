/**
 */
package at.fhj.gaar.androidapp.appDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Start Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.fhj.gaar.androidapp.appDsl.ActionStartService#getService <em>Service</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.fhj.gaar.androidapp.appDsl.AppDslPackage#getActionStartService()
 * @model
 * @generated
 */
public interface ActionStartService extends LayoutElementClickAction, BroadcastReceiverAction
{
  /**
   * Returns the value of the '<em><b>Service</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Service</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Service</em>' attribute.
   * @see #setService(String)
   * @see at.fhj.gaar.androidapp.appDsl.AppDslPackage#getActionStartService_Service()
   * @model
   * @generated
   */
  String getService();

  /**
   * Sets the value of the '{@link at.fhj.gaar.androidapp.appDsl.ActionStartService#getService <em>Service</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Service</em>' attribute.
   * @see #getService()
   * @generated
   */
  void setService(String value);

} // ActionStartService
