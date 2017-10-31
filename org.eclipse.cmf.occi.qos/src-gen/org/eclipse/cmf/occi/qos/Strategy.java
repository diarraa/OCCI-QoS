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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Strategy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.qos.Strategy#getStrategyValues <em>Strategy Values</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.qos.QosPackage#getStrategy()
 * @model
 * @generated
 */
public interface Strategy extends EObject {
	/**
	 * Returns the value of the '<em><b>Strategy Values</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.cmf.occi.qos.GroupComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strategy Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strategy Values</em>' containment reference list.
	 * @see org.eclipse.cmf.occi.qos.QosPackage#getStrategy_StrategyValues()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.eclipse.cmf.occi.qos/ecore!Strategy!strategyValues'"
	 * @generated
	 */
	EList<GroupComponent> getStrategyValues();

} // Strategy
