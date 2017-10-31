/*******************************************************************************
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
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /org.eclipse.cmf.occi.qos/model/qos.ecore
 * using:
 *   /org.eclipse.cmf.occi.qos/model/qos.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package org.eclipse.cmf.occi.qos;

import org.eclipse.cmf.occi.core.OCCITables;
import org.eclipse.cmf.occi.qos.QosTables;
import org.eclipse.cmf.occi.sla.SlaTables;
import org.eclipse.ocl.pivot.TemplateParameters;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.TypeUtil;

/**
 * QosTables provides the dispatch tables for the qos for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
@SuppressWarnings("nls")
public class QosTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final /*@NonNull*/ EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(QosPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final /*@NonNull*/ ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_org_eclipse_cmf_occi_qos_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://org.eclipse.cmf.occi.qos/ecore", null, org.eclipse.cmf.occi.qos.QosPackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_sla_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://schemas.ogf.org/occi/sla/ecore", null, org.eclipse.cmf.occi.sla.SlaPackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Component = org.eclipse.cmf.occi.qos.QosTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_qos_s_ecore.getClassId("Component", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Deploy_service = org.eclipse.cmf.occi.qos.QosTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_qos_s_ecore.getClassId("Deploy_service", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_GroupComponent = org.eclipse.cmf.occi.qos.QosTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_qos_s_ecore.getClassId("GroupComponent", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Profile = org.eclipse.cmf.occi.qos.QosTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_qos_s_ecore.getClassId("Profile", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_ResConsumption = org.eclipse.cmf.occi.qos.QosTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_qos_s_ecore.getClassId("ResConsumption", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Strategy = org.eclipse.cmf.occi.qos.QosTables.PACKid_http_c_s_s_org_eclipse_cmf_occi_qos_s_ecore.getClassId("Strategy", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.EnumerationId ENUMid_AgreementStatus = org.eclipse.cmf.occi.qos.QosTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_sla_s_ecore.getEnumerationId("AgreementStatus");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.EnumerationId ENUMid_AgreementTermType = org.eclipse.cmf.occi.qos.QosTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_sla_s_ecore.getEnumerationId("AgreementTermType");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_Component = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(org.eclipse.cmf.occi.qos.QosTables.CLSSid_Component);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_GroupComponent = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(org.eclipse.cmf.occi.qos.QosTables.CLSSid_GroupComponent);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId ORD_CLSSid_ResConsumption = org.eclipse.ocl.pivot.ids.TypeId.ORDERED_SET.getSpecializedId(org.eclipse.cmf.occi.qos.QosTables.CLSSid_ResConsumption);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			QosTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of QosTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final /*@NonNull*/ EcoreExecutorType _Component = new EcoreExecutorType(QosPackage.Literals.COMPONENT, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Deploy_service = new EcoreExecutorType(QosPackage.Literals.DEPLOY_SERVICE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _GroupComponent = new EcoreExecutorType(QosPackage.Literals.GROUP_COMPONENT, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Latency = new EcoreExecutorType(QosPackage.Literals.LATENCY, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Profile = new EcoreExecutorType(QosPackage.Literals.PROFILE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _ResConsumption = new EcoreExecutorType(QosPackage.Literals.RES_CONSUMPTION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Strategy = new EcoreExecutorType(QosPackage.Literals.STRATEGY, PACKAGE, 0);

		private static final /*@NonNull*/ EcoreExecutorType /*@NonNull*/ [] types = {
			_Component,
			_Deploy_service,
			_GroupComponent,
			_Latency,
			_Profile,
			_ResConsumption,
			_Strategy
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of QosTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final /*@NonNull*/ ExecutorFragment _Component__Component = new ExecutorFragment(Types._Component, QosTables.Types._Component);
		private static final /*@NonNull*/ ExecutorFragment _Component__OclAny = new ExecutorFragment(Types._Component, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Component__OclElement = new ExecutorFragment(Types._Component, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Deploy_service__Agreement_term = new ExecutorFragment(Types._Deploy_service, SlaTables.Types._Agreement_term);
		private static final /*@NonNull*/ ExecutorFragment _Deploy_service__Deploy_service = new ExecutorFragment(Types._Deploy_service, QosTables.Types._Deploy_service);
		private static final /*@NonNull*/ ExecutorFragment _Deploy_service__MixinBase = new ExecutorFragment(Types._Deploy_service, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Deploy_service__OclAny = new ExecutorFragment(Types._Deploy_service, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Deploy_service__OclElement = new ExecutorFragment(Types._Deploy_service, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _GroupComponent__GroupComponent = new ExecutorFragment(Types._GroupComponent, QosTables.Types._GroupComponent);
		private static final /*@NonNull*/ ExecutorFragment _GroupComponent__OclAny = new ExecutorFragment(Types._GroupComponent, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _GroupComponent__OclElement = new ExecutorFragment(Types._GroupComponent, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Latency__Agreement_term = new ExecutorFragment(Types._Latency, SlaTables.Types._Agreement_term);
		private static final /*@NonNull*/ ExecutorFragment _Latency__Latency = new ExecutorFragment(Types._Latency, QosTables.Types._Latency);
		private static final /*@NonNull*/ ExecutorFragment _Latency__MixinBase = new ExecutorFragment(Types._Latency, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Latency__OclAny = new ExecutorFragment(Types._Latency, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Latency__OclElement = new ExecutorFragment(Types._Latency, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Profile__OclAny = new ExecutorFragment(Types._Profile, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Profile__OclElement = new ExecutorFragment(Types._Profile, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Profile__Profile = new ExecutorFragment(Types._Profile, QosTables.Types._Profile);

		private static final /*@NonNull*/ ExecutorFragment _ResConsumption__OclAny = new ExecutorFragment(Types._ResConsumption, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _ResConsumption__OclElement = new ExecutorFragment(Types._ResConsumption, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _ResConsumption__ResConsumption = new ExecutorFragment(Types._ResConsumption, QosTables.Types._ResConsumption);

		private static final /*@NonNull*/ ExecutorFragment _Strategy__OclAny = new ExecutorFragment(Types._Strategy, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Strategy__OclElement = new ExecutorFragment(Types._Strategy, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Strategy__Strategy = new ExecutorFragment(Types._Strategy, QosTables.Types._Strategy);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of QosTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}


		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of QosTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		public static final /*@NonNull*/ ExecutorOperation _Deploy_service__computethroughput = new ExecutorOperation("computethroughput", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Deploy_service,
			0, TemplateParameters.EMPTY_LIST, null);

		public static final /*@NonNull*/ ExecutorOperation _Latency__computelatency = new ExecutorOperation("computelatency", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Latency,
			0, TemplateParameters.EMPTY_LIST, null);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of QosTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final /*@NonNull*/ ExecutorProperty _Component__name = new EcoreExecutorProperty(QosPackage.Literals.COMPONENT__NAME, Types._Component, 0);
		public static final /*@NonNull*/ ExecutorProperty _Component__profile = new EcoreExecutorProperty(QosPackage.Literals.COMPONENT__PROFILE, Types._Component, 1);
		public static final /*@NonNull*/ ExecutorProperty _Component__GroupComponent__groupcomponentValues = new ExecutorPropertyWithImplementation("GroupComponent", Types._Component, 2, new EcoreLibraryOppositeProperty(QosPackage.Literals.GROUP_COMPONENT__GROUPCOMPONENT_VALUES));

		public static final /*@NonNull*/ ExecutorProperty _Deploy_service__deployServiceDeploymentStrategy = new EcoreExecutorProperty(QosPackage.Literals.DEPLOY_SERVICE__DEPLOY_SERVICE_DEPLOYMENT_STRATEGY, Types._Deploy_service, 0);
		public static final /*@NonNull*/ ExecutorProperty _Deploy_service__deployServiceNumberComponents = new EcoreExecutorProperty(QosPackage.Literals.DEPLOY_SERVICE__DEPLOY_SERVICE_NUMBER_COMPONENTS, Types._Deploy_service, 1);
		public static final /*@NonNull*/ ExecutorProperty _Deploy_service__deployServiceTermState = new EcoreExecutorProperty(QosPackage.Literals.DEPLOY_SERVICE__DEPLOY_SERVICE_TERM_STATE, Types._Deploy_service, 2);
		public static final /*@NonNull*/ ExecutorProperty _Deploy_service__deployServiceTermType = new EcoreExecutorProperty(QosPackage.Literals.DEPLOY_SERVICE__DEPLOY_SERVICE_TERM_TYPE, Types._Deploy_service, 3);
		public static final /*@NonNull*/ ExecutorProperty _Deploy_service__deployServiceThroughput = new EcoreExecutorProperty(QosPackage.Literals.DEPLOY_SERVICE__DEPLOY_SERVICE_THROUGHPUT, Types._Deploy_service, 4);

		public static final /*@NonNull*/ ExecutorProperty _GroupComponent__groupcomponentValues = new EcoreExecutorProperty(QosPackage.Literals.GROUP_COMPONENT__GROUPCOMPONENT_VALUES, Types._GroupComponent, 0);
		public static final /*@NonNull*/ ExecutorProperty _GroupComponent__Strategy__strategyValues = new ExecutorPropertyWithImplementation("Strategy", Types._GroupComponent, 1, new EcoreLibraryOppositeProperty(QosPackage.Literals.STRATEGY__STRATEGY_VALUES));

		public static final /*@NonNull*/ ExecutorProperty _Latency__latencyMean = new EcoreExecutorProperty(QosPackage.Literals.LATENCY__LATENCY_MEAN, Types._Latency, 0);
		public static final /*@NonNull*/ ExecutorProperty _Latency__latencyTermState = new EcoreExecutorProperty(QosPackage.Literals.LATENCY__LATENCY_TERM_STATE, Types._Latency, 1);
		public static final /*@NonNull*/ ExecutorProperty _Latency__latencyTermType = new EcoreExecutorProperty(QosPackage.Literals.LATENCY__LATENCY_TERM_TYPE, Types._Latency, 2);

		public static final /*@NonNull*/ ExecutorProperty _Profile__profileValues = new EcoreExecutorProperty(QosPackage.Literals.PROFILE__PROFILE_VALUES, Types._Profile, 0);
		public static final /*@NonNull*/ ExecutorProperty _Profile__Component__profile = new ExecutorPropertyWithImplementation("Component", Types._Profile, 1, new EcoreLibraryOppositeProperty(QosPackage.Literals.COMPONENT__PROFILE));

		public static final /*@NonNull*/ ExecutorProperty _ResConsumption__resName = new EcoreExecutorProperty(QosPackage.Literals.RES_CONSUMPTION__RES_NAME, Types._ResConsumption, 0);
		public static final /*@NonNull*/ ExecutorProperty _ResConsumption__value = new EcoreExecutorProperty(QosPackage.Literals.RES_CONSUMPTION__VALUE, Types._ResConsumption, 1);
		public static final /*@NonNull*/ ExecutorProperty _ResConsumption__Profile__profileValues = new ExecutorPropertyWithImplementation("Profile", Types._ResConsumption, 2, new EcoreLibraryOppositeProperty(QosPackage.Literals.PROFILE__PROFILE_VALUES));

		public static final /*@NonNull*/ ExecutorProperty _Strategy__strategyValues = new EcoreExecutorProperty(QosPackage.Literals.STRATEGY__STRATEGY_VALUES, Types._Strategy, 0);
		public static final /*@NonNull*/ ExecutorProperty _Strategy__Deploy_service__deployServiceDeploymentStrategy = new ExecutorPropertyWithImplementation("Deploy_service", Types._Strategy, 1, new EcoreLibraryOppositeProperty(QosPackage.Literals.DEPLOY_SERVICE__DEPLOY_SERVICE_DEPLOYMENT_STRATEGY));
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of QosTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Component =
		{
			Fragments._Component__OclAny /* 0 */,
			Fragments._Component__OclElement /* 1 */,
			Fragments._Component__Component /* 2 */
		};
		private static final int /*@NonNull*/ [] __Component = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Deploy_service =
		{
			Fragments._Deploy_service__OclAny /* 0 */,
			Fragments._Deploy_service__OclElement /* 1 */,
			Fragments._Deploy_service__MixinBase /* 2 */,
			Fragments._Deploy_service__Agreement_term /* 3 */,
			Fragments._Deploy_service__Deploy_service /* 4 */
		};
		private static final int /*@NonNull*/ [] __Deploy_service = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _GroupComponent =
		{
			Fragments._GroupComponent__OclAny /* 0 */,
			Fragments._GroupComponent__OclElement /* 1 */,
			Fragments._GroupComponent__GroupComponent /* 2 */
		};
		private static final int /*@NonNull*/ [] __GroupComponent = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Latency =
		{
			Fragments._Latency__OclAny /* 0 */,
			Fragments._Latency__OclElement /* 1 */,
			Fragments._Latency__MixinBase /* 2 */,
			Fragments._Latency__Agreement_term /* 3 */,
			Fragments._Latency__Latency /* 4 */
		};
		private static final int /*@NonNull*/ [] __Latency = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Profile =
		{
			Fragments._Profile__OclAny /* 0 */,
			Fragments._Profile__OclElement /* 1 */,
			Fragments._Profile__Profile /* 2 */
		};
		private static final int /*@NonNull*/ [] __Profile = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _ResConsumption =
		{
			Fragments._ResConsumption__OclAny /* 0 */,
			Fragments._ResConsumption__OclElement /* 1 */,
			Fragments._ResConsumption__ResConsumption /* 2 */
		};
		private static final int /*@NonNull*/ [] __ResConsumption = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Strategy =
		{
			Fragments._Strategy__OclAny /* 0 */,
			Fragments._Strategy__OclElement /* 1 */,
			Fragments._Strategy__Strategy /* 2 */
		};
		private static final int /*@NonNull*/ [] __Strategy = { 1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Component.initFragments(_Component, __Component);
			Types._Deploy_service.initFragments(_Deploy_service, __Deploy_service);
			Types._GroupComponent.initFragments(_GroupComponent, __GroupComponent);
			Types._Latency.initFragments(_Latency, __Latency);
			Types._Profile.initFragments(_Profile, __Profile);
			Types._ResConsumption.initFragments(_ResConsumption, __ResConsumption);
			Types._Strategy.initFragments(_Strategy, __Strategy);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of QosTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Component__Component = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Component__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Component__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Deploy_service__Deploy_service = {
			QosTables.Operations._Deploy_service__computethroughput /* computethroughput() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Deploy_service__Agreement_term = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Deploy_service__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Deploy_service__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Deploy_service__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _GroupComponent__GroupComponent = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _GroupComponent__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _GroupComponent__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Latency__Latency = {
			QosTables.Operations._Latency__computelatency /* computelatency() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Latency__Agreement_term = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Latency__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Latency__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Latency__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Profile__Profile = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Profile__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Profile__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ResConsumption__ResConsumption = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ResConsumption__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ResConsumption__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Strategy__Strategy = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Strategy__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Strategy__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Component__Component.initOperations(_Component__Component);
			Fragments._Component__OclAny.initOperations(_Component__OclAny);
			Fragments._Component__OclElement.initOperations(_Component__OclElement);

			Fragments._Deploy_service__Agreement_term.initOperations(_Deploy_service__Agreement_term);
			Fragments._Deploy_service__Deploy_service.initOperations(_Deploy_service__Deploy_service);
			Fragments._Deploy_service__MixinBase.initOperations(_Deploy_service__MixinBase);
			Fragments._Deploy_service__OclAny.initOperations(_Deploy_service__OclAny);
			Fragments._Deploy_service__OclElement.initOperations(_Deploy_service__OclElement);

			Fragments._GroupComponent__GroupComponent.initOperations(_GroupComponent__GroupComponent);
			Fragments._GroupComponent__OclAny.initOperations(_GroupComponent__OclAny);
			Fragments._GroupComponent__OclElement.initOperations(_GroupComponent__OclElement);

			Fragments._Latency__Agreement_term.initOperations(_Latency__Agreement_term);
			Fragments._Latency__Latency.initOperations(_Latency__Latency);
			Fragments._Latency__MixinBase.initOperations(_Latency__MixinBase);
			Fragments._Latency__OclAny.initOperations(_Latency__OclAny);
			Fragments._Latency__OclElement.initOperations(_Latency__OclElement);

			Fragments._Profile__OclAny.initOperations(_Profile__OclAny);
			Fragments._Profile__OclElement.initOperations(_Profile__OclElement);
			Fragments._Profile__Profile.initOperations(_Profile__Profile);

			Fragments._ResConsumption__OclAny.initOperations(_ResConsumption__OclAny);
			Fragments._ResConsumption__OclElement.initOperations(_ResConsumption__OclElement);
			Fragments._ResConsumption__ResConsumption.initOperations(_ResConsumption__ResConsumption);

			Fragments._Strategy__OclAny.initOperations(_Strategy__OclAny);
			Fragments._Strategy__OclElement.initOperations(_Strategy__OclElement);
			Fragments._Strategy__Strategy.initOperations(_Strategy__Strategy);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of QosTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Component = {
			QosTables.Properties._Component__name,
			QosTables.Properties._Component__profile
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Deploy_service = {
			QosTables.Properties._Deploy_service__deployServiceDeploymentStrategy,
			QosTables.Properties._Deploy_service__deployServiceNumberComponents,
			QosTables.Properties._Deploy_service__deployServiceTermState,
			QosTables.Properties._Deploy_service__deployServiceTermType,
			QosTables.Properties._Deploy_service__deployServiceThroughput
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _GroupComponent = {
			QosTables.Properties._GroupComponent__groupcomponentValues
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Latency = {
			QosTables.Properties._Latency__latencyMean,
			QosTables.Properties._Latency__latencyTermState,
			QosTables.Properties._Latency__latencyTermType
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Profile = {
			QosTables.Properties._Profile__profileValues
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _ResConsumption = {
			QosTables.Properties._ResConsumption__resName,
			QosTables.Properties._ResConsumption__value
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Strategy = {
			QosTables.Properties._Strategy__strategyValues
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Component__Component.initProperties(_Component);
			Fragments._Deploy_service__Deploy_service.initProperties(_Deploy_service);
			Fragments._GroupComponent__GroupComponent.initProperties(_GroupComponent);
			Fragments._Latency__Latency.initProperties(_Latency);
			Fragments._Profile__Profile.initProperties(_Profile);
			Fragments._ResConsumption__ResConsumption.initProperties(_ResConsumption);
			Fragments._Strategy__Strategy.initProperties(_Strategy);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of QosTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of QosTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual cobstruction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual cobstruction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {}
}
