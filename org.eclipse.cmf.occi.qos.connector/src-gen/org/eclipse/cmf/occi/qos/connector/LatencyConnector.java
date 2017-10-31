/**
 * Copyright (c) 2016-2017 Inria
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * - Philippe Merle <philippe.merle@inria.fr>
 * - Faiez Zalila <faiez.zalila@inria.fr>
 *
 * Generated at Tue Oct 31 14:22:42 CET 2017 from platform:/resource/org.eclipse.cmf.occi.qos/model/qos.occie by org.eclipse.cmf.occi.core.gen.connector
 */
package org.eclipse.cmf.occi.qos.connector;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://org.eclipse.cmf.occi.qos#
 * - term: latency
 * - title: Mean latency for a request
 */
public class LatencyConnector extends org.eclipse.cmf.occi.qos.impl.LatencyImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(LatencyConnector.class);

	// Start of user code Latencyconnector_constructor
	/**
	 * Constructs a latency connector.
	 */
	LatencyConnector()
	{
		LOGGER.debug("Constructor called on " + this);
		// TODO: Implement this constructor.
	}
	// End of user code


	// Start of user code Latency_Mixin_computeLatency_action
	/**
	 * Implement OCCI action:
     * - scheme: http://org.eclipse.cmf.occi.qos/latency/action#
     * - term: computelatency
     * - title: 
	 */
	@Override
	public void computelatency()
	{
		LOGGER.debug("Action computelatency() called on " + this);

		// Latency State Machine.
		switch(getLatencyTermState().getValue()) {
		default:
			break;
		}
	}
	// End of user code
		


}	
