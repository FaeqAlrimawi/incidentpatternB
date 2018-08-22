/**
 */
package cyberPhysical_Incident;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cyberPhysical_Incident.Actor#getRole <em>Role</em>}</li>
 *   <li>{@link cyberPhysical_Incident.Actor#getLevel <em>Level</em>}</li>
 * </ul>
 *
 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getActor()
 * @model
 * @generated
 */
public interface Actor extends IncidentEntity {
	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * The literals are from the enumeration {@link cyberPhysical_Incident.ActorRole}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see cyberPhysical_Incident.ActorRole
	 * @see #setRole(ActorRole)
	 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getActor_Role()
	 * @model
	 * @generated
	 */
	ActorRole getRole();

	/**
	 * Sets the value of the '{@link cyberPhysical_Incident.Actor#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see cyberPhysical_Incident.ActorRole
	 * @see #getRole()
	 * @generated
	 */
	void setRole(ActorRole value);

	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * The literals are from the enumeration {@link cyberPhysical_Incident.ActorLevel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see cyberPhysical_Incident.ActorLevel
	 * @see #setLevel(ActorLevel)
	 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getActor_Level()
	 * @model
	 * @generated
	 */
	ActorLevel getLevel();

	/**
	 * Sets the value of the '{@link cyberPhysical_Incident.Actor#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see cyberPhysical_Incident.ActorLevel
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(ActorLevel value);

} // Actor
