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

/**
 * Connector EFactory for the OCCI extension:
 * - name: qos
 * - scheme: http://org.eclipse.cmf.occi.qos#
 */
public class ConnectorFactory extends org.eclipse.cmf.occi.qos.impl.QosFactoryImpl
{
	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.qos#
	 * - term: deploy_service
	 * - title: Deploy service for a given application
	 */
	@Override
	public org.eclipse.cmf.occi.qos.Deploy_service createDeploy_service() {
		return new Deploy_serviceConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://org.eclipse.cmf.occi.qos#
	 * - term: latency
	 * - title: Mean latency for a request
	 */
	@Override
	public org.eclipse.cmf.occi.qos.Latency createLatency() {
		return new LatencyConnector();
	}

}
