/**
 */
package at.fhj.gaar.androidapp.appDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Show Toast</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.fhj.gaar.androidapp.appDsl.ActionShowToast#getToastText <em>Toast Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.fhj.gaar.androidapp.appDsl.AppDslPackage#getActionShowToast()
 * @model
 * @generated
 */
public interface ActionShowToast extends LayoutElementClickAction, BroadcastReceiverAction
{
  /**
   * Returns the value of the '<em><b>Toast Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Toast Text</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Toast Text</em>' attribute.
   * @see #setToastText(String)
   * @see at.fhj.gaar.androidapp.appDsl.AppDslPackage#getActionShowToast_ToastText()
   * @model
   * @generated
   */
  String getToastText();

  /**
   * Sets the value of the '{@link at.fhj.gaar.androidapp.appDsl.ActionShowToast#getToastText <em>Toast Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Toast Text</em>' attribute.
   * @see #getToastText()
   * @generated
   */
  void setToastText(String value);

} // ActionShowToast
