/**
 */
package cyberPhysical_Incident;

import java.util.LinkedList;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import it.uniud.mads.jlibbig.core.std.Signature;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Incident
 * Diagram</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link cyberPhysical_Incident.IncidentDiagram#getCrimeScript <em>Crime
 * Script</em>}</li>
 * <li>{@link cyberPhysical_Incident.IncidentDiagram#getScene
 * <em>Scene</em>}</li>
 * <li>{@link cyberPhysical_Incident.IncidentDiagram#getIntent
 * <em>Intent</em>}</li>
 * <li>{@link cyberPhysical_Incident.IncidentDiagram#getGoal <em>Goal</em>}</li>
 * <li>{@link cyberPhysical_Incident.IncidentDiagram#getMotive
 * <em>Motive</em>}</li>
 * <li>{@link cyberPhysical_Incident.IncidentDiagram#getAsset
 * <em>Asset</em>}</li>
 * <li>{@link cyberPhysical_Incident.IncidentDiagram#getResource
 * <em>Resource</em>}</li>
 * <li>{@link cyberPhysical_Incident.IncidentDiagram#getActor
 * <em>Actor</em>}</li>
 * <li>{@link cyberPhysical_Incident.IncidentDiagram#getConnection
 * <em>Connection</em>}</li>
 * <li>{@link cyberPhysical_Incident.IncidentDiagram#getPaths
 * <em>Paths</em>}</li>
 * </ul>
 *
 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getIncidentDiagram()
 * @model
 * @generated
 */
public interface IncidentDiagram extends EObject {

	// static final int CONTAINMENT_MERGE_RULE = 0;
	// static final int CONNECTIVITY_MERGE_RULE = 1;
	// static final int COLLECTDATA_MERGE_RULE = 2;

	// IncidentDiagram createAbstractIncident(EnvironmentDiagram systemModel);
	// IncidentDiagram createAbstractIncident();
	// void setSystemModel(EnvironmentDiagram systemModel);
	EList<Activity> getActivity();

	void setActivity(EList<Activity> activity);

	EList<IncidentEntity> getEntity();

	void setEntity(EList<IncidentEntity> entity);

	void removeEntity(IncidentEntity entity);

	// List<Integer> getMergedRules();
	// Map<Activity, List<Activity>> getMergedActivities();
	// void setMergedRules();
	Scene getScene(String sceneName);

	Signature createBigraphSignature();

	int[] getActivityNumberSequence(String startActivityName, String endActivityName);

	String getActivityName(int index);

	Activity getActivity(int index);

	LinkedList<Activity> getActivitySequence(int[] indicesSequence);

	Map<String, Integer> getActivitySequence();

	void setActivitySequence(Map<String, Integer> actSequence);

	/**
	 * Determines if the given entity is used in any of the incident activities.
	 * It could be either stated in a precondition or a postcondition, or has a
	 * relation (e.g., contained in or connected to) with other entities that is
	 * stated in a pre/post condition
	 * 
	 * @param entity
	 *            The incident entity to check if it is used
	 * @return True if it is used in the incident. Fales otherwise
	 */
	boolean isUsed(IncidentEntity entity);

	/**
	 * Removes all incident entities (actor, asset, resource) that have not been
	 * used in activities or has no relations with other entities that have been
	 * used in activities
	 * 
	 * @return The list of entities that are removed. Empty list if none removed
	 */
	LinkedList<IncidentEntity> removeUnusedEntities();

	/**
	 * Returns all incident entities (actor, asset, resource) that have not been
	 * used in activities or has no relations with other entities that have been
	 * used in activities
	 * 
	 * @return The list of entities that are removed. Empty list if none removed
	 */
	LinkedList<IncidentEntity> getUnusedEntities();

	/**
	 * Checks whether there is at least one incident entity (actor, asset, resource) that has not been
	 * used in activities or has no relations with other entities that have been
	 * used in activities
	 * 
	 * @return The list of entities that are removed. Empty list if none removed
	 */
	boolean hasUnusedEntities();

	/**
	 * Checks whether the given activity name already exists in the incident
	 * model or not
	 * 
	 * @param activityName
	 *            name that needs to be checked
	 * @return True if it already exists in the incident model. False otherwise.
	 */
	boolean activityNameExists(String activityName);
	/**
	 * Finds possible pairs of activities that can be merged based on
	 * containment and connectivity heuristics
	 */
	// Map<Activity, List<Activity>> abstractActivities();

	/**
	 * Abstracts assets found in the incident model, which correspod to assets
	 * in the system model. If such asset is found then its abstract
	 * representation by the system model is returned and replaced in the
	 * incident model
	 */
	// void abstractEntities(EnvironmentDiagram system);

	/**
	 * Merges the activity sequence between the given argument activities (them
	 * included). Currently, merging is done based on containment of the
	 * initiator between the first and the second activity. Please see
	 * {@link #mergeAccordingToContainment(EList)}
	 * 
	 * @param startingActivity
	 *            starting activity of the sequence
	 * @param endActivity
	 *            final activity of the sequence
	 * @return New activity replacing the sequence. Or null if merging is not
	 *         successful
	 */
	// Activity mergeActivities(Activity startingActivity, Activity
	// endActivity);

	/**
	 * Merges the given activity sequence. Merging is done based on certain set
	 * of rules that can be matched against the given sequence. Currently,
	 * merging is done based on containment of the initiator between the first
	 * and the second activity. Please see
	 * {@link #mergeAccordingToContainment(EList)} Returns a new activity that
	 * replaces the sequence, or null if it cannot be repalced.
	 * 
	 * @param activitySequence
	 *            the sequence of activities to merge
	 * @return New activity replacing the sequence. Or null if merging is not
	 *         successful
	 */
	// Activity mergeActivities(List<Activity> activitySequence);

	/**
	 * Merges the first two activities of the given sequence. Criteria is:
	 * 1-Check basics (same action name, same initiator, same activity type)
	 * 2-Activity initiator in the first activity is contained by different
	 * entities in the precondition and postcondition 3-Container of initiator
	 * in the second activity should be different from the contianer in
	 * postcondition of the first activity 4-A connection between the containers
	 * of the postconditions in the first and second activity should exist
	 * 
	 * @param activitySequence
	 *            The sequence of activities to merge
	 * @return New activity replacing the first two activities in the sequence.
	 *         Or null if merging is not successful
	 */
	// Activity mergeBasedOnContainment(List<Activity> activitySequence);

	/**
	 * Merges the first two activities of the given sequence. Criteria is:
	 * 1-Check basics (same action name, same initiator, same activity type)
	 * 2-Activity initiator in the first activity contains an entity that has
	 * connections that increases from pre to post. These connections should be
	 * assoicated with the target asset 3-In the second activity, the same
	 * entity in the postcondition has new connection different from that in the
	 * first activity postcondition
	 * 
	 * @param activitySequence
	 *            The sequence of activities to merge
	 * @return New activity replacing the first two activities in the sequence.
	 *         Or null if merging is not successful
	 */
	// Activity mergeBasedOnConnectivity(List<Activity> activitySequence);

	/**
	 * Merges the first two activities of the given sequence based on 'collect
	 * Data' pattern. Pattern: collect [Data (sensitive), which can be used to
	 * undermine the security of the target] from [Common Resource (or Asset),
	 * well-known locations for resources] using a [device].
	 * <p>
	 * Criteria is: <br>
	 * 1st activity (connect [reach] to network [common resource]): <br>
	 * <<em>action</em>: "connect" <br>
	 * <em>Target asset</em>: Network (IP or Bus)<br>
	 * <em>Initiator</em>: Actor with role as OFFENDER<br>
	 * <em>Resource</em>: ComputingDevice contained by Initiator<br>
	 * <em>Precondition</em>: Initiator [Offender] not connected to a
	 * Network<br>
	 * <em>Postcondition</em>: Initiator connected to Network using a
	 * computingDevice [device]<br>
	 * </p>
	 * 2nd activity (i.e. identify sensitive data):<br>
	 * <em>action</em>: not specified<br>
	 * <em>Target Asset</em>: [Sensitive-Data] such as packet payload<br>
	 * <em>Exploited Asset</em>: Data collected from Network<br>
	 * <em>Precondition</em>: collect Data available from Network<br>
	 * <em>Postcondition</em>: obtain Sensitive-Data<br>
	 * 
	 * @param activitySequence
	 *            The sequence of activities to merge
	 * @return New activity replacing the first two activities in the sequence.
	 *         Or null if merging is not successful
	 */
	// Activity mergeBasedOnCollectData(List<Activity> activitySequence);

	// Activity mergeBasedOnEstablishRogueLocation(List<Activity>
	// activitySequence);
	// Activity mergeBasedOnByPassCardSystem(List<Activity> activitySequence);

	// Activity mergeBasedOnExploit(List<Activity> activitySequence);

	/**
	 * * Merges the activity sequence starting from the given argument activity
	 * (it included) until the activity that is located the last in the given
	 * number of activities. Returns a new activity that replaces the sequence,
	 * or null if it cannot be repalced. Currently, merging is done based on
	 * containment of the initiator between the first and the second activity.
	 * Please see {@link #mergeAccordingToContainment(EList)}
	 * 
	 * @param startingActivity
	 *            the starting activity in the sequence
	 * @param sequenceLength
	 *            Number of activities to add to the starting activity. Minimum
	 *            should be 1
	 * @return New activity replacing the sequence. Or null if merging is not
	 *         successful
	 */
	// Activity mergeActivities(Activity startingActivity, int sequenceLength);

	/**
	 * Checks whether the given two incident entities have a connection or not
	 * 
	 * @param incidentEntity1
	 * @param incidentEntity2
	 * @return true if they have. false otherwise
	 */
	Connection hasConnection(String incidentEntity1, String incidentEntity2);

	Activity getInitialActivity();

	Activity getInitialActivity(Scene scene);

	Scene getInitialScene();

	/**
	 * Returns the value of the '<em><b>Crime Script</b></em>' containment
	 * reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Crime Script</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Crime Script</em>' containment reference.
	 * @see #setCrimeScript(CrimeScript)
	 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getIncidentDiagram_CrimeScript()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CrimeScript getCrimeScript();

	/**
	 * Sets the value of the
	 * '{@link cyberPhysical_Incident.IncidentDiagram#getCrimeScript <em>Crime
	 * Script</em>}' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Crime Script</em>' containment
	 *            reference.
	 * @see #getCrimeScript()
	 * @generated
	 */
	void setCrimeScript(CrimeScript value);

	/**
	 * Returns the value of the '<em><b>Scene</b></em>' containment reference
	 * list. The list contents are of type {@link cyberPhysical_Incident.Scene}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scene</em>' containment reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Scene</em>' containment reference list.
	 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getIncidentDiagram_Scene()
	 * @model containment="true"
	 * @generated
	 */
	EList<Scene> getScene();

	/**
	 * Returns the value of the '<em><b>Intent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intent</em>' containment reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Intent</em>' containment reference.
	 * @see #setIntent(Intent)
	 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getIncidentDiagram_Intent()
	 * @model containment="true"
	 * @generated
	 */
	Intent getIntent();

	/**
	 * Sets the value of the
	 * '{@link cyberPhysical_Incident.IncidentDiagram#getIntent
	 * <em>Intent</em>}' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Intent</em>' containment reference.
	 * @see #getIntent()
	 * @generated
	 */
	void setIntent(Intent value);

	/**
	 * Returns the value of the '<em><b>Goal</b></em>' containment reference
	 * list. The list contents are of type {@link cyberPhysical_Incident.Goal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Goal</em>' containment reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Goal</em>' containment reference list.
	 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getIncidentDiagram_Goal()
	 * @model containment="true"
	 * @generated
	 */
	EList<Goal> getGoal();

	/**
	 * Returns the value of the '<em><b>Motive</b></em>' containment reference
	 * list. The list contents are of type
	 * {@link cyberPhysical_Incident.Motive}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Motive</em>' containment reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Motive</em>' containment reference list.
	 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getIncidentDiagram_Motive()
	 * @model containment="true"
	 * @generated
	 */
	EList<Motive> getMotive();

	/**
	 * Returns the value of the '<em><b>Asset</b></em>' containment reference
	 * list. The list contents are of type {@link cyberPhysical_Incident.Asset}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asset</em>' containment reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Asset</em>' containment reference list.
	 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getIncidentDiagram_Asset()
	 * @model containment="true"
	 * @generated
	 */
	EList<Asset> getAsset();

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' containment reference
	 * list. The list contents are of type
	 * {@link cyberPhysical_Incident.Resource}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Resource</em>' containment reference list.
	 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getIncidentDiagram_Resource()
	 * @model containment="true"
	 * @generated
	 */
	EList<Resource> getResource();

	/**
	 * Returns the value of the '<em><b>Actor</b></em>' containment reference
	 * list. The list contents are of type {@link cyberPhysical_Incident.Actor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actor</em>' containment reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Actor</em>' containment reference list.
	 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getIncidentDiagram_Actor()
	 * @model containment="true"
	 * @generated
	 */
	EList<Actor> getActor();

	/**
	 * Returns the value of the '<em><b>Connection</b></em>' containment
	 * reference list. The list contents are of type
	 * {@link cyberPhysical_Incident.Connection}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Connection</em>' containment reference
	 *         list.
	 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getIncidentDiagram_Connection()
	 * @model containment="true"
	 * @generated
	 */
	EList<Connection> getConnection();

	/**
	 * Returns the value of the '<em><b>Paths</b></em>' containment reference
	 * list. The list contents are of type {@link cyberPhysical_Incident.Path}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paths</em>' containment reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Paths</em>' containment reference list.
	 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getIncidentDiagram_Paths()
	 * @model containment="true"
	 * @generated
	 */
	EList<Path> getPaths();

} // IncidentDiagram
