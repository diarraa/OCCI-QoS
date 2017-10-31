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

import java.lang.reflect.InvocationTargetException;

import org.eclipse.cmf.occi.qos.Latency;
import org.eclipse.cmf.occi.qos.QosPackage;

import org.eclipse.cmf.occi.sla.AgreementStatus;
import org.eclipse.cmf.occi.sla.AgreementTermType;

import org.eclipse.cmf.occi.sla.impl.Agreement_termImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Latency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.qos.impl.LatencyImpl#getLatencyTermType <em>Latency Term Type</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.qos.impl.LatencyImpl#getLatencyTermState <em>Latency Term State</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.qos.impl.LatencyImpl#getLatencyMean <em>Latency Mean</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LatencyImpl extends Agreement_termImpl implements Latency {
	/**
	 * The default value of the '{@link #getLatencyTermType() <em>Latency Term Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatencyTermType()
	 * @generated
	 * @ordered
	 */
	protected static final AgreementTermType LATENCY_TERM_TYPE_EDEFAULT = AgreementTermType.SLO;

	/**
	 * The cached value of the '{@link #getLatencyTermType() <em>Latency Term Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatencyTermType()
	 * @generated
	 * @ordered
	 */
	protected AgreementTermType latencyTermType = LATENCY_TERM_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLatencyTermState() <em>Latency Term State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatencyTermState()
	 * @generated
	 * @ordered
	 */
	protected static final AgreementStatus LATENCY_TERM_STATE_EDEFAULT = AgreementStatus.PENDING;

	/**
	 * The cached value of the '{@link #getLatencyTermState() <em>Latency Term State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatencyTermState()
	 * @generated
	 * @ordered
	 */
	protected AgreementStatus latencyTermState = LATENCY_TERM_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLatencyMean() <em>Latency Mean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatencyMean()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LATENCY_MEAN_EDEFAULT = new Integer(0);

	/**
	 * The cached value of the '{@link #getLatencyMean() <em>Latency Mean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatencyMean()
	 * @generated
	 * @ordered
	 */
	protected Integer latencyMean = LATENCY_MEAN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LatencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QosPackage.Literals.LATENCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgreementTermType getLatencyTermType() {
		return latencyTermType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLatencyTermType(AgreementTermType newLatencyTermType) {
		AgreementTermType oldLatencyTermType = latencyTermType;
		latencyTermType = newLatencyTermType == null ? LATENCY_TERM_TYPE_EDEFAULT : newLatencyTermType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QosPackage.LATENCY__LATENCY_TERM_TYPE, oldLatencyTermType, latencyTermType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgreementStatus getLatencyTermState() {
		return latencyTermState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLatencyTermState(AgreementStatus newLatencyTermState) {
		AgreementStatus oldLatencyTermState = latencyTermState;
		latencyTermState = newLatencyTermState == null ? LATENCY_TERM_STATE_EDEFAULT : newLatencyTermState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QosPackage.LATENCY__LATENCY_TERM_STATE, oldLatencyTermState, latencyTermState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getLatencyMean() {
		return latencyMean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLatencyMean(Integer newLatencyMean) {
		Integer oldLatencyMean = latencyMean;
		latencyMean = newLatencyMean;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QosPackage.LATENCY__LATENCY_MEAN, oldLatencyMean, latencyMean));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void computelatency() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.eclipse.cmf.occi.qos/ecore!Latency!computelatency()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QosPackage.LATENCY__LATENCY_TERM_TYPE:
				return getLatencyTermType();
			case QosPackage.LATENCY__LATENCY_TERM_STATE:
				return getLatencyTermState();
			case QosPackage.LATENCY__LATENCY_MEAN:
				return getLatencyMean();
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
			case QosPackage.LATENCY__LATENCY_TERM_TYPE:
				setLatencyTermType((AgreementTermType)newValue);
				return;
			case QosPackage.LATENCY__LATENCY_TERM_STATE:
				setLatencyTermState((AgreementStatus)newValue);
				return;
			case QosPackage.LATENCY__LATENCY_MEAN:
				setLatencyMean((Integer)newValue);
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
			case QosPackage.LATENCY__LATENCY_TERM_TYPE:
				setLatencyTermType(LATENCY_TERM_TYPE_EDEFAULT);
				return;
			case QosPackage.LATENCY__LATENCY_TERM_STATE:
				setLatencyTermState(LATENCY_TERM_STATE_EDEFAULT);
				return;
			case QosPackage.LATENCY__LATENCY_MEAN:
				setLatencyMean(LATENCY_MEAN_EDEFAULT);
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
			case QosPackage.LATENCY__LATENCY_TERM_TYPE:
				return latencyTermType != LATENCY_TERM_TYPE_EDEFAULT;
			case QosPackage.LATENCY__LATENCY_TERM_STATE:
				return latencyTermState != LATENCY_TERM_STATE_EDEFAULT;
			case QosPackage.LATENCY__LATENCY_MEAN:
				return LATENCY_MEAN_EDEFAULT == null ? latencyMean != null : !LATENCY_MEAN_EDEFAULT.equals(latencyMean);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case QosPackage.LATENCY___COMPUTELATENCY:
				computelatency();
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (latencyTermType: ");
		result.append(latencyTermType);
		result.append(", latencyTermState: ");
		result.append(latencyTermState);
		result.append(", latencyMean: ");
		result.append(latencyMean);
		result.append(')');
		return result.toString();
	}

} //LatencyImpl
