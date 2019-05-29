/**
 */
package cyberPhysical_Incident;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Incident Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cyberPhysical_Incident.IncidentEntity#getName <em>Name</em>}</li>
 *   <li>{@link cyberPhysical_Incident.IncidentEntity#getProperties <em>Properties</em>}</li>
 *   <li>{@link cyberPhysical_Incident.IncidentEntity#getType <em>Type</em>}</li>
 *   <li>{@link cyberPhysical_Incident.IncidentEntity#getMobility <em>Mobility</em>}</li>
 * </ul>
 *
 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getIncidentEntity()
 * @model
 * @generated
 */
public interface IncidentEntity extends ActivityInitiator, Location {
	
	
	//boolean loadEntityInformation(String xmlInfo);
	boolean contains(String entityName);
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
	 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getIncidentEntity_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link cyberPhysical_Incident.IncidentEntity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link cyberPhysical_Incident.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getIncidentEntity_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getProperties();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(Type)
	 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getIncidentEntity_Type()
	 * @model containment="true"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link cyberPhysical_Incident.IncidentEntity#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);
	/**
	 * Returns the value of the '<em><b>Mobility</b></em>' attribute.
	 * The literals are from the enumeration {@link cyberPhysical_Incident.Mobility}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mobility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mobility</em>' attribute.
	 * @see cyberPhysical_Incident.Mobility
	 * @see #setMobility(Mobility)
	 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getIncidentEntity_Mobility()
	 * @model
	 * @generated
	 */
	Mobility getMobility();
	/**
	 * Sets the value of the '{@link cyberPhysical_Incident.IncidentEntity#getMobility <em>Mobility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mobility</em>' attribute.
	 * @see cyberPhysical_Incident.Mobility
	 * @see #getMobility()
	 * @generated
	 */
	void setMobility(Mobility value);

} // IncidentEntity
