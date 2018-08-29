/**
 */
package cyberPhysical_Incident;

import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cyberPhysical_Incident.ActivityPattern#getName <em>Name</em>}</li>
 *   <li>{@link cyberPhysical_Incident.ActivityPattern#getSeverity <em>Severity</em>}</li>
 *   <li>{@link cyberPhysical_Incident.ActivityPattern#getDescription <em>Description</em>}</li>
 *   <li>{@link cyberPhysical_Incident.ActivityPattern#getSkillsRequired <em>Skills Required</em>}</li>
 *   <li>{@link cyberPhysical_Incident.ActivityPattern#getPatternsFollow <em>Patterns Follow</em>}</li>
 *   <li>{@link cyberPhysical_Incident.ActivityPattern#getAbstractActivity <em>Abstract Activity</em>}</li>
 *   <li>{@link cyberPhysical_Incident.ActivityPattern#getIncidententity <em>Incidententity</em>}</li>
 * </ul>
 *
 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getActivityPattern()
 * @model
 * @generated
 */
public interface ActivityPattern extends EObject {
	
	/**
	 * Compares the given actiivty sequence to the pattern to determine if it can map/satisfy it. 
	 * Satisfaction or mapping criteria can be different from one pattern to another. 
	 * However, it depends on what attributes/referneces/entities are defined in a pattern that should exist in an activity sequence
	 * @param activitySequence The sequence of activities to map this pattern against
	 * @return A new Activity object that represents the merge of the sequence. Or null if the sequence cannot be mapped
	 */
	Activity applyTo(List<Activity> activitySequence);
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
	 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getActivityPattern_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link cyberPhysical_Incident.ActivityPattern#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Severity</b></em>' attribute.
	 * The literals are from the enumeration {@link cyberPhysical_Incident.ActivityPatternSeverity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Severity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Severity</em>' attribute.
	 * @see cyberPhysical_Incident.ActivityPatternSeverity
	 * @see #setSeverity(ActivityPatternSeverity)
	 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getActivityPattern_Severity()
	 * @model
	 * @generated
	 */
	ActivityPatternSeverity getSeverity();

	/**
	 * Sets the value of the '{@link cyberPhysical_Incident.ActivityPattern#getSeverity <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity</em>' attribute.
	 * @see cyberPhysical_Incident.ActivityPatternSeverity
	 * @see #getSeverity()
	 * @generated
	 */
	void setSeverity(ActivityPatternSeverity value);

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
	 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getActivityPattern_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link cyberPhysical_Incident.ActivityPattern#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Skills Required</b></em>' attribute.
	 * The literals are from the enumeration {@link cyberPhysical_Incident.Skill_Level}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Skills Required</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skills Required</em>' attribute.
	 * @see cyberPhysical_Incident.Skill_Level
	 * @see #setSkillsRequired(Skill_Level)
	 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getActivityPattern_SkillsRequired()
	 * @model
	 * @generated
	 */
	Skill_Level getSkillsRequired();

	/**
	 * Sets the value of the '{@link cyberPhysical_Incident.ActivityPattern#getSkillsRequired <em>Skills Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Skills Required</em>' attribute.
	 * @see cyberPhysical_Incident.Skill_Level
	 * @see #getSkillsRequired()
	 * @generated
	 */
	void setSkillsRequired(Skill_Level value);

	/**
	 * Returns the value of the '<em><b>Patterns Follow</b></em>' reference list.
	 * The list contents are of type {@link cyberPhysical_Incident.ActivityPattern}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Patterns Follow</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patterns Follow</em>' reference list.
	 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getActivityPattern_PatternsFollow()
	 * @model
	 * @generated
	 */
	EList<ActivityPattern> getPatternsFollow();

	/**
	 * Returns the value of the '<em><b>Abstract Activity</b></em>' containment reference list.
	 * The list contents are of type {@link cyberPhysical_Incident.Activity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Activity</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Activity</em>' containment reference list.
	 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getActivityPattern_AbstractActivity()
	 * @model containment="true"
	 * @generated
	 */
	EList<Activity> getAbstractActivity();

	/**
	 * Returns the value of the '<em><b>Incidententity</b></em>' containment reference list.
	 * The list contents are of type {@link cyberPhysical_Incident.IncidentEntity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incidententity</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incidententity</em>' containment reference list.
	 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getActivityPattern_Incidententity()
	 * @model containment="true"
	 * @generated
	 */
	EList<IncidentEntity> getIncidententity();

} // ActivityPattern
