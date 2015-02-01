/**
 */
package at.fhj.gaar.androidapp.appDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Broadcast Receiver Action Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.fhj.gaar.androidapp.appDsl.BroadcastReceiverActionAttribute#getAction <em>Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.fhj.gaar.androidapp.appDsl.AppDslPackage#getBroadcastReceiverActionAttribute()
 * @model
 * @generated
 */
public interface BroadcastReceiverActionAttribute extends BroadcastReceiverAttribute
{
  /**
   * Returns the value of the '<em><b>Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Action</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action</em>' containment reference.
   * @see #setAction(BroadcastReceiverAction)
   * @see at.fhj.gaar.androidapp.appDsl.AppDslPackage#getBroadcastReceiverActionAttribute_Action()
   * @model containment="true"
   * @generated
   */
  BroadcastReceiverAction getAction();

  /**
   * Sets the value of the '{@link at.fhj.gaar.androidapp.appDsl.BroadcastReceiverActionAttribute#getAction <em>Action</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Action</em>' containment reference.
   * @see #getAction()
   * @generated
   */
  void setAction(BroadcastReceiverAction value);

} // BroadcastReceiverActionAttribute
