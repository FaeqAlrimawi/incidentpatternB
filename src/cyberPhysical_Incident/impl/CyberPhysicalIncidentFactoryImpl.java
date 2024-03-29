/**
 */
package cyberPhysical_Incident.impl;

import cyberPhysical_Incident.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CyberPhysicalIncidentFactoryImpl extends EFactoryImpl implements CyberPhysicalIncidentFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CyberPhysicalIncidentFactory init() {
		try {
			CyberPhysicalIncidentFactory theCyberPhysicalIncidentFactory = (CyberPhysicalIncidentFactory)EPackage.Registry.INSTANCE.getEFactory(CyberPhysicalIncidentPackage.eNS_URI);
			if (theCyberPhysicalIncidentFactory != null) {
				return theCyberPhysicalIncidentFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CyberPhysicalIncidentFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CyberPhysicalIncidentFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CyberPhysicalIncidentPackage.ACTIVITY: return createActivity();
			case CyberPhysicalIncidentPackage.CRIME_SCRIPT: return createCrimeScript();
			case CyberPhysicalIncidentPackage.SCENE: return createScene();
			case CyberPhysicalIncidentPackage.MOTIVE: return createMotive();
			case CyberPhysicalIncidentPackage.GOAL: return createGoal();
			case CyberPhysicalIncidentPackage.INTENT: return createIntent();
			case CyberPhysicalIncidentPackage.ASSET: return createAsset();
			case CyberPhysicalIncidentPackage.CONNECTION: return createConnection();
			case CyberPhysicalIncidentPackage.RESOURCE: return createResource();
			case CyberPhysicalIncidentPackage.PATH: return createPath();
			case CyberPhysicalIncidentPackage.ACTOR: return createActor();
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM: return createIncidentDiagram();
			case CyberPhysicalIncidentPackage.PROPERTY: return createProperty();
			case CyberPhysicalIncidentPackage.VULNERABILITY: return createVulnerability();
			case CyberPhysicalIncidentPackage.TYPE: return createType();
			case CyberPhysicalIncidentPackage.ENTITY: return createEntity();
			case CyberPhysicalIncidentPackage.PRECONDITION: return createPrecondition();
			case CyberPhysicalIncidentPackage.BIGRAPH_EXPRESSION: return createBigraphExpression();
			case CyberPhysicalIncidentPackage.POSTCONDITION: return createPostcondition();
			case CyberPhysicalIncidentPackage.FACILITATING_CONDITION: return createFacilitatingCondition();
			case CyberPhysicalIncidentPackage.INCIDENT_ENTITY: return createIncidentEntity();
			case CyberPhysicalIncidentPackage.CONNECTIVITY: return createConnectivity();
			case CyberPhysicalIncidentPackage.INNER_NAME: return createInnerName();
			case CyberPhysicalIncidentPackage.SITE: return createSite();
			case CyberPhysicalIncidentPackage.ACTIVITY_PATTERN: return createActivityPattern();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case CyberPhysicalIncidentPackage.LEVEL:
				return createLevelFromString(eDataType, initialValue);
			case CyberPhysicalIncidentPackage.ACTIVITY_TYPE:
				return createActivityTypeFromString(eDataType, initialValue);
			case CyberPhysicalIncidentPackage.BEHAVIOUR:
				return createBehaviourFromString(eDataType, initialValue);
			case CyberPhysicalIncidentPackage.KNOWLEDGE:
				return createKnowledgeFromString(eDataType, initialValue);
			case CyberPhysicalIncidentPackage.SCRIPT_CATEGORY:
				return createScriptCategoryFromString(eDataType, initialValue);
			case CyberPhysicalIncidentPackage.ACTOR_ROLE:
				return createActorRoleFromString(eDataType, initialValue);
			case CyberPhysicalIncidentPackage.ACTOR_LEVEL:
				return createActorLevelFromString(eDataType, initialValue);
			case CyberPhysicalIncidentPackage.MOBILITY:
				return createMobilityFromString(eDataType, initialValue);
			case CyberPhysicalIncidentPackage.ABSTRACTION_LEVEL:
				return createAbstractionLevelFromString(eDataType, initialValue);
			case CyberPhysicalIncidentPackage.CONNECTION_STATE:
				return createConnectionStateFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case CyberPhysicalIncidentPackage.LEVEL:
				return convertLevelToString(eDataType, instanceValue);
			case CyberPhysicalIncidentPackage.ACTIVITY_TYPE:
				return convertActivityTypeToString(eDataType, instanceValue);
			case CyberPhysicalIncidentPackage.BEHAVIOUR:
				return convertBehaviourToString(eDataType, instanceValue);
			case CyberPhysicalIncidentPackage.KNOWLEDGE:
				return convertKnowledgeToString(eDataType, instanceValue);
			case CyberPhysicalIncidentPackage.SCRIPT_CATEGORY:
				return convertScriptCategoryToString(eDataType, instanceValue);
			case CyberPhysicalIncidentPackage.ACTOR_ROLE:
				return convertActorRoleToString(eDataType, instanceValue);
			case CyberPhysicalIncidentPackage.ACTOR_LEVEL:
				return convertActorLevelToString(eDataType, instanceValue);
			case CyberPhysicalIncidentPackage.MOBILITY:
				return convertMobilityToString(eDataType, instanceValue);
			case CyberPhysicalIncidentPackage.ABSTRACTION_LEVEL:
				return convertAbstractionLevelToString(eDataType, instanceValue);
			case CyberPhysicalIncidentPackage.CONNECTION_STATE:
				return convertConnectionStateToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Activity createActivity() {
		ActivityImpl activity = new ActivityImpl();
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CrimeScript createCrimeScript() {
		CrimeScriptImpl crimeScript = new CrimeScriptImpl();
		return crimeScript;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Scene createScene() {
		SceneImpl scene = new SceneImpl();
		return scene;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Motive createMotive() {
		MotiveImpl motive = new MotiveImpl();
		return motive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Goal createGoal() {
		GoalImpl goal = new GoalImpl();
		return goal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Intent createIntent() {
		IntentImpl intent = new IntentImpl();
		return intent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Asset createAsset() {
		AssetImpl asset = new AssetImpl();
		return asset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Connection createConnection() {
		ConnectionImpl connection = new ConnectionImpl();
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Resource createResource() {
		ResourceImpl resource = new ResourceImpl();
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Path createPath() {
		PathImpl path = new PathImpl();
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Actor createActor() {
		ActorImpl actor = new ActorImpl();
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IncidentDiagram createIncidentDiagram() {
		IncidentDiagramImpl incidentDiagram = new IncidentDiagramImpl();
		return incidentDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vulnerability createVulnerability() {
		VulnerabilityImpl vulnerability = new VulnerabilityImpl();
		return vulnerability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type createType() {
		TypeImpl type = new TypeImpl();
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entity createEntity() {
		EntityImpl entity = new EntityImpl();
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Precondition createPrecondition() {
		PreconditionImpl precondition = new PreconditionImpl();
		return precondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigraphExpression createBigraphExpression() {
		BigraphExpressionImpl bigraphExpression = new BigraphExpressionImpl();
		return bigraphExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Postcondition createPostcondition() {
		PostconditionImpl postcondition = new PostconditionImpl();
		return postcondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FacilitatingCondition createFacilitatingCondition() {
		FacilitatingConditionImpl facilitatingCondition = new FacilitatingConditionImpl();
		return facilitatingCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IncidentEntity createIncidentEntity() {
		IncidentEntityImpl incidentEntity = new IncidentEntityImpl();
		return incidentEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Connectivity createConnectivity() {
		ConnectivityImpl connectivity = new ConnectivityImpl();
		return connectivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InnerName createInnerName() {
		InnerNameImpl innerName = new InnerNameImpl();
		return innerName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Site createSite() {
		SiteImpl site = new SiteImpl();
		return site;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActivityPattern createActivityPattern() {
		ActivityPatternImpl activityPattern = new ActivityPatternImpl();
		return activityPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Level createLevelFromString(EDataType eDataType, String initialValue) {
		Level result = Level.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityType createActivityTypeFromString(EDataType eDataType, String initialValue) {
		ActivityType result = ActivityType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActivityTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behaviour createBehaviourFromString(EDataType eDataType, String initialValue) {
		Behaviour result = Behaviour.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBehaviourToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Knowledge createKnowledgeFromString(EDataType eDataType, String initialValue) {
		Knowledge result = Knowledge.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKnowledgeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScriptCategory createScriptCategoryFromString(EDataType eDataType, String initialValue) {
		ScriptCategory result = ScriptCategory.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScriptCategoryToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActorRole createActorRoleFromString(EDataType eDataType, String initialValue) {
		ActorRole result = ActorRole.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActorRoleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActorLevel createActorLevelFromString(EDataType eDataType, String initialValue) {
		ActorLevel result = ActorLevel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActorLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mobility createMobilityFromString(EDataType eDataType, String initialValue) {
		Mobility result = Mobility.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMobilityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractionLevel createAbstractionLevelFromString(EDataType eDataType, String initialValue) {
		AbstractionLevel result = AbstractionLevel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAbstractionLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionState createConnectionStateFromString(EDataType eDataType, String initialValue) {
		ConnectionState result = ConnectionState.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConnectionStateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CyberPhysicalIncidentPackage getCyberPhysicalIncidentPackage() {
		return (CyberPhysicalIncidentPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CyberPhysicalIncidentPackage getPackage() {
		return CyberPhysicalIncidentPackage.eINSTANCE;
	}

} //CyberPhysicalIncidentFactoryImpl
