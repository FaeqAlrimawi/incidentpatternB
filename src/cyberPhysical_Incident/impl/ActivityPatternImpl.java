/**
 */
package cyberPhysical_Incident.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import cyberPhysical_Incident.Activity;
import cyberPhysical_Incident.ActivityInitiator;
import cyberPhysical_Incident.ActivityPattern;
import cyberPhysical_Incident.ActivityPatternSeverity;
import cyberPhysical_Incident.ActivityType;
import cyberPhysical_Incident.Actor;
import cyberPhysical_Incident.ActorLevel;
import cyberPhysical_Incident.ActorRole;
import cyberPhysical_Incident.Asset;
import cyberPhysical_Incident.Behaviour;
import cyberPhysical_Incident.BigraphExpression;
import cyberPhysical_Incident.Connection;
import cyberPhysical_Incident.CyberPhysicalIncidentPackage;
import cyberPhysical_Incident.Entity;
import cyberPhysical_Incident.IncidentEntity;
import cyberPhysical_Incident.Knowledge;
import cyberPhysical_Incident.Location;
import cyberPhysical_Incident.Postcondition;
import cyberPhysical_Incident.Precondition;
import cyberPhysical_Incident.Resource;
import cyberPhysical_Incident.Skill_Level;
import cyberPhysical_Incident.Vulnerability;
import it.uniud.mads.jlibbig.core.std.Bigraph;
import it.uniud.mads.jlibbig.core.std.Matcher;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Activity Pattern</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link cyberPhysical_Incident.impl.ActivityPatternImpl#getName
 * <em>Name</em>}</li>
 * <li>{@link cyberPhysical_Incident.impl.ActivityPatternImpl#getSeverity
 * <em>Severity</em>}</li>
 * <li>{@link cyberPhysical_Incident.impl.ActivityPatternImpl#getDescription
 * <em>Description</em>}</li>
 * <li>{@link cyberPhysical_Incident.impl.ActivityPatternImpl#getSkillsRequired
 * <em>Skills Required</em>}</li>
 * <li>{@link cyberPhysical_Incident.impl.ActivityPatternImpl#getPatternsFollow
 * <em>Patterns Follow</em>}</li>
 * <li>{@link cyberPhysical_Incident.impl.ActivityPatternImpl#getAbstractActivity
 * <em>Abstract Activity</em>}</li>
 * <li>{@link cyberPhysical_Incident.impl.ActivityPatternImpl#getIncidententity
 * <em>Incidententity</em>}</li>
 * <li>{@link cyberPhysical_Incident.impl.ActivityPatternImpl#getConnection
 * <em>Connection</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityPatternImpl extends MinimalEObjectImpl.Container implements ActivityPattern {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSeverity() <em>Severity</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected static final ActivityPatternSeverity SEVERITY_EDEFAULT = ActivityPatternSeverity.LOW;

	/**
	 * The cached value of the '{@link #getSeverity() <em>Severity</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected ActivityPatternSeverity severity = SEVERITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSkillsRequired() <em>Skills
	 * Required</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSkillsRequired()
	 * @generated
	 * @ordered
	 */
	protected static final Skill_Level SKILLS_REQUIRED_EDEFAULT = Skill_Level.LOW;

	/**
	 * The cached value of the '{@link #getSkillsRequired() <em>Skills
	 * Required</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSkillsRequired()
	 * @generated
	 * @ordered
	 */
	protected Skill_Level skillsRequired = SKILLS_REQUIRED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPatternsFollow() <em>Patterns
	 * Follow</em>}' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getPatternsFollow()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityPattern> patternsFollow;

	/**
	 * The cached value of the '{@link #getAbstractActivity() <em>Abstract
	 * Activity</em>}' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getAbstractActivity()
	 * @generated
	 * @ordered
	 */
	protected EList<Activity> abstractActivity;

	/**
	 * The cached value of the '{@link #getIncidententity()
	 * <em>Incidententity</em>}' containment reference list. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getIncidententity()
	 * @generated
	 * @ordered
	 */
	protected EList<IncidentEntity> incidententity;

	/**
	 * The cached value of the '{@link #getConnection() <em>Connection</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getConnection()
	 * @generated
	 * @ordered
	 */
	protected EList<Connection> connection;

	protected Map<String, String> entityMap = new HashMap<String, String>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ActivityPatternImpl() {
		super();
	}

	public Activity applyTo(List<Activity> activitySequence) {

		Activity patternInitialActivity = getInitialActivity();
		Activity patternNextActivity = patternInitialActivity != null
				? patternInitialActivity.getNextActivities().get(0) : null;

		Activity firstActivity = activitySequence.get(0);
		Activity secondActivity = activitySequence.get(1);

		if (firstActivity == null || secondActivity == null) {
			return null;
		}

//		boolean canBeApplied1 = canBeApplied(patternInitialActivity, firstActivity);
		 boolean canBeApplied2 = canBeApplied(patternNextActivity, secondActivity);

		// if both activities apply to the pattern then create a new activity
		// representing a merge of the two incident activities
		if (canBeApplied2) {
			// create a new activity
			// TBD
			System.out.println("both activities apply to the pattern");
		}

		return null;
	}

	protected boolean canBeApplied(Activity patternActivity, Activity incidentActivity) {

		// compare attributes and references of both activities

		// basic activity attributes:
		// 1-Behaviour Type (e.g., normal, malicious)
		// 2-System action
		// 3-Type (e.g., physical, digital)
		// 4-Duration (to be implemented)
		// 5-Timing (to be implemented)

		// 1- Behaviour Type (e.g., normal, malicious)
		Behaviour incActBehaviour = incidentActivity.getBehaviourType();
		Behaviour ptrActBehaviour = patternActivity.getBehaviourType();

		// if both activities don't have the same behaviour then return false
		if (!ptrActBehaviour.equals(incActBehaviour)) {
			return false;
		}

		// 2-system action
		String incActAction = incidentActivity.getSystemAction();
		String ptrActAction = patternActivity.getSystemAction();

		// if the pattern activity has an action that is not equal to the action
		// in the incident activity then return false
		if (ptrActAction != null && !ptrActAction.equals(incActAction)) {
			return false;
		}

		// 3-Type (e.g., Physical, digital)
		ActivityType incActType = incidentActivity.getType();
		ActivityType ptrActType = patternActivity.getType();

		// if the pattern activity has a type that is different from the
		// incident activity then return false
		if (ptrActType != null && !ptrActType.equals(incActType)) {
			return false;
		}

		// activity references:
		// 1-Initiator
		// 2-Target assets
		// 3-Resources
		// 4-Exploited assets
		// 5-Location
		// 6-Vicitms
		// 7-Precondition
		// 8-Postcondition
		// -9-Accomplices (to be implemented)

		// 1-Initiator: compare initiator attributes found in the pattern
		// activity to that in the incident activity
		ActivityInitiator ptrInitiator = patternActivity.getInitiator();
		ActivityInitiator incInitiator = incidentActivity.getInitiator();

		boolean canBeApplied = compareInitiators(ptrInitiator, incInitiator);

		if (!canBeApplied) {
			return false;
		}

		if (ptrInitiator != null) {
			entityMap.put(((IncidentEntity) ptrInitiator).getName(), ((IncidentEntity) incInitiator).getName());
		}

		// 2-Target assets
		Asset ptrTargetAsset = !patternActivity.getTargetedAssets().isEmpty()
				? patternActivity.getTargetedAssets().get(0) : null;
		Asset incTargetAsset = !incidentActivity.getTargetedAssets().isEmpty()
				? incidentActivity.getTargetedAssets().get(0) : null;

		canBeApplied = compareAssets(ptrTargetAsset, incTargetAsset);

		if (!canBeApplied) {
			return false;
		}

		if (ptrTargetAsset != null) {
			entityMap.put(ptrTargetAsset.getName(), incTargetAsset.getName());
		}

		// 3-Resources
		Resource ptrResource = !patternActivity.getResources().isEmpty() ? patternActivity.getResources().get(0) : null;
		Resource incResource = !incidentActivity.getResources().isEmpty() ? incidentActivity.getResources().get(0)
				: null;

		canBeApplied = compareResources(ptrResource, incResource);

		if (!canBeApplied) {
			return false;
		}

		if (ptrResource != null) {
			entityMap.put(ptrResource.getName(), incResource.getName());
		}

		// 4-Exploited assets
		Asset ptrExploitedAsset = !patternActivity.getExploitedAssets().isEmpty()
				? patternActivity.getExploitedAssets().get(0) : null;
		Asset incExploitedAsset = !incidentActivity.getExploitedAssets().isEmpty()
				? incidentActivity.getExploitedAssets().get(0) : null;

		canBeApplied = compareAssets(ptrExploitedAsset, incExploitedAsset);

		if (!canBeApplied) {
			return false;
		}

		if (ptrExploitedAsset != null) {
			entityMap.put(ptrExploitedAsset.getName(), incExploitedAsset.getName());
		}

		// 5-Locations
		Location ptrLocation = patternActivity.getLocation();
		Location incLocation = incidentActivity.getLocation();

		canBeApplied = compareLocations(ptrLocation, incLocation);

		if (!canBeApplied) {
			return false;
		}

		if (ptrLocation != null) {
			entityMap.put(((IncidentEntity) ptrLocation).getName(), ((IncidentEntity) incLocation).getName());
		}

		// 6-Vicitms
		Actor ptrVicitm = !patternActivity.getVictims().isEmpty() ? patternActivity.getVictims().get(0) : null;
		Actor incVicitm = !incidentActivity.getVictims().isEmpty() ? incidentActivity.getVictims().get(0) : null;

		canBeApplied = compareActors(ptrVicitm, incVicitm);

		if (!canBeApplied) {
			return false;
		}

		if (ptrVicitm != null) {
			entityMap.put(ptrVicitm.getName(), incVicitm.getName());
		}

		// evaluate precondition
		Precondition ptrPre = patternActivity.getPrecondition();
		BigraphExpression ptrBigExp = ptrPre != null ? (BigraphExpression) ptrPre.getExpression() : null;

		Precondition incPre = incidentActivity.getPrecondition();
		BigraphExpression incBigExp = incPre != null ? (BigraphExpression) incPre.getExpression() : null;

		canBeApplied = compareConditions(ptrBigExp, incBigExp);

		if (!canBeApplied) {
			return false;
		}

		// evaluate postcondition
		Postcondition ptrPost = patternActivity.getPostcondition();
		BigraphExpression ptrBigExpPost = ptrPost != null ? (BigraphExpression) ptrPost.getExpression() : null;

		Postcondition incPost = incidentActivity.getPostcondition();
		BigraphExpression incBigExpPost = incPost != null ? (BigraphExpression) incPost.getExpression() : null;

		canBeApplied = compareConditions(ptrBigExpPost, incBigExpPost);

		if (!canBeApplied) {
			return false;
		}

		return true;
	}

	public Activity applyTo(Activity startingActivity, Activity endActivity) {

		if (startingActivity == null || endActivity == null) {
			return null;
		}

		if (startingActivity.equals(endActivity)) {
			return startingActivity;
		}

		EList<Activity> activitiesToMerge = new BasicEList<Activity>();

		activitiesToMerge.add(startingActivity);

		// assuming there's only one next activity. In future, an algorithm for
		// finding all possible sequences between two activities can be
		// implemented
		Activity nextActivity = null;

		if (startingActivity.getNextActivities().size() > 0) {
			nextActivity = startingActivity.getNextActivities().get(0);
		}

		while (nextActivity != null) {

			activitiesToMerge.add(nextActivity);

			if (nextActivity.equals(endActivity)) {
				break;
			}

			if (nextActivity.getNextActivities().size() > 0) {
				nextActivity = nextActivity.getNextActivities().get(0);
			} else {
				nextActivity = null;
			}

		}

		return applyTo(activitiesToMerge);

	}

	protected boolean compareInitiators(ActivityInitiator patternActivityInitiator,
			ActivityInitiator incidentActivityInitiator) {

		if (patternActivityInitiator == null) {
			return true;
		}

		// if the pattern activity has an initiator but the incident activity
		// does not then return false
		if (patternActivityInitiator != null && incidentActivityInitiator == null) {
			return false;
		}

		// attributes to compare between initiators
		// 1-Initiator Type (i.e. are they of the same class such as actor or
		// asset)

		// if the class of the pattern activity initiator is the same (or
		// superclass) of the incident activity initiator then return false
		if (!patternActivityInitiator.getClass().isInstance(incidentActivityInitiator)) {
			return false;
		}

		boolean canBeApplied = false;

		if (Actor.class.isInstance(patternActivityInitiator)) {
			canBeApplied = compareActors((Actor) patternActivityInitiator, (Actor) incidentActivityInitiator);
		} else if (Asset.class.isInstance(patternActivityInitiator)) {
			canBeApplied = compareAssets((Asset) patternActivityInitiator, (Asset) incidentActivityInitiator);
		} else if (Resource.class.isInstance(patternActivityInitiator)) {
			canBeApplied = compareResources((Resource) patternActivityInitiator, (Resource) incidentActivityInitiator);
		} else {
			canBeApplied = compareIncidentEntities((IncidentEntity) patternActivityInitiator,
					(IncidentEntity) incidentActivityInitiator);
		}

		if (!canBeApplied) {
			return false;
		}

		return true;
	}

	protected boolean compareIncidentEntities(IncidentEntity patternEntity, IncidentEntity incidentEntity) {

		if (patternEntity != null && incidententity == null) {
			return false;
		}

		if (patternEntity == null) {
			return true;
		}

		// Attributes:
		// 1-Type
		// 2-Parent Entity
		// 3-Contained Entities
		// 4-Connections

		// 1-type: compare the types of both entities
		String ptrActType = patternEntity.getType() != null ? patternEntity.getType().getName() : null;
		String incActType = incidentEntity.getType() != null ? incidentEntity.getType().getName() : null;

		if (ptrActType != null && incActType == null) {
			return false;
		}

		if (ptrActType != null && incActType != null) {
			if (!isSameClassOrSuperClass(ptrActType, incActType)) {
				return false;
			}
		}

		// 2-parent entity: find out if the type of the parent entity is of the
		// same type or super type to that of the incident activity
		IncidentEntity ptrActParent = (IncidentEntity) patternEntity.getParentEntity();
		IncidentEntity incActParent = (IncidentEntity) incidentEntity.getParentEntity();

		if (ptrActParent != null && incActParent == null) {
			return false;
		}

		// check parent types (pattern parent type should be same class or super
		// class of incident parent type)
		if (ptrActParent != null && incActParent != null) {

			String ptrParentType = ptrActParent.getType() != null ? ptrActParent.getType().getName() : null;
			String incParentType = incActParent.getType() != null ? incActParent.getType().getName() : null;

			if (!isSameClassOrSuperClass(ptrParentType, incParentType)) {
				return false;
			}
		}

		// 3-Contained Entities: check number & types
		// if knowledge is complete in pattern entity then both should have the
		// same number,
		// and type of pattern contained entities should be same class or
		// superclass
		Knowledge ptrCotnainedEntitiesKnowledge = incidentEntity.getContainedAssetsKnowledge();
		// Knowledge incContainedEntitiesKnowledge =
		// patternEntity.getContainedAssetsKnowledge();

		EList<Location> ptrContainedEntities = patternEntity.getContainedEntities();
		EList<Location> incContainedEntities = incidentEntity.getContainedEntities();

		// check if the knowledge is exact then both should have the same number
		// of entities
		if (ptrCotnainedEntitiesKnowledge.equals(Knowledge.EXACT)) {
			if (ptrContainedEntities.size() != incContainedEntities.size()) {
				return false;
			}
		}

		// check for the case when the pattern has more cotnained entities
		// what should be done!? Allow it? return false?

		// check the types of both (pattern types should be same class or
		// superclass of the incident ones)
		if (!checkContainedEntities(ptrContainedEntities, incContainedEntities)) {
			return false;
		}

		// 4-Connections: check number & types
		// if knowledge is complete in pattern entity then both should have the
		// same number,
		// and type of pattern contained entities should be same class or
		// superclass
		Knowledge ptrConnectionsKnowledge = patternEntity.getConnectionsKnowledge();
		// Knowledge incContainedEntitiesKnowledge =
		// patternEntity.getContainedAssetsKnowledge();

		EList<Connection> ptrConnections = patternEntity.getConnections();
		EList<Connection> incConnections = incidentEntity.getConnections();

		// check if the knowledge is exact then both should have the same number
		// of entities
		if (ptrConnectionsKnowledge.equals(Knowledge.EXACT)) {
			if (ptrConnections.size() != incConnections.size()) {
				return false;
			}
		}

		// check for the case when the pattern has more cotnained entities
		// what should be done!? Allow it? return false?

		// check the types of both (pattern types should be same class or
		// superclass of the incident ones)
		if (!checkConnections(ptrConnections, incConnections)) {
			return false;
		}

		return true;
	}

	protected boolean compareAssets(Asset patternAsset, Asset incidentAsset) {

		if (patternAsset != null && incidentAsset == null) {
			return false;
		}

		if (patternAsset == null) {
			return true;
		}

		boolean isApplicable = compareIncidentEntities(patternAsset, incidentAsset);

		if (!isApplicable) {
			return false;
		}

		EList<Vulnerability> ptrVuls = patternAsset.getVulnerability();
		EList<Vulnerability> incVuls = incidentAsset.getVulnerability();

		// compare vulnerabilities
		List<Integer> matchedConnections = new LinkedList<Integer>();

		for (Vulnerability ptrVul : ptrVuls) {

			if (ptrVul.getName() == null || ptrVul.getName().isEmpty()) {
				continue;// ignored
			}

			boolean isVulMatched = false;

			Vulnerability incVul = null;

			for (int i = 0; i < incVuls.size(); i++) {

				if (matchedConnections.contains(i)) {
					continue;
				}

				incVul = incVuls.get(i);

				if (ptrVul.equals(incVul)) {
					matchedConnections.add(i);
					isVulMatched = true;
					break;
				}
			}

			// if none of the incident vulnerabilities match the pattern
			// vulnerabilities then it is a mismatch
			if (!isVulMatched) {
				return false;
			}

			isVulMatched = false;

		}

		return true;
	}

	protected boolean compareActors(Actor patternActor, Actor incidentActor) {

		if (patternActor != null && incidentActor == null) {
			return false;
		}

		if (patternActor == null) {
			return true;
		}

		boolean canBeApplied = compareIncidentEntities(patternActor, incidentActor);

		if (!canBeApplied) {
			return false;
		}

		// Attributes to compare:
		// 1-Role (e.g., offender, vicitm)
		// 2-Level (e.g., individual, group)

		// 1-Role
		ActorRole ptrRole = patternActor.getRole();
		ActorRole incRole = incidentActor.getRole();

		if (!ptrRole.equals(incRole)) {
			return false;
		}

		// 2-Level
		ActorLevel ptrLevel = patternActor.getLevel();
		ActorLevel incLevel = incidentActor.getLevel();

		if (!ptrLevel.equals(incLevel)) {
			return false;
		}

		return true;
	}

	protected boolean compareResources(Resource patternResource, Resource incidentResource) {

		if (patternResource != null && incidentResource == null) {
			return false;
		}

		if (patternResource == null) {
			return true;
		}

		boolean canBeApplied = compareIncidentEntities(patternResource, incidentResource);

		if (!canBeApplied) {
			return false;
		}

		// specific comparison criteria for resources can be defined here

		return true;
	}

	protected boolean compareLocations(Location patternLocation, Location incidentLocation) {

		if (patternLocation != null && incidentLocation == null) {
			return false;
		}

		if (patternLocation == null) {
			return true;
		}

		boolean canBeApplied = compareIncidentEntities((IncidentEntity) patternLocation,
				(IncidentEntity) incidentLocation);

		if (!canBeApplied) {
			return false;
		}

		// more specifc criteria to locations can be defined here
		// for example, connection ends can be further explored here

		return true;

	}

	/**
	 * Finds if the given patternType parameter is of the same class or super
	 * class of the given incidentType parameter
	 * 
	 * @param patternType
	 * @param incidentType
	 * @return
	 */
	protected boolean isSameClassOrSuperClass(String patternType, String incidentType) {

		// depends on the classes of the cyber physical system

		if (patternType != null && incidentType == null) {
			return false;
		}

		if (patternType == null && incidentType == null) {
			return true;
		}

		try {
			String potentialPatternClassName = "environment.impl." + patternType;

			if (!patternType.endsWith("Impl")) {
				potentialPatternClassName += "Impl";
			}

			Class<?> patternClass = Class.forName(potentialPatternClassName);

			String potentialIncidentClassName = "environment.impl." + incidentType;

			if (!incidentType.endsWith("Impl")) {
				potentialIncidentClassName += "Impl";
			}

			Class<?> incidentClass = Class.forName(potentialIncidentClassName);

			if (!patternClass.isAssignableFrom(incidentClass)) {
				return false;
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			return false;
		}

		return true;
	}

	protected boolean checkContainedEntities(EList<Location> patternContainedEntities,
			EList<Location> incidentContainedEntities) {

		// compare type
		LinkedList<Integer> matchedcontainedAssets = new LinkedList<Integer>();

		for (Location ent : patternContainedEntities) {

			IncidentEntity ptrcontainedEntity = (IncidentEntity) ent;

			if (ptrcontainedEntity.getType() == null) {
				continue;// ignored
			}

			String ptrTypeName = ptrcontainedEntity.getType().getName();

			boolean iscontainedEntityMatched = false;

			IncidentEntity incContainedEntity = null;

			for (int i = 0; i < incidentContainedEntities.size(); i++) {

				if (matchedcontainedAssets.contains(i)) {
					continue;
				}

				incContainedEntity = (IncidentEntity) incidentContainedEntities.get(i);

				String incTypeName = incContainedEntity.getType() != null ? incContainedEntity.getType().getName()
						: null;

				if (isSameClassOrSuperClass(ptrTypeName, incTypeName)) {
					matchedcontainedAssets.add(i);
					iscontainedEntityMatched = true;
					break;
				}
			}

			// if none of the incident contained entities match the pattern
			// contained entities then it is a mismatch
			if (!iscontainedEntityMatched) {
				return false;
			}

			iscontainedEntityMatched = false;

		}

		return true;
	}

	protected boolean checkConnections(EList<Connection> patternConnections, EList<Connection> incidentConnections) {

		// compare type
		LinkedList<Integer> matchedConnections = new LinkedList<Integer>();

		for (Connection ptrConnection : patternConnections) {

			if (ptrConnection.getType() == null) {
				continue;// ignored
			}

			String ptrTypeName = ptrConnection.getType().getName();

			boolean isConnectionMatched = false;

			Connection incConnection = null;

			for (int i = 0; i < incidentConnections.size(); i++) {

				if (matchedConnections.contains(i)) {
					continue;
				}

				incConnection = incidentConnections.get(i);

				String incTypeName = incConnection.getType() != null ? incConnection.getType().getName() : null;

				if (isSameClassOrSuperClass(ptrTypeName, incTypeName)) {
					matchedConnections.add(i);
					isConnectionMatched = true;
					break;
				}
			}

			// if none of the incident contained entities match the pattern
			// contained entities then it is a mismatch
			if (!isConnectionMatched) {
				return false;
			}

			isConnectionMatched = false;

		}

		return true;
	}

	protected boolean compareConditions(BigraphExpression patternCondition, BigraphExpression incidentCondition) {
		
		if (patternCondition == null) {
			return true;
		}

		if (patternCondition != null && incidentCondition == null) {
			return false;
		}

		boolean isGround = true;
		Bigraph incBigraph = incidentCondition.createBigraph(isGround);
		Matcher matcher = new Matcher();
		
		if (incBigraph != null) {
			System.out.println(incBigraph);
			// update entities names in the pattern precondition by mapping names to the incident conditiosn
			boolean isAllMapped = updateEntityNames(patternCondition);

			if (isAllMapped) {
				// create a bigraph of the pattern precondition
				Bigraph ptrBigraph = patternCondition.createBigraph(incBigraph.getSignature());
				System.out.println(ptrBigraph);
				if (matcher.match(incBigraph, ptrBigraph).iterator().hasNext()) {
					return true;
				}
			}
		}

		return false;
	}

	protected boolean updateEntityNames(BigraphExpression patternCondition) {

		List<String> notFoundNames = new LinkedList<String>();
		LinkedList<Entity> visitedEntities = new LinkedList<Entity>();

		visitedEntities.addAll(patternCondition.getEntity());

		while (!visitedEntities.isEmpty()) {
			Entity entity = visitedEntities.pop();

			if (entityMap.containsKey(entity.getName())) {
				entity.setName(entityMap.get(entity.getName()));
			} else {
				notFoundNames.add(entity.getName());
			}

			visitedEntities.addAll(entity.getEntity());
		}

		// if some entities cannot be mapped then try to find a [similar] entity
		// in the incident activity
		// condition that has not yet been mapped, otherwise the conditions do
		// NOT match
		// currently if there are unmapped entities in the pattern condition
		// then it is a NO match
		if (notFoundNames.size() != 0) {
			return false;
		}

		return true;
	}

	protected Activity getInitialActivity() {

		List<Activity> notFirst = new LinkedList<Activity>();

		for (Activity act : getAbstractActivity()) {
			if (act.getNextActivities() != null) {
				notFirst.addAll(act.getNextActivities());
			}
		}

		for (Activity act : getAbstractActivity()) {
			if (!notFirst.contains(act)) {
				return act;
			}
		}

		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CyberPhysicalIncidentPackage.Literals.ACTIVITY_PATTERN;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CyberPhysicalIncidentPackage.ACTIVITY_PATTERN__NAME,
					oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ActivityPatternSeverity getSeverity() {
		return severity;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setSeverity(ActivityPatternSeverity newSeverity) {
		ActivityPatternSeverity oldSeverity = severity;
		severity = newSeverity == null ? SEVERITY_EDEFAULT : newSeverity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CyberPhysicalIncidentPackage.ACTIVITY_PATTERN__SEVERITY, oldSeverity, severity));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CyberPhysicalIncidentPackage.ACTIVITY_PATTERN__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Skill_Level getSkillsRequired() {
		return skillsRequired;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setSkillsRequired(Skill_Level newSkillsRequired) {
		Skill_Level oldSkillsRequired = skillsRequired;
		skillsRequired = newSkillsRequired == null ? SKILLS_REQUIRED_EDEFAULT : newSkillsRequired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CyberPhysicalIncidentPackage.ACTIVITY_PATTERN__SKILLS_REQUIRED, oldSkillsRequired, skillsRequired));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<ActivityPattern> getPatternsFollow() {
		if (patternsFollow == null) {
			patternsFollow = new EObjectResolvingEList<ActivityPattern>(ActivityPattern.class, this,
					CyberPhysicalIncidentPackage.ACTIVITY_PATTERN__PATTERNS_FOLLOW);
		}
		return patternsFollow;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Activity> getAbstractActivity() {
		if (abstractActivity == null) {
			abstractActivity = new EObjectContainmentEList<Activity>(Activity.class, this,
					CyberPhysicalIncidentPackage.ACTIVITY_PATTERN__ABSTRACT_ACTIVITY);
		}
		return abstractActivity;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<IncidentEntity> getIncidententity() {
		if (incidententity == null) {
			incidententity = new EObjectContainmentEList<IncidentEntity>(IncidentEntity.class, this,
					CyberPhysicalIncidentPackage.ACTIVITY_PATTERN__INCIDENTENTITY);
		}
		return incidententity;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Connection> getConnection() {
		if (connection == null) {
			connection = new EObjectContainmentEList<Connection>(Connection.class, this,
					CyberPhysicalIncidentPackage.ACTIVITY_PATTERN__CONNECTION);
		}
		return connection;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CyberPhysicalIncidentPackage.ACTIVITY_PATTERN__ABSTRACT_ACTIVITY:
			return ((InternalEList<?>) getAbstractActivity()).basicRemove(otherEnd, msgs);
		case CyberPhysicalIncidentPackage.ACTIVITY_PATTERN__INCIDENTENTITY:
			return ((InternalEList<?>) getIncidententity()).basicRemove(otherEnd, msgs);
		case CyberPhysicalIncidentPackage.ACTIVITY_PATTERN__CONNECTION:
			return ((InternalEList<?>) getConnection()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CyberPhysicalIncidentPackage.ACTIVITY_PATTERN__NAME:
			return getName();
		case CyberPhysicalIncidentPackage.ACTIVITY_PATTERN__SEVERITY:
			return getSeverity();
		case CyberPhysicalIncidentPackage.ACTIVITY_PATTERN__DESCRIPTION:
			return getDescription();
		case CyberPhysicalIncidentPackage.ACTIVITY_PATTERN__SKILLS_REQUIRED:
			return getSkillsRequired();
		case CyberPhysicalIncidentPackage.ACTIVITY_PATTERN__PATTERNS_FOLLOW:
			return getPatternsFollow();
		case CyberPhysicalIncidentPackage.ACTIVITY_PATTERN__ABSTRACT_ACTIVITY:
			return getAbstractActivity();
		case CyberPhysicalIncidentPackage.ACTIVITY_PATTERN__INCIDENTENTITY:
			return getIncidententity();
		case CyberPhysicalIncidentPackage.ACTIVITY_PATTERN__CONNECTION:
			return getConnection();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CyberPhysicalIncidentPackage.ACTIVITY_PATTERN__NAME:
			setName((String) newValue);
			return;
		case CyberPhysicalIncidentPackage.ACTIVITY_PATTERN__SEVERITY:
			setSeverity((ActivityPatternSeverity) newValue);
			return;
		case CyberPhysicalIncidentPackage.ACTIVITY_PATTERN__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case CyberPhysicalIncidentPackage.ACTIVITY_PATTERN__SKILLS_REQUIRED:
			setSkillsRequired((Skill_Level) newValue);
			return;
		case CyberPhysicalIncidentPackage.ACTIVITY_PATTERN__PATTERNS_FOLLOW:
			getPatternsFollow().clear();
			getPatternsFollow().addAll((Collection<? extends ActivityPattern>) newValue);
			return;
		case CyberPhysicalIncidentPackage.ACTIVITY_PATTERN__ABSTRACT_ACTIVITY:
			getAbstractActivity().clear();
			getAbstractActivity().addAll((Collection<? extends Activity>) newValue);
			return;
		case CyberPhysicalIncidentPackage.ACTIVITY_PATTERN__INCIDENTENTITY:
			getIncidententity().clear();
			getIncidententity().addAll((Collection<? extends IncidentEntity>) newValue);
			return;
		case CyberPhysicalIncidentPackage.ACTIVITY_PATTERN__CONNECTION:
			getConnection().clear();
			getConnection().addAll((Collection<? extends Connection>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case CyberPhysicalIncidentPackage.ACTIVITY_PATTERN__NAME:
			setName(NAME_EDEFAULT);
			return;
		case CyberPhysicalIncidentPackage.ACTIVITY_PATTERN__SEVERITY:
			setSeverity(SEVERITY_EDEFAULT);
			return;
		case CyberPhysicalIncidentPackage.ACTIVITY_PATTERN__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case CyberPhysicalIncidentPackage.ACTIVITY_PATTERN__SKILLS_REQUIRED:
			setSkillsRequired(SKILLS_REQUIRED_EDEFAULT);
			return;
		case CyberPhysicalIncidentPackage.ACTIVITY_PATTERN__PATTERNS_FOLLOW:
			getPatternsFollow().clear();
			return;
		case CyberPhysicalIncidentPackage.ACTIVITY_PATTERN__ABSTRACT_ACTIVITY:
			getAbstractActivity().clear();
			return;
		case CyberPhysicalIncidentPackage.ACTIVITY_PATTERN__INCIDENTENTITY:
			getIncidententity().clear();
			return;
		case CyberPhysicalIncidentPackage.ACTIVITY_PATTERN__CONNECTION:
			getConnection().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case CyberPhysicalIncidentPackage.ACTIVITY_PATTERN__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case CyberPhysicalIncidentPackage.ACTIVITY_PATTERN__SEVERITY:
			return severity != SEVERITY_EDEFAULT;
		case CyberPhysicalIncidentPackage.ACTIVITY_PATTERN__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case CyberPhysicalIncidentPackage.ACTIVITY_PATTERN__SKILLS_REQUIRED:
			return skillsRequired != SKILLS_REQUIRED_EDEFAULT;
		case CyberPhysicalIncidentPackage.ACTIVITY_PATTERN__PATTERNS_FOLLOW:
			return patternsFollow != null && !patternsFollow.isEmpty();
		case CyberPhysicalIncidentPackage.ACTIVITY_PATTERN__ABSTRACT_ACTIVITY:
			return abstractActivity != null && !abstractActivity.isEmpty();
		case CyberPhysicalIncidentPackage.ACTIVITY_PATTERN__INCIDENTENTITY:
			return incidententity != null && !incidententity.isEmpty();
		case CyberPhysicalIncidentPackage.ACTIVITY_PATTERN__CONNECTION:
			return connection != null && !connection.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", Severity: ");
		result.append(severity);
		result.append(", description: ");
		result.append(description);
		result.append(", skillsRequired: ");
		result.append(skillsRequired);
		result.append(')');
		return result.toString();
	}

} // ActivityPatternImpl
