/**
 */
package cyberPhysical_Incident.impl;

import cyberPhysical_Incident.CyberPhysical_IncidentPackage;
import cyberPhysical_Incident.Type;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cyberPhysical_Incident.impl.TypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.TypeImpl#isHasSuperType <em>Has Super Type</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.TypeImpl#getSuperType <em>Super Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeImpl extends MinimalEObjectImpl.Container implements Type {
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
	 * The default value of the '{@link #isHasSuperType() <em>Has Super Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasSuperType()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_SUPER_TYPE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHasSuperType() <em>Has Super Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasSuperType()
	 * @generated
	 * @ordered
	 */
	protected boolean hasSuperType = HAS_SUPER_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSuperType() <em>Super Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperType()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> superType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CyberPhysical_IncidentPackage.Literals.TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CyberPhysical_IncidentPackage.TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHasSuperType() {
		return hasSuperType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasSuperType(boolean newHasSuperType) {
		boolean oldHasSuperType = hasSuperType;
		hasSuperType = newHasSuperType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CyberPhysical_IncidentPackage.TYPE__HAS_SUPER_TYPE, oldHasSuperType, hasSuperType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getSuperType() {
		if (superType == null) {
			superType = new EObjectContainmentEList<Type>(Type.class, this, CyberPhysical_IncidentPackage.TYPE__SUPER_TYPE);
		}
		return superType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CyberPhysical_IncidentPackage.TYPE__SUPER_TYPE:
				return ((InternalEList<?>)getSuperType()).basicRemove(otherEnd, msgs);
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
			case CyberPhysical_IncidentPackage.TYPE__NAME:
				return getName();
			case CyberPhysical_IncidentPackage.TYPE__HAS_SUPER_TYPE:
				return isHasSuperType();
			case CyberPhysical_IncidentPackage.TYPE__SUPER_TYPE:
				return getSuperType();
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
			case CyberPhysical_IncidentPackage.TYPE__NAME:
				setName((String)newValue);
				return;
			case CyberPhysical_IncidentPackage.TYPE__HAS_SUPER_TYPE:
				setHasSuperType((Boolean)newValue);
				return;
			case CyberPhysical_IncidentPackage.TYPE__SUPER_TYPE:
				getSuperType().clear();
				getSuperType().addAll((Collection<? extends Type>)newValue);
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
			case CyberPhysical_IncidentPackage.TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CyberPhysical_IncidentPackage.TYPE__HAS_SUPER_TYPE:
				setHasSuperType(HAS_SUPER_TYPE_EDEFAULT);
				return;
			case CyberPhysical_IncidentPackage.TYPE__SUPER_TYPE:
				getSuperType().clear();
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
			case CyberPhysical_IncidentPackage.TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CyberPhysical_IncidentPackage.TYPE__HAS_SUPER_TYPE:
				return hasSuperType != HAS_SUPER_TYPE_EDEFAULT;
			case CyberPhysical_IncidentPackage.TYPE__SUPER_TYPE:
				return superType != null && !superType.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", hasSuperType: ");
		result.append(hasSuperType);
		result.append(')');
		return result.toString();
	}

} //TypeImpl
