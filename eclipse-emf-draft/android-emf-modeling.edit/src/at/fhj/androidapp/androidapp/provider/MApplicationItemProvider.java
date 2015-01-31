/**
 */
package at.fhj.androidapp.androidapp.provider;


import at.fhj.androidapp.androidapp.AndroidApplicationModelFactory;
import at.fhj.androidapp.androidapp.AndroidApplicationModelPackage;
import at.fhj.androidapp.androidapp.MApplication;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link at.fhj.androidapp.androidapp.MApplication} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MApplicationItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MApplicationItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addPackageNamePropertyDescriptor(object);
			addPermissionsPropertyDescriptor(object);
			addMinSdkPropertyDescriptor(object);
			addTargetSdkPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addElementsPropertyDescriptor(object);
			addLauncherActivityPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Package Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPackageNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MApplication_packageName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MApplication_packageName_feature", "_UI_MApplication_type"),
				 AndroidApplicationModelPackage.Literals.MAPPLICATION__PACKAGE_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Permissions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPermissionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MApplication_permissions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MApplication_permissions_feature", "_UI_MApplication_type"),
				 AndroidApplicationModelPackage.Literals.MAPPLICATION__PERMISSIONS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Min Sdk feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinSdkPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MApplication_minSdk_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MApplication_minSdk_feature", "_UI_MApplication_type"),
				 AndroidApplicationModelPackage.Literals.MAPPLICATION__MIN_SDK,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Target Sdk feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetSdkPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MApplication_targetSdk_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MApplication_targetSdk_feature", "_UI_MApplication_type"),
				 AndroidApplicationModelPackage.Literals.MAPPLICATION__TARGET_SDK,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MApplication_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MApplication_name_feature", "_UI_MApplication_type"),
				 AndroidApplicationModelPackage.Literals.MAPPLICATION__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Elements feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addElementsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MApplication_elements_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MApplication_elements_feature", "_UI_MApplication_type"),
				 AndroidApplicationModelPackage.Literals.MAPPLICATION__ELEMENTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Launcher Activity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLauncherActivityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MApplication_launcherActivity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MApplication_launcherActivity_feature", "_UI_MApplication_type"),
				 AndroidApplicationModelPackage.Literals.MAPPLICATION__LAUNCHER_ACTIVITY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(AndroidApplicationModelPackage.Literals.MAPPLICATION__PERMISSIONS);
			childrenFeatures.add(AndroidApplicationModelPackage.Literals.MAPPLICATION__ELEMENTS);
			childrenFeatures.add(AndroidApplicationModelPackage.Literals.MAPPLICATION__LAUNCHER_ACTIVITY);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns MApplication.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MApplication"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((MApplication)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_MApplication_type") :
			getString("_UI_MApplication_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(MApplication.class)) {
			case AndroidApplicationModelPackage.MAPPLICATION__PACKAGE_NAME:
			case AndroidApplicationModelPackage.MAPPLICATION__MIN_SDK:
			case AndroidApplicationModelPackage.MAPPLICATION__TARGET_SDK:
			case AndroidApplicationModelPackage.MAPPLICATION__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(AndroidApplicationModelPackage.Literals.MAPPLICATION__PERMISSIONS,
				 AndroidApplicationModelFactory.eINSTANCE.createMPermission()));

		newChildDescriptors.add
			(createChildParameter
				(AndroidApplicationModelPackage.Literals.MAPPLICATION__ELEMENTS,
				 AndroidApplicationModelFactory.eINSTANCE.createMActivity()));

		newChildDescriptors.add
			(createChildParameter
				(AndroidApplicationModelPackage.Literals.MAPPLICATION__ELEMENTS,
				 AndroidApplicationModelFactory.eINSTANCE.createMService()));

		newChildDescriptors.add
			(createChildParameter
				(AndroidApplicationModelPackage.Literals.MAPPLICATION__ELEMENTS,
				 AndroidApplicationModelFactory.eINSTANCE.createMBroadcastReceiver()));

		newChildDescriptors.add
			(createChildParameter
				(AndroidApplicationModelPackage.Literals.MAPPLICATION__LAUNCHER_ACTIVITY,
				 AndroidApplicationModelFactory.eINSTANCE.createMActivity()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == AndroidApplicationModelPackage.Literals.MAPPLICATION__ELEMENTS ||
			childFeature == AndroidApplicationModelPackage.Literals.MAPPLICATION__LAUNCHER_ACTIVITY;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return AndroidAppMetamodelContainerEditPlugin.INSTANCE;
	}

}
