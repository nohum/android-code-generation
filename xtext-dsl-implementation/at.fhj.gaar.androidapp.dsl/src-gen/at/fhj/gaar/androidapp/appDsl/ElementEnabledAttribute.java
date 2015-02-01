/**
 */
package at.fhj.gaar.androidapp.appDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Enabled Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.fhj.gaar.androidapp.appDsl.ElementEnabledAttribute#isEnabled <em>Enabled</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.fhj.gaar.androidapp.appDsl.AppDslPackage#getElementEnabledAttribute()
 * @model
 * @generated
 */
public interface ElementEnabledAttribute extends ActivityAttribute, BroadcastReceiverAttribute, ServiceAttribute
{
  /**
   * Returns the value of the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enabled</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enabled</em>' attribute.
   * @see #setEnabled(boolean)
   * @see at.fhj.gaar.androidapp.appDsl.AppDslPackage#getElementEnabledAttribute_Enabled()
   * @model
   * @generated
   */
  boolean isEnabled();

  /**
   * Sets the value of the '{@link at.fhj.gaar.androidapp.appDsl.ElementEnabledAttribute#isEnabled <em>Enabled</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Enabled</em>' attribute.
   * @see #isEnabled()
   * @generated
   */
  void setEnabled(boolean value);

} // ElementEnabledAttribute
