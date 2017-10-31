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

import org.eclipse.cmf.occi.qos.Deploy_service;
import org.eclipse.cmf.occi.qos.QosPackage;
import org.eclipse.cmf.occi.qos.Strategy;

import org.eclipse.cmf.occi.sla.AgreementStatus;
import org.eclipse.cmf.occi.sla.AgreementTermType;

import org.eclipse.cmf.occi.sla.impl.Agreement_termImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deploy service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.qos.impl.Deploy_serviceImpl#getDeployServiceTermType <em>Deploy Service Term Type</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.qos.impl.Deploy_serviceImpl#getDeployServiceTermState <em>Deploy Service Term State</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.qos.impl.Deploy_serviceImpl#getDeployServiceNumberComponents <em>Deploy Service Number Components</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.qos.impl.Deploy_serviceImpl#getDeployServiceDeploymentStrategy <em>Deploy Service Deployment Strategy</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.qos.impl.Deploy_serviceImpl#getDeployServiceThroughput <em>Deploy Service Throughput</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Deploy_serviceImpl extends Agreement_termImpl implements Deploy_service {
	/**
	 * The default value of the '{@link #getDeployServiceTermType() <em>Deploy Service Term Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployServiceTermType()
	 * @generated
	 * @ordered
	 */
	protected static final AgreementTermType DEPLOY_SERVICE_TERM_TYPE_EDEFAULT = AgreementTermType.SERVICE;

	/**
	 * The cached value of the '{@link #getDeployServiceTermType() <em>Deploy Service Term Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployServiceTermType()
	 * @generated
	 * @ordered
	 */
	protected AgreementTermType deployServiceTermType = DEPLOY_SERVICE_TERM_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeployServiceTermState() <em>Deploy Service Term State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployServiceTermState()
	 * @generated
	 * @ordered
	 */
	protected static final AgreementStatus DEPLOY_SERVICE_TERM_STATE_EDEFAULT = AgreementStatus.PENDING;

	/**
	 * The cached value of the '{@link #getDeployServiceTermState() <em>Deploy Service Term State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployServiceTermState()
	 * @generated
	 * @ordered
	 */
	protected AgreementStatus deployServiceTermState = DEPLOY_SERVICE_TERM_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeployServiceNumberComponents() <em>Deploy Service Number Components</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployServiceNumberComponents()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DEPLOY_SERVICE_NUMBER_COMPONENTS_EDEFAULT = new Integer(0);

	/**
	 * The cached value of the '{@link #getDeployServiceNumberComponents() <em>Deploy Service Number Components</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployServiceNumberComponents()
	 * @generated
	 * @ordered
	 */
	protected Integer deployServiceNumberComponents = DEPLOY_SERVICE_NUMBER_COMPONENTS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDeployServiceDeploymentStrategy() <em>Deploy Service Deployment Strategy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployServiceDeploymentStrategy()
	 * @generated
	 * @ordered
	 */
	protected Strategy deployServiceDeploymentStrategy;

	/**
	 * The default value of the '{@link #getDeployServiceThroughput() <em>Deploy Service Throughput</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployServiceThroughput()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DEPLOY_SERVICE_THROUGHPUT_EDEFAULT = new Integer(0);

	/**
	 * The cached value of the '{@link #getDeployServiceThroughput() <em>Deploy Service Throughput</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployServiceThroughput()
	 * @generated
	 * @ordered
	 */
	protected Integer deployServiceThroughput = DEPLOY_SERVICE_THROUGHPUT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Deploy_serviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QosPackage.Literals.DEPLOY_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgreementTermType getDeployServiceTermType() {
		return deployServiceTermType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeployServiceTermType(AgreementTermType newDeployServiceTermType) {
		AgreementTermType oldDeployServiceTermType = deployServiceTermType;
		deployServiceTermType = newDeployServiceTermType == null ? DEPLOY_SERVICE_TERM_TYPE_EDEFAULT : newDeployServiceTermType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QosPackage.DEPLOY_SERVICE__DEPLOY_SERVICE_TERM_TYPE, oldDeployServiceTermType, deployServiceTermType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgreementStatus getDeployServiceTermState() {
		return deployServiceTermState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeployServiceTermState(AgreementStatus newDeployServiceTermState) {
		AgreementStatus oldDeployServiceTermState = deployServiceTermState;
		deployServiceTermState = newDeployServiceTermState == null ? DEPLOY_SERVICE_TERM_STATE_EDEFAULT : newDeployServiceTermState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QosPackage.DEPLOY_SERVICE__DEPLOY_SERVICE_TERM_STATE, oldDeployServiceTermState, deployServiceTermState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getDeployServiceNumberComponents() {
		return deployServiceNumberComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeployServiceNumberComponents(Integer newDeployServiceNumberComponents) {
		Integer oldDeployServiceNumberComponents = deployServiceNumberComponents;
		deployServiceNumberComponents = newDeployServiceNumberComponents;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QosPackage.DEPLOY_SERVICE__DEPLOY_SERVICE_NUMBER_COMPONENTS, oldDeployServiceNumberComponents, deployServiceNumberComponents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Strategy getDeployServiceDeploymentStrategy() {
		return deployServiceDeploymentStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeployServiceDeploymentStrategy(Strategy newDeployServiceDeploymentStrategy, NotificationChain msgs) {
		Strategy oldDeployServiceDeploymentStrategy = deployServiceDeploymentStrategy;
		deployServiceDeploymentStrategy = newDeployServiceDeploymentStrategy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QosPackage.DEPLOY_SERVICE__DEPLOY_SERVICE_DEPLOYMENT_STRATEGY, oldDeployServiceDeploymentStrategy, newDeployServiceDeploymentStrategy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeployServiceDeploymentStrategy(Strategy newDeployServiceDeploymentStrategy) {
		if (newDeployServiceDeploymentStrategy != deployServiceDeploymentStrategy) {
			NotificationChain msgs = null;
			if (deployServiceDeploymentStrategy != null)
				msgs = ((InternalEObject)deployServiceDeploymentStrategy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QosPackage.DEPLOY_SERVICE__DEPLOY_SERVICE_DEPLOYMENT_STRATEGY, null, msgs);
			if (newDeployServiceDeploymentStrategy != null)
				msgs = ((InternalEObject)newDeployServiceDeploymentStrategy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QosPackage.DEPLOY_SERVICE__DEPLOY_SERVICE_DEPLOYMENT_STRATEGY, null, msgs);
			msgs = basicSetDeployServiceDeploymentStrategy(newDeployServiceDeploymentStrategy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QosPackage.DEPLOY_SERVICE__DEPLOY_SERVICE_DEPLOYMENT_STRATEGY, newDeployServiceDeploymentStrategy, newDeployServiceDeploymentStrategy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getDeployServiceThroughput() {
		return deployServiceThroughput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeployServiceThroughput(Integer newDeployServiceThroughput) {
		Integer oldDeployServiceThroughput = deployServiceThroughput;
		deployServiceThroughput = newDeployServiceThroughput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QosPackage.DEPLOY_SERVICE__DEPLOY_SERVICE_THROUGHPUT, oldDeployServiceThroughput, deployServiceThroughput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void computethroughput() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.eclipse.cmf.occi.qos/ecore!Deploy_service!computethroughput()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QosPackage.DEPLOY_SERVICE__DEPLOY_SERVICE_DEPLOYMENT_STRATEGY:
				return basicSetDeployServiceDeploymentStrategy(null, msgs);
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
			case QosPackage.DEPLOY_SERVICE__DEPLOY_SERVICE_TERM_TYPE:
				return getDeployServiceTermType();
			case QosPackage.DEPLOY_SERVICE__DEPLOY_SERVICE_TERM_STATE:
				return getDeployServiceTermState();
			case QosPackage.DEPLOY_SERVICE__DEPLOY_SERVICE_NUMBER_COMPONENTS:
				return getDeployServiceNumberComponents();
			case QosPackage.DEPLOY_SERVICE__DEPLOY_SERVICE_DEPLOYMENT_STRATEGY:
				return getDeployServiceDeploymentStrategy();
			case QosPackage.DEPLOY_SERVICE__DEPLOY_SERVICE_THROUGHPUT:
				return getDeployServiceThroughput();
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
			case QosPackage.DEPLOY_SERVICE__DEPLOY_SERVICE_TERM_TYPE:
				setDeployServiceTermType((AgreementTermType)newValue);
				return;
			case QosPackage.DEPLOY_SERVICE__DEPLOY_SERVICE_TERM_STATE:
				setDeployServiceTermState((AgreementStatus)newValue);
				return;
			case QosPackage.DEPLOY_SERVICE__DEPLOY_SERVICE_NUMBER_COMPONENTS:
				setDeployServiceNumberComponents((Integer)newValue);
				return;
			case QosPackage.DEPLOY_SERVICE__DEPLOY_SERVICE_DEPLOYMENT_STRATEGY:
				setDeployServiceDeploymentStrategy((Strategy)newValue);
				return;
			case QosPackage.DEPLOY_SERVICE__DEPLOY_SERVICE_THROUGHPUT:
				setDeployServiceThroughput((Integer)newValue);
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
			case QosPackage.DEPLOY_SERVICE__DEPLOY_SERVICE_TERM_TYPE:
				setDeployServiceTermType(DEPLOY_SERVICE_TERM_TYPE_EDEFAULT);
				return;
			case QosPackage.DEPLOY_SERVICE__DEPLOY_SERVICE_TERM_STATE:
				setDeployServiceTermState(DEPLOY_SERVICE_TERM_STATE_EDEFAULT);
				return;
			case QosPackage.DEPLOY_SERVICE__DEPLOY_SERVICE_NUMBER_COMPONENTS:
				setDeployServiceNumberComponents(DEPLOY_SERVICE_NUMBER_COMPONENTS_EDEFAULT);
				return;
			case QosPackage.DEPLOY_SERVICE__DEPLOY_SERVICE_DEPLOYMENT_STRATEGY:
				setDeployServiceDeploymentStrategy((Strategy)null);
				return;
			case QosPackage.DEPLOY_SERVICE__DEPLOY_SERVICE_THROUGHPUT:
				setDeployServiceThroughput(DEPLOY_SERVICE_THROUGHPUT_EDEFAULT);
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
			case QosPackage.DEPLOY_SERVICE__DEPLOY_SERVICE_TERM_TYPE:
				return deployServiceTermType != DEPLOY_SERVICE_TERM_TYPE_EDEFAULT;
			case QosPackage.DEPLOY_SERVICE__DEPLOY_SERVICE_TERM_STATE:
				return deployServiceTermState != DEPLOY_SERVICE_TERM_STATE_EDEFAULT;
			case QosPackage.DEPLOY_SERVICE__DEPLOY_SERVICE_NUMBER_COMPONENTS:
				return DEPLOY_SERVICE_NUMBER_COMPONENTS_EDEFAULT == null ? deployServiceNumberComponents != null : !DEPLOY_SERVICE_NUMBER_COMPONENTS_EDEFAULT.equals(deployServiceNumberComponents);
			case QosPackage.DEPLOY_SERVICE__DEPLOY_SERVICE_DEPLOYMENT_STRATEGY:
				return deployServiceDeploymentStrategy != null;
			case QosPackage.DEPLOY_SERVICE__DEPLOY_SERVICE_THROUGHPUT:
				return DEPLOY_SERVICE_THROUGHPUT_EDEFAULT == null ? deployServiceThroughput != null : !DEPLOY_SERVICE_THROUGHPUT_EDEFAULT.equals(deployServiceThroughput);
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
			case QosPackage.DEPLOY_SERVICE___COMPUTETHROUGHPUT:
				computethroughput();
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
		result.append(" (deployServiceTermType: ");
		result.append(deployServiceTermType);
		result.append(", deployServiceTermState: ");
		result.append(deployServiceTermState);
		result.append(", deployServiceNumberComponents: ");
		result.append(deployServiceNumberComponents);
		result.append(", deployServiceThroughput: ");
		result.append(deployServiceThroughput);
		result.append(')');
		return result.toString();
	}

} //Deploy_serviceImpl
