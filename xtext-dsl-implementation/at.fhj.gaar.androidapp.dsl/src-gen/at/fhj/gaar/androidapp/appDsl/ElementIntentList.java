/**
 */
package at.fhj.gaar.androidapp.appDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Intent List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.fhj.gaar.androidapp.appDsl.ElementIntentList#getIntents <em>Intents</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.fhj.gaar.androidapp.appDsl.AppDslPackage#getElementIntentList()
 * @model
 * @generated
 */
public interface ElementIntentList extends ActivityAttribute, BroadcastReceiverAttribute, ServiceAttribute
{
  /**
   * Returns the value of the '<em><b>Intents</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Intents</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Intents</em>' attribute list.
   * @see at.fhj.gaar.androidapp.appDsl.AppDslPackage#getElementIntentList_Intents()
   * @model unique="false"
   * @generated
   */
  EList<String> getIntents();

} // ElementIntentList
