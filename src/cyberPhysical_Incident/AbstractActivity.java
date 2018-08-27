/**
 */
package cyberPhysical_Incident;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cyberPhysical_Incident.AbstractActivity#getBehaviourType <em>Behaviour Type</em>}</li>
 *   <li>{@link cyberPhysical_Incident.AbstractActivity#getDuration <em>Duration</em>}</li>
 *   <li>{@link cyberPhysical_Incident.AbstractActivity#getType <em>Type</em>}</li>
 *   <li>{@link cyberPhysical_Incident.AbstractActivity#getSystemAction <em>System Action</em>}</li>
 *   <li>{@link cyberPhysical_Incident.AbstractActivity#getExploitedAssets <em>Exploited Assets</em>}</li>
 *   <li>{@link cyberPhysical_Incident.AbstractActivity#getTargetAssets <em>Target Assets</em>}</li>
 *   <li>{@link cyberPhysical_Incident.AbstractActivity#getResources <em>Resources</em>}</li>
 *   <li>{@link cyberPhysical_Incident.AbstractActivity#getLocation <em>Location</em>}</li>
 *   <li>{@link cyberPhysical_Incident.AbstractActivity#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link cyberPhysical_Incident.AbstractActivity#getPostcondition <em>Postcondition</em>}</li>
 *   <li>{@link cyberPhysical_Incident.AbstractActivity#getActivityinitiator <em>Activityinitiator</em>}</li>
 *   <li>{@link cyberPhysical_Incident.AbstractActivity#getVictims <em>Victims</em>}</li>
 * </ul>
 *
 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getAbstractActivity()
 * @model
 * @generated
 */
public interface AbstractActivity extends EObject {
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
	 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getAbstractActivity_Duration()
	 * @model
	 * @generated
	 */
	int getDuration();

	/**
	 * Sets the value of the '{@link cyberPhysical_Incident.AbstractActivity#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(int value);

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
	 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getAbstractActivity_Type()
	 * @model
	 * @generated
	 */
	ActivityType getType();

	/**
	 * Sets the value of the '{@link cyberPhysical_Incident.AbstractActivity#getType <em>Type</em>}' attribute.
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
	 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getAbstractActivity_BehaviourType()
	 * @model
	 * @generated
	 */
	Behaviour getBehaviourType();

	/**
	 * Sets the value of the '{@link cyberPhysical_Incident.AbstractActivity#getBehaviourType <em>Behaviour Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behaviour Type</em>' attribute.
	 * @see cyberPhysical_Incident.Behaviour
	 * @see #getBehaviourType()
	 * @generated
	 */
	void setBehaviourType(Behaviour value);

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
	 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getAbstractActivity_SystemAction()
	 * @model
	 * @generated
	 */
	String getSystemAction();

	/**
	 * Sets the value of the '{@link cyberPhysical_Incident.AbstractActivity#getSystemAction <em>System Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Action</em>' attribute.
	 * @see #getSystemAction()
	 * @generated
	 */
	void setSystemAction(String value);

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
	 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getAbstractActivity_Precondition()
	 * @model containment="true"
	 * @generated
	 */
	Precondition getPrecondition();

	/**
	 * Sets the value of the '{@link cyberPhysical_Incident.AbstractActivity#getPrecondition <em>Precondition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precondition</em>' containment reference.
	 * @see #getPrecondition()
	 * @generated
	 */
	void setPrecondition(Precondition value);

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
	 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getAbstractActivity_Postcondition()
	 * @model containment="true"
	 * @generated
	 */
	Postcondition getPostcondition();

	/**
	 * Sets the value of the '{@link cyberPhysical_Incident.AbstractActivity#getPostcondition <em>Postcondition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postcondition</em>' containment reference.
	 * @see #getPostcondition()
	 * @generated
	 */
	void setPostcondition(Postcondition value);

	/**
	 * Returns the value of the '<em><b>Activityinitiator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activityinitiator</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activityinitiator</em>' reference.
	 * @see #setActivityinitiator(ActivityInitiator)
	 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getAbstractActivity_Activityinitiator()
	 * @model
	 * @generated
	 */
	ActivityInitiator getActivityinitiator();

	/**
	 * Sets the value of the '{@link cyberPhysical_Incident.AbstractActivity#getActivityinitiator <em>Activityinitiator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activityinitiator</em>' reference.
	 * @see #getActivityinitiator()
	 * @generated
	 */
	void setActivityinitiator(ActivityInitiator value);

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
	 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getAbstractActivity_Victims()
	 * @model
	 * @generated
	 */
	EList<Actor> getVictims();

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
	 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getAbstractActivity_Resources()
	 * @model
	 * @generated
	 */
	EList<Resource> getResources();

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
	 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getAbstractActivity_Location()
	 * @model
	 * @generated
	 */
	Location getLocation();

	/**
	 * Sets the value of the '{@link cyberPhysical_Incident.AbstractActivity#getLocation <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Location value);

	/**
	 * Returns the value of the '<em><b>Exploited Assets</b></em>' reference list.
	 * The list contents are of type {@link cyberPhysical_Incident.Asset}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exploited Assets</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exploited Assets</em>' reference list.
	 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getAbstractActivity_ExploitedAssets()
	 * @model
	 * @generated
	 */
	EList<Asset> getExploitedAssets();

	/**
	 * Returns the value of the '<em><b>Target Assets</b></em>' reference list.
	 * The list contents are of type {@link cyberPhysical_Incident.Asset}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Assets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Assets</em>' reference list.
	 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getAbstractActivity_TargetAssets()
	 * @model
	 * @generated
	 */
	EList<Asset> getTargetAssets();

} // AbstractActivity
