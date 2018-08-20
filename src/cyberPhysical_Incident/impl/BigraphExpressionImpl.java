/**
 */
package cyberPhysical_Incident.impl;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import cyberPhysical_Incident.BigraphExpression;
import cyberPhysical_Incident.Connectivity;
import cyberPhysical_Incident.CyberPhysicalIncidentPackage;
import cyberPhysical_Incident.Entity;
import cyberPhysical_Incident.InnerName;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bigraph Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cyberPhysical_Incident.impl.BigraphExpressionImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.BigraphExpressionImpl#getInnername <em>Innername</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BigraphExpressionImpl extends ExpressionImpl implements BigraphExpression {
	/**
	 * The cached value of the '{@link #getEntity() <em>Entity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> entity;

	/**
	 * The cached value of the '{@link #getInnername() <em>Innername</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnername()
	 * @generated
	 * @ordered
	 */
	protected EList<InnerName> innername;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BigraphExpressionImpl() {
		super();
	}
	
	
	public String getContainer(String entityName) {
		
		String container = null;
		
		for(Entity entity : this.getEntity()) {
			
			//if the entity is a root entity
			if(entity.getName().equals(entityName)) {
				return "";
			}
			container = checkChildren(entity, entityName);
			
			if(container != null) {
				break;
			}
			
		}
		
		return container;
	}

	public List<Entity> getContainedEntities(String entityName) {
		
		LinkedList<Entity> containedEntities = null;
		List<Entity> tmp = null;
		
		for(Entity entity: this.getEntity()) {
			if(entity.getName().equals(entityName)) {
				tmp = entity.getEntity(); 
				break;
			}
			
			if(entity.getEntity().size()>0) {
				tmp = getContainedEntities(entityName, entity.getEntity());
			}
			
			if(tmp != null) {
				break;
			}
		}
		
		if(tmp != null) {
			containedEntities = new LinkedList<Entity>();
				containedEntities.addAll(tmp);
		}
		
		return containedEntities;
		
	}
	
	public List<Connectivity> getConnections(String entityName1, String entityName2) {
		LinkedList<Connectivity> connections = null;
		
		Entity entity1 = getEntity(entityName1);
		Entity entity2 = getEntity(entityName2);
		
		if(entity1 == null || entity2 == null) {
			return null;
		}
		
		connections = new LinkedList<Connectivity>();
		
		for(Connectivity con1 : entity1.getConnectivity()) {
			for(Connectivity con2 : entity2.getConnectivity()) {
				//if both connectivity have the same name then they are the same
				if(con1.getName().equals(con2.getName())) {
					//add anyone of them
					connections.add(con1);
					break;
				}
			}
		}
		
		return connections;	
		
	}
	
	public void replaceEntityName(String oldEntityName, String newEntityName) {
	
		Entity e = getEntity(oldEntityName);
		
		if(e != null) {
			e.setName(newEntityName);
		} 
	}
	

	public Entity getEntity(String entityName) {
		
		Entity result = null;

		//finds first occurance of entityName
		for(Entity entity : getEntity()) {
			
			if (entity.getName().equals(entityName)) {
				result = entity;
				break;
			}
			if(!entity.getEntity().isEmpty()) {
				result = getEntity(entityName, entity.getEntity());
			}
			
			if(result != null) {
				break;
			}
		}
		
		return result;
	}
	
	protected Entity getEntity(String entityName, List<Entity> list) {
		
		Entity result = null;
		
		for(Entity entity : list) {
			if (entity.getName().equals(entityName)) {
				result = entity;
				break;
			}
			if(!entity.getEntity().isEmpty()) {
				result = getEntity(entityName, entity.getEntity());
			}
		}
		return result;
	}
	
	protected LinkedList<Entity> getContainedEntities(String entityName, List<Entity> list) {
		
		LinkedList<Entity> containedentities = null;
		List<Entity> tmp = null;
		
		for(Entity entity: list) {
		
			if(entity.getName().equals(entityName)) {	
				tmp = entity.getEntity();
				break;
			}
			
			if(entity.getEntity().size()>0) {
				tmp = getContainedEntities(entityName, entity.getEntity());
			}
		}
		
		if(tmp != null) {
			containedentities = new LinkedList<Entity>();
			containedentities.addAll(tmp);
		}
		
		return containedentities;
	}
	
	protected String checkChildren(Entity parentEntity, String entityName) {
		
		//boolean isChildrenMatched = false;
		for(Entity entity : parentEntity.getEntity()) {
			if(entity.getName().equalsIgnoreCase(entityName)) {
				return parentEntity.getName();
			} 
			
			/*if (entity.getEntity().size()>0){
				return checkChildren(entity, entityName);
			}*/
			
			/*if(isChildrenMatched) {
				return true;
			}*/
		}
		
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CyberPhysicalIncidentPackage.Literals.BIGRAPH_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getEntity() {
		if (entity == null) {
			entity = new EObjectContainmentEList<Entity>(Entity.class, this, CyberPhysicalIncidentPackage.BIGRAPH_EXPRESSION__ENTITY);
		}
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InnerName> getInnername() {
		if (innername == null) {
			innername = new EObjectContainmentEList<InnerName>(InnerName.class, this, CyberPhysicalIncidentPackage.BIGRAPH_EXPRESSION__INNERNAME);
		}
		return innername;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CyberPhysicalIncidentPackage.BIGRAPH_EXPRESSION__ENTITY:
				return ((InternalEList<?>)getEntity()).basicRemove(otherEnd, msgs);
			case CyberPhysicalIncidentPackage.BIGRAPH_EXPRESSION__INNERNAME:
				return ((InternalEList<?>)getInnername()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CyberPhysicalIncidentPackage.BIGRAPH_EXPRESSION__ENTITY:
				return getEntity();
			case CyberPhysicalIncidentPackage.BIGRAPH_EXPRESSION__INNERNAME:
				return getInnername();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CyberPhysicalIncidentPackage.BIGRAPH_EXPRESSION__ENTITY:
				getEntity().clear();
				getEntity().addAll((Collection<? extends Entity>)newValue);
				return;
			case CyberPhysicalIncidentPackage.BIGRAPH_EXPRESSION__INNERNAME:
				getInnername().clear();
				getInnername().addAll((Collection<? extends InnerName>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CyberPhysicalIncidentPackage.BIGRAPH_EXPRESSION__ENTITY:
				getEntity().clear();
				return;
			case CyberPhysicalIncidentPackage.BIGRAPH_EXPRESSION__INNERNAME:
				getInnername().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CyberPhysicalIncidentPackage.BIGRAPH_EXPRESSION__ENTITY:
				return entity != null && !entity.isEmpty();
			case CyberPhysicalIncidentPackage.BIGRAPH_EXPRESSION__INNERNAME:
				return innername != null && !innername.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BigraphExpressionImpl
