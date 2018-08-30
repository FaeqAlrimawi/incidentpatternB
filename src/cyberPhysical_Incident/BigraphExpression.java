/**
 */
package cyberPhysical_Incident;

import java.util.List;

import org.eclipse.emf.common.util.EList;

import it.uniud.mads.jlibbig.core.std.Bigraph;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bigraph Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cyberPhysical_Incident.BigraphExpression#getEntity <em>Entity</em>}</li>
 *   <li>{@link cyberPhysical_Incident.BigraphExpression#getInnername <em>Innername</em>}</li>
 * </ul>
 *
 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getBigraphExpression()
 * @model
 * @generated
 */
public interface BigraphExpression extends Expression {
	
	static final int PRECONDITION_EXPRESSION = 0;
	static final int POSTCONDITION_EXPRESSION = 1;
	
	String getContainer(String entityName);
	List<Entity> getContainedEntities(String entityName);
	List<Connectivity> getConnections(String entityName1, String entityName2);
	Entity getEntity(String entityName);
	void replaceEntityName(String oldeEntityName, String newEntityName);
	 boolean matches(BigraphExpression other);
	 Bigraph createBigraph();
	/**
	 * Returns the value of the '<em><b>Entity</b></em>' containment reference list.
	 * The list contents are of type {@link cyberPhysical_Incident.Entity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' containment reference list.
	 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getBigraphExpression_Entity()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Entity> getEntity();

	/**
	 * Returns the value of the '<em><b>Innername</b></em>' containment reference list.
	 * The list contents are of type {@link cyberPhysical_Incident.InnerName}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Innername</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Innername</em>' containment reference list.
	 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getBigraphExpression_Innername()
	 * @model containment="true"
	 * @generated
	 */
	EList<InnerName> getInnername();

} // BigraphExpression
