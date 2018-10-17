/**
 */
package cyberPhysical_Incident.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import cyberPhysical_Incident.Activity;
import cyberPhysical_Incident.Actor;
import cyberPhysical_Incident.Asset;
import cyberPhysical_Incident.BigraphExpression;
import cyberPhysical_Incident.Connection;
import cyberPhysical_Incident.CrimeScript;
import cyberPhysical_Incident.CyberPhysicalIncidentPackage;
import cyberPhysical_Incident.Entity;
import cyberPhysical_Incident.Goal;
import cyberPhysical_Incident.IncidentDiagram;
import cyberPhysical_Incident.IncidentEntity;
import cyberPhysical_Incident.Intent;
import cyberPhysical_Incident.Location;
import cyberPhysical_Incident.Motive;
import cyberPhysical_Incident.Path;
import cyberPhysical_Incident.Resource;
import cyberPhysical_Incident.Scene;
import it.uniud.mads.jlibbig.core.std.Signature;
import it.uniud.mads.jlibbig.core.std.SignatureBuilder;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Incident Diagram</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cyberPhysical_Incident.impl.IncidentDiagramImpl#getCrimeScript <em>Crime Script</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.IncidentDiagramImpl#getScene <em>Scene</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.IncidentDiagramImpl#getIntent <em>Intent</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.IncidentDiagramImpl#getGoal <em>Goal</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.IncidentDiagramImpl#getMotive <em>Motive</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.IncidentDiagramImpl#getAsset <em>Asset</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.IncidentDiagramImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.IncidentDiagramImpl#getActor <em>Actor</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.IncidentDiagramImpl#getConnection <em>Connection</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.IncidentDiagramImpl#getPaths <em>Paths</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IncidentDiagramImpl extends MinimalEObjectImpl.Container implements IncidentDiagram {


	/**
	 * The cached value of the '{@link #getCrimeScript() <em>Crime Script</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getCrimeScript()
	 * @generated
	 * @ordered
	 */
	protected CrimeScript crimeScript;

	/**
	 * The cached value of the '{@link #getScene() <em>Scene</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getScene()
	 * @generated
	 * @ordered
	 */
	protected EList<Scene> scene;

	/**
	 * The cached value of the '{@link #getIntent() <em>Intent</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getIntent()
	 * @generated
	 * @ordered
	 */
	protected Intent intent;

	/**
	 * The cached value of the '{@link #getGoal() <em>Goal</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getGoal()
	 * @generated
	 * @ordered
	 */
	protected EList<Goal> goal;

	/**
	 * The cached value of the '{@link #getMotive() <em>Motive</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMotive()
	 * @generated
	 * @ordered
	 */
	protected EList<Motive> motive;

	/**
	 * The cached value of the '{@link #getAsset() <em>Asset</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getAsset()
	 * @generated
	 * @ordered
	 */
	protected EList<Asset> asset;

	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> resource;

	/**
	 * The cached value of the '{@link #getActor() <em>Actor</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getActor()
	 * @generated
	 * @ordered
	 */
	protected EList<Actor> actor;

	/**
	 * The cached value of the '{@link #getConnection() <em>Connection</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getConnection()
	 * @generated
	 * @ordered
	 */
	protected EList<Connection> connection;

	/**
	 * The cached value of the '{@link #getPaths() <em>Paths</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPaths()
	 * @generated
	 * @ordered
	 */
	protected EList<Path> paths;
	
	//===added
	protected EList<Activity> activity;
	protected EList<IncidentEntity> incidentEntity;
	protected static Signature signature;

	// used for creating a global signature
	// larger number would slow down the matching
	protected int maxOuterNameNumber = 5;
	
	protected Map<String, Integer> activitiesSequence = null;
	protected List<IncidentEntity> isEntityUsedList = new LinkedList<IncidentEntity>();
	protected List<Connection> isConnectionUsedList = new LinkedList<Connection>();
	
	protected Map<String, IncidentEntity> entityMap = null;
	
	public boolean isUsed(IncidentEntity entity) {


		if(isEntityUsedList.contains(entity)) {
			return true;
		}
		
		List<IncidentEntity> entitiesvisited = new LinkedList<IncidentEntity>();
		
		// see if entity is used in the conditions of activities
		for (Activity act : getActivity()) {

			if (act.isEntityUsed(entity.getName())) {
				isEntityUsedList.add(entity);
				return true;
			}
		}

		entitiesvisited.add(entity);
		boolean isUsed = false;

		if (entity.getParentEntity() != null) {
			isUsed = isUsed((IncidentEntity) entity.getParentEntity(), entitiesvisited);

			if (isUsed) {
				isEntityUsedList.add(entity);
				return true;
			}
		}

		// see if one of the contained entities by the argument is used in one
		// of the activities
		for (Location loc : entity.getContainedEntities()) {

			IncidentEntity ent = (IncidentEntity) loc;

			if (ent.equals(entity)) {
				continue;
			}
		
			isUsed = isUsed(ent, entitiesvisited);

			if (isUsed) {
				isEntityUsedList.add(entity);
				return true;
			}
		}

		// see if any of its connections is used in an activity
		for (Connection con : entity.getConnections()) {
			if (isConnectionUsed(con)) {
				return true;
			}

			// check if the other end of the connection is used in any activity
			IncidentEntity conEnd1 = (IncidentEntity) con.getEntity1();
			IncidentEntity conEnd2 = (IncidentEntity) con.getEntity2();
			IncidentEntity otherEnd = null;

			if (!conEnd1.equals(entity) && conEnd2.equals(entity)) {
				otherEnd = conEnd1;
			} else if (!conEnd2.equals(entity) && conEnd1.equals(entity)) {
				otherEnd = conEnd2;
			}

			if (otherEnd != null && !entitiesvisited.contains(otherEnd)) {
				isUsed = isUsed(otherEnd, entitiesvisited);
				
				if(isUsed) {
					isEntityUsedList.add(entity);
					return true;
				}
			}
		}

		return false;
	}

	protected boolean isUsed(IncidentEntity entity, List<IncidentEntity> entitiesvisited) {
		
		if(isEntityUsedList.contains(entity)) {
			return true;
		}
		
		// see if entity is used in the conditions of activities
		for (Activity act : getActivity()) {

			if (act.isEntityUsed(entity.getName())) {
				isEntityUsedList.add(entity);
				return true;
			}
		}

		entitiesvisited.add(entity);
		
		boolean isUsed = false;

		IncidentEntity parent = (IncidentEntity)entity.getParentEntity();
		
		if (parent != null && !entitiesvisited.contains(parent)) {
			isUsed = isUsed((IncidentEntity) entity.getParentEntity(), entitiesvisited);

			if (isUsed) {
				isEntityUsedList.add(entity);
				return true;
			}
		}

		// see if one of the contained entities by the argument is used in one
		// of the activities
		for (Location loc : entity.getContainedEntities()) {

			IncidentEntity ent = (IncidentEntity) loc;

			if (entitiesvisited.contains(ent)) {
				continue;
			}

			isUsed = isUsed(ent, entitiesvisited);

			if (isUsed) {
				isEntityUsedList.add(entity);
				return true;
			}

		}

		// see if any of its connections is used in an activity
		for (Connection con : entity.getConnections()) {
			
			if (isConnectionUsed(con)) {
				return true;
			}

			// check if the other end of the connection is used in any activity
			IncidentEntity conEnd1 = (IncidentEntity) con.getEntity1();
			IncidentEntity conEnd2 = (IncidentEntity) con.getEntity2();
			IncidentEntity otherEnd = null;

			if (!conEnd1.equals(entity) && conEnd2.equals(entity)) {
				otherEnd = conEnd1;
			} else if (!conEnd2.equals(entity) && conEnd1.equals(entity)) {
				otherEnd = conEnd2;
			}

			if (otherEnd != null && !entitiesvisited.contains(otherEnd)) {
				isUsed = isUsed(otherEnd, entitiesvisited);
				
				if(isUsed) {
					return true;
				}
			}
		}

		return false;
	}

	public Activity getInitialActivity() {

		Scene initialScene = getInitialScene();

		if (initialScene != null) {
			return initialScene.getInitialActivity();
		}

		return null;
	}

	protected boolean isConnectionUsed(Connection connection) {

		if(isConnectionUsedList.contains(connection)) {
			return true;
		}
		
		String conName = connection.getName();
		
		for (Activity act : getActivity()) {
			if (act.isConnectionUsed(conName)) {
				isConnectionUsedList.add(connection);
				return true;
			}
		}

		return false;
	}

	public boolean activityNameExists(String activityName) {

		Map<String, Integer> activitiesSequence = getActivitySequence();

		if (activitiesSequence != null) {
			if (activitiesSequence.containsKey(activityName)) {
				return true;
			}
		} else {
			for (Activity act : getActivity()) {
				if (act.getName() != null && act.getName().equals(activityName)) {
					return true;
				}
			}
		}

		return false;
	}

	public Scene getInitialScene() {

		for (Scene scene : getScene()) {
			if (scene.getPreviousScenes() == null || scene.getPreviousScenes().size() == 0) {
				return scene;
			}

		}
		return null;
	}

	public Activity getInitialActivity(Scene scene) {

		if (scene != null) {
			return scene.getInitialActivity();
		}

		return null;
	}

	public Signature createBigraphSignature() {

		setMaxNumberOfuterNames();

		SignatureBuilder sigBuilder = new SignatureBuilder();
		EList<IncidentEntity> entities = new BasicEList<IncidentEntity>();

		entities.addAll(getAsset());
		entities.addAll(getResource());
		entities.addAll(getActor());

		for (IncidentEntity ent : entities) {
			// create a bigraph signature out of each entity and max arity
			// number
			sigBuilder.add(ent.getName(), true, maxOuterNameNumber);

			// addChildren(node, ent.getEntity(), nodes, sigBuilder);
		}

		entities = null;
		signature = sigBuilder.makeSignature();

		return signature;

	}

	protected void setMaxNumberOfuterNames() {

		// max number of outernames = max number of connections for an entity

		int maxNum = 0;

		for (Activity act : getActivity()) {
			BigraphExpression expPre = (BigraphExpression) act.getPrecondition().getExpression();
			BigraphExpression expPost = (BigraphExpression) act.getPostcondition().getExpression();

			for (Entity ent : expPre.getEntity()) {
				if (ent.getConnectivity().size() > maxNum) {
					maxNum = ent.getConnectivity().size();
				}
			}

			for (Entity ent : expPost.getEntity()) {
				if (ent.getConnectivity().size() > maxNum) {
					maxNum = ent.getConnectivity().size();
				}
			}
		}

		if (maxNum == 0) {
			maxOuterNameNumber = 5; // default
		} else {
			maxOuterNameNumber = maxNum;
		}

	}

	/**
	 * Checks whether the two given entities have a connection
	 */
	public Connection hasConnection(String incidentEntity1, String incidentEntity2) {

		// look for a connection in the list of connections
		for (Connection con : this.getConnection()) {

			IncidentEntity ent1 = (IncidentEntity) con.getEntity1();
			IncidentEntity ent2 = (IncidentEntity) con.getEntity2();

			if (ent1 == null || ent2 == null) {
				continue;
			}

			if (ent1.getName().equals(incidentEntity1) && ent2.getName().equals(incidentEntity2)) {
				return con;
			}

			if (ent1.getName().equals(incidentEntity2) && ent2.getName().equals(incidentEntity1)) {
				return con;
			}
		}

		return null;
	}

	public Scene getScene(String sceneName) {

		for (Scene scene : getScene()) {
			if (scene.getName() != null && scene.getName().equals(sceneName)) {
				return scene;
			}
		}

		return null;
	}

	/*
	 * protected void print(String msg) {
	 * 
	 * if(!isDebug) { return; }
	 * 
	 * System.out.println("IncidentDiagram: "+msg); }
	 */

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected IncidentDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CyberPhysicalIncidentPackage.Literals.INCIDENT_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public CrimeScript getCrimeScript() {
		return crimeScript;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCrimeScript(CrimeScript newCrimeScript, NotificationChain msgs) {
		CrimeScript oldCrimeScript = crimeScript;
		crimeScript = newCrimeScript;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__CRIME_SCRIPT, oldCrimeScript, newCrimeScript);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setCrimeScript(CrimeScript newCrimeScript) {
		if (newCrimeScript != crimeScript) {
			NotificationChain msgs = null;
			if (crimeScript != null)
				msgs = ((InternalEObject)crimeScript).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__CRIME_SCRIPT, null, msgs);
			if (newCrimeScript != null)
				msgs = ((InternalEObject)newCrimeScript).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__CRIME_SCRIPT, null, msgs);
			msgs = basicSetCrimeScript(newCrimeScript, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__CRIME_SCRIPT, newCrimeScript, newCrimeScript));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Scene> getScene() {
		if (scene == null) {
			scene = new EObjectContainmentEList<Scene>(Scene.class, this, CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__SCENE);
		}
		return scene;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Intent getIntent() {
		return intent;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntent(Intent newIntent, NotificationChain msgs) {
		Intent oldIntent = intent;
		intent = newIntent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__INTENT, oldIntent, newIntent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntent(Intent newIntent) {
		if (newIntent != intent) {
			NotificationChain msgs = null;
			if (intent != null)
				msgs = ((InternalEObject)intent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__INTENT, null, msgs);
			if (newIntent != null)
				msgs = ((InternalEObject)newIntent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__INTENT, null, msgs);
			msgs = basicSetIntent(newIntent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__INTENT, newIntent, newIntent));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Goal> getGoal() {
		if (goal == null) {
			goal = new EObjectContainmentEList<Goal>(Goal.class, this, CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__GOAL);
		}
		return goal;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Motive> getMotive() {
		if (motive == null) {
			motive = new EObjectContainmentEList<Motive>(Motive.class, this, CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__MOTIVE);
		}
		return motive;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Asset> getAsset() {
		if (asset == null) {
			asset = new EObjectContainmentEList<Asset>(Asset.class, this, CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__ASSET);
		}
		return asset;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getResource() {
		if (resource == null) {
			resource = new EObjectContainmentEList<Resource>(Resource.class, this, CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__RESOURCE);
		}
		return resource;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Actor> getActor() {
		if (actor == null) {
			actor = new EObjectContainmentEList<Actor>(Actor.class, this, CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__ACTOR);
		}
		return actor;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connection> getConnection() {
		if (connection == null) {
			connection = new EObjectContainmentEList<Connection>(Connection.class, this, CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__CONNECTION);
		}
		return connection;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Path> getPaths() {
		if (paths == null) {
			paths = new EObjectContainmentEList<Path>(Path.class, this, CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__PATHS);
		}
		return paths;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__CRIME_SCRIPT:
				return basicSetCrimeScript(null, msgs);
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__SCENE:
				return ((InternalEList<?>)getScene()).basicRemove(otherEnd, msgs);
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__INTENT:
				return basicSetIntent(null, msgs);
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__GOAL:
				return ((InternalEList<?>)getGoal()).basicRemove(otherEnd, msgs);
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__MOTIVE:
				return ((InternalEList<?>)getMotive()).basicRemove(otherEnd, msgs);
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__ASSET:
				return ((InternalEList<?>)getAsset()).basicRemove(otherEnd, msgs);
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__RESOURCE:
				return ((InternalEList<?>)getResource()).basicRemove(otherEnd, msgs);
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__ACTOR:
				return ((InternalEList<?>)getActor()).basicRemove(otherEnd, msgs);
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__CONNECTION:
				return ((InternalEList<?>)getConnection()).basicRemove(otherEnd, msgs);
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__PATHS:
				return ((InternalEList<?>)getPaths()).basicRemove(otherEnd, msgs);
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
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__CRIME_SCRIPT:
				return getCrimeScript();
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__SCENE:
				return getScene();
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__INTENT:
				return getIntent();
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__GOAL:
				return getGoal();
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__MOTIVE:
				return getMotive();
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__ASSET:
				return getAsset();
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__RESOURCE:
				return getResource();
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__ACTOR:
				return getActor();
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__CONNECTION:
				return getConnection();
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__PATHS:
				return getPaths();
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
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__CRIME_SCRIPT:
				setCrimeScript((CrimeScript)newValue);
				return;
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__SCENE:
				getScene().clear();
				getScene().addAll((Collection<? extends Scene>)newValue);
				return;
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__INTENT:
				setIntent((Intent)newValue);
				return;
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__GOAL:
				getGoal().clear();
				getGoal().addAll((Collection<? extends Goal>)newValue);
				return;
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__MOTIVE:
				getMotive().clear();
				getMotive().addAll((Collection<? extends Motive>)newValue);
				return;
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__ASSET:
				getAsset().clear();
				getAsset().addAll((Collection<? extends Asset>)newValue);
				return;
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__RESOURCE:
				getResource().clear();
				getResource().addAll((Collection<? extends Resource>)newValue);
				return;
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__ACTOR:
				getActor().clear();
				getActor().addAll((Collection<? extends Actor>)newValue);
				return;
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__CONNECTION:
				getConnection().clear();
				getConnection().addAll((Collection<? extends Connection>)newValue);
				return;
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__PATHS:
				getPaths().clear();
				getPaths().addAll((Collection<? extends Path>)newValue);
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
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__CRIME_SCRIPT:
				setCrimeScript((CrimeScript)null);
				return;
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__SCENE:
				getScene().clear();
				return;
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__INTENT:
				setIntent((Intent)null);
				return;
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__GOAL:
				getGoal().clear();
				return;
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__MOTIVE:
				getMotive().clear();
				return;
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__ASSET:
				getAsset().clear();
				return;
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__RESOURCE:
				getResource().clear();
				return;
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__ACTOR:
				getActor().clear();
				return;
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__CONNECTION:
				getConnection().clear();
				return;
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__PATHS:
				getPaths().clear();
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
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__CRIME_SCRIPT:
				return crimeScript != null;
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__SCENE:
				return scene != null && !scene.isEmpty();
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__INTENT:
				return intent != null;
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__GOAL:
				return goal != null && !goal.isEmpty();
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__MOTIVE:
				return motive != null && !motive.isEmpty();
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__ASSET:
				return asset != null && !asset.isEmpty();
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__RESOURCE:
				return resource != null && !resource.isEmpty();
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__ACTOR:
				return actor != null && !actor.isEmpty();
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__CONNECTION:
				return connection != null && !connection.isEmpty();
			case CyberPhysicalIncidentPackage.INCIDENT_DIAGRAM__PATHS:
				return paths != null && !paths.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	public EList<Activity> getActivity() {

		if (activity != null) {
			return activity;
		}

		activity = new BasicEList<Activity>();

		for (Scene scene : getScene()) {
			activity.addAll(scene.getActivity());
		}

		return activity;
	}

	public EList<IncidentEntity> getEntity() {

		if (incidentEntity != null) {
			return incidentEntity;
		}

		incidentEntity = new BasicEList<IncidentEntity>();

		incidentEntity.addAll(getAsset());
		incidentEntity.addAll(getActor());
		incidentEntity.addAll(getResource());

		return incidentEntity;
	}

	public IncidentEntity getEntity(String entityName) {
	
		if(entityName == null || entityName.isEmpty()) {
			return null;
		}
		
		if(entityMap == null || entityMap.isEmpty()) {
			updateEntityMap();
		}
		
		return entityMap.get(entityName);
	}
	
	protected void updateEntityMap() {
	
		entityMap = new HashMap<String, IncidentEntity>();
		
		for(IncidentEntity entity: getEntity()) {
			entityMap.put(entity.getName(), entity);
		}
		
	}
	
	public void setEntity(EList<IncidentEntity> entity) {

		incidentEntity = entity;
	}

	public void removeEntity(IncidentEntity entity) {

		if (Asset.class.isInstance(entity)) {
			getAsset().remove(entity);
		} else if (Resource.class.isInstance(entity)) {
			getResource().remove(entity);
		} else if (Actor.class.isInstance(entity)) {
			getActor().remove(entity);
		}
		
		setEntity(null);
		getEntity();
		isEntityUsedList.clear();
		isConnectionUsedList.clear();
	}
	
	protected void removeEntityLocal(IncidentEntity entity) {

		if (Asset.class.isInstance(entity)) {
			getAsset().remove(entity);
		} else if (Resource.class.isInstance(entity)) {
			getResource().remove(entity);
		} else if (Actor.class.isInstance(entity)) {
			getActor().remove(entity);
		}
	}

	public LinkedList<IncidentEntity> removeUnusedEntities() {
	
		LinkedList<IncidentEntity> removedEntities = new LinkedList<IncidentEntity>();
		
		for(IncidentEntity entity : getEntity()) {
			if(!isUsed(entity)) {
				removedEntities.add(entity);
				removeEntityLocal(entity);
			}
		}
		
		List<Connection> unusedCons = new LinkedList<Connection>();
		
		//remove unused connections as well
		for(Connection con : getConnection()) {
			if(!isConnectionUsedList.contains(con) &&
					!isEntityUsedList.contains(con.getEntity1()) &&
					!isEntityUsedList.contains(con.getEntity2())) {
				unusedCons.add(con);
			}
		}
		
		if(!unusedCons.isEmpty()) {
			getConnection().removeAll(unusedCons);
		}
		
		setEntity(null);
		getEntity();
		isEntityUsedList.clear();
		isConnectionUsedList.clear();
		
		return removedEntities;
	}
	
	public LinkedList<IncidentEntity> getUnusedEntities() {
		
		LinkedList<IncidentEntity> unUsedEntities = new LinkedList<IncidentEntity>();
		
		for(IncidentEntity entity : getEntity()) {
			if(!isUsed(entity)) {
				unUsedEntities.add(entity);
			}
		}
		
		return unUsedEntities;
	}
	
	public boolean hasUnusedEntities() {
	
		for(IncidentEntity entity : getEntity()) {
			if(!isUsed(entity)) {
				return true;
			}
		}
		
		return false;
	}
	
	public void setActivity(EList<Activity> activity) {

		this.activity = activity;
	}

	public Map<String, Integer> getActivitySequence() {

		if (activitiesSequence == null || activitiesSequence.isEmpty()) {
			generateActivitySequence();
		}

		return activitiesSequence;
	}

	public void setActivitySequence(Map<String, Integer> actSequence) {

		activitiesSequence = actSequence;
	}

	protected void generateActivitySequence() {

		Activity initialActivity = getInitialActivity();
		Activity current = initialActivity;
		boolean isDone = false;
		activitiesSequence = new HashMap<String, Integer>();
		int index = 0;

		do {

			if (current != null) {
				activitiesSequence.put(current.getName(), index);
				index++;
				current = !current.getNextActivities().isEmpty() ? current.getNextActivities().get(0) : null;
			} else {
				isDone = true;
			}

		} while (!isDone);

	}

	public String getActivityName(int index) {

		Map<String, Integer> activitiesSequence = getActivitySequence();

		if (activitiesSequence.containsValue(index)) {
			for (Entry<String, Integer> entry : activitiesSequence.entrySet()) {
				if (entry.getValue().equals(index)) {
					return entry.getKey();
				}
			}
		}
		return null;
	}

	public Activity getActivity(int index) {

		Map<String, Integer> activitiesSequence = getActivitySequence();
		String actName = null;

		if (activitiesSequence.containsValue(index)) {
			for (Entry<String, Integer> entry : activitiesSequence.entrySet()) {
				if (entry.getValue().equals(index)) {
					actName = entry.getKey();
					break;
				}
			}
		}

		if (actName != null) {
			for (Activity act : getActivity()) {
				if (act.getName() != null && act.getName().equals(actName)) {
					return act;
				}
			}
		}

		return null;
	}

	public LinkedList<Activity> getActivitySequence(int[] indicesSequence) {

		if (indicesSequence == null || indicesSequence.length == 0) {
			return null;
		}

		LinkedList<Activity> result = new LinkedList<Activity>();

		for (int index : indicesSequence) {
			result.add(getActivity(index));
		}

		return result;
	}

	public int[] getActivityNumberSequence(String startActivityName, String endActivityName) {

		Map<String, Integer> activitiesSequence = getActivitySequence();

		int startIndex = activitiesSequence.get(startActivityName);
		int endIndex = activitiesSequence.get(endActivityName);

		if (startIndex > endIndex) {
			return null;
		}

		int[] sequence = new int[(endIndex - startIndex) + 1];

		for (int i = 0; i < sequence.length; i++) {
			sequence[i] = startIndex;
			startIndex++;
		}

		return sequence;
	}

} // IncidentDiagramImpl
