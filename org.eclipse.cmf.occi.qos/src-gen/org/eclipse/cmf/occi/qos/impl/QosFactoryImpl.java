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

import org.eclipse.cmf.occi.qos.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QosFactoryImpl extends EFactoryImpl implements QosFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QosFactory init() {
		try {
			QosFactory theQosFactory = (QosFactory)EPackage.Registry.INSTANCE.getEFactory(QosPackage.eNS_URI);
			if (theQosFactory != null) {
				return theQosFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new QosFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QosFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case QosPackage.RES_CONSUMPTION: return createResConsumption();
			case QosPackage.PROFILE: return createProfile();
			case QosPackage.COMPONENT: return createComponent();
			case QosPackage.GROUP_COMPONENT: return createGroupComponent();
			case QosPackage.STRATEGY: return createStrategy();
			case QosPackage.DEPLOY_SERVICE: return createDeploy_service();
			case QosPackage.LATENCY: return createLatency();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResConsumption createResConsumption() {
		ResConsumptionImpl resConsumption = new ResConsumptionImpl();
		return resConsumption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Profile createProfile() {
		ProfileImpl profile = new ProfileImpl();
		return profile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component createComponent() {
		ComponentImpl component = new ComponentImpl();
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupComponent createGroupComponent() {
		GroupComponentImpl groupComponent = new GroupComponentImpl();
		return groupComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Strategy createStrategy() {
		StrategyImpl strategy = new StrategyImpl();
		return strategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deploy_service createDeploy_service() {
		Deploy_serviceImpl deploy_service = new Deploy_serviceImpl();
		return deploy_service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Latency createLatency() {
		LatencyImpl latency = new LatencyImpl();
		return latency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QosPackage getQosPackage() {
		return (QosPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QosPackage getPackage() {
		return QosPackage.eINSTANCE;
	}

} //QosFactoryImpl
