/**
 */
package at.fhj.gaar.androidapp.appDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Parent Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.fhj.gaar.androidapp.appDsl.ActivityParentAttribute#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.fhj.gaar.androidapp.appDsl.AppDslPackage#getActivityParentAttribute()
 * @model
 * @generated
 */
public interface ActivityParentAttribute extends ActivityAttribute
{
  /**
   * Returns the value of the '<em><b>Parent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent</em>' reference.
   * @see #setParent(Activity)
   * @see at.fhj.gaar.androidapp.appDsl.AppDslPackage#getActivityParentAttribute_Parent()
   * @model
   * @generated
   */
  Activity getParent();

  /**
   * Sets the value of the '{@link at.fhj.gaar.androidapp.appDsl.ActivityParentAttribute#getParent <em>Parent</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent</em>' reference.
   * @see #getParent()
   * @generated
   */
  void setParent(Activity value);

} // ActivityParentAttribute
