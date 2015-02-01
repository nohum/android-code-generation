/**
 */
package at.fhj.gaar.androidapp.appDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see at.fhj.gaar.androidapp.appDsl.AppDslPackage
 * @generated
 */
public interface AppDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AppDslFactory eINSTANCE = at.fhj.gaar.androidapp.appDsl.impl.AppDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Android App Project</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Android App Project</em>'.
   * @generated
   */
  AndroidAppProject createAndroidAppProject();

  /**
   * Returns a new object of class '<em>Application</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Application</em>'.
   * @generated
   */
  Application createApplication();

  /**
   * Returns a new object of class '<em>Application Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Application Attribute</em>'.
   * @generated
   */
  ApplicationAttribute createApplicationAttribute();

  /**
   * Returns a new object of class '<em>Application Title</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Application Title</em>'.
   * @generated
   */
  ApplicationTitle createApplicationTitle();

  /**
   * Returns a new object of class '<em>Application Min Sdk</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Application Min Sdk</em>'.
   * @generated
   */
  ApplicationMinSdk createApplicationMinSdk();

  /**
   * Returns a new object of class '<em>Application Target Sdk</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Application Target Sdk</em>'.
   * @generated
   */
  ApplicationTargetSdk createApplicationTargetSdk();

  /**
   * Returns a new object of class '<em>Application Compile Sdk</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Application Compile Sdk</em>'.
   * @generated
   */
  ApplicationCompileSdk createApplicationCompileSdk();

  /**
   * Returns a new object of class '<em>Application Permission List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Application Permission List</em>'.
   * @generated
   */
  ApplicationPermissionList createApplicationPermissionList();

  /**
   * Returns a new object of class '<em>Application Element List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Application Element List</em>'.
   * @generated
   */
  ApplicationElementList createApplicationElementList();

  /**
   * Returns a new object of class '<em>Application Main Activity</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Application Main Activity</em>'.
   * @generated
   */
  ApplicationMainActivity createApplicationMainActivity();

  /**
   * Returns a new object of class '<em>Application Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Application Element</em>'.
   * @generated
   */
  ApplicationElement createApplicationElement();

  /**
   * Returns a new object of class '<em>Activity</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Activity</em>'.
   * @generated
   */
  Activity createActivity();

  /**
   * Returns a new object of class '<em>Broadcast Receiver</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Broadcast Receiver</em>'.
   * @generated
   */
  BroadcastReceiver createBroadcastReceiver();

  /**
   * Returns a new object of class '<em>Service</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Service</em>'.
   * @generated
   */
  Service createService();

  /**
   * Returns a new object of class '<em>Activity Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Activity Attribute</em>'.
   * @generated
   */
  ActivityAttribute createActivityAttribute();

  /**
   * Returns a new object of class '<em>Broadcast Receiver Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Broadcast Receiver Attribute</em>'.
   * @generated
   */
  BroadcastReceiverAttribute createBroadcastReceiverAttribute();

  /**
   * Returns a new object of class '<em>Service Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Service Attribute</em>'.
   * @generated
   */
  ServiceAttribute createServiceAttribute();

  /**
   * Returns a new object of class '<em>Element Enabled Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Element Enabled Attribute</em>'.
   * @generated
   */
  ElementEnabledAttribute createElementEnabledAttribute();

  /**
   * Returns a new object of class '<em>Element Exported Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Element Exported Attribute</em>'.
   * @generated
   */
  ElementExportedAttribute createElementExportedAttribute();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  AppDslPackage getAppDslPackage();

} //AppDslFactory
