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

import org.eclipse.cmf.occi.qos.QosPackage;
import org.eclipse.cmf.occi.qos.ResConsumption;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Res Consumption</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.qos.impl.ResConsumptionImpl#getResName <em>Res Name</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.qos.impl.ResConsumptionImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResConsumptionImpl extends EObjectImpl implements ResConsumption {
	/**
	 * The default value of the '{@link #getResName() <em>Res Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResName()
	 * @generated
	 * @ordered
	 */
	protected static final String RES_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResName() <em>Res Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResName()
	 * @generated
	 * @ordered
	 */
	protected String resName = RES_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final Integer VALUE_EDEFAULT = new Integer(0);

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected Integer value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResConsumptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QosPackage.Literals.RES_CONSUMPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResName() {
		return resName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResName(String newResName) {
		String oldResName = resName;
		resName = newResName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QosPackage.RES_CONSUMPTION__RES_NAME, oldResName, resName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(Integer newValue) {
		Integer oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QosPackage.RES_CONSUMPTION__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QosPackage.RES_CONSUMPTION__RES_NAME:
				return getResName();
			case QosPackage.RES_CONSUMPTION__VALUE:
				return getValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QosPackage.RES_CONSUMPTION__RES_NAME:
				setResName((String)newValue);
				return;
			case QosPackage.RES_CONSUMPTION__VALUE:
				setValue((Integer)newValue);
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
			case QosPackage.RES_CONSUMPTION__RES_NAME:
				setResName(RES_NAME_EDEFAULT);
				return;
			case QosPackage.RES_CONSUMPTION__VALUE:
				setValue(VALUE_EDEFAULT);
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
			case QosPackage.RES_CONSUMPTION__RES_NAME:
				return RES_NAME_EDEFAULT == null ? resName != null : !RES_NAME_EDEFAULT.equals(resName);
			case QosPackage.RES_CONSUMPTION__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (resName: ");
		result.append(resName);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //ResConsumptionImpl
