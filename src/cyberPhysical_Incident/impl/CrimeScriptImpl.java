/**
 */
package cyberPhysical_Incident.impl;

import cyberPhysical_Incident.Actor;
import cyberPhysical_Incident.Asset;
import cyberPhysical_Incident.CrimeScript;
import cyberPhysical_Incident.CyberPhysicalIncidentPackage;
import cyberPhysical_Incident.Goal;
import cyberPhysical_Incident.Intent;
import cyberPhysical_Incident.Location;
import cyberPhysical_Incident.Motive;
import cyberPhysical_Incident.Resource;
import cyberPhysical_Incident.Scene;
import cyberPhysical_Incident.ScriptCategory;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Crime Script</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cyberPhysical_Incident.impl.CrimeScriptImpl#getId <em>Id</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.CrimeScriptImpl#getName <em>Name</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.CrimeScriptImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.CrimeScriptImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.CrimeScriptImpl#getScenes <em>Scenes</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.CrimeScriptImpl#getGoals <em>Goals</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.CrimeScriptImpl#getTargetedAssets <em>Targeted Assets</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.CrimeScriptImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.CrimeScriptImpl#getMainLocation <em>Main Location</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.CrimeScriptImpl#getVictims <em>Victims</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.CrimeScriptImpl#getOffenders <em>Offenders</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.CrimeScriptImpl#getHigherLevelScriptName <em>Higher Level Script Name</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.CrimeScriptImpl#getIntent <em>Intent</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.CrimeScriptImpl#getMotive <em>Motive</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CrimeScriptImpl extends MinimalEObjectImpl.Container implements CrimeScript {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected static final ScriptCategory CATEGORY_EDEFAULT = ScriptCategory.PATTERN;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected ScriptCategory category = CATEGORY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getScenes() <em>Scenes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenes()
	 * @generated
	 * @ordered
	 */
	protected EList<Scene> scenes;

	/**
	 * The cached value of the '{@link #getGoals() <em>Goals</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoals()
	 * @generated
	 * @ordered
	 */
	protected EList<Goal> goals;

	/**
	 * The cached value of the '{@link #getTargetedAssets() <em>Targeted Assets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetedAssets()
	 * @generated
	 * @ordered
	 */
	protected EList<Asset> targetedAssets;

	/**
	 * The cached value of the '{@link #getResources() <em>Resources</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> resources;

	/**
	 * The cached value of the '{@link #getMainLocation() <em>Main Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainLocation()
	 * @generated
	 * @ordered
	 */
	protected Location mainLocation;

	/**
	 * The cached value of the '{@link #getVictims() <em>Victims</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVictims()
	 * @generated
	 * @ordered
	 */
	protected EList<Actor> victims;

	/**
	 * The cached value of the '{@link #getOffenders() <em>Offenders</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffenders()
	 * @generated
	 * @ordered
	 */
	protected EList<Actor> offenders;

	/**
	 * The default value of the '{@link #getHigherLevelScriptName() <em>Higher Level Script Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHigherLevelScriptName()
	 * @generated
	 * @ordered
	 */
	protected static final String HIGHER_LEVEL_SCRIPT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHigherLevelScriptName() <em>Higher Level Script Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHigherLevelScriptName()
	 * @generated
	 * @ordered
	 */
	protected String higherLevelScriptName = HIGHER_LEVEL_SCRIPT_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIntent() <em>Intent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntent()
	 * @generated
	 * @ordered
	 */
	protected Intent intent;

	/**
	 * The cached value of the '{@link #getMotive() <em>Motive</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMotive()
	 * @generated
	 * @ordered
	 */
	protected EList<Motive> motive;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CrimeScriptImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CyberPhysicalIncidentPackage.Literals.CRIME_SCRIPT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CyberPhysicalIncidentPackage.CRIME_SCRIPT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CyberPhysicalIncidentPackage.CRIME_SCRIPT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CyberPhysicalIncidentPackage.CRIME_SCRIPT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScriptCategory getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCategory(ScriptCategory newCategory) {
		ScriptCategory oldCategory = category;
		category = newCategory == null ? CATEGORY_EDEFAULT : newCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CyberPhysicalIncidentPackage.CRIME_SCRIPT__CATEGORY, oldCategory, category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Scene> getScenes() {
		if (scenes == null) {
			scenes = new EObjectResolvingEList<Scene>(Scene.class, this, CyberPhysicalIncidentPackage.CRIME_SCRIPT__SCENES);
		}
		return scenes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Intent getIntent() {
		return intent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntent(Intent newIntent, NotificationChain msgs) {
		Intent oldIntent = intent;
		intent = newIntent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CyberPhysicalIncidentPackage.CRIME_SCRIPT__INTENT, oldIntent, newIntent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIntent(Intent newIntent) {
		if (newIntent != intent) {
			NotificationChain msgs = null;
			if (intent != null)
				msgs = ((InternalEObject)intent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CyberPhysicalIncidentPackage.CRIME_SCRIPT__INTENT, null, msgs);
			if (newIntent != null)
				msgs = ((InternalEObject)newIntent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CyberPhysicalIncidentPackage.CRIME_SCRIPT__INTENT, null, msgs);
			msgs = basicSetIntent(newIntent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CyberPhysicalIncidentPackage.CRIME_SCRIPT__INTENT, newIntent, newIntent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Motive> getMotive() {
		if (motive == null) {
			motive = new EObjectContainmentEList<Motive>(Motive.class, this, CyberPhysicalIncidentPackage.CRIME_SCRIPT__MOTIVE);
		}
		return motive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CyberPhysicalIncidentPackage.CRIME_SCRIPT__INTENT:
				return basicSetIntent(null, msgs);
			case CyberPhysicalIncidentPackage.CRIME_SCRIPT__MOTIVE:
				return ((InternalEList<?>)getMotive()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Goal> getGoals() {
		if (goals == null) {
			goals = new EObjectResolvingEList<Goal>(Goal.class, this, CyberPhysicalIncidentPackage.CRIME_SCRIPT__GOALS);
		}
		return goals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Asset> getTargetedAssets() {
		if (targetedAssets == null) {
			targetedAssets = new EObjectResolvingEList<Asset>(Asset.class, this, CyberPhysicalIncidentPackage.CRIME_SCRIPT__TARGETED_ASSETS);
		}
		return targetedAssets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Resource> getResources() {
		if (resources == null) {
			resources = new EObjectResolvingEList<Resource>(Resource.class, this, CyberPhysicalIncidentPackage.CRIME_SCRIPT__RESOURCES);
		}
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Location getMainLocation() {
		if (mainLocation != null && mainLocation.eIsProxy()) {
			InternalEObject oldMainLocation = (InternalEObject)mainLocation;
			mainLocation = (Location)eResolveProxy(oldMainLocation);
			if (mainLocation != oldMainLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CyberPhysicalIncidentPackage.CRIME_SCRIPT__MAIN_LOCATION, oldMainLocation, mainLocation));
			}
		}
		return mainLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetMainLocation() {
		return mainLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMainLocation(Location newMainLocation) {
		Location oldMainLocation = mainLocation;
		mainLocation = newMainLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CyberPhysicalIncidentPackage.CRIME_SCRIPT__MAIN_LOCATION, oldMainLocation, mainLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Actor> getVictims() {
		if (victims == null) {
			victims = new EObjectResolvingEList<Actor>(Actor.class, this, CyberPhysicalIncidentPackage.CRIME_SCRIPT__VICTIMS);
		}
		return victims;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Actor> getOffenders() {
		if (offenders == null) {
			offenders = new EObjectResolvingEList<Actor>(Actor.class, this, CyberPhysicalIncidentPackage.CRIME_SCRIPT__OFFENDERS);
		}
		return offenders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHigherLevelScriptName() {
		return higherLevelScriptName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHigherLevelScriptName(String newHigherLevelScriptName) {
		String oldHigherLevelScriptName = higherLevelScriptName;
		higherLevelScriptName = newHigherLevelScriptName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CyberPhysicalIncidentPackage.CRIME_SCRIPT__HIGHER_LEVEL_SCRIPT_NAME, oldHigherLevelScriptName, higherLevelScriptName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CyberPhysicalIncidentPackage.CRIME_SCRIPT__ID:
				return getId();
			case CyberPhysicalIncidentPackage.CRIME_SCRIPT__NAME:
				return getName();
			case CyberPhysicalIncidentPackage.CRIME_SCRIPT__DESCRIPTION:
				return getDescription();
			case CyberPhysicalIncidentPackage.CRIME_SCRIPT__CATEGORY:
				return getCategory();
			case CyberPhysicalIncidentPackage.CRIME_SCRIPT__SCENES:
				return getScenes();
			case CyberPhysicalIncidentPackage.CRIME_SCRIPT__GOALS:
				return getGoals();
			case CyberPhysicalIncidentPackage.CRIME_SCRIPT__TARGETED_ASSETS:
				return getTargetedAssets();
			case CyberPhysicalIncidentPackage.CRIME_SCRIPT__RESOURCES:
				return getResources();
			case CyberPhysicalIncidentPackage.CRIME_SCRIPT__MAIN_LOCATION:
				if (resolve) return getMainLocation();
				return basicGetMainLocation();
			case CyberPhysicalIncidentPackage.CRIME_SCRIPT__VICTIMS:
				return getVictims();
			case CyberPhysicalIncidentPackage.CRIME_SCRIPT__OFFENDERS:
				return getOffenders();
			case CyberPhysicalIncidentPackage.CRIME_SCRIPT__HIGHER_LEVEL_SCRIPT_NAME:
				return getHigherLevelScriptName();
			case CyberPhysicalIncidentPackage.CRIME_SCRIPT__INTENT:
				return getIntent();
			case CyberPhysicalIncidentPackage.CRIME_SCRIPT__MOTIVE:
				return getMotive();
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
			case CyberPhysicalIncidentPackage.CRIME_SCRIPT__ID:
				setId((Integer)newValue);
				return;
			case CyberPhysicalIncidentPackage.CRIME_SCRIPT__NAME:
				setName((String)newValue);
				return;
			case CyberPhysicalIncidentPackage.CRIME_SCRIPT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case CyberPhysicalIncidentPackage.CRIME_SCRIPT__CATEGORY:
				setCategory((ScriptCategory)newValue);
				return;
			case CyberPhysicalIncidentPackage.CRIME_SCRIPT__SCENES:
				getScenes().clear();
				getScenes().addAll((Collection<? extends Scene>)newValue);
				return;
			case CyberPhysicalIncidentPackage.CRIME_SCRIPT__GOALS:
				getGoals().clear();
				getGoals().addAll((Collection<? extends Goal>)newValue);
				return;
			case CyberPhysicalIncidentPackage.CRIME_SCRIPT__TARGETED_ASSETS:
				getTargetedAssets().clear();
				getTargetedAssets().addAll((Collection<? extends Asset>)newValue);
				return;
			case CyberPhysicalIncidentPackage.CRIME_SCRIPT__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection<? extends Resource>)newValue);
				return;
			case CyberPhysicalIncidentPackage.CRIME_SCRIPT__MAIN_LOCATION:
				setMainLocation((Location)newValue);
				return;
			case CyberPhysicalIncidentPackage.CRIME_SCRIPT__VICTIMS:
				getVictims().clear();
				getVictims().addAll((Collection<? extends Actor>)newValue);
				return;
			case CyberPhysicalIncidentPackage.CRIME_SCRIPT__OFFENDERS:
				getOffenders().clear();
				getOffenders().addAll((Collection<? extends Actor>)newValue);
				return;
			case CyberPhysicalIncidentPackage.CRIME_SCRIPT__HIGHER_LEVEL_SCRIPT_NAME:
				setHigherLevelScriptName((String)newValue);
				return;
			case CyberPhysicalIncidentPackage.CRIME_SCRIPT__INTENT:
				setIntent((Intent)newValue);
				return;
			case CyberPhysicalIncidentPackage.CRIME_SCRIPT__MOTIVE:
				getMotive().clear();
				getMotive().addAll((Collection<? extends Motive>)newValue);
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
			case CyberPhysicalIncidentPackage.CRIME_SCRIPT__ID:
				setId(ID_EDEFAULT);
				return;
			case CyberPhysicalIncidentPackage.CRIME_SCRIPT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CyberPhysicalIncidentPackage.CRIME_SCRIPT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case CyberPhysicalIncidentPackage.CRIME_SCRIPT__CATEGORY:
				setCategory(CATEGORY_EDEFAULT);
				return;
			case CyberPhysicalIncidentPackage.CRIME_SCRIPT__SCENES:
				getScenes().clear();
				return;
			case CyberPhysicalIncidentPackage.CRIME_SCRIPT__GOALS:
				getGoals().clear();
				return;
			case CyberPhysicalIncidentPackage.CRIME_SCRIPT__TARGETED_ASSETS:
				getTargetedAssets().clear();
				return;
			case CyberPhysicalIncidentPackage.CRIME_SCRIPT__RESOURCES:
				getResources().clear();
				return;
			case CyberPhysicalIncidentPackage.CRIME_SCRIPT__MAIN_LOCATION:
				setMainLocation((Location)null);
				return;
			case CyberPhysicalIncidentPackage.CRIME_SCRIPT__VICTIMS:
				getVictims().clear();
				return;
			case CyberPhysicalIncidentPackage.CRIME_SCRIPT__OFFENDERS:
				getOffenders().clear();
				return;
			case CyberPhysicalIncidentPackage.CRIME_SCRIPT__HIGHER_LEVEL_SCRIPT_NAME:
				setHigherLevelScriptName(HIGHER_LEVEL_SCRIPT_NAME_EDEFAULT);
				return;
			case CyberPhysicalIncidentPackage.CRIME_SCRIPT__INTENT:
				setIntent((Intent)null);
				return;
			case CyberPhysicalIncidentPackage.CRIME_SCRIPT__MOTIVE:
				getMotive().clear();
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
			case CyberPhysicalIncidentPackage.CRIME_SCRIPT__ID:
				return id != ID_EDEFAULT;
			case CyberPhysicalIncidentPackage.CRIME_SCRIPT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CyberPhysicalIncidentPackage.CRIME_SCRIPT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case CyberPhysicalIncidentPackage.CRIME_SCRIPT__CATEGORY:
				return category != CATEGORY_EDEFAULT;
			case CyberPhysicalIncidentPackage.CRIME_SCRIPT__SCENES:
				return scenes != null && !scenes.isEmpty();
			case CyberPhysicalIncidentPackage.CRIME_SCRIPT__GOALS:
				return goals != null && !goals.isEmpty();
			case CyberPhysicalIncidentPackage.CRIME_SCRIPT__TARGETED_ASSETS:
				return targetedAssets != null && !targetedAssets.isEmpty();
			case CyberPhysicalIncidentPackage.CRIME_SCRIPT__RESOURCES:
				return resources != null && !resources.isEmpty();
			case CyberPhysicalIncidentPackage.CRIME_SCRIPT__MAIN_LOCATION:
				return mainLocation != null;
			case CyberPhysicalIncidentPackage.CRIME_SCRIPT__VICTIMS:
				return victims != null && !victims.isEmpty();
			case CyberPhysicalIncidentPackage.CRIME_SCRIPT__OFFENDERS:
				return offenders != null && !offenders.isEmpty();
			case CyberPhysicalIncidentPackage.CRIME_SCRIPT__HIGHER_LEVEL_SCRIPT_NAME:
				return HIGHER_LEVEL_SCRIPT_NAME_EDEFAULT == null ? higherLevelScriptName != null : !HIGHER_LEVEL_SCRIPT_NAME_EDEFAULT.equals(higherLevelScriptName);
			case CyberPhysicalIncidentPackage.CRIME_SCRIPT__INTENT:
				return intent != null;
			case CyberPhysicalIncidentPackage.CRIME_SCRIPT__MOTIVE:
				return motive != null && !motive.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", category: ");
		result.append(category);
		result.append(", higherLevelScriptName: ");
		result.append(higherLevelScriptName);
		result.append(')');
		return result.toString();
	}

} //CrimeScriptImpl
