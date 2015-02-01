/**
 */
package at.fhj.gaar.androidapp.appDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Exported Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.fhj.gaar.androidapp.appDsl.ElementExportedAttribute#isExported <em>Exported</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.fhj.gaar.androidapp.appDsl.AppDslPackage#getElementExportedAttribute()
 * @model
 * @generated
 */
public interface ElementExportedAttribute extends ActivityAttribute, BroadcastReceiverAttribute, ServiceAttribute
{
  /**
   * Returns the value of the '<em><b>Exported</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exported</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exported</em>' attribute.
   * @see #setExported(boolean)
   * @see at.fhj.gaar.androidapp.appDsl.AppDslPackage#getElementExportedAttribute_Exported()
   * @model
   * @generated
   */
  boolean isExported();

  /**
   * Sets the value of the '{@link at.fhj.gaar.androidapp.appDsl.ElementExportedAttribute#isExported <em>Exported</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exported</em>' attribute.
   * @see #isExported()
   * @generated
   */
  void setExported(boolean value);

} // ElementExportedAttribute
