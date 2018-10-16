/**
 */
package cyberPhysical_Incident.impl;

import cyberPhysical_Incident.AbstractionLevel;
import cyberPhysical_Incident.CyberPhysicalIncidentPackage;
import cyberPhysical_Incident.Type;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cyberPhysical_Incident.impl.TypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link cyberPhysical_Incident.impl.TypeImpl#getAbstractionLevel <em>Abstraction Level</em>}</li>
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
	 * The default value of the '{@link #getAbstractionLevel() <em>Abstraction Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractionLevel()
	 * @generated
	 * @ordered
	 */
	protected static final AbstractionLevel ABSTRACTION_LEVEL_EDEFAULT = AbstractionLevel.ANYSUBCLASS;

	/**
	 * The cached value of the '{@link #getAbstractionLevel() <em>Abstraction Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractionLevel()
	 * @generated
	 * @ordered
	 */
	protected AbstractionLevel abstractionLevel = ABSTRACTION_LEVEL_EDEFAULT;

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
		return CyberPhysicalIncidentPackage.Literals.TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CyberPhysicalIncidentPackage.TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractionLevel getAbstractionLevel() {
		return abstractionLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstractionLevel(AbstractionLevel newAbstractionLevel) {
		AbstractionLevel oldAbstractionLevel = abstractionLevel;
		abstractionLevel = newAbstractionLevel == null ? ABSTRACTION_LEVEL_EDEFAULT : newAbstractionLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CyberPhysicalIncidentPackage.TYPE__ABSTRACTION_LEVEL, oldAbstractionLevel, abstractionLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CyberPhysicalIncidentPackage.TYPE__NAME:
				return getName();
			case CyberPhysicalIncidentPackage.TYPE__ABSTRACTION_LEVEL:
				return getAbstractionLevel();
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
			case CyberPhysicalIncidentPackage.TYPE__NAME:
				setName((String)newValue);
				return;
			case CyberPhysicalIncidentPackage.TYPE__ABSTRACTION_LEVEL:
				setAbstractionLevel((AbstractionLevel)newValue);
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
			case CyberPhysicalIncidentPackage.TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CyberPhysicalIncidentPackage.TYPE__ABSTRACTION_LEVEL:
				setAbstractionLevel(ABSTRACTION_LEVEL_EDEFAULT);
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
			case CyberPhysicalIncidentPackage.TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CyberPhysicalIncidentPackage.TYPE__ABSTRACTION_LEVEL:
				return abstractionLevel != ABSTRACTION_LEVEL_EDEFAULT;
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
		result.append(", abstractionLevel: ");
		result.append(abstractionLevel);
		result.append(')');
		return result.toString();
	}

} //TypeImpl
