/**
 */
package at.fhj.gaar.androidapp.appDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application Target Sdk</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.fhj.gaar.androidapp.appDsl.ApplicationTargetSdk#getTargetSdk <em>Target Sdk</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.fhj.gaar.androidapp.appDsl.AppDslPackage#getApplicationTargetSdk()
 * @model
 * @generated
 */
public interface ApplicationTargetSdk extends ApplicationAttribute
{
  /**
   * Returns the value of the '<em><b>Target Sdk</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target Sdk</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target Sdk</em>' attribute.
   * @see #setTargetSdk(int)
   * @see at.fhj.gaar.androidapp.appDsl.AppDslPackage#getApplicationTargetSdk_TargetSdk()
   * @model
   * @generated
   */
  int getTargetSdk();

  /**
   * Sets the value of the '{@link at.fhj.gaar.androidapp.appDsl.ApplicationTargetSdk#getTargetSdk <em>Target Sdk</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Sdk</em>' attribute.
   * @see #getTargetSdk()
   * @generated
   */
  void setTargetSdk(int value);

} // ApplicationTargetSdk
