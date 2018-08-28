/**
 */
package cyberPhysical_Incident.impl;

import cyberPhysical_Incident.AbstractActivity;
import cyberPhysical_Incident.ActivityInitiator;
import cyberPhysical_Incident.ActivityType;
import cyberPhysical_Incident.Actor;
import cyberPhysical_Incident.Asset;
import cyberPhysical_Incident.Behaviour;
import cyberPhysical_Incident.CyberPhysicalIncidentPackage;
import cyberPhysical_Incident.Location;
import cyberPhysical_Incident.Postcondition;
import cyberPhysical_Incident.Precondition;
import cyberPhysical_Incident.Resource;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cyberPhysical_Incident.impl.AbstractActivityImpl#getBehaviourType <em>Behaviour Type</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.AbstractActivityImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.AbstractActivityImpl#getType <em>Type</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.AbstractActivityImpl#getSystemAction <em>System Action</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.AbstractActivityImpl#getExploitedAssets <em>Exploited Assets</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.AbstractActivityImpl#getTargetAssets <em>Target Assets</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.AbstractActivityImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.AbstractActivityImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.AbstractActivityImpl#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.AbstractActivityImpl#getPostcondition <em>Postcondition</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.AbstractActivityImpl#getActivityinitiator <em>Activityinitiator</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.AbstractActivityImpl#getVictims <em>Victims</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.AbstractActivityImpl#getNextAbstractactivity <em>Next Abstractactivity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbstractActivityImpl extends MinimalEObjectImpl.Container implements AbstractActivity {
	/**
	 * The default value of the '{@link #getBehaviourType() <em>Behaviour Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviourType()
	 * @generated
	 * @ordered
	 */
	protected static final Behaviour BEHAVIOUR_TYPE_EDEFAULT = Behaviour.NORMAL;

	/**
	 * The cached value of the '{@link #getBehaviourType() <em>Behaviour Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviourType()
	 * @generated
	 * @ordered
	 */
	protected Behaviour behaviourType = BEHAVIOUR_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final int DURATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected int duration = DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ActivityType TYPE_EDEFAULT = ActivityType.PHYSICAL;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ActivityType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSystemAction() <em>System Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemAction()
	 * @generated
	 * @ordered
	 */
	protected static final String SYSTEM_ACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSystemAction() <em>System Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemAction()
	 * @generated
	 * @ordered
	 */
	protected String systemAction = SYSTEM_ACTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExploitedAssets() <em>Exploited Assets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExploitedAssets()
	 * @generated
	 * @ordered
	 */
	protected EList<Asset> exploitedAssets;

	/**
	 * The cached value of the '{@link #getTargetAssets() <em>Target Assets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetAssets()
	 * @generated
	 * @ordered
	 */
	protected EList<Asset> targetAssets;

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
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected Location location;

	/**
	 * The cached value of the '{@link #getPrecondition() <em>Precondition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecondition()
	 * @generated
	 * @ordered
	 */
	protected Precondition precondition;

	/**
	 * The cached value of the '{@link #getPostcondition() <em>Postcondition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostcondition()
	 * @generated
	 * @ordered
	 */
	protected Postcondition postcondition;

	/**
	 * The cached value of the '{@link #getActivityinitiator() <em>Activityinitiator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityinitiator()
	 * @generated
	 * @ordered
	 */
	protected ActivityInitiator activityinitiator;

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
	 * The cached value of the '{@link #getNextAbstractactivity() <em>Next Abstractactivity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextAbstractactivity()
	 * @generated
	 * @ordered
	 */
	protected AbstractActivity nextAbstractactivity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CyberPhysicalIncidentPackage.Literals.ABSTRACT_ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(int newDuration) {
		int oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CyberPhysicalIncidentPackage.ABSTRACT_ACTIVITY__DURATION, oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ActivityType newType) {
		ActivityType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CyberPhysicalIncidentPackage.ABSTRACT_ACTIVITY__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behaviour getBehaviourType() {
		return behaviourType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBehaviourType(Behaviour newBehaviourType) {
		Behaviour oldBehaviourType = behaviourType;
		behaviourType = newBehaviourType == null ? BEHAVIOUR_TYPE_EDEFAULT : newBehaviourType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CyberPhysicalIncidentPackage.ABSTRACT_ACTIVITY__BEHAVIOUR_TYPE, oldBehaviourType, behaviourType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSystemAction() {
		return systemAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemAction(String newSystemAction) {
		String oldSystemAction = systemAction;
		systemAction = newSystemAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CyberPhysicalIncidentPackage.ABSTRACT_ACTIVITY__SYSTEM_ACTION, oldSystemAction, systemAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Precondition getPrecondition() {
		return precondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrecondition(Precondition newPrecondition, NotificationChain msgs) {
		Precondition oldPrecondition = precondition;
		precondition = newPrecondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CyberPhysicalIncidentPackage.ABSTRACT_ACTIVITY__PRECONDITION, oldPrecondition, newPrecondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecondition(Precondition newPrecondition) {
		if (newPrecondition != precondition) {
			NotificationChain msgs = null;
			if (precondition != null)
				msgs = ((InternalEObject)precondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CyberPhysicalIncidentPackage.ABSTRACT_ACTIVITY__PRECONDITION, null, msgs);
			if (newPrecondition != null)
				msgs = ((InternalEObject)newPrecondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CyberPhysicalIncidentPackage.ABSTRACT_ACTIVITY__PRECONDITION, null, msgs);
			msgs = basicSetPrecondition(newPrecondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CyberPhysicalIncidentPackage.ABSTRACT_ACTIVITY__PRECONDITION, newPrecondition, newPrecondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Postcondition getPostcondition() {
		return postcondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostcondition(Postcondition newPostcondition, NotificationChain msgs) {
		Postcondition oldPostcondition = postcondition;
		postcondition = newPostcondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CyberPhysicalIncidentPackage.ABSTRACT_ACTIVITY__POSTCONDITION, oldPostcondition, newPostcondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostcondition(Postcondition newPostcondition) {
		if (newPostcondition != postcondition) {
			NotificationChain msgs = null;
			if (postcondition != null)
				msgs = ((InternalEObject)postcondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CyberPhysicalIncidentPackage.ABSTRACT_ACTIVITY__POSTCONDITION, null, msgs);
			if (newPostcondition != null)
				msgs = ((InternalEObject)newPostcondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CyberPhysicalIncidentPackage.ABSTRACT_ACTIVITY__POSTCONDITION, null, msgs);
			msgs = basicSetPostcondition(newPostcondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CyberPhysicalIncidentPackage.ABSTRACT_ACTIVITY__POSTCONDITION, newPostcondition, newPostcondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityInitiator getActivityinitiator() {
		if (activityinitiator != null && activityinitiator.eIsProxy()) {
			InternalEObject oldActivityinitiator = (InternalEObject)activityinitiator;
			activityinitiator = (ActivityInitiator)eResolveProxy(oldActivityinitiator);
			if (activityinitiator != oldActivityinitiator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CyberPhysicalIncidentPackage.ABSTRACT_ACTIVITY__ACTIVITYINITIATOR, oldActivityinitiator, activityinitiator));
			}
		}
		return activityinitiator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityInitiator basicGetActivityinitiator() {
		return activityinitiator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivityinitiator(ActivityInitiator newActivityinitiator) {
		ActivityInitiator oldActivityinitiator = activityinitiator;
		activityinitiator = newActivityinitiator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CyberPhysicalIncidentPackage.ABSTRACT_ACTIVITY__ACTIVITYINITIATOR, oldActivityinitiator, activityinitiator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Actor> getVictims() {
		if (victims == null) {
			victims = new EObjectResolvingEList<Actor>(Actor.class, this, CyberPhysicalIncidentPackage.ABSTRACT_ACTIVITY__VICTIMS);
		}
		return victims;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractActivity getNextAbstractactivity() {
		if (nextAbstractactivity != null && nextAbstractactivity.eIsProxy()) {
			InternalEObject oldNextAbstractactivity = (InternalEObject)nextAbstractactivity;
			nextAbstractactivity = (AbstractActivity)eResolveProxy(oldNextAbstractactivity);
			if (nextAbstractactivity != oldNextAbstractactivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CyberPhysicalIncidentPackage.ABSTRACT_ACTIVITY__NEXT_ABSTRACTACTIVITY, oldNextAbstractactivity, nextAbstractactivity));
			}
		}
		return nextAbstractactivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractActivity basicGetNextAbstractactivity() {
		return nextAbstractactivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextAbstractactivity(AbstractActivity newNextAbstractactivity) {
		AbstractActivity oldNextAbstractactivity = nextAbstractactivity;
		nextAbstractactivity = newNextAbstractactivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CyberPhysicalIncidentPackage.ABSTRACT_ACTIVITY__NEXT_ABSTRACTACTIVITY, oldNextAbstractactivity, nextAbstractactivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getResources() {
		if (resources == null) {
			resources = new EObjectResolvingEList<Resource>(Resource.class, this, CyberPhysicalIncidentPackage.ABSTRACT_ACTIVITY__RESOURCES);
		}
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getLocation() {
		if (location != null && location.eIsProxy()) {
			InternalEObject oldLocation = (InternalEObject)location;
			location = (Location)eResolveProxy(oldLocation);
			if (location != oldLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CyberPhysicalIncidentPackage.ABSTRACT_ACTIVITY__LOCATION, oldLocation, location));
			}
		}
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(Location newLocation) {
		Location oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CyberPhysicalIncidentPackage.ABSTRACT_ACTIVITY__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Asset> getExploitedAssets() {
		if (exploitedAssets == null) {
			exploitedAssets = new EObjectResolvingEList<Asset>(Asset.class, this, CyberPhysicalIncidentPackage.ABSTRACT_ACTIVITY__EXPLOITED_ASSETS);
		}
		return exploitedAssets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Asset> getTargetAssets() {
		if (targetAssets == null) {
			targetAssets = new EObjectResolvingEList<Asset>(Asset.class, this, CyberPhysicalIncidentPackage.ABSTRACT_ACTIVITY__TARGET_ASSETS);
		}
		return targetAssets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CyberPhysicalIncidentPackage.ABSTRACT_ACTIVITY__PRECONDITION:
				return basicSetPrecondition(null, msgs);
			case CyberPhysicalIncidentPackage.ABSTRACT_ACTIVITY__POSTCONDITION:
				return basicSetPostcondition(null, msgs);
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
			case CyberPhysicalIncidentPackage.ABSTRACT_ACTIVITY__BEHAVIOUR_TYPE:
				return getBehaviourType();
			case CyberPhysicalIncidentPackage.ABSTRACT_ACTIVITY__DURATION:
				return getDuration();
			case CyberPhysicalIncidentPackage.ABSTRACT_ACTIVITY__TYPE:
				return getType();
			case CyberPhysicalIncidentPackage.ABSTRACT_ACTIVITY__SYSTEM_ACTION:
				return getSystemAction();
			case CyberPhysicalIncidentPackage.ABSTRACT_ACTIVITY__EXPLOITED_ASSETS:
				return getExploitedAssets();
			case CyberPhysicalIncidentPackage.ABSTRACT_ACTIVITY__TARGET_ASSETS:
				return getTargetAssets();
			case CyberPhysicalIncidentPackage.ABSTRACT_ACTIVITY__RESOURCES:
				return getResources();
			case CyberPhysicalIncidentPackage.ABSTRACT_ACTIVITY__LOCATION:
				if (resolve) return getLocation();
				return basicGetLocation();
			case CyberPhysicalIncidentPackage.ABSTRACT_ACTIVITY__PRECONDITION:
				return getPrecondition();
			case CyberPhysicalIncidentPackage.ABSTRACT_ACTIVITY__POSTCONDITION:
				return getPostcondition();
			case CyberPhysicalIncidentPackage.ABSTRACT_ACTIVITY__ACTIVITYINITIATOR:
				if (resolve) return getActivityinitiator();
				return basicGetActivityinitiator();
			case CyberPhysicalIncidentPackage.ABSTRACT_ACTIVITY__VICTIMS:
				return getVictims();
			case CyberPhysicalIncidentPackage.ABSTRACT_ACTIVITY__NEXT_ABSTRACTACTIVITY:
				if (resolve) return getNextAbstractactivity();
				return basicGetNextAbstractactivity();
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
			case CyberPhysicalIncidentPackage.ABSTRACT_ACTIVITY__BEHAVIOUR_TYPE:
				setBehaviourType((Behaviour)newValue);
				return;
			case CyberPhysicalIncidentPackage.ABSTRACT_ACTIVITY__DURATION:
				setDuration((Integer)newValue);
				return;
			case CyberPhysicalIncidentPackage.ABSTRACT_ACTIVITY__TYPE:
				setType((ActivityType)newValue);
				return;
			case CyberPhysicalIncidentPackage.ABSTRACT_ACTIVITY__SYSTEM_ACTION:
				setSystemAction((String)newValue);
				return;
			case CyberPhysicalIncidentPackage.ABSTRACT_ACTIVITY__EXPLOITED_ASSETS:
				getExploitedAssets().clear();
				getExploitedAssets().addAll((Collection<? extends Asset>)newValue);
				return;
			case CyberPhysicalIncidentPackage.ABSTRACT_ACTIVITY__TARGET_ASSETS:
				getTargetAssets().clear();
				getTargetAssets().addAll((Collection<? extends Asset>)newValue);
				return;
			case CyberPhysicalIncidentPackage.ABSTRACT_ACTIVITY__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection<? extends Resource>)newValue);
				return;
			case CyberPhysicalIncidentPackage.ABSTRACT_ACTIVITY__LOCATION:
				setLocation((Location)newValue);
				return;
			case CyberPhysicalIncidentPackage.ABSTRACT_ACTIVITY__PRECONDITION:
				setPrecondition((Precondition)newValue);
				return;
			case CyberPhysicalIncidentPackage.ABSTRACT_ACTIVITY__POSTCONDITION:
				setPostcondition((Postcondition)newValue);
				return;
			case CyberPhysicalIncidentPackage.ABSTRACT_ACTIVITY__ACTIVITYINITIATOR:
				setActivityinitiator((ActivityInitiator)newValue);
				return;
			case CyberPhysicalIncidentPackage.ABSTRACT_ACTIVITY__VICTIMS:
				getVictims().clear();
				getVictims().addAll((Collection<? extends Actor>)newValue);
				return;
			case CyberPhysicalIncidentPackage.ABSTRACT_ACTIVITY__NEXT_ABSTRACTACTIVITY:
				setNextAbstractactivity((AbstractActivity)newValue);
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
			case CyberPhysicalIncidentPackage.ABSTRACT_ACTIVITY__BEHAVIOUR_TYPE:
				setBehaviourType(BEHAVIOUR_TYPE_EDEFAULT);
				return;
			case CyberPhysicalIncidentPackage.ABSTRACT_ACTIVITY__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case CyberPhysicalIncidentPackage.ABSTRACT_ACTIVITY__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case CyberPhysicalIncidentPackage.ABSTRACT_ACTIVITY__SYSTEM_ACTION:
				setSystemAction(SYSTEM_ACTION_EDEFAULT);
				return;
			case CyberPhysicalIncidentPackage.ABSTRACT_ACTIVITY__EXPLOITED_ASSETS:
				getExploitedAssets().clear();
				return;
			case CyberPhysicalIncidentPackage.ABSTRACT_ACTIVITY__TARGET_ASSETS:
				getTargetAssets().clear();
				return;
			case CyberPhysicalIncidentPackage.ABSTRACT_ACTIVITY__RESOURCES:
				getResources().clear();
				return;
			case CyberPhysicalIncidentPackage.ABSTRACT_ACTIVITY__LOCATION:
				setLocation((Location)null);
				return;
			case CyberPhysicalIncidentPackage.ABSTRACT_ACTIVITY__PRECONDITION:
				setPrecondition((Precondition)null);
				return;
			case CyberPhysicalIncidentPackage.ABSTRACT_ACTIVITY__POSTCONDITION:
				setPostcondition((Postcondition)null);
				return;
			case CyberPhysicalIncidentPackage.ABSTRACT_ACTIVITY__ACTIVITYINITIATOR:
				setActivityinitiator((ActivityInitiator)null);
				return;
			case CyberPhysicalIncidentPackage.ABSTRACT_ACTIVITY__VICTIMS:
				getVictims().clear();
				return;
			case CyberPhysicalIncidentPackage.ABSTRACT_ACTIVITY__NEXT_ABSTRACTACTIVITY:
				setNextAbstractactivity((AbstractActivity)null);
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
			case CyberPhysicalIncidentPackage.ABSTRACT_ACTIVITY__BEHAVIOUR_TYPE:
				return behaviourType != BEHAVIOUR_TYPE_EDEFAULT;
			case CyberPhysicalIncidentPackage.ABSTRACT_ACTIVITY__DURATION:
				return duration != DURATION_EDEFAULT;
			case CyberPhysicalIncidentPackage.ABSTRACT_ACTIVITY__TYPE:
				return type != TYPE_EDEFAULT;
			case CyberPhysicalIncidentPackage.ABSTRACT_ACTIVITY__SYSTEM_ACTION:
				return SYSTEM_ACTION_EDEFAULT == null ? systemAction != null : !SYSTEM_ACTION_EDEFAULT.equals(systemAction);
			case CyberPhysicalIncidentPackage.ABSTRACT_ACTIVITY__EXPLOITED_ASSETS:
				return exploitedAssets != null && !exploitedAssets.isEmpty();
			case CyberPhysicalIncidentPackage.ABSTRACT_ACTIVITY__TARGET_ASSETS:
				return targetAssets != null && !targetAssets.isEmpty();
			case CyberPhysicalIncidentPackage.ABSTRACT_ACTIVITY__RESOURCES:
				return resources != null && !resources.isEmpty();
			case CyberPhysicalIncidentPackage.ABSTRACT_ACTIVITY__LOCATION:
				return location != null;
			case CyberPhysicalIncidentPackage.ABSTRACT_ACTIVITY__PRECONDITION:
				return precondition != null;
			case CyberPhysicalIncidentPackage.ABSTRACT_ACTIVITY__POSTCONDITION:
				return postcondition != null;
			case CyberPhysicalIncidentPackage.ABSTRACT_ACTIVITY__ACTIVITYINITIATOR:
				return activityinitiator != null;
			case CyberPhysicalIncidentPackage.ABSTRACT_ACTIVITY__VICTIMS:
				return victims != null && !victims.isEmpty();
			case CyberPhysicalIncidentPackage.ABSTRACT_ACTIVITY__NEXT_ABSTRACTACTIVITY:
				return nextAbstractactivity != null;
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (behaviourType: ");
		result.append(behaviourType);
		result.append(", duration: ");
		result.append(duration);
		result.append(", type: ");
		result.append(type);
		result.append(", systemAction: ");
		result.append(systemAction);
		result.append(')');
		return result.toString();
	}

} //AbstractActivityImpl
