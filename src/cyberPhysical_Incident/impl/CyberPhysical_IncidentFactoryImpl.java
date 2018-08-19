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
public class CyberPhysical_IncidentFactoryImpl extends EFactoryImpl implements CyberPhysical_IncidentFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CyberPhysical_IncidentFactory init() {
		try {
			CyberPhysical_IncidentFactory theCyberPhysical_IncidentFactory = (CyberPhysical_IncidentFactory)EPackage.Registry.INSTANCE.getEFactory(CyberPhysical_IncidentPackage.eNS_URI);
			if (theCyberPhysical_IncidentFactory != null) {
				return theCyberPhysical_IncidentFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CyberPhysical_IncidentFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CyberPhysical_IncidentFactoryImpl() {
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
			case CyberPhysical_IncidentPackage.ACTIVITY: return createActivity();
			case CyberPhysical_IncidentPackage.CRIME_SCRIPT: return createCrimeScript();
			case CyberPhysical_IncidentPackage.SCENE: return createScene();
			case CyberPhysical_IncidentPackage.MOTIVE: return createMotive();
			case CyberPhysical_IncidentPackage.GOAL: return createGoal();
			case CyberPhysical_IncidentPackage.INTENT: return createIntent();
			case CyberPhysical_IncidentPackage.ASSET: return createAsset();
			case CyberPhysical_IncidentPackage.CONNECTION: return createConnection();
			case CyberPhysical_IncidentPackage.RESOURCE: return createResource();
			case CyberPhysical_IncidentPackage.PATH: return createPath();
			case CyberPhysical_IncidentPackage.ACTOR: return createActor();
			case CyberPhysical_IncidentPackage.INCIDENT_DIAGRAM: return createIncidentDiagram();
			case CyberPhysical_IncidentPackage.PROPERTY: return createProperty();
			case CyberPhysical_IncidentPackage.VULNERABILITY: return createVulnerability();
			case CyberPhysical_IncidentPackage.TYPE: return createType();
			case CyberPhysical_IncidentPackage.ENTITY: return createEntity();
			case CyberPhysical_IncidentPackage.PRECONDITION: return createPrecondition();
			case CyberPhysical_IncidentPackage.BIGRAPH_EXPRESSION: return createBigraphExpression();
			case CyberPhysical_IncidentPackage.POSTCONDITION: return createPostcondition();
			case CyberPhysical_IncidentPackage.FACILITATING_CONDITION: return createFacilitatingCondition();
			case CyberPhysical_IncidentPackage.INCIDENT_ENTITY: return createIncidentEntity();
			case CyberPhysical_IncidentPackage.CONNECTIVITY: return createConnectivity();
			case CyberPhysical_IncidentPackage.INNER_NAME: return createInnerName();
			case CyberPhysical_IncidentPackage.SITE: return createSite();
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
			case CyberPhysical_IncidentPackage.LEVEL:
				return createLevelFromString(eDataType, initialValue);
			case CyberPhysical_IncidentPackage.ACTIVITY_TYPE:
				return createActivityTypeFromString(eDataType, initialValue);
			case CyberPhysical_IncidentPackage.BEHAVIOUR:
				return createBehaviourFromString(eDataType, initialValue);
			case CyberPhysical_IncidentPackage.KNOWLEDGE:
				return createKnowledgeFromString(eDataType, initialValue);
			case CyberPhysical_IncidentPackage.SCRIPT_CATEGORY:
				return createScriptCategoryFromString(eDataType, initialValue);
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
			case CyberPhysical_IncidentPackage.LEVEL:
				return convertLevelToString(eDataType, instanceValue);
			case CyberPhysical_IncidentPackage.ACTIVITY_TYPE:
				return convertActivityTypeToString(eDataType, instanceValue);
			case CyberPhysical_IncidentPackage.BEHAVIOUR:
				return convertBehaviourToString(eDataType, instanceValue);
			case CyberPhysical_IncidentPackage.KNOWLEDGE:
				return convertKnowledgeToString(eDataType, instanceValue);
			case CyberPhysical_IncidentPackage.SCRIPT_CATEGORY:
				return convertScriptCategoryToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity createActivity() {
		ActivityImpl activity = new ActivityImpl();
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CrimeScript createCrimeScript() {
		CrimeScriptImpl crimeScript = new CrimeScriptImpl();
		return crimeScript;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scene createScene() {
		SceneImpl scene = new SceneImpl();
		return scene;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Motive createMotive() {
		MotiveImpl motive = new MotiveImpl();
		return motive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Goal createGoal() {
		GoalImpl goal = new GoalImpl();
		return goal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Intent createIntent() {
		IntentImpl intent = new IntentImpl();
		return intent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Asset createAsset() {
		AssetImpl asset = new AssetImpl();
		return asset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection createConnection() {
		ConnectionImpl connection = new ConnectionImpl();
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource createResource() {
		ResourceImpl resource = new ResourceImpl();
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Path createPath() {
		PathImpl path = new PathImpl();
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor createActor() {
		ActorImpl actor = new ActorImpl();
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncidentDiagram createIncidentDiagram() {
		IncidentDiagramImpl incidentDiagram = new IncidentDiagramImpl();
		return incidentDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vulnerability createVulnerability() {
		VulnerabilityImpl vulnerability = new VulnerabilityImpl();
		return vulnerability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type createType() {
		TypeImpl type = new TypeImpl();
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity createEntity() {
		EntityImpl entity = new EntityImpl();
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Precondition createPrecondition() {
		PreconditionImpl precondition = new PreconditionImpl();
		return precondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigraphExpression createBigraphExpression() {
		BigraphExpressionImpl bigraphExpression = new BigraphExpressionImpl();
		return bigraphExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Postcondition createPostcondition() {
		PostconditionImpl postcondition = new PostconditionImpl();
		return postcondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacilitatingCondition createFacilitatingCondition() {
		FacilitatingConditionImpl facilitatingCondition = new FacilitatingConditionImpl();
		return facilitatingCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncidentEntity createIncidentEntity() {
		IncidentEntityImpl incidentEntity = new IncidentEntityImpl();
		return incidentEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connectivity createConnectivity() {
		ConnectivityImpl connectivity = new ConnectivityImpl();
		return connectivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InnerName createInnerName() {
		InnerNameImpl innerName = new InnerNameImpl();
		return innerName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Site createSite() {
		SiteImpl site = new SiteImpl();
		return site;
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
	public CyberPhysical_IncidentPackage getCyberPhysical_IncidentPackage() {
		return (CyberPhysical_IncidentPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CyberPhysical_IncidentPackage getPackage() {
		return CyberPhysical_IncidentPackage.eINSTANCE;
	}

} //CyberPhysical_IncidentFactoryImpl
