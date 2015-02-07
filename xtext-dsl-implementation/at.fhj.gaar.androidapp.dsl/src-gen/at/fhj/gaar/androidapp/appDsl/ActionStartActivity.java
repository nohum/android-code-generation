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
   * Returns the value of the '<em><b>Activity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Activity</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Activity</em>' reference.
   * @see #setActivity(Activity)
   * @see at.fhj.gaar.androidapp.appDsl.AppDslPackage#getActionStartActivity_Activity()
   * @model
   * @generated
   */
  Activity getActivity();

  /**
   * Sets the value of the '{@link at.fhj.gaar.androidapp.appDsl.ActionStartActivity#getActivity <em>Activity</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Activity</em>' reference.
   * @see #getActivity()
   * @generated
   */
  void setActivity(Activity value);

} // ActionStartActivity
