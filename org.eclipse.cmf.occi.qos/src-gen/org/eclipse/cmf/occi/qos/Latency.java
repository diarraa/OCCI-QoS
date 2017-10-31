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
 * A representation of the model object '<em><b>Latency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.qos.Latency#getLatencyTermType <em>Latency Term Type</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.qos.Latency#getLatencyTermState <em>Latency Term State</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.qos.Latency#getLatencyMean <em>Latency Mean</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.qos.QosPackage#getLatency()
 * @model
 * @generated
 */
public interface Latency extends Agreement_term, MixinBase {
	/**
	 * Returns the value of the '<em><b>Latency Term Type</b></em>' attribute.
	 * The default value is <code>"SLO"</code>.
	 * The literals are from the enumeration {@link org.eclipse.cmf.occi.sla.AgreementTermType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A service level objective
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Latency Term Type</em>' attribute.
	 * @see org.eclipse.cmf.occi.sla.AgreementTermType
	 * @see #setLatencyTermType(AgreementTermType)
	 * @see org.eclipse.cmf.occi.qos.QosPackage#getLatency_LatencyTermType()
	 * @model default="SLO"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.eclipse.cmf.occi.qos/ecore!Latency!latencyTermType'"
	 * @generated
	 */
	AgreementTermType getLatencyTermType();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.qos.Latency#getLatencyTermType <em>Latency Term Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latency Term Type</em>' attribute.
	 * @see org.eclipse.cmf.occi.sla.AgreementTermType
	 * @see #getLatencyTermType()
	 * @generated
	 */
	void setLatencyTermType(AgreementTermType value);

	/**
	 * Returns the value of the '<em><b>Latency Term State</b></em>' attribute.
	 * The default value is <code>"Undefined"</code>.
	 * The literals are from the enumeration {@link org.eclipse.cmf.occi.sla.AgreementStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Latency Term State</em>' attribute.
	 * @see org.eclipse.cmf.occi.sla.AgreementStatus
	 * @see #setLatencyTermState(AgreementStatus)
	 * @see org.eclipse.cmf.occi.qos.QosPackage#getLatency_LatencyTermState()
	 * @model default="Undefined"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.eclipse.cmf.occi.qos/ecore!Latency!latencyTermState'"
	 * @generated
	 */
	AgreementStatus getLatencyTermState();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.qos.Latency#getLatencyTermState <em>Latency Term State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latency Term State</em>' attribute.
	 * @see org.eclipse.cmf.occi.sla.AgreementStatus
	 * @see #getLatencyTermState()
	 * @generated
	 */
	void setLatencyTermState(AgreementStatus value);

	/**
	 * Returns the value of the '<em><b>Latency Mean</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The average latency of a given distributed application
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Latency Mean</em>' attribute.
	 * @see #setLatencyMean(Integer)
	 * @see org.eclipse.cmf.occi.qos.QosPackage#getLatency_LatencyMean()
	 * @model default="0" dataType="org.eclipse.cmf.occi.core.Integer"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.eclipse.cmf.occi.qos/ecore!Latency!latencyMean'"
	 * @generated
	 */
	Integer getLatencyMean();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.qos.Latency#getLatencyMean <em>Latency Mean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latency Mean</em>' attribute.
	 * @see #getLatencyMean()
	 * @generated
	 */
	void setLatencyMean(Integer value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.eclipse.cmf.occi.qos/ecore!Latency!computelatency()'"
	 * @generated
	 */
	void computelatency();

} // Latency
