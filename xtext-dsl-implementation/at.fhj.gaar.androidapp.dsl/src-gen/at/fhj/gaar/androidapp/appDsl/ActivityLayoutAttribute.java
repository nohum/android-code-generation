/**
 */
package at.fhj.gaar.androidapp.appDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Layout Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.fhj.gaar.androidapp.appDsl.ActivityLayoutAttribute#getLayoutElements <em>Layout Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.fhj.gaar.androidapp.appDsl.AppDslPackage#getActivityLayoutAttribute()
 * @model
 * @generated
 */
public interface ActivityLayoutAttribute extends ActivityAttribute
{
  /**
   * Returns the value of the '<em><b>Layout Elements</b></em>' containment reference list.
   * The list contents are of type {@link at.fhj.gaar.androidapp.appDsl.LayoutElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Layout Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Layout Elements</em>' containment reference list.
   * @see at.fhj.gaar.androidapp.appDsl.AppDslPackage#getActivityLayoutAttribute_LayoutElements()
   * @model containment="true"
   * @generated
   */
  EList<LayoutElement> getLayoutElements();

} // ActivityLayoutAttribute
