/**
 */
package at.fhj.androidapp.androidapp.provider;

import at.fhj.androidapp.androidapp.util.AndroidApplicationModelAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AndroidApplicationModelItemProviderAdapterFactory extends AndroidApplicationModelAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AndroidApplicationModelItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link at.fhj.androidapp.androidapp.MAndroidAppProject} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MAndroidAppProjectItemProvider mAndroidAppProjectItemProvider;

	/**
	 * This creates an adapter for a {@link at.fhj.androidapp.androidapp.MAndroidAppProject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMAndroidAppProjectAdapter() {
		if (mAndroidAppProjectItemProvider == null) {
			mAndroidAppProjectItemProvider = new MAndroidAppProjectItemProvider(this);
		}

		return mAndroidAppProjectItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link at.fhj.androidapp.androidapp.MApplication} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MApplicationItemProvider mApplicationItemProvider;

	/**
	 * This creates an adapter for a {@link at.fhj.androidapp.androidapp.MApplication}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMApplicationAdapter() {
		if (mApplicationItemProvider == null) {
			mApplicationItemProvider = new MApplicationItemProvider(this);
		}

		return mApplicationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link at.fhj.androidapp.androidapp.MPermission} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MPermissionItemProvider mPermissionItemProvider;

	/**
	 * This creates an adapter for a {@link at.fhj.androidapp.androidapp.MPermission}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMPermissionAdapter() {
		if (mPermissionItemProvider == null) {
			mPermissionItemProvider = new MPermissionItemProvider(this);
		}

		return mPermissionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link at.fhj.androidapp.androidapp.MIntent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MIntentItemProvider mIntentItemProvider;

	/**
	 * This creates an adapter for a {@link at.fhj.androidapp.androidapp.MIntent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMIntentAdapter() {
		if (mIntentItemProvider == null) {
			mIntentItemProvider = new MIntentItemProvider(this);
		}

		return mIntentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link at.fhj.androidapp.androidapp.MActivity} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MActivityItemProvider mActivityItemProvider;

	/**
	 * This creates an adapter for a {@link at.fhj.androidapp.androidapp.MActivity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMActivityAdapter() {
		if (mActivityItemProvider == null) {
			mActivityItemProvider = new MActivityItemProvider(this);
		}

		return mActivityItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link at.fhj.androidapp.androidapp.MService} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MServiceItemProvider mServiceItemProvider;

	/**
	 * This creates an adapter for a {@link at.fhj.androidapp.androidapp.MService}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMServiceAdapter() {
		if (mServiceItemProvider == null) {
			mServiceItemProvider = new MServiceItemProvider(this);
		}

		return mServiceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link at.fhj.androidapp.androidapp.MBroadcastReceiver} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MBroadcastReceiverItemProvider mBroadcastReceiverItemProvider;

	/**
	 * This creates an adapter for a {@link at.fhj.androidapp.androidapp.MBroadcastReceiver}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMBroadcastReceiverAdapter() {
		if (mBroadcastReceiverItemProvider == null) {
			mBroadcastReceiverItemProvider = new MBroadcastReceiverItemProvider(this);
		}

		return mBroadcastReceiverItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (mAndroidAppProjectItemProvider != null) mAndroidAppProjectItemProvider.dispose();
		if (mApplicationItemProvider != null) mApplicationItemProvider.dispose();
		if (mPermissionItemProvider != null) mPermissionItemProvider.dispose();
		if (mIntentItemProvider != null) mIntentItemProvider.dispose();
		if (mActivityItemProvider != null) mActivityItemProvider.dispose();
		if (mServiceItemProvider != null) mServiceItemProvider.dispose();
		if (mBroadcastReceiverItemProvider != null) mBroadcastReceiverItemProvider.dispose();
	}

}
