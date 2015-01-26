/**
 */
package at.fhj.androidapp.androidapp;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see at.fhj.androidapp.androidapp.AndroidApplicationModelPackage
 * @generated
 */
public interface AndroidApplicationModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AndroidApplicationModelFactory eINSTANCE = at.fhj.androidapp.androidapp.impl.AndroidApplicationModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>MAndroid App Project</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MAndroid App Project</em>'.
	 * @generated
	 */
	MAndroidAppProject createMAndroidAppProject();

	/**
	 * Returns a new object of class '<em>MApplication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MApplication</em>'.
	 * @generated
	 */
	MApplication createMApplication();

	/**
	 * Returns a new object of class '<em>MPermission</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MPermission</em>'.
	 * @generated
	 */
	MPermission createMPermission();

	/**
	 * Returns a new object of class '<em>MIntent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MIntent</em>'.
	 * @generated
	 */
	MIntent createMIntent();

	/**
	 * Returns a new object of class '<em>MIntent Startable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MIntent Startable</em>'.
	 * @generated
	 */
	MIntentStartable createMIntentStartable();

	/**
	 * Returns a new object of class '<em>MActivity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MActivity</em>'.
	 * @generated
	 */
	MActivity createMActivity();

	/**
	 * Returns a new object of class '<em>MService</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MService</em>'.
	 * @generated
	 */
	MService createMService();

	/**
	 * Returns a new object of class '<em>MBroadcast Receiver</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MBroadcast Receiver</em>'.
	 * @generated
	 */
	MBroadcastReceiver createMBroadcastReceiver();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AndroidApplicationModelPackage getAndroidApplicationModelPackage();

} //AndroidApplicationModelFactory
