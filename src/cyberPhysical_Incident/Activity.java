/**
 */
package cyberPhysical_Incident;

import java.util.Date;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cyberPhysical_Incident.Activity#getName <em>Name</em>}</li>
 *   <li>{@link cyberPhysical_Incident.Activity#getFacilitatingConditions <em>Facilitating Conditions</em>}</li>
 *   <li>{@link cyberPhysical_Incident.Activity#getCertainty <em>Certainty</em>}</li>
 *   <li>{@link cyberPhysical_Incident.Activity#getDuration <em>Duration</em>}</li>
 *   <li>{@link cyberPhysical_Incident.Activity#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link cyberPhysical_Incident.Activity#getNextActivities <em>Next Activities</em>}</li>
 *   <li>{@link cyberPhysical_Incident.Activity#getPreviousActivities <em>Previous Activities</em>}</li>
 *   <li>{@link cyberPhysical_Incident.Activity#getPaths <em>Paths</em>}</li>
 *   <li>{@link cyberPhysical_Incident.Activity#getGoals <em>Goals</em>}</li>
 *   <li>{@link cyberPhysical_Incident.Activity#getInitiator <em>Initiator</em>}</li>
 *   <li>{@link cyberPhysical_Incident.Activity#getAccomplices <em>Accomplices</em>}</li>
 *   <li>{@link cyberPhysical_Incident.Activity#getVictims <em>Victims</em>}</li>
 *   <li>{@link cyberPhysical_Incident.Activity#getTargetedAssets <em>Targeted Assets</em>}</li>
 *   <li>{@link cyberPhysical_Incident.Activity#getEndTime <em>End Time</em>}</li>
 *   <li>{@link cyberPhysical_Incident.Activity#getResources <em>Resources</em>}</li>
 *   <li>{@link cyberPhysical_Incident.Activity#getExploitedAssets <em>Exploited Assets</em>}</li>
 *   <li>{@link cyberPhysical_Incident.Activity#getType <em>Type</em>}</li>
 *   <li>{@link cyberPhysical_Incident.Activity#getBehaviourType <em>Behaviour Type</em>}</li>
 *   <li>{@link cyberPhysical_Incident.Activity#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link cyberPhysical_Incident.Activity#getLocation <em>Location</em>}</li>
 *   <li>{@link cyberPhysical_Incident.Activity#getDescription <em>Description</em>}</li>
 *   <li>{@link cyberPhysical_Incident.Activity#getSystemAction <em>System Action</em>}</li>
 *   <li>{@link cyberPhysical_Incident.Activity#getPostcondition <em>Postcondition</em>}</li>
 * </ul>
 *
 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getActivity()
 * @model
 * @generated
 */
public interface Activity extends EObject {
	
	public static final int CONNECTIONS_NUMBER_SAME = 0;
	public static final int CONNECTIONS_NUMBER_INCREASED = 1;
	public static final int CONNECTIONS_NUMBER_DECREASED = 2;
	public static final int ERROR = -1;
	
	//boolean sourceEntityContainsTargetEntity(IncidentEntity sourceEntity, IncidentEntity targetEntity);
	boolean isInitiatorMoved();
	String getInitiatorContainer(int expressionType);
	List<String> getInitiatorContainedEntities(int expressionType);
	int getConnectionChangesBetweenEntities(String entity1, String entity2);
	void replaceEntityName(String oldEntityName, String newEntityName);
	
	/**
	 * Returns the entities contained by the initiator both in the pre and post conditions
	 * @return List of entity names
	 */
	List<String> getInitiatorContainedEntities();
	
	/**
	 * Determines if the connections of the given entity name change from the pre to the post condition
	 * @param entityName the entity name
	 * @return 0 if there is no change. 1 if the connections number increase from pre to post. 2 if the connections number decrease. -1 if there is an error.
	 */
	int connectionsChanged(String entityName);
	
	
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getActivity_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	//Activity mergeActivities();
	/**
	 * Sets the value of the '{@link cyberPhysical_Incident.Activity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Facilitating Conditions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facilitating Conditions</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facilitating Conditions</em>' attribute list.
	 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getActivity_FacilitatingConditions()
	 * @model
	 * @generated
	 */
	EList<String> getFacilitatingConditions();

	/**
	 * Returns the value of the '<em><b>Certainty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Certainty</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Certainty</em>' attribute.
	 * @see #setCertainty(double)
	 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getActivity_Certainty()
	 * @model
	 * @generated
	 */
	double getCertainty();

	/**
	 * Sets the value of the '{@link cyberPhysical_Incident.Activity#getCertainty <em>Certainty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Certainty</em>' attribute.
	 * @see #getCertainty()
	 * @generated
	 */
	void setCertainty(double value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(int)
	 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getActivity_Duration()
	 * @model
	 * @generated
	 */
	int getDuration();

	/**
	 * Sets the value of the '{@link cyberPhysical_Incident.Activity#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(int value);

	/**
	 * Returns the value of the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Time</em>' attribute.
	 * @see #setStartTime(Date)
	 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getActivity_StartTime()
	 * @model
	 * @generated
	 */
	Date getStartTime();

	/**
	 * Sets the value of the '{@link cyberPhysical_Incident.Activity#getStartTime <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Time</em>' attribute.
	 * @see #getStartTime()
	 * @generated
	 */
	void setStartTime(Date value);

	/**
	 * Returns the value of the '<em><b>Next Activities</b></em>' reference list.
	 * The list contents are of type {@link cyberPhysical_Incident.Activity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Activities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Activities</em>' reference list.
	 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getActivity_NextActivities()
	 * @model
	 * @generated
	 */
	EList<Activity> getNextActivities();

	/**
	 * Returns the value of the '<em><b>Previous Activities</b></em>' reference list.
	 * The list contents are of type {@link cyberPhysical_Incident.Activity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous Activities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous Activities</em>' reference list.
	 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getActivity_PreviousActivities()
	 * @model
	 * @generated
	 */
	EList<Activity> getPreviousActivities();

	/**
	 * Returns the value of the '<em><b>Paths</b></em>' reference list.
	 * The list contents are of type {@link cyberPhysical_Incident.Path}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paths</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paths</em>' reference list.
	 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getActivity_Paths()
	 * @model
	 * @generated
	 */
	EList<Path> getPaths();

	/**
	 * Returns the value of the '<em><b>Goals</b></em>' reference list.
	 * The list contents are of type {@link cyberPhysical_Incident.Goal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Goals</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goals</em>' reference list.
	 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getActivity_Goals()
	 * @model
	 * @generated
	 */
	EList<Goal> getGoals();

	/**
	 * Returns the value of the '<em><b>Initiator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initiator</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initiator</em>' reference.
	 * @see #setInitiator(ActivityInitiator)
	 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getActivity_Initiator()
	 * @model
	 * @generated
	 */
	ActivityInitiator getInitiator();

	/**
	 * Sets the value of the '{@link cyberPhysical_Incident.Activity#getInitiator <em>Initiator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initiator</em>' reference.
	 * @see #getInitiator()
	 * @generated
	 */
	void setInitiator(ActivityInitiator value);

	/**
	 * Returns the value of the '<em><b>Accomplices</b></em>' reference list.
	 * The list contents are of type {@link cyberPhysical_Incident.Actor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accomplices</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accomplices</em>' reference list.
	 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getActivity_Accomplices()
	 * @model
	 * @generated
	 */
	EList<Actor> getAccomplices();

	/**
	 * Returns the value of the '<em><b>Victims</b></em>' reference list.
	 * The list contents are of type {@link cyberPhysical_Incident.Actor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Victims</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Victims</em>' reference list.
	 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getActivity_Victims()
	 * @model
	 * @generated
	 */
	EList<Actor> getVictims();

	/**
	 * Returns the value of the '<em><b>Targeted Assets</b></em>' reference list.
	 * The list contents are of type {@link cyberPhysical_Incident.Asset}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Targeted Assets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Targeted Assets</em>' reference list.
	 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getActivity_TargetedAssets()
	 * @model
	 * @generated
	 */
	EList<Asset> getTargetedAssets();

	/**
	 * Returns the value of the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Time</em>' attribute.
	 * @see #setEndTime(Date)
	 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getActivity_EndTime()
	 * @model
	 * @generated
	 */
	Date getEndTime();

	/**
	 * Sets the value of the '{@link cyberPhysical_Incident.Activity#getEndTime <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Time</em>' attribute.
	 * @see #getEndTime()
	 * @generated
	 */
	void setEndTime(Date value);

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' reference list.
	 * The list contents are of type {@link cyberPhysical_Incident.Resource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' reference list.
	 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getActivity_Resources()
	 * @model
	 * @generated
	 */
	EList<Resource> getResources();

	/**
	 * Returns the value of the '<em><b>Exploited Assets</b></em>' reference list.
	 * The list contents are of type {@link cyberPhysical_Incident.Asset}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exploited Assets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exploited Assets</em>' reference list.
	 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getActivity_ExploitedAssets()
	 * @model
	 * @generated
	 */
	EList<Asset> getExploitedAssets();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link cyberPhysical_Incident.ActivityType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see cyberPhysical_Incident.ActivityType
	 * @see #setType(ActivityType)
	 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getActivity_Type()
	 * @model
	 * @generated
	 */
	ActivityType getType();

	/**
	 * Sets the value of the '{@link cyberPhysical_Incident.Activity#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see cyberPhysical_Incident.ActivityType
	 * @see #getType()
	 * @generated
	 */
	void setType(ActivityType value);

	/**
	 * Returns the value of the '<em><b>Behaviour Type</b></em>' attribute.
	 * The literals are from the enumeration {@link cyberPhysical_Incident.Behaviour}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behaviour Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behaviour Type</em>' attribute.
	 * @see cyberPhysical_Incident.Behaviour
	 * @see #setBehaviourType(Behaviour)
	 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getActivity_BehaviourType()
	 * @model
	 * @generated
	 */
	Behaviour getBehaviourType();

	/**
	 * Sets the value of the '{@link cyberPhysical_Incident.Activity#getBehaviourType <em>Behaviour Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behaviour Type</em>' attribute.
	 * @see cyberPhysical_Incident.Behaviour
	 * @see #getBehaviourType()
	 * @generated
	 */
	void setBehaviourType(Behaviour value);

	/**
	 * Returns the value of the '<em><b>Precondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precondition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precondition</em>' containment reference.
	 * @see #setPrecondition(Precondition)
	 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getActivity_Precondition()
	 * @model containment="true"
	 * @generated
	 */
	Precondition getPrecondition();
	/**
	 * Sets the value of the '{@link cyberPhysical_Incident.Activity#getPrecondition <em>Precondition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precondition</em>' containment reference.
	 * @see #getPrecondition()
	 * @generated
	 */
	void setPrecondition(Precondition value);
	/**
	 * Returns the value of the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' reference.
	 * @see #setLocation(Location)
	 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getActivity_Location()
	 * @model
	 * @generated
	 */
	Location getLocation();

	/**
	 * Sets the value of the '{@link cyberPhysical_Incident.Activity#getLocation <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Location value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getActivity_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link cyberPhysical_Incident.Activity#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>System Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Action</em>' attribute.
	 * @see #setSystemAction(String)
	 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getActivity_SystemAction()
	 * @model
	 * @generated
	 */
	String getSystemAction();

	/**
	 * Sets the value of the '{@link cyberPhysical_Incident.Activity#getSystemAction <em>System Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Action</em>' attribute.
	 * @see #getSystemAction()
	 * @generated
	 */
	void setSystemAction(String value);
	/**
	 * Returns the value of the '<em><b>Postcondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Postcondition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postcondition</em>' containment reference.
	 * @see #setPostcondition(Postcondition)
	 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getActivity_Postcondition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Postcondition getPostcondition();
	/**
	 * Sets the value of the '{@link cyberPhysical_Incident.Activity#getPostcondition <em>Postcondition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postcondition</em>' containment reference.
	 * @see #getPostcondition()
	 * @generated
	 */
	void setPostcondition(Postcondition value);

} // Activity
