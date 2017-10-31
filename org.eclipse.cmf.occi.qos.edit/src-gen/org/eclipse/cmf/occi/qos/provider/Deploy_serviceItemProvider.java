/**
 * Copyright (c) 2015-2017 Obeo, Inria
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 	
 * Contributors:
 * - William Piers <william.piers@obeo.fr>
 * - Philippe Merle <philippe.merle@inria.fr>
 * - Faiez Zalila <faiez.zalila@inria.fr>
 */
package org.eclipse.cmf.occi.qos.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.cmf.occi.qos.Deploy_service;
import org.eclipse.cmf.occi.qos.QosFactory;
import org.eclipse.cmf.occi.qos.QosPackage;

import org.eclipse.cmf.occi.sla.AgreementTermType;

import org.eclipse.cmf.occi.sla.provider.Agreement_termItemProvider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.eclipse.cmf.occi.qos.Deploy_service} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Deploy_serviceItemProvider extends Agreement_termItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deploy_serviceItemProvider(AdapterFactory adapterFactory) {
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

			addDeployServiceTermTypePropertyDescriptor(object);
			addDeployServiceTermStatePropertyDescriptor(object);
			addDeployServiceNumberComponentsPropertyDescriptor(object);
			addDeployServiceThroughputPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Deploy Service Term Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDeployServiceTermTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Deploy_service_deployServiceTermType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Deploy_service_deployServiceTermType_feature", "_UI_Deploy_service_type"),
				 QosPackage.Literals.DEPLOY_SERVICE__DEPLOY_SERVICE_TERM_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Deploy Service Term State feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDeployServiceTermStatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Deploy_service_deployServiceTermState_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Deploy_service_deployServiceTermState_feature", "_UI_Deploy_service_type"),
				 QosPackage.Literals.DEPLOY_SERVICE__DEPLOY_SERVICE_TERM_STATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Deploy Service Number Components feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDeployServiceNumberComponentsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Deploy_service_deployServiceNumberComponents_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Deploy_service_deployServiceNumberComponents_feature", "_UI_Deploy_service_type"),
				 QosPackage.Literals.DEPLOY_SERVICE__DEPLOY_SERVICE_NUMBER_COMPONENTS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Deploy Service Throughput feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDeployServiceThroughputPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Deploy_service_deployServiceThroughput_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Deploy_service_deployServiceThroughput_feature", "_UI_Deploy_service_type"),
				 QosPackage.Literals.DEPLOY_SERVICE__DEPLOY_SERVICE_THROUGHPUT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(QosPackage.Literals.DEPLOY_SERVICE__DEPLOY_SERVICE_DEPLOYMENT_STRATEGY);
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
	 * This returns Deploy_service.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Deploy_service"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		AgreementTermType labelValue = ((Deploy_service)object).getOcciAgreementTermType();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_Deploy_service_type") :
			getString("_UI_Deploy_service_type") + " " + label;
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

		switch (notification.getFeatureID(Deploy_service.class)) {
			case QosPackage.DEPLOY_SERVICE__DEPLOY_SERVICE_TERM_TYPE:
			case QosPackage.DEPLOY_SERVICE__DEPLOY_SERVICE_TERM_STATE:
			case QosPackage.DEPLOY_SERVICE__DEPLOY_SERVICE_NUMBER_COMPONENTS:
			case QosPackage.DEPLOY_SERVICE__DEPLOY_SERVICE_THROUGHPUT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case QosPackage.DEPLOY_SERVICE__DEPLOY_SERVICE_DEPLOYMENT_STRATEGY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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
				(QosPackage.Literals.DEPLOY_SERVICE__DEPLOY_SERVICE_DEPLOYMENT_STRATEGY,
				 QosFactory.eINSTANCE.createStrategy()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return QosEditPlugin.INSTANCE;
	}

}
