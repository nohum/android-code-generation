/**
 */
package at.fhj.gaar.androidapp.appDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Label Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.fhj.gaar.androidapp.appDsl.ElementLabelAttribute#getTitle <em>Title</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.fhj.gaar.androidapp.appDsl.AppDslPackage#getElementLabelAttribute()
 * @model
 * @generated
 */
public interface ElementLabelAttribute extends ApplicationAttribute, ActivityAttribute, BroadcastReceiverAttribute, ServiceAttribute
{
  /**
   * Returns the value of the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Title</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Title</em>' attribute.
   * @see #setTitle(String)
   * @see at.fhj.gaar.androidapp.appDsl.AppDslPackage#getElementLabelAttribute_Title()
   * @model
   * @generated
   */
  String getTitle();

  /**
   * Sets the value of the '{@link at.fhj.gaar.androidapp.appDsl.ElementLabelAttribute#getTitle <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Title</em>' attribute.
   * @see #getTitle()
   * @generated
   */
  void setTitle(String value);

} // ElementLabelAttribute
