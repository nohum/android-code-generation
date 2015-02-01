/**
 */
package at.fhj.gaar.androidapp.appDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Start Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.fhj.gaar.androidapp.appDsl.ActionStartActivity#getActivity <em>Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.fhj.gaar.androidapp.appDsl.AppDslPackage#getActionStartActivity()
 * @model
 * @generated
 */
public interface ActionStartActivity extends LayoutElementClickAction, BroadcastReceiverAction
{
  /**
   * Returns the value of the '<em><b>Activity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Activity</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Activity</em>' attribute.
   * @see #setActivity(String)
   * @see at.fhj.gaar.androidapp.appDsl.AppDslPackage#getActionStartActivity_Activity()
   * @model
   * @generated
   */
  String getActivity();

  /**
   * Sets the value of the '{@link at.fhj.gaar.androidapp.appDsl.ActionStartActivity#getActivity <em>Activity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Activity</em>' attribute.
   * @see #getActivity()
   * @generated
   */
  void setActivity(String value);

} // ActionStartActivity
