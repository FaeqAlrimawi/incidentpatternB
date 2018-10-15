/**
 */
package cyberPhysical_Incident;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see cyberPhysical_Incident.CyberPhysicalIncidentFactory
 * @model kind="package"
 * @generated
 */
public interface CyberPhysicalIncidentPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cyberPhysical_Incident";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/cyberPhysical_Incident";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cyberPhysical_Incident";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CyberPhysicalIncidentPackage eINSTANCE = cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl.init();

	/**
	 * The meta object id for the '{@link cyberPhysical_Incident.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cyberPhysical_Incident.impl.ActivityImpl
	 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Facilitating Conditions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__FACILITATING_CONDITIONS = 1;

	/**
	 * The feature id for the '<em><b>Certainty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__CERTAINTY = 2;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__DURATION = 3;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__START_TIME = 4;

	/**
	 * The feature id for the '<em><b>Next Activities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__NEXT_ACTIVITIES = 5;

	/**
	 * The feature id for the '<em><b>Previous Activities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__PREVIOUS_ACTIVITIES = 6;

	/**
	 * The feature id for the '<em><b>Paths</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__PATHS = 7;

	/**
	 * The feature id for the '<em><b>Goals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__GOALS = 8;

	/**
	 * The feature id for the '<em><b>Initiator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__INITIATOR = 9;

	/**
	 * The feature id for the '<em><b>Accomplices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__ACCOMPLICES = 10;

	/**
	 * The feature id for the '<em><b>Victims</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__VICTIMS = 11;

	/**
	 * The feature id for the '<em><b>Targeted Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__TARGETED_ASSETS = 12;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__END_TIME = 13;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__RESOURCES = 14;

	/**
	 * The feature id for the '<em><b>Exploited Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__EXPLOITED_ASSETS = 15;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__TYPE = 16;

	/**
	 * The feature id for the '<em><b>Behaviour Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__BEHAVIOUR_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__PRECONDITION = 18;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__LOCATION = 19;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__DESCRIPTION = 20;

	/**
	 * The feature id for the '<em><b>System Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__SYSTEM_ACTION = 21;

	/**
	 * The feature id for the '<em><b>Postcondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__POSTCONDITION = 22;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = 23;

	/**
	 * The number of operations of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cyberPhysical_Incident.impl.CrimeScriptImpl <em>Crime Script</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cyberPhysical_Incident.impl.CrimeScriptImpl
	 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getCrimeScript()
	 * @generated
	 */
	int CRIME_SCRIPT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRIME_SCRIPT__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRIME_SCRIPT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRIME_SCRIPT__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRIME_SCRIPT__CATEGORY = 3;

	/**
	 * The feature id for the '<em><b>Scenes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRIME_SCRIPT__SCENES = 4;

	/**
	 * The feature id for the '<em><b>Goals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRIME_SCRIPT__GOALS = 5;

	/**
	 * The feature id for the '<em><b>Targeted Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRIME_SCRIPT__TARGETED_ASSETS = 6;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRIME_SCRIPT__RESOURCES = 7;

	/**
	 * The feature id for the '<em><b>Main Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRIME_SCRIPT__MAIN_LOCATION = 8;

	/**
	 * The feature id for the '<em><b>Victims</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRIME_SCRIPT__VICTIMS = 9;

	/**
	 * The feature id for the '<em><b>Offenders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRIME_SCRIPT__OFFENDERS = 10;

	/**
	 * The feature id for the '<em><b>Higher Level Script Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRIME_SCRIPT__HIGHER_LEVEL_SCRIPT_NAME = 11;

	/**
	 * The feature id for the '<em><b>Intent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRIME_SCRIPT__INTENT = 12;

	/**
	 * The feature id for the '<em><b>Motive</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRIME_SCRIPT__MOTIVE = 13;

	/**
	 * The number of structural features of the '<em>Crime Script</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRIME_SCRIPT_FEATURE_COUNT = 14;

	/**
	 * The number of operations of the '<em>Crime Script</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRIME_SCRIPT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cyberPhysical_Incident.impl.SceneImpl <em>Scene</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cyberPhysical_Incident.impl.SceneImpl
	 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getScene()
	 * @generated
	 */
	int SCENE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Next Scenes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE__NEXT_SCENES = 1;

	/**
	 * The feature id for the '<em><b>Previous Scenes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE__PREVIOUS_SCENES = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE__ACTIVITY = 4;

	/**
	 * The number of structural features of the '<em>Scene</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Scene</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cyberPhysical_Incident.impl.MotiveImpl <em>Motive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cyberPhysical_Incident.impl.MotiveImpl
	 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getMotive()
	 * @generated
	 */
	int MOTIVE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTIVE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTIVE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Primary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTIVE__PRIMARY = 2;

	/**
	 * The number of structural features of the '<em>Motive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTIVE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Motive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTIVE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cyberPhysical_Incident.impl.GoalImpl <em>Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cyberPhysical_Incident.impl.GoalImpl
	 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getGoal()
	 * @generated
	 */
	int GOAL = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__ACTIVITIES = 2;

	/**
	 * The feature id for the '<em><b>State</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__STATE = 3;

	/**
	 * The number of structural features of the '<em>Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cyberPhysical_Incident.impl.IntentImpl <em>Intent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cyberPhysical_Incident.impl.IntentImpl
	 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getIntent()
	 * @generated
	 */
	int INTENT = 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT__NAME = 1;

	/**
	 * The number of structural features of the '<em>Intent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Intent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cyberPhysical_Incident.ActivityInitiator <em>Activity Initiator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cyberPhysical_Incident.ActivityInitiator
	 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getActivityInitiator()
	 * @generated
	 */
	int ACTIVITY_INITIATOR = 11;

	/**
	 * The number of structural features of the '<em>Activity Initiator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_INITIATOR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Activity Initiator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_INITIATOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cyberPhysical_Incident.impl.IncidentEntityImpl <em>Incident Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cyberPhysical_Incident.impl.IncidentEntityImpl
	 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getIncidentEntity()
	 * @generated
	 */
	int INCIDENT_ENTITY = 36;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCIDENT_ENTITY__CONNECTIONS = ACTIVITY_INITIATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCIDENT_ENTITY__PARENT_ENTITY = ACTIVITY_INITIATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Contained Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCIDENT_ENTITY__CONTAINED_ENTITIES = ACTIVITY_INITIATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Connections Knowledge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCIDENT_ENTITY__CONNECTIONS_KNOWLEDGE = ACTIVITY_INITIATOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Contained Assets Knowledge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCIDENT_ENTITY__CONTAINED_ASSETS_KNOWLEDGE = ACTIVITY_INITIATOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCIDENT_ENTITY__NAME = ACTIVITY_INITIATOR_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCIDENT_ENTITY__PROPERTIES = ACTIVITY_INITIATOR_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCIDENT_ENTITY__TYPE = ACTIVITY_INITIATOR_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Mobility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCIDENT_ENTITY__MOBILITY = ACTIVITY_INITIATOR_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Incident Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCIDENT_ENTITY_FEATURE_COUNT = ACTIVITY_INITIATOR_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Incident Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCIDENT_ENTITY_OPERATION_COUNT = ACTIVITY_INITIATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cyberPhysical_Incident.impl.AssetImpl <em>Asset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cyberPhysical_Incident.impl.AssetImpl
	 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getAsset()
	 * @generated
	 */
	int ASSET = 6;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__CONNECTIONS = INCIDENT_ENTITY__CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Parent Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__PARENT_ENTITY = INCIDENT_ENTITY__PARENT_ENTITY;

	/**
	 * The feature id for the '<em><b>Contained Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__CONTAINED_ENTITIES = INCIDENT_ENTITY__CONTAINED_ENTITIES;

	/**
	 * The feature id for the '<em><b>Connections Knowledge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__CONNECTIONS_KNOWLEDGE = INCIDENT_ENTITY__CONNECTIONS_KNOWLEDGE;

	/**
	 * The feature id for the '<em><b>Contained Assets Knowledge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__CONTAINED_ASSETS_KNOWLEDGE = INCIDENT_ENTITY__CONTAINED_ASSETS_KNOWLEDGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__NAME = INCIDENT_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__PROPERTIES = INCIDENT_ENTITY__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__TYPE = INCIDENT_ENTITY__TYPE;

	/**
	 * The feature id for the '<em><b>Mobility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__MOBILITY = INCIDENT_ENTITY__MOBILITY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__DESCRIPTION = INCIDENT_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Vulnerability</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__VULNERABILITY = INCIDENT_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__STATUS = INCIDENT_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_FEATURE_COUNT = INCIDENT_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_OPERATION_COUNT = INCIDENT_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cyberPhysical_Incident.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cyberPhysical_Incident.impl.ConnectionImpl
	 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__CONSTRAINTS = 1;

	/**
	 * The feature id for the '<em><b>Entity1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__ENTITY1 = 2;

	/**
	 * The feature id for the '<em><b>Entity2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__ENTITY2 = 3;

	/**
	 * The feature id for the '<em><b>Connection Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__CONNECTION_PROBABILITY = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__TYPE = 5;

	/**
	 * The feature id for the '<em><b>Bidirectional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__BIDIRECTIONAL = 6;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__PROPERTIES = 7;

	/**
	 * The feature id for the '<em><b>Vulnerabilities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__VULNERABILITIES = 8;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cyberPhysical_Incident.Location <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cyberPhysical_Incident.Location
	 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 8;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__CONNECTIONS = 0;

	/**
	 * The feature id for the '<em><b>Parent Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__PARENT_ENTITY = 1;

	/**
	 * The feature id for the '<em><b>Contained Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__CONTAINED_ENTITIES = 2;

	/**
	 * The feature id for the '<em><b>Connections Knowledge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__CONNECTIONS_KNOWLEDGE = 3;

	/**
	 * The feature id for the '<em><b>Contained Assets Knowledge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__CONTAINED_ASSETS_KNOWLEDGE = 4;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cyberPhysical_Incident.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cyberPhysical_Incident.impl.ResourceImpl
	 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 9;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__CONNECTIONS = INCIDENT_ENTITY__CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Parent Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__PARENT_ENTITY = INCIDENT_ENTITY__PARENT_ENTITY;

	/**
	 * The feature id for the '<em><b>Contained Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__CONTAINED_ENTITIES = INCIDENT_ENTITY__CONTAINED_ENTITIES;

	/**
	 * The feature id for the '<em><b>Connections Knowledge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__CONNECTIONS_KNOWLEDGE = INCIDENT_ENTITY__CONNECTIONS_KNOWLEDGE;

	/**
	 * The feature id for the '<em><b>Contained Assets Knowledge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__CONTAINED_ASSETS_KNOWLEDGE = INCIDENT_ENTITY__CONTAINED_ASSETS_KNOWLEDGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__NAME = INCIDENT_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__PROPERTIES = INCIDENT_ENTITY__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__TYPE = INCIDENT_ENTITY__TYPE;

	/**
	 * The feature id for the '<em><b>Mobility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__MOBILITY = INCIDENT_ENTITY__MOBILITY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__DESCRIPTION = INCIDENT_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = INCIDENT_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION_COUNT = INCIDENT_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cyberPhysical_Incident.impl.PathImpl <em>Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cyberPhysical_Incident.impl.PathImpl
	 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getPath()
	 * @generated
	 */
	int PATH = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__NAME = 0;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__ACTIVITIES = 1;

	/**
	 * The number of structural features of the '<em>Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cyberPhysical_Incident.impl.ActorImpl <em>Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cyberPhysical_Incident.impl.ActorImpl
	 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getActor()
	 * @generated
	 */
	int ACTOR = 12;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__CONNECTIONS = INCIDENT_ENTITY__CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Parent Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__PARENT_ENTITY = INCIDENT_ENTITY__PARENT_ENTITY;

	/**
	 * The feature id for the '<em><b>Contained Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__CONTAINED_ENTITIES = INCIDENT_ENTITY__CONTAINED_ENTITIES;

	/**
	 * The feature id for the '<em><b>Connections Knowledge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__CONNECTIONS_KNOWLEDGE = INCIDENT_ENTITY__CONNECTIONS_KNOWLEDGE;

	/**
	 * The feature id for the '<em><b>Contained Assets Knowledge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__CONTAINED_ASSETS_KNOWLEDGE = INCIDENT_ENTITY__CONTAINED_ASSETS_KNOWLEDGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__NAME = INCIDENT_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__PROPERTIES = INCIDENT_ENTITY__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__TYPE = INCIDENT_ENTITY__TYPE;

	/**
	 * The feature id for the '<em><b>Mobility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__MOBILITY = INCIDENT_ENTITY__MOBILITY;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__ROLE = INCIDENT_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__LEVEL = INCIDENT_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FEATURE_COUNT = INCIDENT_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_OPERATION_COUNT = INCIDENT_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cyberPhysical_Incident.impl.IncidentDiagramImpl <em>Incident Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cyberPhysical_Incident.impl.IncidentDiagramImpl
	 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getIncidentDiagram()
	 * @generated
	 */
	int INCIDENT_DIAGRAM = 13;

	/**
	 * The feature id for the '<em><b>Crime Script</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCIDENT_DIAGRAM__CRIME_SCRIPT = 0;

	/**
	 * The feature id for the '<em><b>Scene</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCIDENT_DIAGRAM__SCENE = 1;

	/**
	 * The feature id for the '<em><b>Intent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCIDENT_DIAGRAM__INTENT = 2;

	/**
	 * The feature id for the '<em><b>Goal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCIDENT_DIAGRAM__GOAL = 3;

	/**
	 * The feature id for the '<em><b>Motive</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCIDENT_DIAGRAM__MOTIVE = 4;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCIDENT_DIAGRAM__ASSET = 5;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCIDENT_DIAGRAM__RESOURCE = 6;

	/**
	 * The feature id for the '<em><b>Actor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCIDENT_DIAGRAM__ACTOR = 7;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCIDENT_DIAGRAM__CONNECTION = 8;

	/**
	 * The feature id for the '<em><b>Paths</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCIDENT_DIAGRAM__PATHS = 9;

	/**
	 * The number of structural features of the '<em>Incident Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCIDENT_DIAGRAM_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Incident Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCIDENT_DIAGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cyberPhysical_Incident.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cyberPhysical_Incident.impl.PropertyImpl
	 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cyberPhysical_Incident.impl.VulnerabilityImpl <em>Vulnerability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cyberPhysical_Incident.impl.VulnerabilityImpl
	 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getVulnerability()
	 * @generated
	 */
	int VULNERABILITY = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITY__URL = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITY__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITY__SEVERITY = 3;

	/**
	 * The number of structural features of the '<em>Vulnerability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Vulnerability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULNERABILITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cyberPhysical_Incident.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cyberPhysical_Incident.impl.TypeImpl
	 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Has Super Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__HAS_SUPER_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__SUPER_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cyberPhysical_Incident.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cyberPhysical_Incident.impl.ExpressionImpl
	 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 17;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cyberPhysical_Incident.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cyberPhysical_Incident.impl.UnaryExpressionImpl
	 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getUnaryExpression()
	 * @generated
	 */
	int UNARY_EXPRESSION = 18;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__OPERAND = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Unary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cyberPhysical_Incident.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cyberPhysical_Incident.impl.BinaryExpressionImpl
	 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getBinaryExpression()
	 * @generated
	 */
	int BINARY_EXPRESSION = 19;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Binary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Binary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cyberPhysical_Incident.impl.TopologicalRelationImpl <em>Topological Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cyberPhysical_Incident.impl.TopologicalRelationImpl
	 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getTopologicalRelation()
	 * @generated
	 */
	int TOPOLOGICAL_RELATION = 25;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGICAL_RELATION__LEFT = BINARY_EXPRESSION__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGICAL_RELATION__RIGHT = BINARY_EXPRESSION__RIGHT;

	/**
	 * The number of structural features of the '<em>Topological Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGICAL_RELATION_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Topological Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGICAL_RELATION_OPERATION_COUNT = BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cyberPhysical_Incident.impl.ContainsImpl <em>Contains</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cyberPhysical_Incident.impl.ContainsImpl
	 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getContains()
	 * @generated
	 */
	int CONTAINS = 20;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS__LEFT = TOPOLOGICAL_RELATION__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS__RIGHT = TOPOLOGICAL_RELATION__RIGHT;

	/**
	 * The number of structural features of the '<em>Contains</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS_FEATURE_COUNT = TOPOLOGICAL_RELATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Contains</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS_OPERATION_COUNT = TOPOLOGICAL_RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cyberPhysical_Incident.impl.ConnectedToImpl <em>Connected To</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cyberPhysical_Incident.impl.ConnectedToImpl
	 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getConnectedTo()
	 * @generated
	 */
	int CONNECTED_TO = 21;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTED_TO__LEFT = TOPOLOGICAL_RELATION__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTED_TO__RIGHT = TOPOLOGICAL_RELATION__RIGHT;

	/**
	 * The number of structural features of the '<em>Connected To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTED_TO_FEATURE_COUNT = TOPOLOGICAL_RELATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Connected To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTED_TO_OPERATION_COUNT = TOPOLOGICAL_RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cyberPhysical_Incident.impl.NotImpl <em>Not</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cyberPhysical_Incident.impl.NotImpl
	 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getNot()
	 * @generated
	 */
	int NOT = 22;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__OPERAND = UNARY_EXPRESSION__OPERAND;

	/**
	 * The number of structural features of the '<em>Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_FEATURE_COUNT = UNARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OPERATION_COUNT = UNARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cyberPhysical_Incident.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cyberPhysical_Incident.impl.EntityImpl
	 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ENTITY = 1;

	/**
	 * The feature id for the '<em><b>Connectivity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__CONNECTIVITY = 2;

	/**
	 * The feature id for the '<em><b>Site</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__SITE = 3;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cyberPhysical_Incident.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cyberPhysical_Incident.impl.ConditionImpl
	 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 33;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__EXPRESSION = 1;

	/**
	 * The feature id for the '<em><b>Assoicated Conditions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__ASSOICATED_CONDITIONS = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__DESCRIPTION = 3;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cyberPhysical_Incident.impl.PreconditionImpl <em>Precondition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cyberPhysical_Incident.impl.PreconditionImpl
	 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getPrecondition()
	 * @generated
	 */
	int PRECONDITION = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECONDITION__NAME = CONDITION__NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECONDITION__EXPRESSION = CONDITION__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Assoicated Conditions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECONDITION__ASSOICATED_CONDITIONS = CONDITION__ASSOICATED_CONDITIONS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECONDITION__DESCRIPTION = CONDITION__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Precondition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Precondition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cyberPhysical_Incident.impl.EqualImpl <em>Equal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cyberPhysical_Incident.impl.EqualImpl
	 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getEqual()
	 * @generated
	 */
	int EQUAL = 26;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL__LEFT = BINARY_EXPRESSION__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL__RIGHT = BINARY_EXPRESSION__RIGHT;

	/**
	 * The number of structural features of the '<em>Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL_OPERATION_COUNT = BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cyberPhysical_Incident.impl.GreaterImpl <em>Greater</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cyberPhysical_Incident.impl.GreaterImpl
	 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getGreater()
	 * @generated
	 */
	int GREATER = 27;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER__LEFT = BINARY_EXPRESSION__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER__RIGHT = BINARY_EXPRESSION__RIGHT;

	/**
	 * The number of structural features of the '<em>Greater</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Greater</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_OPERATION_COUNT = BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cyberPhysical_Incident.impl.AndImpl <em>And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cyberPhysical_Incident.impl.AndImpl
	 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getAnd()
	 * @generated
	 */
	int AND = 28;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__LEFT = BINARY_EXPRESSION__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__RIGHT = BINARY_EXPRESSION__RIGHT;

	/**
	 * The number of structural features of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_OPERATION_COUNT = BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cyberPhysical_Incident.impl.BigraphExpressionImpl <em>Bigraph Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cyberPhysical_Incident.impl.BigraphExpressionImpl
	 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getBigraphExpression()
	 * @generated
	 */
	int BIGRAPH_EXPRESSION = 29;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIGRAPH_EXPRESSION__ENTITY = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Innername</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIGRAPH_EXPRESSION__INNERNAME = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Bigraph Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIGRAPH_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Bigraph Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIGRAPH_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cyberPhysical_Incident.impl.OrImpl <em>Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cyberPhysical_Incident.impl.OrImpl
	 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getOr()
	 * @generated
	 */
	int OR = 30;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__LEFT = BINARY_EXPRESSION__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__RIGHT = BINARY_EXPRESSION__RIGHT;

	/**
	 * The number of structural features of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_OPERATION_COUNT = BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cyberPhysical_Incident.impl.ReachableFromImpl <em>Reachable From</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cyberPhysical_Incident.impl.ReachableFromImpl
	 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getReachableFrom()
	 * @generated
	 */
	int REACHABLE_FROM = 31;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACHABLE_FROM__LEFT = TOPOLOGICAL_RELATION__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACHABLE_FROM__RIGHT = TOPOLOGICAL_RELATION__RIGHT;

	/**
	 * The number of structural features of the '<em>Reachable From</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACHABLE_FROM_FEATURE_COUNT = TOPOLOGICAL_RELATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Reachable From</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACHABLE_FROM_OPERATION_COUNT = TOPOLOGICAL_RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cyberPhysical_Incident.impl.NearImpl <em>Near</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cyberPhysical_Incident.impl.NearImpl
	 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getNear()
	 * @generated
	 */
	int NEAR = 32;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEAR__LEFT = TOPOLOGICAL_RELATION__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEAR__RIGHT = TOPOLOGICAL_RELATION__RIGHT;

	/**
	 * The number of structural features of the '<em>Near</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEAR_FEATURE_COUNT = TOPOLOGICAL_RELATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Near</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEAR_OPERATION_COUNT = TOPOLOGICAL_RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cyberPhysical_Incident.impl.PostconditionImpl <em>Postcondition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cyberPhysical_Incident.impl.PostconditionImpl
	 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getPostcondition()
	 * @generated
	 */
	int POSTCONDITION = 34;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTCONDITION__NAME = CONDITION__NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTCONDITION__EXPRESSION = CONDITION__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Assoicated Conditions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTCONDITION__ASSOICATED_CONDITIONS = CONDITION__ASSOICATED_CONDITIONS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTCONDITION__DESCRIPTION = CONDITION__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Postcondition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTCONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Postcondition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTCONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cyberPhysical_Incident.impl.FacilitatingConditionImpl <em>Facilitating Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cyberPhysical_Incident.impl.FacilitatingConditionImpl
	 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getFacilitatingCondition()
	 * @generated
	 */
	int FACILITATING_CONDITION = 35;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITATING_CONDITION__NAME = CONDITION__NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITATING_CONDITION__EXPRESSION = CONDITION__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Assoicated Conditions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITATING_CONDITION__ASSOICATED_CONDITIONS = CONDITION__ASSOICATED_CONDITIONS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITATING_CONDITION__DESCRIPTION = CONDITION__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Facilitating Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITATING_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Facilitating Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITATING_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cyberPhysical_Incident.impl.ConnectivityImpl <em>Connectivity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cyberPhysical_Incident.impl.ConnectivityImpl
	 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getConnectivity()
	 * @generated
	 */
	int CONNECTIVITY = 37;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Is Closed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVITY__IS_CLOSED = 1;

	/**
	 * The number of structural features of the '<em>Connectivity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVITY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Connectivity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cyberPhysical_Incident.impl.InnerNameImpl <em>Inner Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cyberPhysical_Incident.impl.InnerNameImpl
	 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getInnerName()
	 * @generated
	 */
	int INNER_NAME = 38;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INNER_NAME__NAME = 0;

	/**
	 * The feature id for the '<em><b>Is Closed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INNER_NAME__IS_CLOSED = 1;

	/**
	 * The feature id for the '<em><b>Outername</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INNER_NAME__OUTERNAME = 2;

	/**
	 * The number of structural features of the '<em>Inner Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INNER_NAME_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Inner Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INNER_NAME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cyberPhysical_Incident.impl.SiteImpl <em>Site</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cyberPhysical_Incident.impl.SiteImpl
	 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getSite()
	 * @generated
	 */
	int SITE = 39;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Is Closed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE__IS_CLOSED = 1;

	/**
	 * The number of structural features of the '<em>Site</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Site</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cyberPhysical_Incident.impl.ActivityPatternImpl <em>Activity Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cyberPhysical_Incident.impl.ActivityPatternImpl
	 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getActivityPattern()
	 * @generated
	 */
	int ACTIVITY_PATTERN = 40;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PATTERN__NAME = 0;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PATTERN__SEVERITY = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PATTERN__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Skills Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PATTERN__SKILLS_REQUIRED = 3;

	/**
	 * The feature id for the '<em><b>Patterns Follow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PATTERN__PATTERNS_FOLLOW = 4;

	/**
	 * The feature id for the '<em><b>Abstract Activity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PATTERN__ABSTRACT_ACTIVITY = 5;

	/**
	 * The feature id for the '<em><b>Incidententity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PATTERN__INCIDENTENTITY = 6;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PATTERN__CONNECTION = 7;

	/**
	 * The number of structural features of the '<em>Activity Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PATTERN_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Activity Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PATTERN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cyberPhysical_Incident.Level <em>Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cyberPhysical_Incident.Level
	 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getLevel()
	 * @generated
	 */
	int LEVEL = 41;

	/**
	 * The meta object id for the '{@link cyberPhysical_Incident.ActivityType <em>Activity Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cyberPhysical_Incident.ActivityType
	 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getActivityType()
	 * @generated
	 */
	int ACTIVITY_TYPE = 42;

	/**
	 * The meta object id for the '{@link cyberPhysical_Incident.Behaviour <em>Behaviour</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cyberPhysical_Incident.Behaviour
	 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getBehaviour()
	 * @generated
	 */
	int BEHAVIOUR = 43;

	/**
	 * The meta object id for the '{@link cyberPhysical_Incident.Knowledge <em>Knowledge</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cyberPhysical_Incident.Knowledge
	 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getKnowledge()
	 * @generated
	 */
	int KNOWLEDGE = 44;

	/**
	 * The meta object id for the '{@link cyberPhysical_Incident.ScriptCategory <em>Script Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cyberPhysical_Incident.ScriptCategory
	 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getScriptCategory()
	 * @generated
	 */
	int SCRIPT_CATEGORY = 45;


	/**
	 * The meta object id for the '{@link cyberPhysical_Incident.ActorRole <em>Actor Role</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cyberPhysical_Incident.ActorRole
	 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getActorRole()
	 * @generated
	 */
	int ACTOR_ROLE = 46;

	/**
	 * The meta object id for the '{@link cyberPhysical_Incident.ActorLevel <em>Actor Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cyberPhysical_Incident.ActorLevel
	 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getActorLevel()
	 * @generated
	 */
	int ACTOR_LEVEL = 47;


	/**
	 * The meta object id for the '{@link cyberPhysical_Incident.ActivityPatternSeverity <em>Activity Pattern Severity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cyberPhysical_Incident.ActivityPatternSeverity
	 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getActivityPatternSeverity()
	 * @generated
	 */
	int ACTIVITY_PATTERN_SEVERITY = 48;

	/**
	 * The meta object id for the '{@link cyberPhysical_Incident.Skill_Level <em>Skill Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cyberPhysical_Incident.Skill_Level
	 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getSkill_Level()
	 * @generated
	 */
	int SKILL_LEVEL = 49;

	/**
	 * The meta object id for the '{@link cyberPhysical_Incident.Mobility <em>Mobility</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cyberPhysical_Incident.Mobility
	 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getMobility()
	 * @generated
	 */
	int MOBILITY = 50;

	/**
	 * Returns the meta object for class '{@link cyberPhysical_Incident.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see cyberPhysical_Incident.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for the attribute '{@link cyberPhysical_Incident.Activity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cyberPhysical_Incident.Activity#getName()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_Name();

	/**
	 * Returns the meta object for the attribute list '{@link cyberPhysical_Incident.Activity#getFacilitatingConditions <em>Facilitating Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Facilitating Conditions</em>'.
	 * @see cyberPhysical_Incident.Activity#getFacilitatingConditions()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_FacilitatingConditions();

	/**
	 * Returns the meta object for the attribute '{@link cyberPhysical_Incident.Activity#getCertainty <em>Certainty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Certainty</em>'.
	 * @see cyberPhysical_Incident.Activity#getCertainty()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_Certainty();

	/**
	 * Returns the meta object for the attribute '{@link cyberPhysical_Incident.Activity#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see cyberPhysical_Incident.Activity#getDuration()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_Duration();

	/**
	 * Returns the meta object for the attribute '{@link cyberPhysical_Incident.Activity#getStartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time</em>'.
	 * @see cyberPhysical_Incident.Activity#getStartTime()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_StartTime();

	/**
	 * Returns the meta object for the reference list '{@link cyberPhysical_Incident.Activity#getNextActivities <em>Next Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Next Activities</em>'.
	 * @see cyberPhysical_Incident.Activity#getNextActivities()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_NextActivities();

	/**
	 * Returns the meta object for the reference list '{@link cyberPhysical_Incident.Activity#getPreviousActivities <em>Previous Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Previous Activities</em>'.
	 * @see cyberPhysical_Incident.Activity#getPreviousActivities()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_PreviousActivities();

	/**
	 * Returns the meta object for the reference list '{@link cyberPhysical_Incident.Activity#getPaths <em>Paths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Paths</em>'.
	 * @see cyberPhysical_Incident.Activity#getPaths()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Paths();

	/**
	 * Returns the meta object for the reference list '{@link cyberPhysical_Incident.Activity#getGoals <em>Goals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Goals</em>'.
	 * @see cyberPhysical_Incident.Activity#getGoals()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Goals();

	/**
	 * Returns the meta object for the reference '{@link cyberPhysical_Incident.Activity#getInitiator <em>Initiator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initiator</em>'.
	 * @see cyberPhysical_Incident.Activity#getInitiator()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Initiator();

	/**
	 * Returns the meta object for the reference list '{@link cyberPhysical_Incident.Activity#getAccomplices <em>Accomplices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Accomplices</em>'.
	 * @see cyberPhysical_Incident.Activity#getAccomplices()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Accomplices();

	/**
	 * Returns the meta object for the reference list '{@link cyberPhysical_Incident.Activity#getVictims <em>Victims</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Victims</em>'.
	 * @see cyberPhysical_Incident.Activity#getVictims()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Victims();

	/**
	 * Returns the meta object for the reference list '{@link cyberPhysical_Incident.Activity#getTargetedAssets <em>Targeted Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Targeted Assets</em>'.
	 * @see cyberPhysical_Incident.Activity#getTargetedAssets()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_TargetedAssets();

	/**
	 * Returns the meta object for the attribute '{@link cyberPhysical_Incident.Activity#getEndTime <em>End Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Time</em>'.
	 * @see cyberPhysical_Incident.Activity#getEndTime()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_EndTime();

	/**
	 * Returns the meta object for the reference list '{@link cyberPhysical_Incident.Activity#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resources</em>'.
	 * @see cyberPhysical_Incident.Activity#getResources()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Resources();

	/**
	 * Returns the meta object for the reference list '{@link cyberPhysical_Incident.Activity#getExploitedAssets <em>Exploited Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Exploited Assets</em>'.
	 * @see cyberPhysical_Incident.Activity#getExploitedAssets()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_ExploitedAssets();

	/**
	 * Returns the meta object for the attribute '{@link cyberPhysical_Incident.Activity#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see cyberPhysical_Incident.Activity#getType()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_Type();

	/**
	 * Returns the meta object for the attribute '{@link cyberPhysical_Incident.Activity#getBehaviourType <em>Behaviour Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Behaviour Type</em>'.
	 * @see cyberPhysical_Incident.Activity#getBehaviourType()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_BehaviourType();

	/**
	 * Returns the meta object for the containment reference '{@link cyberPhysical_Incident.Activity#getPrecondition <em>Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Precondition</em>'.
	 * @see cyberPhysical_Incident.Activity#getPrecondition()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Precondition();

	/**
	 * Returns the meta object for the reference '{@link cyberPhysical_Incident.Activity#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see cyberPhysical_Incident.Activity#getLocation()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Location();

	/**
	 * Returns the meta object for the attribute '{@link cyberPhysical_Incident.Activity#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see cyberPhysical_Incident.Activity#getDescription()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_Description();

	/**
	 * Returns the meta object for the attribute '{@link cyberPhysical_Incident.Activity#getSystemAction <em>System Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System Action</em>'.
	 * @see cyberPhysical_Incident.Activity#getSystemAction()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_SystemAction();

	/**
	 * Returns the meta object for the containment reference '{@link cyberPhysical_Incident.Activity#getPostcondition <em>Postcondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Postcondition</em>'.
	 * @see cyberPhysical_Incident.Activity#getPostcondition()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Postcondition();

	/**
	 * Returns the meta object for class '{@link cyberPhysical_Incident.CrimeScript <em>Crime Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Crime Script</em>'.
	 * @see cyberPhysical_Incident.CrimeScript
	 * @generated
	 */
	EClass getCrimeScript();

	/**
	 * Returns the meta object for the attribute '{@link cyberPhysical_Incident.CrimeScript#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see cyberPhysical_Incident.CrimeScript#getId()
	 * @see #getCrimeScript()
	 * @generated
	 */
	EAttribute getCrimeScript_Id();

	/**
	 * Returns the meta object for the attribute '{@link cyberPhysical_Incident.CrimeScript#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cyberPhysical_Incident.CrimeScript#getName()
	 * @see #getCrimeScript()
	 * @generated
	 */
	EAttribute getCrimeScript_Name();

	/**
	 * Returns the meta object for the attribute '{@link cyberPhysical_Incident.CrimeScript#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see cyberPhysical_Incident.CrimeScript#getDescription()
	 * @see #getCrimeScript()
	 * @generated
	 */
	EAttribute getCrimeScript_Description();

	/**
	 * Returns the meta object for the attribute '{@link cyberPhysical_Incident.CrimeScript#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see cyberPhysical_Incident.CrimeScript#getCategory()
	 * @see #getCrimeScript()
	 * @generated
	 */
	EAttribute getCrimeScript_Category();

	/**
	 * Returns the meta object for the reference list '{@link cyberPhysical_Incident.CrimeScript#getScenes <em>Scenes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Scenes</em>'.
	 * @see cyberPhysical_Incident.CrimeScript#getScenes()
	 * @see #getCrimeScript()
	 * @generated
	 */
	EReference getCrimeScript_Scenes();

	/**
	 * Returns the meta object for the containment reference '{@link cyberPhysical_Incident.CrimeScript#getIntent <em>Intent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Intent</em>'.
	 * @see cyberPhysical_Incident.CrimeScript#getIntent()
	 * @see #getCrimeScript()
	 * @generated
	 */
	EReference getCrimeScript_Intent();

	/**
	 * Returns the meta object for the containment reference list '{@link cyberPhysical_Incident.CrimeScript#getMotive <em>Motive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Motive</em>'.
	 * @see cyberPhysical_Incident.CrimeScript#getMotive()
	 * @see #getCrimeScript()
	 * @generated
	 */
	EReference getCrimeScript_Motive();

	/**
	 * Returns the meta object for the reference list '{@link cyberPhysical_Incident.CrimeScript#getGoals <em>Goals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Goals</em>'.
	 * @see cyberPhysical_Incident.CrimeScript#getGoals()
	 * @see #getCrimeScript()
	 * @generated
	 */
	EReference getCrimeScript_Goals();

	/**
	 * Returns the meta object for the reference list '{@link cyberPhysical_Incident.CrimeScript#getTargetedAssets <em>Targeted Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Targeted Assets</em>'.
	 * @see cyberPhysical_Incident.CrimeScript#getTargetedAssets()
	 * @see #getCrimeScript()
	 * @generated
	 */
	EReference getCrimeScript_TargetedAssets();

	/**
	 * Returns the meta object for the reference list '{@link cyberPhysical_Incident.CrimeScript#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resources</em>'.
	 * @see cyberPhysical_Incident.CrimeScript#getResources()
	 * @see #getCrimeScript()
	 * @generated
	 */
	EReference getCrimeScript_Resources();

	/**
	 * Returns the meta object for the reference '{@link cyberPhysical_Incident.CrimeScript#getMainLocation <em>Main Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Main Location</em>'.
	 * @see cyberPhysical_Incident.CrimeScript#getMainLocation()
	 * @see #getCrimeScript()
	 * @generated
	 */
	EReference getCrimeScript_MainLocation();

	/**
	 * Returns the meta object for the reference list '{@link cyberPhysical_Incident.CrimeScript#getVictims <em>Victims</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Victims</em>'.
	 * @see cyberPhysical_Incident.CrimeScript#getVictims()
	 * @see #getCrimeScript()
	 * @generated
	 */
	EReference getCrimeScript_Victims();

	/**
	 * Returns the meta object for the reference list '{@link cyberPhysical_Incident.CrimeScript#getOffenders <em>Offenders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Offenders</em>'.
	 * @see cyberPhysical_Incident.CrimeScript#getOffenders()
	 * @see #getCrimeScript()
	 * @generated
	 */
	EReference getCrimeScript_Offenders();

	/**
	 * Returns the meta object for the attribute '{@link cyberPhysical_Incident.CrimeScript#getHigherLevelScriptName <em>Higher Level Script Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Higher Level Script Name</em>'.
	 * @see cyberPhysical_Incident.CrimeScript#getHigherLevelScriptName()
	 * @see #getCrimeScript()
	 * @generated
	 */
	EAttribute getCrimeScript_HigherLevelScriptName();

	/**
	 * Returns the meta object for class '{@link cyberPhysical_Incident.Scene <em>Scene</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scene</em>'.
	 * @see cyberPhysical_Incident.Scene
	 * @generated
	 */
	EClass getScene();

	/**
	 * Returns the meta object for the attribute '{@link cyberPhysical_Incident.Scene#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cyberPhysical_Incident.Scene#getName()
	 * @see #getScene()
	 * @generated
	 */
	EAttribute getScene_Name();

	/**
	 * Returns the meta object for the reference list '{@link cyberPhysical_Incident.Scene#getNextScenes <em>Next Scenes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Next Scenes</em>'.
	 * @see cyberPhysical_Incident.Scene#getNextScenes()
	 * @see #getScene()
	 * @generated
	 */
	EReference getScene_NextScenes();

	/**
	 * Returns the meta object for the reference list '{@link cyberPhysical_Incident.Scene#getPreviousScenes <em>Previous Scenes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Previous Scenes</em>'.
	 * @see cyberPhysical_Incident.Scene#getPreviousScenes()
	 * @see #getScene()
	 * @generated
	 */
	EReference getScene_PreviousScenes();

	/**
	 * Returns the meta object for the attribute '{@link cyberPhysical_Incident.Scene#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see cyberPhysical_Incident.Scene#getDescription()
	 * @see #getScene()
	 * @generated
	 */
	EAttribute getScene_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link cyberPhysical_Incident.Scene#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activity</em>'.
	 * @see cyberPhysical_Incident.Scene#getActivity()
	 * @see #getScene()
	 * @generated
	 */
	EReference getScene_Activity();

	/**
	 * Returns the meta object for class '{@link cyberPhysical_Incident.Motive <em>Motive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Motive</em>'.
	 * @see cyberPhysical_Incident.Motive
	 * @generated
	 */
	EClass getMotive();

	/**
	 * Returns the meta object for the attribute '{@link cyberPhysical_Incident.Motive#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cyberPhysical_Incident.Motive#getName()
	 * @see #getMotive()
	 * @generated
	 */
	EAttribute getMotive_Name();

	/**
	 * Returns the meta object for the attribute '{@link cyberPhysical_Incident.Motive#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see cyberPhysical_Incident.Motive#getDescription()
	 * @see #getMotive()
	 * @generated
	 */
	EAttribute getMotive_Description();

	/**
	 * Returns the meta object for the attribute '{@link cyberPhysical_Incident.Motive#isPrimary <em>Primary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primary</em>'.
	 * @see cyberPhysical_Incident.Motive#isPrimary()
	 * @see #getMotive()
	 * @generated
	 */
	EAttribute getMotive_Primary();

	/**
	 * Returns the meta object for class '{@link cyberPhysical_Incident.Goal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Goal</em>'.
	 * @see cyberPhysical_Incident.Goal
	 * @generated
	 */
	EClass getGoal();

	/**
	 * Returns the meta object for the attribute '{@link cyberPhysical_Incident.Goal#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cyberPhysical_Incident.Goal#getName()
	 * @see #getGoal()
	 * @generated
	 */
	EAttribute getGoal_Name();

	/**
	 * Returns the meta object for the attribute '{@link cyberPhysical_Incident.Goal#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see cyberPhysical_Incident.Goal#getDescription()
	 * @see #getGoal()
	 * @generated
	 */
	EAttribute getGoal_Description();

	/**
	 * Returns the meta object for the reference list '{@link cyberPhysical_Incident.Goal#getActivities <em>Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activities</em>'.
	 * @see cyberPhysical_Incident.Goal#getActivities()
	 * @see #getGoal()
	 * @generated
	 */
	EReference getGoal_Activities();

	/**
	 * Returns the meta object for the containment reference list '{@link cyberPhysical_Incident.Goal#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>State</em>'.
	 * @see cyberPhysical_Incident.Goal#getState()
	 * @see #getGoal()
	 * @generated
	 */
	EReference getGoal_State();

	/**
	 * Returns the meta object for class '{@link cyberPhysical_Incident.Intent <em>Intent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intent</em>'.
	 * @see cyberPhysical_Incident.Intent
	 * @generated
	 */
	EClass getIntent();

	/**
	 * Returns the meta object for the attribute '{@link cyberPhysical_Incident.Intent#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see cyberPhysical_Incident.Intent#getDescription()
	 * @see #getIntent()
	 * @generated
	 */
	EAttribute getIntent_Description();

	/**
	 * Returns the meta object for the attribute '{@link cyberPhysical_Incident.Intent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cyberPhysical_Incident.Intent#getName()
	 * @see #getIntent()
	 * @generated
	 */
	EAttribute getIntent_Name();

	/**
	 * Returns the meta object for class '{@link cyberPhysical_Incident.Asset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asset</em>'.
	 * @see cyberPhysical_Incident.Asset
	 * @generated
	 */
	EClass getAsset();

	/**
	 * Returns the meta object for the attribute '{@link cyberPhysical_Incident.Asset#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see cyberPhysical_Incident.Asset#getDescription()
	 * @see #getAsset()
	 * @generated
	 */
	EAttribute getAsset_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link cyberPhysical_Incident.Asset#getVulnerability <em>Vulnerability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vulnerability</em>'.
	 * @see cyberPhysical_Incident.Asset#getVulnerability()
	 * @see #getAsset()
	 * @generated
	 */
	EReference getAsset_Vulnerability();

	/**
	 * Returns the meta object for the attribute '{@link cyberPhysical_Incident.Asset#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see cyberPhysical_Incident.Asset#getStatus()
	 * @see #getAsset()
	 * @generated
	 */
	EAttribute getAsset_Status();

	/**
	 * Returns the meta object for class '{@link cyberPhysical_Incident.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see cyberPhysical_Incident.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for the attribute '{@link cyberPhysical_Incident.Connection#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cyberPhysical_Incident.Connection#getName()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Name();

	/**
	 * Returns the meta object for the attribute list '{@link cyberPhysical_Incident.Connection#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Constraints</em>'.
	 * @see cyberPhysical_Incident.Connection#getConstraints()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Constraints();

	/**
	 * Returns the meta object for the reference '{@link cyberPhysical_Incident.Connection#getEntity1 <em>Entity1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity1</em>'.
	 * @see cyberPhysical_Incident.Connection#getEntity1()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Entity1();

	/**
	 * Returns the meta object for the reference '{@link cyberPhysical_Incident.Connection#getEntity2 <em>Entity2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity2</em>'.
	 * @see cyberPhysical_Incident.Connection#getEntity2()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Entity2();

	/**
	 * Returns the meta object for the attribute '{@link cyberPhysical_Incident.Connection#getConnectionProbability <em>Connection Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connection Probability</em>'.
	 * @see cyberPhysical_Incident.Connection#getConnectionProbability()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_ConnectionProbability();

	/**
	 * Returns the meta object for the containment reference '{@link cyberPhysical_Incident.Connection#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see cyberPhysical_Incident.Connection#getType()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Type();

	/**
	 * Returns the meta object for the attribute '{@link cyberPhysical_Incident.Connection#isBidirectional <em>Bidirectional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bidirectional</em>'.
	 * @see cyberPhysical_Incident.Connection#isBidirectional()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Bidirectional();

	/**
	 * Returns the meta object for the reference list '{@link cyberPhysical_Incident.Connection#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Properties</em>'.
	 * @see cyberPhysical_Incident.Connection#getProperties()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Properties();

	/**
	 * Returns the meta object for the reference list '{@link cyberPhysical_Incident.Connection#getVulnerabilities <em>Vulnerabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Vulnerabilities</em>'.
	 * @see cyberPhysical_Incident.Connection#getVulnerabilities()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Vulnerabilities();

	/**
	 * Returns the meta object for class '{@link cyberPhysical_Incident.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see cyberPhysical_Incident.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for the reference list '{@link cyberPhysical_Incident.Location#getConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connections</em>'.
	 * @see cyberPhysical_Incident.Location#getConnections()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_Connections();

	/**
	 * Returns the meta object for the reference '{@link cyberPhysical_Incident.Location#getParentEntity <em>Parent Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Entity</em>'.
	 * @see cyberPhysical_Incident.Location#getParentEntity()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_ParentEntity();

	/**
	 * Returns the meta object for the reference list '{@link cyberPhysical_Incident.Location#getContainedEntities <em>Contained Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contained Entities</em>'.
	 * @see cyberPhysical_Incident.Location#getContainedEntities()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_ContainedEntities();

	/**
	 * Returns the meta object for the attribute '{@link cyberPhysical_Incident.Location#getConnectionsKnowledge <em>Connections Knowledge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connections Knowledge</em>'.
	 * @see cyberPhysical_Incident.Location#getConnectionsKnowledge()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_ConnectionsKnowledge();

	/**
	 * Returns the meta object for the attribute '{@link cyberPhysical_Incident.Location#getContainedAssetsKnowledge <em>Contained Assets Knowledge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contained Assets Knowledge</em>'.
	 * @see cyberPhysical_Incident.Location#getContainedAssetsKnowledge()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_ContainedAssetsKnowledge();

	/**
	 * Returns the meta object for class '{@link cyberPhysical_Incident.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see cyberPhysical_Incident.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the attribute '{@link cyberPhysical_Incident.Resource#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see cyberPhysical_Incident.Resource#getDescription()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Description();

	/**
	 * Returns the meta object for class '{@link cyberPhysical_Incident.Path <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path</em>'.
	 * @see cyberPhysical_Incident.Path
	 * @generated
	 */
	EClass getPath();

	/**
	 * Returns the meta object for the attribute '{@link cyberPhysical_Incident.Path#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cyberPhysical_Incident.Path#getName()
	 * @see #getPath()
	 * @generated
	 */
	EAttribute getPath_Name();

	/**
	 * Returns the meta object for the reference list '{@link cyberPhysical_Incident.Path#getActivities <em>Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activities</em>'.
	 * @see cyberPhysical_Incident.Path#getActivities()
	 * @see #getPath()
	 * @generated
	 */
	EReference getPath_Activities();

	/**
	 * Returns the meta object for class '{@link cyberPhysical_Incident.ActivityInitiator <em>Activity Initiator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Initiator</em>'.
	 * @see cyberPhysical_Incident.ActivityInitiator
	 * @generated
	 */
	EClass getActivityInitiator();

	/**
	 * Returns the meta object for class '{@link cyberPhysical_Incident.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor</em>'.
	 * @see cyberPhysical_Incident.Actor
	 * @generated
	 */
	EClass getActor();

	/**
	 * Returns the meta object for the attribute '{@link cyberPhysical_Incident.Actor#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see cyberPhysical_Incident.Actor#getRole()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_Role();

	/**
	 * Returns the meta object for the attribute '{@link cyberPhysical_Incident.Actor#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see cyberPhysical_Incident.Actor#getLevel()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_Level();

	/**
	 * Returns the meta object for class '{@link cyberPhysical_Incident.IncidentDiagram <em>Incident Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Incident Diagram</em>'.
	 * @see cyberPhysical_Incident.IncidentDiagram
	 * @generated
	 */
	EClass getIncidentDiagram();

	/**
	 * Returns the meta object for the containment reference '{@link cyberPhysical_Incident.IncidentDiagram#getCrimeScript <em>Crime Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Crime Script</em>'.
	 * @see cyberPhysical_Incident.IncidentDiagram#getCrimeScript()
	 * @see #getIncidentDiagram()
	 * @generated
	 */
	EReference getIncidentDiagram_CrimeScript();

	/**
	 * Returns the meta object for the containment reference list '{@link cyberPhysical_Incident.IncidentDiagram#getScene <em>Scene</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scene</em>'.
	 * @see cyberPhysical_Incident.IncidentDiagram#getScene()
	 * @see #getIncidentDiagram()
	 * @generated
	 */
	EReference getIncidentDiagram_Scene();

	/**
	 * Returns the meta object for the containment reference '{@link cyberPhysical_Incident.IncidentDiagram#getIntent <em>Intent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Intent</em>'.
	 * @see cyberPhysical_Incident.IncidentDiagram#getIntent()
	 * @see #getIncidentDiagram()
	 * @generated
	 */
	EReference getIncidentDiagram_Intent();

	/**
	 * Returns the meta object for the containment reference list '{@link cyberPhysical_Incident.IncidentDiagram#getGoal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Goal</em>'.
	 * @see cyberPhysical_Incident.IncidentDiagram#getGoal()
	 * @see #getIncidentDiagram()
	 * @generated
	 */
	EReference getIncidentDiagram_Goal();

	/**
	 * Returns the meta object for the containment reference list '{@link cyberPhysical_Incident.IncidentDiagram#getMotive <em>Motive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Motive</em>'.
	 * @see cyberPhysical_Incident.IncidentDiagram#getMotive()
	 * @see #getIncidentDiagram()
	 * @generated
	 */
	EReference getIncidentDiagram_Motive();

	/**
	 * Returns the meta object for the containment reference list '{@link cyberPhysical_Incident.IncidentDiagram#getAsset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Asset</em>'.
	 * @see cyberPhysical_Incident.IncidentDiagram#getAsset()
	 * @see #getIncidentDiagram()
	 * @generated
	 */
	EReference getIncidentDiagram_Asset();

	/**
	 * Returns the meta object for the containment reference list '{@link cyberPhysical_Incident.IncidentDiagram#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource</em>'.
	 * @see cyberPhysical_Incident.IncidentDiagram#getResource()
	 * @see #getIncidentDiagram()
	 * @generated
	 */
	EReference getIncidentDiagram_Resource();

	/**
	 * Returns the meta object for the containment reference list '{@link cyberPhysical_Incident.IncidentDiagram#getActor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actor</em>'.
	 * @see cyberPhysical_Incident.IncidentDiagram#getActor()
	 * @see #getIncidentDiagram()
	 * @generated
	 */
	EReference getIncidentDiagram_Actor();

	/**
	 * Returns the meta object for the containment reference list '{@link cyberPhysical_Incident.IncidentDiagram#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connection</em>'.
	 * @see cyberPhysical_Incident.IncidentDiagram#getConnection()
	 * @see #getIncidentDiagram()
	 * @generated
	 */
	EReference getIncidentDiagram_Connection();

	/**
	 * Returns the meta object for the containment reference list '{@link cyberPhysical_Incident.IncidentDiagram#getPaths <em>Paths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Paths</em>'.
	 * @see cyberPhysical_Incident.IncidentDiagram#getPaths()
	 * @see #getIncidentDiagram()
	 * @generated
	 */
	EReference getIncidentDiagram_Paths();

	/**
	 * Returns the meta object for class '{@link cyberPhysical_Incident.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see cyberPhysical_Incident.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link cyberPhysical_Incident.Property#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cyberPhysical_Incident.Property#getName()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Name();

	/**
	 * Returns the meta object for the attribute '{@link cyberPhysical_Incident.Property#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see cyberPhysical_Incident.Property#getValue()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Value();

	/**
	 * Returns the meta object for class '{@link cyberPhysical_Incident.Vulnerability <em>Vulnerability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vulnerability</em>'.
	 * @see cyberPhysical_Incident.Vulnerability
	 * @generated
	 */
	EClass getVulnerability();

	/**
	 * Returns the meta object for the attribute '{@link cyberPhysical_Incident.Vulnerability#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cyberPhysical_Incident.Vulnerability#getName()
	 * @see #getVulnerability()
	 * @generated
	 */
	EAttribute getVulnerability_Name();

	/**
	 * Returns the meta object for the attribute '{@link cyberPhysical_Incident.Vulnerability#getURL <em>URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>URL</em>'.
	 * @see cyberPhysical_Incident.Vulnerability#getURL()
	 * @see #getVulnerability()
	 * @generated
	 */
	EAttribute getVulnerability_URL();

	/**
	 * Returns the meta object for the attribute '{@link cyberPhysical_Incident.Vulnerability#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see cyberPhysical_Incident.Vulnerability#getDescription()
	 * @see #getVulnerability()
	 * @generated
	 */
	EAttribute getVulnerability_Description();

	/**
	 * Returns the meta object for the attribute '{@link cyberPhysical_Incident.Vulnerability#getSeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Severity</em>'.
	 * @see cyberPhysical_Incident.Vulnerability#getSeverity()
	 * @see #getVulnerability()
	 * @generated
	 */
	EAttribute getVulnerability_Severity();

	/**
	 * Returns the meta object for class '{@link cyberPhysical_Incident.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see cyberPhysical_Incident.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for the attribute '{@link cyberPhysical_Incident.Type#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cyberPhysical_Incident.Type#getName()
	 * @see #getType()
	 * @generated
	 */
	EAttribute getType_Name();

	/**
	 * Returns the meta object for the attribute '{@link cyberPhysical_Incident.Type#isHasSuperType <em>Has Super Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Super Type</em>'.
	 * @see cyberPhysical_Incident.Type#isHasSuperType()
	 * @see #getType()
	 * @generated
	 */
	EAttribute getType_HasSuperType();

	/**
	 * Returns the meta object for the containment reference list '{@link cyberPhysical_Incident.Type#getSuperType <em>Super Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Super Type</em>'.
	 * @see cyberPhysical_Incident.Type#getSuperType()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_SuperType();

	/**
	 * Returns the meta object for class '{@link cyberPhysical_Incident.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see cyberPhysical_Incident.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link cyberPhysical_Incident.UnaryExpression <em>Unary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Expression</em>'.
	 * @see cyberPhysical_Incident.UnaryExpression
	 * @generated
	 */
	EClass getUnaryExpression();

	/**
	 * Returns the meta object for the containment reference '{@link cyberPhysical_Incident.UnaryExpression#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operand</em>'.
	 * @see cyberPhysical_Incident.UnaryExpression#getOperand()
	 * @see #getUnaryExpression()
	 * @generated
	 */
	EReference getUnaryExpression_Operand();

	/**
	 * Returns the meta object for class '{@link cyberPhysical_Incident.BinaryExpression <em>Binary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Expression</em>'.
	 * @see cyberPhysical_Incident.BinaryExpression
	 * @generated
	 */
	EClass getBinaryExpression();

	/**
	 * Returns the meta object for the containment reference '{@link cyberPhysical_Incident.BinaryExpression#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see cyberPhysical_Incident.BinaryExpression#getLeft()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EReference getBinaryExpression_Left();

	/**
	 * Returns the meta object for the containment reference '{@link cyberPhysical_Incident.BinaryExpression#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see cyberPhysical_Incident.BinaryExpression#getRight()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EReference getBinaryExpression_Right();

	/**
	 * Returns the meta object for class '{@link cyberPhysical_Incident.Contains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contains</em>'.
	 * @see cyberPhysical_Incident.Contains
	 * @generated
	 */
	EClass getContains();

	/**
	 * Returns the meta object for class '{@link cyberPhysical_Incident.ConnectedTo <em>Connected To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connected To</em>'.
	 * @see cyberPhysical_Incident.ConnectedTo
	 * @generated
	 */
	EClass getConnectedTo();

	/**
	 * Returns the meta object for class '{@link cyberPhysical_Incident.Not <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not</em>'.
	 * @see cyberPhysical_Incident.Not
	 * @generated
	 */
	EClass getNot();

	/**
	 * Returns the meta object for class '{@link cyberPhysical_Incident.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see cyberPhysical_Incident.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the attribute '{@link cyberPhysical_Incident.Entity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cyberPhysical_Incident.Entity#getName()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link cyberPhysical_Incident.Entity#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entity</em>'.
	 * @see cyberPhysical_Incident.Entity#getEntity()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Entity();

	/**
	 * Returns the meta object for the containment reference list '{@link cyberPhysical_Incident.Entity#getConnectivity <em>Connectivity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connectivity</em>'.
	 * @see cyberPhysical_Incident.Entity#getConnectivity()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Connectivity();

	/**
	 * Returns the meta object for the containment reference '{@link cyberPhysical_Incident.Entity#getSite <em>Site</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Site</em>'.
	 * @see cyberPhysical_Incident.Entity#getSite()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Site();

	/**
	 * Returns the meta object for class '{@link cyberPhysical_Incident.Precondition <em>Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Precondition</em>'.
	 * @see cyberPhysical_Incident.Precondition
	 * @generated
	 */
	EClass getPrecondition();

	/**
	 * Returns the meta object for class '{@link cyberPhysical_Incident.TopologicalRelation <em>Topological Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Topological Relation</em>'.
	 * @see cyberPhysical_Incident.TopologicalRelation
	 * @generated
	 */
	EClass getTopologicalRelation();

	/**
	 * Returns the meta object for class '{@link cyberPhysical_Incident.Equal <em>Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equal</em>'.
	 * @see cyberPhysical_Incident.Equal
	 * @generated
	 */
	EClass getEqual();

	/**
	 * Returns the meta object for class '{@link cyberPhysical_Incident.Greater <em>Greater</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Greater</em>'.
	 * @see cyberPhysical_Incident.Greater
	 * @generated
	 */
	EClass getGreater();

	/**
	 * Returns the meta object for class '{@link cyberPhysical_Incident.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And</em>'.
	 * @see cyberPhysical_Incident.And
	 * @generated
	 */
	EClass getAnd();

	/**
	 * Returns the meta object for class '{@link cyberPhysical_Incident.BigraphExpression <em>Bigraph Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bigraph Expression</em>'.
	 * @see cyberPhysical_Incident.BigraphExpression
	 * @generated
	 */
	EClass getBigraphExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link cyberPhysical_Incident.BigraphExpression#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entity</em>'.
	 * @see cyberPhysical_Incident.BigraphExpression#getEntity()
	 * @see #getBigraphExpression()
	 * @generated
	 */
	EReference getBigraphExpression_Entity();

	/**
	 * Returns the meta object for the containment reference list '{@link cyberPhysical_Incident.BigraphExpression#getInnername <em>Innername</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Innername</em>'.
	 * @see cyberPhysical_Incident.BigraphExpression#getInnername()
	 * @see #getBigraphExpression()
	 * @generated
	 */
	EReference getBigraphExpression_Innername();

	/**
	 * Returns the meta object for class '{@link cyberPhysical_Incident.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or</em>'.
	 * @see cyberPhysical_Incident.Or
	 * @generated
	 */
	EClass getOr();

	/**
	 * Returns the meta object for class '{@link cyberPhysical_Incident.ReachableFrom <em>Reachable From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reachable From</em>'.
	 * @see cyberPhysical_Incident.ReachableFrom
	 * @generated
	 */
	EClass getReachableFrom();

	/**
	 * Returns the meta object for class '{@link cyberPhysical_Incident.Near <em>Near</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Near</em>'.
	 * @see cyberPhysical_Incident.Near
	 * @generated
	 */
	EClass getNear();

	/**
	 * Returns the meta object for class '{@link cyberPhysical_Incident.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see cyberPhysical_Incident.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the attribute '{@link cyberPhysical_Incident.Condition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cyberPhysical_Incident.Condition#getName()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_Name();

	/**
	 * Returns the meta object for the containment reference '{@link cyberPhysical_Incident.Condition#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see cyberPhysical_Incident.Condition#getExpression()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_Expression();

	/**
	 * Returns the meta object for the reference list '{@link cyberPhysical_Incident.Condition#getAssoicatedConditions <em>Assoicated Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assoicated Conditions</em>'.
	 * @see cyberPhysical_Incident.Condition#getAssoicatedConditions()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_AssoicatedConditions();

	/**
	 * Returns the meta object for the attribute '{@link cyberPhysical_Incident.Condition#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see cyberPhysical_Incident.Condition#getDescription()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_Description();

	/**
	 * Returns the meta object for class '{@link cyberPhysical_Incident.Postcondition <em>Postcondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postcondition</em>'.
	 * @see cyberPhysical_Incident.Postcondition
	 * @generated
	 */
	EClass getPostcondition();

	/**
	 * Returns the meta object for class '{@link cyberPhysical_Incident.FacilitatingCondition <em>Facilitating Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facilitating Condition</em>'.
	 * @see cyberPhysical_Incident.FacilitatingCondition
	 * @generated
	 */
	EClass getFacilitatingCondition();

	/**
	 * Returns the meta object for class '{@link cyberPhysical_Incident.IncidentEntity <em>Incident Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Incident Entity</em>'.
	 * @see cyberPhysical_Incident.IncidentEntity
	 * @generated
	 */
	EClass getIncidentEntity();

	/**
	 * Returns the meta object for the attribute '{@link cyberPhysical_Incident.IncidentEntity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cyberPhysical_Incident.IncidentEntity#getName()
	 * @see #getIncidentEntity()
	 * @generated
	 */
	EAttribute getIncidentEntity_Name();

	/**
	 * Returns the meta object for the reference list '{@link cyberPhysical_Incident.IncidentEntity#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Properties</em>'.
	 * @see cyberPhysical_Incident.IncidentEntity#getProperties()
	 * @see #getIncidentEntity()
	 * @generated
	 */
	EReference getIncidentEntity_Properties();

	/**
	 * Returns the meta object for the containment reference '{@link cyberPhysical_Incident.IncidentEntity#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see cyberPhysical_Incident.IncidentEntity#getType()
	 * @see #getIncidentEntity()
	 * @generated
	 */
	EReference getIncidentEntity_Type();

	/**
	 * Returns the meta object for the attribute '{@link cyberPhysical_Incident.IncidentEntity#getMobility <em>Mobility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mobility</em>'.
	 * @see cyberPhysical_Incident.IncidentEntity#getMobility()
	 * @see #getIncidentEntity()
	 * @generated
	 */
	EAttribute getIncidentEntity_Mobility();

	/**
	 * Returns the meta object for class '{@link cyberPhysical_Incident.Connectivity <em>Connectivity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connectivity</em>'.
	 * @see cyberPhysical_Incident.Connectivity
	 * @generated
	 */
	EClass getConnectivity();

	/**
	 * Returns the meta object for the attribute '{@link cyberPhysical_Incident.Connectivity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cyberPhysical_Incident.Connectivity#getName()
	 * @see #getConnectivity()
	 * @generated
	 */
	EAttribute getConnectivity_Name();

	/**
	 * Returns the meta object for the attribute '{@link cyberPhysical_Incident.Connectivity#isIsClosed <em>Is Closed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Closed</em>'.
	 * @see cyberPhysical_Incident.Connectivity#isIsClosed()
	 * @see #getConnectivity()
	 * @generated
	 */
	EAttribute getConnectivity_IsClosed();

	/**
	 * Returns the meta object for class '{@link cyberPhysical_Incident.InnerName <em>Inner Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inner Name</em>'.
	 * @see cyberPhysical_Incident.InnerName
	 * @generated
	 */
	EClass getInnerName();

	/**
	 * Returns the meta object for the attribute '{@link cyberPhysical_Incident.InnerName#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cyberPhysical_Incident.InnerName#getName()
	 * @see #getInnerName()
	 * @generated
	 */
	EAttribute getInnerName_Name();

	/**
	 * Returns the meta object for the attribute '{@link cyberPhysical_Incident.InnerName#isIsClosed <em>Is Closed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Closed</em>'.
	 * @see cyberPhysical_Incident.InnerName#isIsClosed()
	 * @see #getInnerName()
	 * @generated
	 */
	EAttribute getInnerName_IsClosed();

	/**
	 * Returns the meta object for the reference '{@link cyberPhysical_Incident.InnerName#getOutername <em>Outername</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Outername</em>'.
	 * @see cyberPhysical_Incident.InnerName#getOutername()
	 * @see #getInnerName()
	 * @generated
	 */
	EReference getInnerName_Outername();

	/**
	 * Returns the meta object for class '{@link cyberPhysical_Incident.Site <em>Site</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Site</em>'.
	 * @see cyberPhysical_Incident.Site
	 * @generated
	 */
	EClass getSite();

	/**
	 * Returns the meta object for the attribute '{@link cyberPhysical_Incident.Site#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cyberPhysical_Incident.Site#getName()
	 * @see #getSite()
	 * @generated
	 */
	EAttribute getSite_Name();

	/**
	 * Returns the meta object for the attribute '{@link cyberPhysical_Incident.Site#isIsClosed <em>Is Closed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Closed</em>'.
	 * @see cyberPhysical_Incident.Site#isIsClosed()
	 * @see #getSite()
	 * @generated
	 */
	EAttribute getSite_IsClosed();

	/**
	 * Returns the meta object for class '{@link cyberPhysical_Incident.ActivityPattern <em>Activity Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Pattern</em>'.
	 * @see cyberPhysical_Incident.ActivityPattern
	 * @generated
	 */
	EClass getActivityPattern();

	/**
	 * Returns the meta object for the attribute '{@link cyberPhysical_Incident.ActivityPattern#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cyberPhysical_Incident.ActivityPattern#getName()
	 * @see #getActivityPattern()
	 * @generated
	 */
	EAttribute getActivityPattern_Name();

	/**
	 * Returns the meta object for the attribute '{@link cyberPhysical_Incident.ActivityPattern#getSeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Severity</em>'.
	 * @see cyberPhysical_Incident.ActivityPattern#getSeverity()
	 * @see #getActivityPattern()
	 * @generated
	 */
	EAttribute getActivityPattern_Severity();

	/**
	 * Returns the meta object for the attribute '{@link cyberPhysical_Incident.ActivityPattern#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see cyberPhysical_Incident.ActivityPattern#getDescription()
	 * @see #getActivityPattern()
	 * @generated
	 */
	EAttribute getActivityPattern_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link cyberPhysical_Incident.ActivityPattern#getIncidententity <em>Incidententity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Incidententity</em>'.
	 * @see cyberPhysical_Incident.ActivityPattern#getIncidententity()
	 * @see #getActivityPattern()
	 * @generated
	 */
	EReference getActivityPattern_Incidententity();

	/**
	 * Returns the meta object for the containment reference list '{@link cyberPhysical_Incident.ActivityPattern#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connection</em>'.
	 * @see cyberPhysical_Incident.ActivityPattern#getConnection()
	 * @see #getActivityPattern()
	 * @generated
	 */
	EReference getActivityPattern_Connection();

	/**
	 * Returns the meta object for the reference list '{@link cyberPhysical_Incident.ActivityPattern#getPatternsFollow <em>Patterns Follow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Patterns Follow</em>'.
	 * @see cyberPhysical_Incident.ActivityPattern#getPatternsFollow()
	 * @see #getActivityPattern()
	 * @generated
	 */
	EReference getActivityPattern_PatternsFollow();

	/**
	 * Returns the meta object for the attribute '{@link cyberPhysical_Incident.ActivityPattern#getSkillsRequired <em>Skills Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Skills Required</em>'.
	 * @see cyberPhysical_Incident.ActivityPattern#getSkillsRequired()
	 * @see #getActivityPattern()
	 * @generated
	 */
	EAttribute getActivityPattern_SkillsRequired();

	/**
	 * Returns the meta object for the containment reference list '{@link cyberPhysical_Incident.ActivityPattern#getAbstractActivity <em>Abstract Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Activity</em>'.
	 * @see cyberPhysical_Incident.ActivityPattern#getAbstractActivity()
	 * @see #getActivityPattern()
	 * @generated
	 */
	EReference getActivityPattern_AbstractActivity();

	/**
	 * Returns the meta object for enum '{@link cyberPhysical_Incident.Level <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Level</em>'.
	 * @see cyberPhysical_Incident.Level
	 * @generated
	 */
	EEnum getLevel();

	/**
	 * Returns the meta object for enum '{@link cyberPhysical_Incident.ActivityType <em>Activity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Activity Type</em>'.
	 * @see cyberPhysical_Incident.ActivityType
	 * @generated
	 */
	EEnum getActivityType();

	/**
	 * Returns the meta object for enum '{@link cyberPhysical_Incident.Behaviour <em>Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Behaviour</em>'.
	 * @see cyberPhysical_Incident.Behaviour
	 * @generated
	 */
	EEnum getBehaviour();

	/**
	 * Returns the meta object for enum '{@link cyberPhysical_Incident.Knowledge <em>Knowledge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Knowledge</em>'.
	 * @see cyberPhysical_Incident.Knowledge
	 * @generated
	 */
	EEnum getKnowledge();

	/**
	 * Returns the meta object for enum '{@link cyberPhysical_Incident.ScriptCategory <em>Script Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Script Category</em>'.
	 * @see cyberPhysical_Incident.ScriptCategory
	 * @generated
	 */
	EEnum getScriptCategory();

	/**
	 * Returns the meta object for enum '{@link cyberPhysical_Incident.ActorRole <em>Actor Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Actor Role</em>'.
	 * @see cyberPhysical_Incident.ActorRole
	 * @generated
	 */
	EEnum getActorRole();

	/**
	 * Returns the meta object for enum '{@link cyberPhysical_Incident.ActorLevel <em>Actor Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Actor Level</em>'.
	 * @see cyberPhysical_Incident.ActorLevel
	 * @generated
	 */
	EEnum getActorLevel();

	/**
	 * Returns the meta object for enum '{@link cyberPhysical_Incident.ActivityPatternSeverity <em>Activity Pattern Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Activity Pattern Severity</em>'.
	 * @see cyberPhysical_Incident.ActivityPatternSeverity
	 * @generated
	 */
	EEnum getActivityPatternSeverity();

	/**
	 * Returns the meta object for enum '{@link cyberPhysical_Incident.Skill_Level <em>Skill Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Skill Level</em>'.
	 * @see cyberPhysical_Incident.Skill_Level
	 * @generated
	 */
	EEnum getSkill_Level();

	/**
	 * Returns the meta object for enum '{@link cyberPhysical_Incident.Mobility <em>Mobility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mobility</em>'.
	 * @see cyberPhysical_Incident.Mobility
	 * @generated
	 */
	EEnum getMobility();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CyberPhysicalIncidentFactory getCyberPhysicalIncidentFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link cyberPhysical_Incident.impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cyberPhysical_Incident.impl.ActivityImpl
		 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getActivity()
		 * @generated
		 */
		EClass ACTIVITY = eINSTANCE.getActivity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__NAME = eINSTANCE.getActivity_Name();

		/**
		 * The meta object literal for the '<em><b>Facilitating Conditions</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__FACILITATING_CONDITIONS = eINSTANCE.getActivity_FacilitatingConditions();

		/**
		 * The meta object literal for the '<em><b>Certainty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__CERTAINTY = eINSTANCE.getActivity_Certainty();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__DURATION = eINSTANCE.getActivity_Duration();

		/**
		 * The meta object literal for the '<em><b>Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__START_TIME = eINSTANCE.getActivity_StartTime();

		/**
		 * The meta object literal for the '<em><b>Next Activities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__NEXT_ACTIVITIES = eINSTANCE.getActivity_NextActivities();

		/**
		 * The meta object literal for the '<em><b>Previous Activities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__PREVIOUS_ACTIVITIES = eINSTANCE.getActivity_PreviousActivities();

		/**
		 * The meta object literal for the '<em><b>Paths</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__PATHS = eINSTANCE.getActivity_Paths();

		/**
		 * The meta object literal for the '<em><b>Goals</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__GOALS = eINSTANCE.getActivity_Goals();

		/**
		 * The meta object literal for the '<em><b>Initiator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__INITIATOR = eINSTANCE.getActivity_Initiator();

		/**
		 * The meta object literal for the '<em><b>Accomplices</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__ACCOMPLICES = eINSTANCE.getActivity_Accomplices();

		/**
		 * The meta object literal for the '<em><b>Victims</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__VICTIMS = eINSTANCE.getActivity_Victims();

		/**
		 * The meta object literal for the '<em><b>Targeted Assets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__TARGETED_ASSETS = eINSTANCE.getActivity_TargetedAssets();

		/**
		 * The meta object literal for the '<em><b>End Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__END_TIME = eINSTANCE.getActivity_EndTime();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__RESOURCES = eINSTANCE.getActivity_Resources();

		/**
		 * The meta object literal for the '<em><b>Exploited Assets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__EXPLOITED_ASSETS = eINSTANCE.getActivity_ExploitedAssets();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__TYPE = eINSTANCE.getActivity_Type();

		/**
		 * The meta object literal for the '<em><b>Behaviour Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__BEHAVIOUR_TYPE = eINSTANCE.getActivity_BehaviourType();

		/**
		 * The meta object literal for the '<em><b>Precondition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__PRECONDITION = eINSTANCE.getActivity_Precondition();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__LOCATION = eINSTANCE.getActivity_Location();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__DESCRIPTION = eINSTANCE.getActivity_Description();

		/**
		 * The meta object literal for the '<em><b>System Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__SYSTEM_ACTION = eINSTANCE.getActivity_SystemAction();

		/**
		 * The meta object literal for the '<em><b>Postcondition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__POSTCONDITION = eINSTANCE.getActivity_Postcondition();

		/**
		 * The meta object literal for the '{@link cyberPhysical_Incident.impl.CrimeScriptImpl <em>Crime Script</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cyberPhysical_Incident.impl.CrimeScriptImpl
		 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getCrimeScript()
		 * @generated
		 */
		EClass CRIME_SCRIPT = eINSTANCE.getCrimeScript();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRIME_SCRIPT__ID = eINSTANCE.getCrimeScript_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRIME_SCRIPT__NAME = eINSTANCE.getCrimeScript_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRIME_SCRIPT__DESCRIPTION = eINSTANCE.getCrimeScript_Description();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRIME_SCRIPT__CATEGORY = eINSTANCE.getCrimeScript_Category();

		/**
		 * The meta object literal for the '<em><b>Scenes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRIME_SCRIPT__SCENES = eINSTANCE.getCrimeScript_Scenes();

		/**
		 * The meta object literal for the '<em><b>Intent</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRIME_SCRIPT__INTENT = eINSTANCE.getCrimeScript_Intent();

		/**
		 * The meta object literal for the '<em><b>Motive</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRIME_SCRIPT__MOTIVE = eINSTANCE.getCrimeScript_Motive();

		/**
		 * The meta object literal for the '<em><b>Goals</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRIME_SCRIPT__GOALS = eINSTANCE.getCrimeScript_Goals();

		/**
		 * The meta object literal for the '<em><b>Targeted Assets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRIME_SCRIPT__TARGETED_ASSETS = eINSTANCE.getCrimeScript_TargetedAssets();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRIME_SCRIPT__RESOURCES = eINSTANCE.getCrimeScript_Resources();

		/**
		 * The meta object literal for the '<em><b>Main Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRIME_SCRIPT__MAIN_LOCATION = eINSTANCE.getCrimeScript_MainLocation();

		/**
		 * The meta object literal for the '<em><b>Victims</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRIME_SCRIPT__VICTIMS = eINSTANCE.getCrimeScript_Victims();

		/**
		 * The meta object literal for the '<em><b>Offenders</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRIME_SCRIPT__OFFENDERS = eINSTANCE.getCrimeScript_Offenders();

		/**
		 * The meta object literal for the '<em><b>Higher Level Script Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRIME_SCRIPT__HIGHER_LEVEL_SCRIPT_NAME = eINSTANCE.getCrimeScript_HigherLevelScriptName();

		/**
		 * The meta object literal for the '{@link cyberPhysical_Incident.impl.SceneImpl <em>Scene</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cyberPhysical_Incident.impl.SceneImpl
		 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getScene()
		 * @generated
		 */
		EClass SCENE = eINSTANCE.getScene();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENE__NAME = eINSTANCE.getScene_Name();

		/**
		 * The meta object literal for the '<em><b>Next Scenes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENE__NEXT_SCENES = eINSTANCE.getScene_NextScenes();

		/**
		 * The meta object literal for the '<em><b>Previous Scenes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENE__PREVIOUS_SCENES = eINSTANCE.getScene_PreviousScenes();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENE__DESCRIPTION = eINSTANCE.getScene_Description();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENE__ACTIVITY = eINSTANCE.getScene_Activity();

		/**
		 * The meta object literal for the '{@link cyberPhysical_Incident.impl.MotiveImpl <em>Motive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cyberPhysical_Incident.impl.MotiveImpl
		 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getMotive()
		 * @generated
		 */
		EClass MOTIVE = eINSTANCE.getMotive();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOTIVE__NAME = eINSTANCE.getMotive_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOTIVE__DESCRIPTION = eINSTANCE.getMotive_Description();

		/**
		 * The meta object literal for the '<em><b>Primary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOTIVE__PRIMARY = eINSTANCE.getMotive_Primary();

		/**
		 * The meta object literal for the '{@link cyberPhysical_Incident.impl.GoalImpl <em>Goal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cyberPhysical_Incident.impl.GoalImpl
		 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getGoal()
		 * @generated
		 */
		EClass GOAL = eINSTANCE.getGoal();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOAL__NAME = eINSTANCE.getGoal_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOAL__DESCRIPTION = eINSTANCE.getGoal_Description();

		/**
		 * The meta object literal for the '<em><b>Activities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL__ACTIVITIES = eINSTANCE.getGoal_Activities();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL__STATE = eINSTANCE.getGoal_State();

		/**
		 * The meta object literal for the '{@link cyberPhysical_Incident.impl.IntentImpl <em>Intent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cyberPhysical_Incident.impl.IntentImpl
		 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getIntent()
		 * @generated
		 */
		EClass INTENT = eINSTANCE.getIntent();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTENT__DESCRIPTION = eINSTANCE.getIntent_Description();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTENT__NAME = eINSTANCE.getIntent_Name();

		/**
		 * The meta object literal for the '{@link cyberPhysical_Incident.impl.AssetImpl <em>Asset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cyberPhysical_Incident.impl.AssetImpl
		 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getAsset()
		 * @generated
		 */
		EClass ASSET = eINSTANCE.getAsset();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET__DESCRIPTION = eINSTANCE.getAsset_Description();

		/**
		 * The meta object literal for the '<em><b>Vulnerability</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET__VULNERABILITY = eINSTANCE.getAsset_Vulnerability();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET__STATUS = eINSTANCE.getAsset_Status();

		/**
		 * The meta object literal for the '{@link cyberPhysical_Incident.impl.ConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cyberPhysical_Incident.impl.ConnectionImpl
		 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getConnection()
		 * @generated
		 */
		EClass CONNECTION = eINSTANCE.getConnection();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__NAME = eINSTANCE.getConnection_Name();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__CONSTRAINTS = eINSTANCE.getConnection_Constraints();

		/**
		 * The meta object literal for the '<em><b>Entity1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__ENTITY1 = eINSTANCE.getConnection_Entity1();

		/**
		 * The meta object literal for the '<em><b>Entity2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__ENTITY2 = eINSTANCE.getConnection_Entity2();

		/**
		 * The meta object literal for the '<em><b>Connection Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__CONNECTION_PROBABILITY = eINSTANCE.getConnection_ConnectionProbability();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__TYPE = eINSTANCE.getConnection_Type();

		/**
		 * The meta object literal for the '<em><b>Bidirectional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__BIDIRECTIONAL = eINSTANCE.getConnection_Bidirectional();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__PROPERTIES = eINSTANCE.getConnection_Properties();

		/**
		 * The meta object literal for the '<em><b>Vulnerabilities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__VULNERABILITIES = eINSTANCE.getConnection_Vulnerabilities();

		/**
		 * The meta object literal for the '{@link cyberPhysical_Incident.Location <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cyberPhysical_Incident.Location
		 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '<em><b>Connections</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION__CONNECTIONS = eINSTANCE.getLocation_Connections();

		/**
		 * The meta object literal for the '<em><b>Parent Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION__PARENT_ENTITY = eINSTANCE.getLocation_ParentEntity();

		/**
		 * The meta object literal for the '<em><b>Contained Entities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION__CONTAINED_ENTITIES = eINSTANCE.getLocation_ContainedEntities();

		/**
		 * The meta object literal for the '<em><b>Connections Knowledge</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__CONNECTIONS_KNOWLEDGE = eINSTANCE.getLocation_ConnectionsKnowledge();

		/**
		 * The meta object literal for the '<em><b>Contained Assets Knowledge</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__CONTAINED_ASSETS_KNOWLEDGE = eINSTANCE.getLocation_ContainedAssetsKnowledge();

		/**
		 * The meta object literal for the '{@link cyberPhysical_Incident.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cyberPhysical_Incident.impl.ResourceImpl
		 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__DESCRIPTION = eINSTANCE.getResource_Description();

		/**
		 * The meta object literal for the '{@link cyberPhysical_Incident.impl.PathImpl <em>Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cyberPhysical_Incident.impl.PathImpl
		 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getPath()
		 * @generated
		 */
		EClass PATH = eINSTANCE.getPath();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATH__NAME = eINSTANCE.getPath_Name();

		/**
		 * The meta object literal for the '<em><b>Activities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH__ACTIVITIES = eINSTANCE.getPath_Activities();

		/**
		 * The meta object literal for the '{@link cyberPhysical_Incident.ActivityInitiator <em>Activity Initiator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cyberPhysical_Incident.ActivityInitiator
		 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getActivityInitiator()
		 * @generated
		 */
		EClass ACTIVITY_INITIATOR = eINSTANCE.getActivityInitiator();

		/**
		 * The meta object literal for the '{@link cyberPhysical_Incident.impl.ActorImpl <em>Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cyberPhysical_Incident.impl.ActorImpl
		 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getActor()
		 * @generated
		 */
		EClass ACTOR = eINSTANCE.getActor();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR__ROLE = eINSTANCE.getActor_Role();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR__LEVEL = eINSTANCE.getActor_Level();

		/**
		 * The meta object literal for the '{@link cyberPhysical_Incident.impl.IncidentDiagramImpl <em>Incident Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cyberPhysical_Incident.impl.IncidentDiagramImpl
		 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getIncidentDiagram()
		 * @generated
		 */
		EClass INCIDENT_DIAGRAM = eINSTANCE.getIncidentDiagram();

		/**
		 * The meta object literal for the '<em><b>Crime Script</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCIDENT_DIAGRAM__CRIME_SCRIPT = eINSTANCE.getIncidentDiagram_CrimeScript();

		/**
		 * The meta object literal for the '<em><b>Scene</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCIDENT_DIAGRAM__SCENE = eINSTANCE.getIncidentDiagram_Scene();

		/**
		 * The meta object literal for the '<em><b>Intent</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCIDENT_DIAGRAM__INTENT = eINSTANCE.getIncidentDiagram_Intent();

		/**
		 * The meta object literal for the '<em><b>Goal</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCIDENT_DIAGRAM__GOAL = eINSTANCE.getIncidentDiagram_Goal();

		/**
		 * The meta object literal for the '<em><b>Motive</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCIDENT_DIAGRAM__MOTIVE = eINSTANCE.getIncidentDiagram_Motive();

		/**
		 * The meta object literal for the '<em><b>Asset</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCIDENT_DIAGRAM__ASSET = eINSTANCE.getIncidentDiagram_Asset();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCIDENT_DIAGRAM__RESOURCE = eINSTANCE.getIncidentDiagram_Resource();

		/**
		 * The meta object literal for the '<em><b>Actor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCIDENT_DIAGRAM__ACTOR = eINSTANCE.getIncidentDiagram_Actor();

		/**
		 * The meta object literal for the '<em><b>Connection</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCIDENT_DIAGRAM__CONNECTION = eINSTANCE.getIncidentDiagram_Connection();

		/**
		 * The meta object literal for the '<em><b>Paths</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCIDENT_DIAGRAM__PATHS = eINSTANCE.getIncidentDiagram_Paths();

		/**
		 * The meta object literal for the '{@link cyberPhysical_Incident.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cyberPhysical_Incident.impl.PropertyImpl
		 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__VALUE = eINSTANCE.getProperty_Value();

		/**
		 * The meta object literal for the '{@link cyberPhysical_Incident.impl.VulnerabilityImpl <em>Vulnerability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cyberPhysical_Incident.impl.VulnerabilityImpl
		 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getVulnerability()
		 * @generated
		 */
		EClass VULNERABILITY = eINSTANCE.getVulnerability();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VULNERABILITY__NAME = eINSTANCE.getVulnerability_Name();

		/**
		 * The meta object literal for the '<em><b>URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VULNERABILITY__URL = eINSTANCE.getVulnerability_URL();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VULNERABILITY__DESCRIPTION = eINSTANCE.getVulnerability_Description();

		/**
		 * The meta object literal for the '<em><b>Severity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VULNERABILITY__SEVERITY = eINSTANCE.getVulnerability_Severity();

		/**
		 * The meta object literal for the '{@link cyberPhysical_Incident.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cyberPhysical_Incident.impl.TypeImpl
		 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE__NAME = eINSTANCE.getType_Name();

		/**
		 * The meta object literal for the '<em><b>Has Super Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE__HAS_SUPER_TYPE = eINSTANCE.getType_HasSuperType();

		/**
		 * The meta object literal for the '<em><b>Super Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE__SUPER_TYPE = eINSTANCE.getType_SuperType();

		/**
		 * The meta object literal for the '{@link cyberPhysical_Incident.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cyberPhysical_Incident.impl.ExpressionImpl
		 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link cyberPhysical_Incident.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cyberPhysical_Incident.impl.UnaryExpressionImpl
		 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getUnaryExpression()
		 * @generated
		 */
		EClass UNARY_EXPRESSION = eINSTANCE.getUnaryExpression();

		/**
		 * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARY_EXPRESSION__OPERAND = eINSTANCE.getUnaryExpression_Operand();

		/**
		 * The meta object literal for the '{@link cyberPhysical_Incident.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cyberPhysical_Incident.impl.BinaryExpressionImpl
		 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getBinaryExpression()
		 * @generated
		 */
		EClass BINARY_EXPRESSION = eINSTANCE.getBinaryExpression();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_EXPRESSION__LEFT = eINSTANCE.getBinaryExpression_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_EXPRESSION__RIGHT = eINSTANCE.getBinaryExpression_Right();

		/**
		 * The meta object literal for the '{@link cyberPhysical_Incident.impl.ContainsImpl <em>Contains</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cyberPhysical_Incident.impl.ContainsImpl
		 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getContains()
		 * @generated
		 */
		EClass CONTAINS = eINSTANCE.getContains();

		/**
		 * The meta object literal for the '{@link cyberPhysical_Incident.impl.ConnectedToImpl <em>Connected To</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cyberPhysical_Incident.impl.ConnectedToImpl
		 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getConnectedTo()
		 * @generated
		 */
		EClass CONNECTED_TO = eINSTANCE.getConnectedTo();

		/**
		 * The meta object literal for the '{@link cyberPhysical_Incident.impl.NotImpl <em>Not</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cyberPhysical_Incident.impl.NotImpl
		 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getNot()
		 * @generated
		 */
		EClass NOT = eINSTANCE.getNot();

		/**
		 * The meta object literal for the '{@link cyberPhysical_Incident.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cyberPhysical_Incident.impl.EntityImpl
		 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__NAME = eINSTANCE.getEntity_Name();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__ENTITY = eINSTANCE.getEntity_Entity();

		/**
		 * The meta object literal for the '<em><b>Connectivity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__CONNECTIVITY = eINSTANCE.getEntity_Connectivity();

		/**
		 * The meta object literal for the '<em><b>Site</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__SITE = eINSTANCE.getEntity_Site();

		/**
		 * The meta object literal for the '{@link cyberPhysical_Incident.impl.PreconditionImpl <em>Precondition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cyberPhysical_Incident.impl.PreconditionImpl
		 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getPrecondition()
		 * @generated
		 */
		EClass PRECONDITION = eINSTANCE.getPrecondition();

		/**
		 * The meta object literal for the '{@link cyberPhysical_Incident.impl.TopologicalRelationImpl <em>Topological Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cyberPhysical_Incident.impl.TopologicalRelationImpl
		 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getTopologicalRelation()
		 * @generated
		 */
		EClass TOPOLOGICAL_RELATION = eINSTANCE.getTopologicalRelation();

		/**
		 * The meta object literal for the '{@link cyberPhysical_Incident.impl.EqualImpl <em>Equal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cyberPhysical_Incident.impl.EqualImpl
		 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getEqual()
		 * @generated
		 */
		EClass EQUAL = eINSTANCE.getEqual();

		/**
		 * The meta object literal for the '{@link cyberPhysical_Incident.impl.GreaterImpl <em>Greater</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cyberPhysical_Incident.impl.GreaterImpl
		 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getGreater()
		 * @generated
		 */
		EClass GREATER = eINSTANCE.getGreater();

		/**
		 * The meta object literal for the '{@link cyberPhysical_Incident.impl.AndImpl <em>And</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cyberPhysical_Incident.impl.AndImpl
		 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getAnd()
		 * @generated
		 */
		EClass AND = eINSTANCE.getAnd();

		/**
		 * The meta object literal for the '{@link cyberPhysical_Incident.impl.BigraphExpressionImpl <em>Bigraph Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cyberPhysical_Incident.impl.BigraphExpressionImpl
		 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getBigraphExpression()
		 * @generated
		 */
		EClass BIGRAPH_EXPRESSION = eINSTANCE.getBigraphExpression();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIGRAPH_EXPRESSION__ENTITY = eINSTANCE.getBigraphExpression_Entity();

		/**
		 * The meta object literal for the '<em><b>Innername</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIGRAPH_EXPRESSION__INNERNAME = eINSTANCE.getBigraphExpression_Innername();

		/**
		 * The meta object literal for the '{@link cyberPhysical_Incident.impl.OrImpl <em>Or</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cyberPhysical_Incident.impl.OrImpl
		 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getOr()
		 * @generated
		 */
		EClass OR = eINSTANCE.getOr();

		/**
		 * The meta object literal for the '{@link cyberPhysical_Incident.impl.ReachableFromImpl <em>Reachable From</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cyberPhysical_Incident.impl.ReachableFromImpl
		 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getReachableFrom()
		 * @generated
		 */
		EClass REACHABLE_FROM = eINSTANCE.getReachableFrom();

		/**
		 * The meta object literal for the '{@link cyberPhysical_Incident.impl.NearImpl <em>Near</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cyberPhysical_Incident.impl.NearImpl
		 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getNear()
		 * @generated
		 */
		EClass NEAR = eINSTANCE.getNear();

		/**
		 * The meta object literal for the '{@link cyberPhysical_Incident.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cyberPhysical_Incident.impl.ConditionImpl
		 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__NAME = eINSTANCE.getCondition_Name();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__EXPRESSION = eINSTANCE.getCondition_Expression();

		/**
		 * The meta object literal for the '<em><b>Assoicated Conditions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__ASSOICATED_CONDITIONS = eINSTANCE.getCondition_AssoicatedConditions();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__DESCRIPTION = eINSTANCE.getCondition_Description();

		/**
		 * The meta object literal for the '{@link cyberPhysical_Incident.impl.PostconditionImpl <em>Postcondition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cyberPhysical_Incident.impl.PostconditionImpl
		 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getPostcondition()
		 * @generated
		 */
		EClass POSTCONDITION = eINSTANCE.getPostcondition();

		/**
		 * The meta object literal for the '{@link cyberPhysical_Incident.impl.FacilitatingConditionImpl <em>Facilitating Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cyberPhysical_Incident.impl.FacilitatingConditionImpl
		 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getFacilitatingCondition()
		 * @generated
		 */
		EClass FACILITATING_CONDITION = eINSTANCE.getFacilitatingCondition();

		/**
		 * The meta object literal for the '{@link cyberPhysical_Incident.impl.IncidentEntityImpl <em>Incident Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cyberPhysical_Incident.impl.IncidentEntityImpl
		 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getIncidentEntity()
		 * @generated
		 */
		EClass INCIDENT_ENTITY = eINSTANCE.getIncidentEntity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCIDENT_ENTITY__NAME = eINSTANCE.getIncidentEntity_Name();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCIDENT_ENTITY__PROPERTIES = eINSTANCE.getIncidentEntity_Properties();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCIDENT_ENTITY__TYPE = eINSTANCE.getIncidentEntity_Type();

		/**
		 * The meta object literal for the '<em><b>Mobility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCIDENT_ENTITY__MOBILITY = eINSTANCE.getIncidentEntity_Mobility();

		/**
		 * The meta object literal for the '{@link cyberPhysical_Incident.impl.ConnectivityImpl <em>Connectivity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cyberPhysical_Incident.impl.ConnectivityImpl
		 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getConnectivity()
		 * @generated
		 */
		EClass CONNECTIVITY = eINSTANCE.getConnectivity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTIVITY__NAME = eINSTANCE.getConnectivity_Name();

		/**
		 * The meta object literal for the '<em><b>Is Closed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTIVITY__IS_CLOSED = eINSTANCE.getConnectivity_IsClosed();

		/**
		 * The meta object literal for the '{@link cyberPhysical_Incident.impl.InnerNameImpl <em>Inner Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cyberPhysical_Incident.impl.InnerNameImpl
		 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getInnerName()
		 * @generated
		 */
		EClass INNER_NAME = eINSTANCE.getInnerName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INNER_NAME__NAME = eINSTANCE.getInnerName_Name();

		/**
		 * The meta object literal for the '<em><b>Is Closed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INNER_NAME__IS_CLOSED = eINSTANCE.getInnerName_IsClosed();

		/**
		 * The meta object literal for the '<em><b>Outername</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INNER_NAME__OUTERNAME = eINSTANCE.getInnerName_Outername();

		/**
		 * The meta object literal for the '{@link cyberPhysical_Incident.impl.SiteImpl <em>Site</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cyberPhysical_Incident.impl.SiteImpl
		 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getSite()
		 * @generated
		 */
		EClass SITE = eINSTANCE.getSite();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SITE__NAME = eINSTANCE.getSite_Name();

		/**
		 * The meta object literal for the '<em><b>Is Closed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SITE__IS_CLOSED = eINSTANCE.getSite_IsClosed();

		/**
		 * The meta object literal for the '{@link cyberPhysical_Incident.impl.ActivityPatternImpl <em>Activity Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cyberPhysical_Incident.impl.ActivityPatternImpl
		 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getActivityPattern()
		 * @generated
		 */
		EClass ACTIVITY_PATTERN = eINSTANCE.getActivityPattern();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_PATTERN__NAME = eINSTANCE.getActivityPattern_Name();

		/**
		 * The meta object literal for the '<em><b>Severity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_PATTERN__SEVERITY = eINSTANCE.getActivityPattern_Severity();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_PATTERN__DESCRIPTION = eINSTANCE.getActivityPattern_Description();

		/**
		 * The meta object literal for the '<em><b>Incidententity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_PATTERN__INCIDENTENTITY = eINSTANCE.getActivityPattern_Incidententity();

		/**
		 * The meta object literal for the '<em><b>Connection</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_PATTERN__CONNECTION = eINSTANCE.getActivityPattern_Connection();

		/**
		 * The meta object literal for the '<em><b>Patterns Follow</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_PATTERN__PATTERNS_FOLLOW = eINSTANCE.getActivityPattern_PatternsFollow();

		/**
		 * The meta object literal for the '<em><b>Skills Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_PATTERN__SKILLS_REQUIRED = eINSTANCE.getActivityPattern_SkillsRequired();

		/**
		 * The meta object literal for the '<em><b>Abstract Activity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_PATTERN__ABSTRACT_ACTIVITY = eINSTANCE.getActivityPattern_AbstractActivity();

		/**
		 * The meta object literal for the '{@link cyberPhysical_Incident.Level <em>Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cyberPhysical_Incident.Level
		 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getLevel()
		 * @generated
		 */
		EEnum LEVEL = eINSTANCE.getLevel();

		/**
		 * The meta object literal for the '{@link cyberPhysical_Incident.ActivityType <em>Activity Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cyberPhysical_Incident.ActivityType
		 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getActivityType()
		 * @generated
		 */
		EEnum ACTIVITY_TYPE = eINSTANCE.getActivityType();

		/**
		 * The meta object literal for the '{@link cyberPhysical_Incident.Behaviour <em>Behaviour</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cyberPhysical_Incident.Behaviour
		 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getBehaviour()
		 * @generated
		 */
		EEnum BEHAVIOUR = eINSTANCE.getBehaviour();

		/**
		 * The meta object literal for the '{@link cyberPhysical_Incident.Knowledge <em>Knowledge</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cyberPhysical_Incident.Knowledge
		 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getKnowledge()
		 * @generated
		 */
		EEnum KNOWLEDGE = eINSTANCE.getKnowledge();

		/**
		 * The meta object literal for the '{@link cyberPhysical_Incident.ScriptCategory <em>Script Category</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cyberPhysical_Incident.ScriptCategory
		 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getScriptCategory()
		 * @generated
		 */
		EEnum SCRIPT_CATEGORY = eINSTANCE.getScriptCategory();

		/**
		 * The meta object literal for the '{@link cyberPhysical_Incident.ActorRole <em>Actor Role</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cyberPhysical_Incident.ActorRole
		 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getActorRole()
		 * @generated
		 */
		EEnum ACTOR_ROLE = eINSTANCE.getActorRole();

		/**
		 * The meta object literal for the '{@link cyberPhysical_Incident.ActorLevel <em>Actor Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cyberPhysical_Incident.ActorLevel
		 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getActorLevel()
		 * @generated
		 */
		EEnum ACTOR_LEVEL = eINSTANCE.getActorLevel();

		/**
		 * The meta object literal for the '{@link cyberPhysical_Incident.ActivityPatternSeverity <em>Activity Pattern Severity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cyberPhysical_Incident.ActivityPatternSeverity
		 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getActivityPatternSeverity()
		 * @generated
		 */
		EEnum ACTIVITY_PATTERN_SEVERITY = eINSTANCE.getActivityPatternSeverity();

		/**
		 * The meta object literal for the '{@link cyberPhysical_Incident.Skill_Level <em>Skill Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cyberPhysical_Incident.Skill_Level
		 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getSkill_Level()
		 * @generated
		 */
		EEnum SKILL_LEVEL = eINSTANCE.getSkill_Level();

		/**
		 * The meta object literal for the '{@link cyberPhysical_Incident.Mobility <em>Mobility</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cyberPhysical_Incident.Mobility
		 * @see cyberPhysical_Incident.impl.CyberPhysicalIncidentPackageImpl#getMobility()
		 * @generated
		 */
		EEnum MOBILITY = eINSTANCE.getMobility();

	}

} //CyberPhysicalIncidentPackage
