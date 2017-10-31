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
package org.eclipse.cmf.occi.qos.impl;

import java.util.Collection;

import org.eclipse.cmf.occi.qos.Component;
import org.eclipse.cmf.occi.qos.GroupComponent;
import org.eclipse.cmf.occi.qos.QosPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Group Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.qos.impl.GroupComponentImpl#getGroupcomponentValues <em>Groupcomponent Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GroupComponentImpl extends EObjectImpl implements GroupComponent {
	/**
	 * The cached value of the '{@link #getGroupcomponentValues() <em>Groupcomponent Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupcomponentValues()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> groupcomponentValues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroupComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QosPackage.Literals.GROUP_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Component> getGroupcomponentValues() {
		if (groupcomponentValues == null) {
			groupcomponentValues = new EObjectContainmentEList<Component>(Component.class, this, QosPackage.GROUP_COMPONENT__GROUPCOMPONENT_VALUES);
		}
		return groupcomponentValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QosPackage.GROUP_COMPONENT__GROUPCOMPONENT_VALUES:
				return ((InternalEList<?>)getGroupcomponentValues()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QosPackage.GROUP_COMPONENT__GROUPCOMPONENT_VALUES:
				return getGroupcomponentValues();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QosPackage.GROUP_COMPONENT__GROUPCOMPONENT_VALUES:
				getGroupcomponentValues().clear();
				getGroupcomponentValues().addAll((Collection<? extends Component>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case QosPackage.GROUP_COMPONENT__GROUPCOMPONENT_VALUES:
				getGroupcomponentValues().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case QosPackage.GROUP_COMPONENT__GROUPCOMPONENT_VALUES:
				return groupcomponentValues != null && !groupcomponentValues.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GroupComponentImpl
