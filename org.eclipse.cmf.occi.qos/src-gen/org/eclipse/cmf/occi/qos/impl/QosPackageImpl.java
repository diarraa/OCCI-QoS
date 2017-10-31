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

import org.eclipse.cmf.occi.core.OCCIPackage;

import org.eclipse.cmf.occi.qos.Component;
import org.eclipse.cmf.occi.qos.Deploy_service;
import org.eclipse.cmf.occi.qos.GroupComponent;
import org.eclipse.cmf.occi.qos.Latency;
import org.eclipse.cmf.occi.qos.Profile;
import org.eclipse.cmf.occi.qos.QosFactory;
import org.eclipse.cmf.occi.qos.QosPackage;
import org.eclipse.cmf.occi.qos.ResConsumption;
import org.eclipse.cmf.occi.qos.Strategy;

import org.eclipse.cmf.occi.sla.SlaPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QosPackageImpl extends EPackageImpl implements QosPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resConsumptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass profileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deploy_serviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass latencyEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.cmf.occi.qos.QosPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private QosPackageImpl() {
		super(eNS_URI, QosFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link QosPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QosPackage init() {
		if (isInited) return (QosPackage)EPackage.Registry.INSTANCE.getEPackage(QosPackage.eNS_URI);

		// Obtain or create and register package
		QosPackageImpl theQosPackage = (QosPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof QosPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new QosPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SlaPackage.eINSTANCE.eClass();
		OCCIPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theQosPackage.createPackageContents();

		// Initialize created meta-data
		theQosPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theQosPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QosPackage.eNS_URI, theQosPackage);
		return theQosPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResConsumption() {
		return resConsumptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResConsumption_ResName() {
		return (EAttribute)resConsumptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResConsumption_Value() {
		return (EAttribute)resConsumptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProfile() {
		return profileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProfile_ProfileValues() {
		return (EReference)profileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_Name() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_Profile() {
		return (EReference)componentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroupComponent() {
		return groupComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupComponent_GroupcomponentValues() {
		return (EReference)groupComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStrategy() {
		return strategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStrategy_StrategyValues() {
		return (EReference)strategyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeploy_service() {
		return deploy_serviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeploy_service_DeployServiceTermType() {
		return (EAttribute)deploy_serviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeploy_service_DeployServiceTermState() {
		return (EAttribute)deploy_serviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeploy_service_DeployServiceNumberComponents() {
		return (EAttribute)deploy_serviceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeploy_service_DeployServiceDeploymentStrategy() {
		return (EReference)deploy_serviceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeploy_service_DeployServiceThroughput() {
		return (EAttribute)deploy_serviceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDeploy_service__Computethroughput() {
		return deploy_serviceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLatency() {
		return latencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLatency_LatencyTermType() {
		return (EAttribute)latencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLatency_LatencyTermState() {
		return (EAttribute)latencyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLatency_LatencyMean() {
		return (EAttribute)latencyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLatency__Computelatency() {
		return latencyEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QosFactory getQosFactory() {
		return (QosFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		resConsumptionEClass = createEClass(RES_CONSUMPTION);
		createEAttribute(resConsumptionEClass, RES_CONSUMPTION__RES_NAME);
		createEAttribute(resConsumptionEClass, RES_CONSUMPTION__VALUE);

		profileEClass = createEClass(PROFILE);
		createEReference(profileEClass, PROFILE__PROFILE_VALUES);

		componentEClass = createEClass(COMPONENT);
		createEAttribute(componentEClass, COMPONENT__NAME);
		createEReference(componentEClass, COMPONENT__PROFILE);

		groupComponentEClass = createEClass(GROUP_COMPONENT);
		createEReference(groupComponentEClass, GROUP_COMPONENT__GROUPCOMPONENT_VALUES);

		strategyEClass = createEClass(STRATEGY);
		createEReference(strategyEClass, STRATEGY__STRATEGY_VALUES);

		deploy_serviceEClass = createEClass(DEPLOY_SERVICE);
		createEAttribute(deploy_serviceEClass, DEPLOY_SERVICE__DEPLOY_SERVICE_TERM_TYPE);
		createEAttribute(deploy_serviceEClass, DEPLOY_SERVICE__DEPLOY_SERVICE_TERM_STATE);
		createEAttribute(deploy_serviceEClass, DEPLOY_SERVICE__DEPLOY_SERVICE_NUMBER_COMPONENTS);
		createEReference(deploy_serviceEClass, DEPLOY_SERVICE__DEPLOY_SERVICE_DEPLOYMENT_STRATEGY);
		createEAttribute(deploy_serviceEClass, DEPLOY_SERVICE__DEPLOY_SERVICE_THROUGHPUT);
		createEOperation(deploy_serviceEClass, DEPLOY_SERVICE___COMPUTETHROUGHPUT);

		latencyEClass = createEClass(LATENCY);
		createEAttribute(latencyEClass, LATENCY__LATENCY_TERM_TYPE);
		createEAttribute(latencyEClass, LATENCY__LATENCY_TERM_STATE);
		createEAttribute(latencyEClass, LATENCY__LATENCY_MEAN);
		createEOperation(latencyEClass, LATENCY___COMPUTELATENCY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		OCCIPackage theOCCIPackage = (OCCIPackage)EPackage.Registry.INSTANCE.getEPackage(OCCIPackage.eNS_URI);
		SlaPackage theSlaPackage = (SlaPackage)EPackage.Registry.INSTANCE.getEPackage(SlaPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		deploy_serviceEClass.getESuperTypes().add(theSlaPackage.getAgreement_term());
		deploy_serviceEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		latencyEClass.getESuperTypes().add(theSlaPackage.getAgreement_term());
		latencyEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());

		// Initialize classes, features, and operations; add parameters
		initEClass(resConsumptionEClass, ResConsumption.class, "ResConsumption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResConsumption_ResName(), theOCCIPackage.getString(), "resName", null, 1, 1, ResConsumption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResConsumption_Value(), theOCCIPackage.getInteger(), "value", "0", 1, 1, ResConsumption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(profileEClass, Profile.class, "Profile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProfile_ProfileValues(), this.getResConsumption(), null, "profileValues", null, 0, -1, Profile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentEClass, Component.class, "Component", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponent_Name(), theOCCIPackage.getString(), "name", null, 1, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_Profile(), this.getProfile(), null, "profile", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(groupComponentEClass, GroupComponent.class, "GroupComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGroupComponent_GroupcomponentValues(), this.getComponent(), null, "groupcomponentValues", null, 0, -1, GroupComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(strategyEClass, Strategy.class, "Strategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStrategy_StrategyValues(), this.getGroupComponent(), null, "strategyValues", null, 0, -1, Strategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deploy_serviceEClass, Deploy_service.class, "Deploy_service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeploy_service_DeployServiceTermType(), theSlaPackage.getAgreementTermType(), "deployServiceTermType", "SERVICE", 0, 1, Deploy_service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeploy_service_DeployServiceTermState(), theSlaPackage.getAgreementStatus(), "deployServiceTermState", "Undefined", 0, 1, Deploy_service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeploy_service_DeployServiceNumberComponents(), theOCCIPackage.getInteger(), "deployServiceNumberComponents", "0", 0, 1, Deploy_service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeploy_service_DeployServiceDeploymentStrategy(), this.getStrategy(), null, "deployServiceDeploymentStrategy", null, 0, 1, Deploy_service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeploy_service_DeployServiceThroughput(), theOCCIPackage.getInteger(), "deployServiceThroughput", "0", 0, 1, Deploy_service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getDeploy_service__Computethroughput(), null, "computethroughput", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(latencyEClass, Latency.class, "Latency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLatency_LatencyTermType(), theSlaPackage.getAgreementTermType(), "latencyTermType", "SLO", 0, 1, Latency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLatency_LatencyTermState(), theSlaPackage.getAgreementStatus(), "latencyTermState", "Undefined", 0, 1, Latency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLatency_LatencyMean(), theOCCIPackage.getInteger(), "latencyMean", "0", 0, 1, Latency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getLatency__Computelatency(), null, "computelatency", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
		   });
	}

} //QosPackageImpl
