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
package org.eclipse.cmf.occi.qos;

import org.eclipse.cmf.occi.sla.SlaPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.cmf.occi.qos.QosFactory
 * @model kind="package"
 * @generated
 */
public interface QosPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "qos";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.eclipse.cmf.occi.qos/ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "qos";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QosPackage eINSTANCE = org.eclipse.cmf.occi.qos.impl.QosPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.qos.impl.ResConsumptionImpl <em>Res Consumption</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.qos.impl.ResConsumptionImpl
	 * @see org.eclipse.cmf.occi.qos.impl.QosPackageImpl#getResConsumption()
	 * @generated
	 */
	int RES_CONSUMPTION = 0;

	/**
	 * The feature id for the '<em><b>Res Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RES_CONSUMPTION__RES_NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RES_CONSUMPTION__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Res Consumption</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RES_CONSUMPTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Res Consumption</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RES_CONSUMPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.qos.impl.ProfileImpl <em>Profile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.qos.impl.ProfileImpl
	 * @see org.eclipse.cmf.occi.qos.impl.QosPackageImpl#getProfile()
	 * @generated
	 */
	int PROFILE = 1;

	/**
	 * The feature id for the '<em><b>Profile Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__PROFILE_VALUES = 0;

	/**
	 * The number of structural features of the '<em>Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.qos.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.qos.impl.ComponentImpl
	 * @see org.eclipse.cmf.occi.qos.impl.QosPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PROFILE = 1;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.qos.impl.GroupComponentImpl <em>Group Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.qos.impl.GroupComponentImpl
	 * @see org.eclipse.cmf.occi.qos.impl.QosPackageImpl#getGroupComponent()
	 * @generated
	 */
	int GROUP_COMPONENT = 3;

	/**
	 * The feature id for the '<em><b>Groupcomponent Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_COMPONENT__GROUPCOMPONENT_VALUES = 0;

	/**
	 * The number of structural features of the '<em>Group Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_COMPONENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Group Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.qos.impl.StrategyImpl <em>Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.qos.impl.StrategyImpl
	 * @see org.eclipse.cmf.occi.qos.impl.QosPackageImpl#getStrategy()
	 * @generated
	 */
	int STRATEGY = 4;

	/**
	 * The feature id for the '<em><b>Strategy Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__STRATEGY_VALUES = 0;

	/**
	 * The number of structural features of the '<em>Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.qos.impl.Deploy_serviceImpl <em>Deploy service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.qos.impl.Deploy_serviceImpl
	 * @see org.eclipse.cmf.occi.qos.impl.QosPackageImpl#getDeploy_service()
	 * @generated
	 */
	int DEPLOY_SERVICE = 5;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY_SERVICE__MIXIN = SlaPackage.AGREEMENT_TERM__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY_SERVICE__ENTITY = SlaPackage.AGREEMENT_TERM__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY_SERVICE__ATTRIBUTES = SlaPackage.AGREEMENT_TERM__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Agreement Term Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY_SERVICE__OCCI_AGREEMENT_TERM_TYPE = SlaPackage.AGREEMENT_TERM__OCCI_AGREEMENT_TERM_TYPE;

	/**
	 * The feature id for the '<em><b>Occi Agreement Term State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY_SERVICE__OCCI_AGREEMENT_TERM_STATE = SlaPackage.AGREEMENT_TERM__OCCI_AGREEMENT_TERM_STATE;

	/**
	 * The feature id for the '<em><b>Occi Agreement Term Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY_SERVICE__OCCI_AGREEMENT_TERM_DESC = SlaPackage.AGREEMENT_TERM__OCCI_AGREEMENT_TERM_DESC;

	/**
	 * The feature id for the '<em><b>Occi Agreement Term Remedy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY_SERVICE__OCCI_AGREEMENT_TERM_REMEDY = SlaPackage.AGREEMENT_TERM__OCCI_AGREEMENT_TERM_REMEDY;

	/**
	 * The feature id for the '<em><b>Deploy Service Term Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY_SERVICE__DEPLOY_SERVICE_TERM_TYPE = SlaPackage.AGREEMENT_TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Deploy Service Term State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY_SERVICE__DEPLOY_SERVICE_TERM_STATE = SlaPackage.AGREEMENT_TERM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Deploy Service Number Components</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY_SERVICE__DEPLOY_SERVICE_NUMBER_COMPONENTS = SlaPackage.AGREEMENT_TERM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Deploy Service Deployment Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY_SERVICE__DEPLOY_SERVICE_DEPLOYMENT_STRATEGY = SlaPackage.AGREEMENT_TERM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Deploy Service Throughput</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY_SERVICE__DEPLOY_SERVICE_THROUGHPUT = SlaPackage.AGREEMENT_TERM_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Deploy service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY_SERVICE_FEATURE_COUNT = SlaPackage.AGREEMENT_TERM_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Computethroughput</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY_SERVICE___COMPUTETHROUGHPUT = SlaPackage.AGREEMENT_TERM_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Deploy service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY_SERVICE_OPERATION_COUNT = SlaPackage.AGREEMENT_TERM_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.cmf.occi.qos.impl.LatencyImpl <em>Latency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.cmf.occi.qos.impl.LatencyImpl
	 * @see org.eclipse.cmf.occi.qos.impl.QosPackageImpl#getLatency()
	 * @generated
	 */
	int LATENCY = 6;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY__MIXIN = SlaPackage.AGREEMENT_TERM__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY__ENTITY = SlaPackage.AGREEMENT_TERM__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY__ATTRIBUTES = SlaPackage.AGREEMENT_TERM__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Occi Agreement Term Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY__OCCI_AGREEMENT_TERM_TYPE = SlaPackage.AGREEMENT_TERM__OCCI_AGREEMENT_TERM_TYPE;

	/**
	 * The feature id for the '<em><b>Occi Agreement Term State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY__OCCI_AGREEMENT_TERM_STATE = SlaPackage.AGREEMENT_TERM__OCCI_AGREEMENT_TERM_STATE;

	/**
	 * The feature id for the '<em><b>Occi Agreement Term Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY__OCCI_AGREEMENT_TERM_DESC = SlaPackage.AGREEMENT_TERM__OCCI_AGREEMENT_TERM_DESC;

	/**
	 * The feature id for the '<em><b>Occi Agreement Term Remedy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY__OCCI_AGREEMENT_TERM_REMEDY = SlaPackage.AGREEMENT_TERM__OCCI_AGREEMENT_TERM_REMEDY;

	/**
	 * The feature id for the '<em><b>Latency Term Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY__LATENCY_TERM_TYPE = SlaPackage.AGREEMENT_TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Latency Term State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY__LATENCY_TERM_STATE = SlaPackage.AGREEMENT_TERM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Latency Mean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY__LATENCY_MEAN = SlaPackage.AGREEMENT_TERM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Latency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_FEATURE_COUNT = SlaPackage.AGREEMENT_TERM_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Computelatency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY___COMPUTELATENCY = SlaPackage.AGREEMENT_TERM_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Latency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_OPERATION_COUNT = SlaPackage.AGREEMENT_TERM_OPERATION_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.qos.ResConsumption <em>Res Consumption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Res Consumption</em>'.
	 * @see org.eclipse.cmf.occi.qos.ResConsumption
	 * @generated
	 */
	EClass getResConsumption();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.qos.ResConsumption#getResName <em>Res Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Res Name</em>'.
	 * @see org.eclipse.cmf.occi.qos.ResConsumption#getResName()
	 * @see #getResConsumption()
	 * @generated
	 */
	EAttribute getResConsumption_ResName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.qos.ResConsumption#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.cmf.occi.qos.ResConsumption#getValue()
	 * @see #getResConsumption()
	 * @generated
	 */
	EAttribute getResConsumption_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.qos.Profile <em>Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Profile</em>'.
	 * @see org.eclipse.cmf.occi.qos.Profile
	 * @generated
	 */
	EClass getProfile();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.cmf.occi.qos.Profile#getProfileValues <em>Profile Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Profile Values</em>'.
	 * @see org.eclipse.cmf.occi.qos.Profile#getProfileValues()
	 * @see #getProfile()
	 * @generated
	 */
	EReference getProfile_ProfileValues();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.qos.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see org.eclipse.cmf.occi.qos.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.qos.Component#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.cmf.occi.qos.Component#getName()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.cmf.occi.qos.Component#getProfile <em>Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Profile</em>'.
	 * @see org.eclipse.cmf.occi.qos.Component#getProfile()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Profile();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.qos.GroupComponent <em>Group Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group Component</em>'.
	 * @see org.eclipse.cmf.occi.qos.GroupComponent
	 * @generated
	 */
	EClass getGroupComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.cmf.occi.qos.GroupComponent#getGroupcomponentValues <em>Groupcomponent Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Groupcomponent Values</em>'.
	 * @see org.eclipse.cmf.occi.qos.GroupComponent#getGroupcomponentValues()
	 * @see #getGroupComponent()
	 * @generated
	 */
	EReference getGroupComponent_GroupcomponentValues();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.qos.Strategy <em>Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strategy</em>'.
	 * @see org.eclipse.cmf.occi.qos.Strategy
	 * @generated
	 */
	EClass getStrategy();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.cmf.occi.qos.Strategy#getStrategyValues <em>Strategy Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Strategy Values</em>'.
	 * @see org.eclipse.cmf.occi.qos.Strategy#getStrategyValues()
	 * @see #getStrategy()
	 * @generated
	 */
	EReference getStrategy_StrategyValues();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.qos.Deploy_service <em>Deploy service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deploy service</em>'.
	 * @see org.eclipse.cmf.occi.qos.Deploy_service
	 * @generated
	 */
	EClass getDeploy_service();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.qos.Deploy_service#getDeployServiceTermType <em>Deploy Service Term Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deploy Service Term Type</em>'.
	 * @see org.eclipse.cmf.occi.qos.Deploy_service#getDeployServiceTermType()
	 * @see #getDeploy_service()
	 * @generated
	 */
	EAttribute getDeploy_service_DeployServiceTermType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.qos.Deploy_service#getDeployServiceTermState <em>Deploy Service Term State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deploy Service Term State</em>'.
	 * @see org.eclipse.cmf.occi.qos.Deploy_service#getDeployServiceTermState()
	 * @see #getDeploy_service()
	 * @generated
	 */
	EAttribute getDeploy_service_DeployServiceTermState();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.qos.Deploy_service#getDeployServiceNumberComponents <em>Deploy Service Number Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deploy Service Number Components</em>'.
	 * @see org.eclipse.cmf.occi.qos.Deploy_service#getDeployServiceNumberComponents()
	 * @see #getDeploy_service()
	 * @generated
	 */
	EAttribute getDeploy_service_DeployServiceNumberComponents();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.cmf.occi.qos.Deploy_service#getDeployServiceDeploymentStrategy <em>Deploy Service Deployment Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Deploy Service Deployment Strategy</em>'.
	 * @see org.eclipse.cmf.occi.qos.Deploy_service#getDeployServiceDeploymentStrategy()
	 * @see #getDeploy_service()
	 * @generated
	 */
	EReference getDeploy_service_DeployServiceDeploymentStrategy();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.qos.Deploy_service#getDeployServiceThroughput <em>Deploy Service Throughput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deploy Service Throughput</em>'.
	 * @see org.eclipse.cmf.occi.qos.Deploy_service#getDeployServiceThroughput()
	 * @see #getDeploy_service()
	 * @generated
	 */
	EAttribute getDeploy_service_DeployServiceThroughput();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.qos.Deploy_service#computethroughput() <em>Computethroughput</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Computethroughput</em>' operation.
	 * @see org.eclipse.cmf.occi.qos.Deploy_service#computethroughput()
	 * @generated
	 */
	EOperation getDeploy_service__Computethroughput();

	/**
	 * Returns the meta object for class '{@link org.eclipse.cmf.occi.qos.Latency <em>Latency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Latency</em>'.
	 * @see org.eclipse.cmf.occi.qos.Latency
	 * @generated
	 */
	EClass getLatency();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.qos.Latency#getLatencyTermType <em>Latency Term Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latency Term Type</em>'.
	 * @see org.eclipse.cmf.occi.qos.Latency#getLatencyTermType()
	 * @see #getLatency()
	 * @generated
	 */
	EAttribute getLatency_LatencyTermType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.qos.Latency#getLatencyTermState <em>Latency Term State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latency Term State</em>'.
	 * @see org.eclipse.cmf.occi.qos.Latency#getLatencyTermState()
	 * @see #getLatency()
	 * @generated
	 */
	EAttribute getLatency_LatencyTermState();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.cmf.occi.qos.Latency#getLatencyMean <em>Latency Mean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latency Mean</em>'.
	 * @see org.eclipse.cmf.occi.qos.Latency#getLatencyMean()
	 * @see #getLatency()
	 * @generated
	 */
	EAttribute getLatency_LatencyMean();

	/**
	 * Returns the meta object for the '{@link org.eclipse.cmf.occi.qos.Latency#computelatency() <em>Computelatency</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Computelatency</em>' operation.
	 * @see org.eclipse.cmf.occi.qos.Latency#computelatency()
	 * @generated
	 */
	EOperation getLatency__Computelatency();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QosFactory getQosFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.qos.impl.ResConsumptionImpl <em>Res Consumption</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.qos.impl.ResConsumptionImpl
		 * @see org.eclipse.cmf.occi.qos.impl.QosPackageImpl#getResConsumption()
		 * @generated
		 */
		EClass RES_CONSUMPTION = eINSTANCE.getResConsumption();

		/**
		 * The meta object literal for the '<em><b>Res Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RES_CONSUMPTION__RES_NAME = eINSTANCE.getResConsumption_ResName();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RES_CONSUMPTION__VALUE = eINSTANCE.getResConsumption_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.qos.impl.ProfileImpl <em>Profile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.qos.impl.ProfileImpl
		 * @see org.eclipse.cmf.occi.qos.impl.QosPackageImpl#getProfile()
		 * @generated
		 */
		EClass PROFILE = eINSTANCE.getProfile();

		/**
		 * The meta object literal for the '<em><b>Profile Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROFILE__PROFILE_VALUES = eINSTANCE.getProfile_ProfileValues();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.qos.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.qos.impl.ComponentImpl
		 * @see org.eclipse.cmf.occi.qos.impl.QosPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__NAME = eINSTANCE.getComponent_Name();

		/**
		 * The meta object literal for the '<em><b>Profile</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__PROFILE = eINSTANCE.getComponent_Profile();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.qos.impl.GroupComponentImpl <em>Group Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.qos.impl.GroupComponentImpl
		 * @see org.eclipse.cmf.occi.qos.impl.QosPackageImpl#getGroupComponent()
		 * @generated
		 */
		EClass GROUP_COMPONENT = eINSTANCE.getGroupComponent();

		/**
		 * The meta object literal for the '<em><b>Groupcomponent Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP_COMPONENT__GROUPCOMPONENT_VALUES = eINSTANCE.getGroupComponent_GroupcomponentValues();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.qos.impl.StrategyImpl <em>Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.qos.impl.StrategyImpl
		 * @see org.eclipse.cmf.occi.qos.impl.QosPackageImpl#getStrategy()
		 * @generated
		 */
		EClass STRATEGY = eINSTANCE.getStrategy();

		/**
		 * The meta object literal for the '<em><b>Strategy Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRATEGY__STRATEGY_VALUES = eINSTANCE.getStrategy_StrategyValues();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.qos.impl.Deploy_serviceImpl <em>Deploy service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.qos.impl.Deploy_serviceImpl
		 * @see org.eclipse.cmf.occi.qos.impl.QosPackageImpl#getDeploy_service()
		 * @generated
		 */
		EClass DEPLOY_SERVICE = eINSTANCE.getDeploy_service();

		/**
		 * The meta object literal for the '<em><b>Deploy Service Term Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOY_SERVICE__DEPLOY_SERVICE_TERM_TYPE = eINSTANCE.getDeploy_service_DeployServiceTermType();

		/**
		 * The meta object literal for the '<em><b>Deploy Service Term State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOY_SERVICE__DEPLOY_SERVICE_TERM_STATE = eINSTANCE.getDeploy_service_DeployServiceTermState();

		/**
		 * The meta object literal for the '<em><b>Deploy Service Number Components</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOY_SERVICE__DEPLOY_SERVICE_NUMBER_COMPONENTS = eINSTANCE.getDeploy_service_DeployServiceNumberComponents();

		/**
		 * The meta object literal for the '<em><b>Deploy Service Deployment Strategy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOY_SERVICE__DEPLOY_SERVICE_DEPLOYMENT_STRATEGY = eINSTANCE.getDeploy_service_DeployServiceDeploymentStrategy();

		/**
		 * The meta object literal for the '<em><b>Deploy Service Throughput</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOY_SERVICE__DEPLOY_SERVICE_THROUGHPUT = eINSTANCE.getDeploy_service_DeployServiceThroughput();

		/**
		 * The meta object literal for the '<em><b>Computethroughput</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEPLOY_SERVICE___COMPUTETHROUGHPUT = eINSTANCE.getDeploy_service__Computethroughput();

		/**
		 * The meta object literal for the '{@link org.eclipse.cmf.occi.qos.impl.LatencyImpl <em>Latency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.cmf.occi.qos.impl.LatencyImpl
		 * @see org.eclipse.cmf.occi.qos.impl.QosPackageImpl#getLatency()
		 * @generated
		 */
		EClass LATENCY = eINSTANCE.getLatency();

		/**
		 * The meta object literal for the '<em><b>Latency Term Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LATENCY__LATENCY_TERM_TYPE = eINSTANCE.getLatency_LatencyTermType();

		/**
		 * The meta object literal for the '<em><b>Latency Term State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LATENCY__LATENCY_TERM_STATE = eINSTANCE.getLatency_LatencyTermState();

		/**
		 * The meta object literal for the '<em><b>Latency Mean</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LATENCY__LATENCY_MEAN = eINSTANCE.getLatency_LatencyMean();

		/**
		 * The meta object literal for the '<em><b>Computelatency</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LATENCY___COMPUTELATENCY = eINSTANCE.getLatency__Computelatency();

	}

} //QosPackage
