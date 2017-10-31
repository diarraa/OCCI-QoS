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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Res Consumption</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.qos.ResConsumption#getResName <em>Res Name</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.qos.ResConsumption#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.qos.QosPackage#getResConsumption()
 * @model
 * @generated
 */
public interface ResConsumption extends EObject {
	/**
	 * Returns the value of the '<em><b>Res Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of a resource
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Res Name</em>' attribute.
	 * @see #setResName(String)
	 * @see org.eclipse.cmf.occi.qos.QosPackage#getResConsumption_ResName()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.eclipse.cmf.occi.qos/ecore!ResConsumption!resName'"
	 * @generated
	 */
	String getResName();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.qos.ResConsumption#getResName <em>Res Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Res Name</em>' attribute.
	 * @see #getResName()
	 * @generated
	 */
	void setResName(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The consumption of a resource
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Integer)
	 * @see org.eclipse.cmf.occi.qos.QosPackage#getResConsumption_Value()
	 * @model default="0" dataType="org.eclipse.cmf.occi.core.Integer" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.eclipse.cmf.occi.qos/ecore!ResConsumption!value'"
	 * @generated
	 */
	Integer getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.qos.ResConsumption#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Integer value);

} // ResConsumption
