/**
 */
package cyberPhysical_Incident.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

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
import cyberPhysical_Incident.IncidentDiagram;
import cyberPhysical_Incident.InnerName;
import externalUtility.BigraphNode;
import it.uniud.mads.jlibbig.core.std.Bigraph;
import it.uniud.mads.jlibbig.core.std.BigraphBuilder;
import it.uniud.mads.jlibbig.core.std.Handle;
import it.uniud.mads.jlibbig.core.std.Node;
import it.uniud.mads.jlibbig.core.std.OuterName;
import it.uniud.mads.jlibbig.core.std.Root;
import it.uniud.mads.jlibbig.core.std.Signature;
import it.uniud.mads.jlibbig.core.std.SignatureBuilder;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Bigraph
 * Expression</b></em>'. <!-- end-user-doc -->
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getEntity()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> entity;

	/**
	 * The cached value of the '{@link #getInnername() <em>Innername</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getInnername()
	 * @generated
	 * @ordered
	 */
	protected EList<InnerName> innername;

	protected int maxOuterNameNumber = 10;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected BigraphExpressionImpl() {
		super();
	}

	public String getContainer(String entityName) {

		String container = null;

		for (Entity entity : this.getEntity()) {

			// if the entity is a root entity
			if (entity.getName().equals(entityName)) {
				return "";
			}
			container = checkChildren(entity, entityName);

			if (container != null) {
				break;
			}

		}

		return container;
	}

	public List<Entity> getContainedEntities(String entityName) {

		LinkedList<Entity> containedEntities = null;
		List<Entity> tmp = null;

		for (Entity entity : this.getEntity()) {
			if (entity.getName().equals(entityName)) {
				tmp = entity.getEntity();
				break;
			}

			if (entity.getEntity().size() > 0) {
				tmp = getContainedEntities(entityName, entity.getEntity());
			}

			if (tmp != null) {
				break;
			}
		}

		if (tmp != null) {
			containedEntities = new LinkedList<Entity>();
			containedEntities.addAll(tmp);
		}

		return containedEntities;

	}

	public List<Connectivity> getConnections(String entityName1, String entityName2) {
		LinkedList<Connectivity> connections = null;

		Entity entity1 = getEntity(entityName1);
		Entity entity2 = getEntity(entityName2);

		if (entity1 == null || entity2 == null) {
			return null;
		}

		connections = new LinkedList<Connectivity>();

		for (Connectivity con1 : entity1.getConnectivity()) {
			for (Connectivity con2 : entity2.getConnectivity()) {
				// if both connectivity have the same name then they are the
				// same
				if (con1.getName().equals(con2.getName())) {
					// add anyone of them
					connections.add(con1);
					break;
				}
			}
		}

		return connections;

	}

	public void replaceEntityName(String oldEntityName, String newEntityName) {

		Entity e = getEntity(oldEntityName);

		if (e != null) {
			e.setName(newEntityName);
		}
	}

	public Entity getEntity(String entityName) {

		Entity result = null;

		// finds first occurance of entityName
		for (Entity entity : getEntity()) {

			if (entity.getName().equals(entityName)) {
				result = entity;
				break;
			}
			if (!entity.getEntity().isEmpty()) {
				result = getEntity(entityName, entity.getEntity());
			}

			if (result != null) {
				break;
			}
		}

		return result;
	}

	protected Entity getEntity(String entityName, List<Entity> list) {

		Entity result = null;

		for (Entity entity : list) {
			if (entity.getName().equals(entityName)) {
				result = entity;
				break;
			}
			if (!entity.getEntity().isEmpty()) {
				result = getEntity(entityName, entity.getEntity());
			}
		}
		return result;
	}

	protected LinkedList<Entity> getContainedEntities(String entityName, List<Entity> list) {

		LinkedList<Entity> containedentities = null;
		List<Entity> tmp = null;

		for (Entity entity : list) {

			if (entity.getName().equals(entityName)) {
				tmp = entity.getEntity();
				break;
			}

			if (entity.getEntity().size() > 0) {
				tmp = getContainedEntities(entityName, entity.getEntity());
			}
		}

		if (tmp != null) {
			containedentities = new LinkedList<Entity>();
			containedentities.addAll(tmp);
		}

		return containedentities;
	}

	protected String checkChildren(Entity parentEntity, String entityName) {

		// boolean isChildrenMatched = false;
		for (Entity entity : parentEntity.getEntity()) {
			if (entity.getName().equalsIgnoreCase(entityName)) {
				return parentEntity.getName();
			}

			/*
			 * if (entity.getEntity().size()>0){ return checkChildren(entity,
			 * entityName); }
			 */

			/*
			 * if(isChildrenMatched) { return true; }
			 */
		}

		return null;
	}

	public boolean isEmpty() {
		
		if(getEntity().isEmpty()) {
			return true;
		}
		
		return false;
	}
	
	public Bigraph createBigraph(boolean isGround) {

		BigraphNode node;
		Map<String, externalUtility.BigraphNode> nodes = new HashMap<String, externalUtility.BigraphNode>();
		//SignatureBuilder sigBuilder = new SignatureBuilder();

		int numOfRoots = 0;

		for (Entity ent : getEntity()) {

			node = new BigraphNode();

			node.setId(ent.getName());

			/*// add site
			node.setSite(ent.getSite() != null ? true : false);*/

			// add parent
			node.setParentRoot(numOfRoots);
			numOfRoots++;

			// add control (currently same as the name of the entity)
			node.setControl(ent.getName());

			// add connectivity (outernames)
			for (Connectivity con : ent.getConnectivity()) {
				node.addOuterName(con.getName(), con.isIsClosed());
			}

			nodes.put(node.getId(), node);

			// create a bigraph signature out of each entity and max arity
			// number
			//sigBuilder.add(ent.getName(), true, maxOuterNameNumber);

			addChildren(node, ent.getEntity(), nodes, isGround);
		}

		//Signature signature = sigBuilder.makeSignature();

		return BuildBigraph(nodes, IncidentDiagramImpl.signature);

	}
	
	/*public Bigraph createBigraph(Signature signature) {

		BigraphNode node;
		Map<String, externalUtility.BigraphNode> nodes = new HashMap<String, externalUtility.BigraphNode>();

		int numOfRoots = 0;

		for (Entity ent : getEntity()) {

			node = new BigraphNode();

			node.setId(ent.getName());

			// add site
			node.setSite(ent.getSite() != null ? true : false);

			// add parent
			node.setParentRoot(numOfRoots);
			numOfRoots++;

			// add control (currently same as the name of the entity)
			node.setControl(ent.getName());

			// add connectivity (outernames)
			for (Connectivity con : ent.getConnectivity()) {
				node.addOuterName(con.getName(), con.isIsClosed());
			}

			nodes.put(node.getId(), node);

			addChildren(node, ent.getEntity(), nodes, false);
		}

		return BuildBigraph(nodes, signature);

	}
*/
	protected Bigraph BuildBigraph(Map<String, BigraphNode> nodes, Signature signature) {

		LinkedList<BigraphNode.OuterName> outerNames = new LinkedList<BigraphNode.OuterName>();
		LinkedList<BigraphNode.InnerName> innerNames = new LinkedList<BigraphNode.InnerName>();
		HashMap<String, it.uniud.mads.jlibbig.core.std.OuterName> libBigOuterNames = new HashMap<String, it.uniud.mads.jlibbig.core.std.OuterName>();
		HashMap<String, it.uniud.mads.jlibbig.core.std.InnerName> libBigInnerNames = new HashMap<String, it.uniud.mads.jlibbig.core.std.InnerName>();
		HashMap<String, Node> libBigNodes = new HashMap<String, Node>();
		LinkedList<Root> libBigRoots = new LinkedList<Root>();
		
		// create bigraph
		BigraphBuilder biBuilder = new BigraphBuilder(signature);

		// create roots for the bigraph
		for (int i = 0; i < getEntity().size(); i++) {
			libBigRoots.add(biBuilder.addRoot(i));
		}

		int difference;
		int arity;
		int newSize = 0;
		LinkedList<BigraphNode.OuterName> names;

		///// To avoid the issue of matching using outernames, I don't create
		///// outernames
		//// but if there are outernames for a node then I add a special node
		///// called "connected" which donates that this node is connected to
		///// the installation bus
		///// this solution should be temporary and we should find a way to use
		///// the outernames (links) to match connectivity based on it

		for (BigraphNode n : nodes.values()) {

			// create bigraph outernames
			arity = maxOuterNameNumber;
			names = n.getOuterNamesObjects();
			difference = names.size() - arity;
			// if the node has more outernames than that in the signature and
			// knowledge is partial, then only add outernames equal to the arity
			// other option is to leave it, then the other extra outernames will
			// be defined as empty i.e. XX:o<-{}
			if (difference > 0 && n.isKnowledgePartial()) {
				newSize = arity;
			} else {
				newSize = names.size();
			}
			for (int i = 0; i < newSize; i++) {
				if (!outerNames.contains(names.get(i))) {
					libBigOuterNames.put(names.get(i).getName(), biBuilder.addOuterName(names.get(i).getName()));
					// biBuilder.closeOuterName(names.get(i).getName());
					outerNames.add(names.get(i));
				}

			}

			// create bigraph inner names
			for (BigraphNode.InnerName in : n.getInnerNamesObjects()) {
				if (!innerNames.contains(in)) {
					libBigInnerNames.put(in.getName(), biBuilder.addInnerName(in.getName()));
					innerNames.add(in);
				}
			}
		}

		// initial creation of bigraph nodes
		for (BigraphNode nd : nodes.values()) {
			if (libBigNodes.containsKey(nd.getId())) {
				continue;
			}
			createNode(nd, biBuilder, libBigRoots, libBigOuterNames, libBigNodes);
		}

		// close outernames after creating nodes of the Bigraph
		// this turns them into edges (or links) in the Bigraph object
		for (BigraphNode.OuterName out : outerNames) {
			if (out.isClosed()) {
				biBuilder.closeOuterName(out.getName());
			}
		}

		/*
		 * LinkedList<String> visited = new LinkedList<String>();
		 * for(BigraphNode nd : nodes.values()) { for(BigraphNode.OuterName ot :
		 * nd.getOuterNamesObjects()) { if(ot.isClosed() &&
		 * libBigOuterNames.containsKey(ot.getName()) &&
		 * !visited.contains(ot.getName())) {
		 * biBuilder.closeOuterName(ot.getName()); visited.add(ot.getName()); }
		 * } }
		 */

		// close every outername....should be removed...it is just for testing
		/*
		 * for(OuterName ot : libBigOuterNames.values()) {
		 * biBuilder.closeOuterName(ot); }
		 */

		// close innernames after creating nodes of the Bigraph
		for (BigraphNode.InnerName in : innerNames) {
			if (in.isClosed()) {
				biBuilder.closeInnerName(in.getName());
			}
		}

		// add sites to bigraph
		for (BigraphNode n : nodes.values()) {
			if (n.hasSite()) {
				biBuilder.addSite(libBigNodes.get(n.getId()));
			}
		}

		// System.out.println("a "+biBuilder.makeBigraph());
		return biBuilder.makeBigraph();
	}

	protected Node createNode(BigraphNode node, BigraphBuilder biBuilder, LinkedList<Root> libBigRoots,
			HashMap<String, OuterName> outerNames, HashMap<String, Node> nodes) {

		LinkedList<Handle> names = new LinkedList<Handle>();
		OuterName tmp;
		// find the difference between the outernames (i.e. connections) of the
		// node and the outernames defined for that node in the signature
		int difference = node.getOuterNames().size() - maxOuterNameNumber;

		// if knowledge is partial for the node,
		if (node.isKnowledgePartial()) {
			// then if number of outernames less than that in the signature,
			while (difference < 0) {
				// then the rest are either:
				// 1-created, added for that node.
				tmp = biBuilder.addOuterName();
				outerNames.put(tmp.getName(), tmp);
				node.addOuterName(tmp.getName());
				difference++;
				// 2-create, added, then closed for that node (they become links
				// or edges i.e. XX:e)
			}
			// if it is more than that in the signature, then

		} else {
			// if knowledge is exact and number of outernames are different,
			while (difference < 0) {
				// then create and close for that node.
				tmp = biBuilder.addOuterName();
				// close outernames
				biBuilder.closeOuterName(tmp);
				outerNames.put(tmp.getName(), tmp);
				node.addOuterName(tmp.getName());
				difference++;
			}
		}

		for (String n : node.getOuterNames()) {
			names.add(outerNames.get(n));
		}

		// if the parent is a root
		if (node.isParentRoot()) { // if the parent is a root
			Node n = biBuilder.addNode(node.getControl(), libBigRoots.get(node.getParentRoot()), names);

			nodes.put(node.getId(), n);
			return n;
		}

		// if the parent is already created as a node in the bigraph
		if (nodes.containsKey(node.getParent().getId())) {
			Node n = biBuilder.addNode(node.getControl(), nodes.get(node.getParent().getId()), names);

			nodes.put(node.getId(), n);
			return n;
		}

		// a node will take as outernames only the number specified in the
		// bigraph signature
		// for example, if a node has arity 2, then it will take only two
		// outernames (the first two) and ignore any other that might exist in
		// the names variable
		// if the number of outernames defined are less than in the signature,
		// then the rest of outernames will be defined as links (i.e. XX:e)
		Node n = biBuilder.addNode(node.getControl(),
				createNode(node.getParent(), biBuilder, libBigRoots, outerNames, nodes), names);

		nodes.put(node.getId(), n);
		return n;

	}

	protected void addChildren(BigraphNode parent, EList<Entity> entities, Map<String, BigraphNode> nodes,
			boolean isGround) {

		BigraphNode node;

		for (Entity entity : entities) {
			node = new BigraphNode();

			node.setId(entity.getName());

			if(!isGround) {
				// add site
				node.setSite(entity.getSite() != null ? true : false);	
			}
			
			// add parent
			node.setParent(parent);

			// add control (currently same as the name of the entity
			node.setControl(entity.getName());

			// add connectivity (outernames)
			for (Connectivity con : entity.getConnectivity()) {
				node.addOuterName(con.getName(), con.isIsClosed());
			}

			nodes.put(node.getId(), node);
			
			addChildren(node, entity.getEntity(), nodes, isGround);
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CyberPhysicalIncidentPackage.Literals.BIGRAPH_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getEntity() {
		if (entity == null) {
			entity = new EObjectContainmentEList<Entity>(Entity.class, this, CyberPhysicalIncidentPackage.BIGRAPH_EXPRESSION__ENTITY);
		}
		return entity;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InnerName> getInnername() {
		if (innername == null) {
			innername = new EObjectContainmentEList<InnerName>(InnerName.class, this, CyberPhysicalIncidentPackage.BIGRAPH_EXPRESSION__INNERNAME);
		}
		return innername;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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

} // BigraphExpressionImpl
