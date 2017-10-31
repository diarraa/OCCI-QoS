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
 * - term: deploy_service
 * - title: Deploy service for a given application
 */
public class Deploy_serviceConnector extends org.eclipse.cmf.occi.qos.impl.Deploy_serviceImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(Deploy_serviceConnector.class);

	// Start of user code Deploy_serviceconnector_constructor
	/**
	 * Constructs a deploy_service connector.
	 */
	Deploy_serviceConnector()
	{
		LOGGER.debug("Constructor called on " + this);
		// TODO: Implement this constructor.
	}
	// End of user code


	// Start of user code Deploy_service_Mixin_computeThroughput_action
	/**
	 * Implement OCCI action:
     * - scheme: http://org.eclipse.cmf.occi.qos/deploy_service/action#
     * - term: computethroughput
     * - title: 
	 */
	@Override
	public void computethroughput()
	{
		LOGGER.debug("Action computethroughput() called on " + this);

		// Deploy_service State Machine.
		switch(getDeployServiceTermState().getValue()) {
		default:
			break;
		}
	}
	// End of user code
		


}	
