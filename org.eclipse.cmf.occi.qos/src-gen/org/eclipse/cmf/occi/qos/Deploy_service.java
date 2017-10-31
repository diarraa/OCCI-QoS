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

import org.eclipse.cmf.occi.core.MixinBase;

import org.eclipse.cmf.occi.sla.AgreementStatus;
import org.eclipse.cmf.occi.sla.AgreementTermType;
import org.eclipse.cmf.occi.sla.Agreement_term;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deploy service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.qos.Deploy_service#getDeployServiceTermType <em>Deploy Service Term Type</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.qos.Deploy_service#getDeployServiceTermState <em>Deploy Service Term State</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.qos.Deploy_service#getDeployServiceNumberComponents <em>Deploy Service Number Components</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.qos.Deploy_service#getDeployServiceDeploymentStrategy <em>Deploy Service Deployment Strategy</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.qos.Deploy_service#getDeployServiceThroughput <em>Deploy Service Throughput</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.qos.QosPackage#getDeploy_service()
 * @model
 * @generated
 */
public interface Deploy_service extends Agreement_term, MixinBase {
	/**
	 * Returns the value of the '<em><b>Deploy Service Term Type</b></em>' attribute.
	 * The default value is <code>"SERVICE"</code>.
	 * The literals are from the enumeration {@link org.eclipse.cmf.occi.sla.AgreementTermType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deploy Service Term Type</em>' attribute.
	 * @see org.eclipse.cmf.occi.sla.AgreementTermType
	 * @see #setDeployServiceTermType(AgreementTermType)
	 * @see org.eclipse.cmf.occi.qos.QosPackage#getDeploy_service_DeployServiceTermType()
	 * @model default="SERVICE"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.eclipse.cmf.occi.qos/ecore!Deploy_service!deployServiceTermType'"
	 * @generated
	 */
	AgreementTermType getDeployServiceTermType();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.qos.Deploy_service#getDeployServiceTermType <em>Deploy Service Term Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deploy Service Term Type</em>' attribute.
	 * @see org.eclipse.cmf.occi.sla.AgreementTermType
	 * @see #getDeployServiceTermType()
	 * @generated
	 */
	void setDeployServiceTermType(AgreementTermType value);

	/**
	 * Returns the value of the '<em><b>Deploy Service Term State</b></em>' attribute.
	 * The default value is <code>"Undefined"</code>.
	 * The literals are from the enumeration {@link org.eclipse.cmf.occi.sla.AgreementStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deploy Service Term State</em>' attribute.
	 * @see org.eclipse.cmf.occi.sla.AgreementStatus
	 * @see #setDeployServiceTermState(AgreementStatus)
	 * @see org.eclipse.cmf.occi.qos.QosPackage#getDeploy_service_DeployServiceTermState()
	 * @model default="Undefined"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.eclipse.cmf.occi.qos/ecore!Deploy_service!deployServiceTermState'"
	 * @generated
	 */
	AgreementStatus getDeployServiceTermState();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.qos.Deploy_service#getDeployServiceTermState <em>Deploy Service Term State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deploy Service Term State</em>' attribute.
	 * @see org.eclipse.cmf.occi.sla.AgreementStatus
	 * @see #getDeployServiceTermState()
	 * @generated
	 */
	void setDeployServiceTermState(AgreementStatus value);

	/**
	 * Returns the value of the '<em><b>Deploy Service Number Components</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deploy Service Number Components</em>' attribute.
	 * @see #setDeployServiceNumberComponents(Integer)
	 * @see org.eclipse.cmf.occi.qos.QosPackage#getDeploy_service_DeployServiceNumberComponents()
	 * @model default="0" dataType="org.eclipse.cmf.occi.core.Integer"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.eclipse.cmf.occi.qos/ecore!Deploy_service!deployServiceNumberComponents'"
	 * @generated
	 */
	Integer getDeployServiceNumberComponents();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.qos.Deploy_service#getDeployServiceNumberComponents <em>Deploy Service Number Components</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deploy Service Number Components</em>' attribute.
	 * @see #getDeployServiceNumberComponents()
	 * @generated
	 */
	void setDeployServiceNumberComponents(Integer value);

	/**
	 * Returns the value of the '<em><b>Deploy Service Deployment Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deploy Service Deployment Strategy</em>' containment reference.
	 * @see #setDeployServiceDeploymentStrategy(Strategy)
	 * @see org.eclipse.cmf.occi.qos.QosPackage#getDeploy_service_DeployServiceDeploymentStrategy()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.eclipse.cmf.occi.qos/ecore!Deploy_service!deployServiceDeploymentStrategy'"
	 * @generated
	 */
	Strategy getDeployServiceDeploymentStrategy();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.qos.Deploy_service#getDeployServiceDeploymentStrategy <em>Deploy Service Deployment Strategy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deploy Service Deployment Strategy</em>' containment reference.
	 * @see #getDeployServiceDeploymentStrategy()
	 * @generated
	 */
	void setDeployServiceDeploymentStrategy(Strategy value);

	/**
	 * Returns the value of the '<em><b>Deploy Service Throughput</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum throughput that be achieved by a given system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deploy Service Throughput</em>' attribute.
	 * @see #setDeployServiceThroughput(Integer)
	 * @see org.eclipse.cmf.occi.qos.QosPackage#getDeploy_service_DeployServiceThroughput()
	 * @model default="0" dataType="org.eclipse.cmf.occi.core.Integer"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.eclipse.cmf.occi.qos/ecore!Deploy_service!deployServiceThroughput'"
	 * @generated
	 */
	Integer getDeployServiceThroughput();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.qos.Deploy_service#getDeployServiceThroughput <em>Deploy Service Throughput</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deploy Service Throughput</em>' attribute.
	 * @see #getDeployServiceThroughput()
	 * @generated
	 */
	void setDeployServiceThroughput(Integer value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.eclipse.cmf.occi.qos/ecore!Deploy_service!computethroughput()'"
	 * @generated
	 */
	void computethroughput();

} // Deploy_service
