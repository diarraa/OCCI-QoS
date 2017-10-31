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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.cmf.occi.qos.QosPackage
 * @generated
 */
public interface QosFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QosFactory eINSTANCE = org.eclipse.cmf.occi.qos.impl.QosFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Res Consumption</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Res Consumption</em>'.
	 * @generated
	 */
	ResConsumption createResConsumption();

	/**
	 * Returns a new object of class '<em>Profile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Profile</em>'.
	 * @generated
	 */
	Profile createProfile();

	/**
	 * Returns a new object of class '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component</em>'.
	 * @generated
	 */
	Component createComponent();

	/**
	 * Returns a new object of class '<em>Group Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Group Component</em>'.
	 * @generated
	 */
	GroupComponent createGroupComponent();

	/**
	 * Returns a new object of class '<em>Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Strategy</em>'.
	 * @generated
	 */
	Strategy createStrategy();

	/**
	 * Returns a new object of class '<em>Deploy service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deploy service</em>'.
	 * @generated
	 */
	Deploy_service createDeploy_service();

	/**
	 * Returns a new object of class '<em>Latency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Latency</em>'.
	 * @generated
	 */
	Latency createLatency();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	QosPackage getQosPackage();

} //QosFactory
