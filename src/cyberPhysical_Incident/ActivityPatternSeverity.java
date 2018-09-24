/**
 */
package cyberPhysical_Incident;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Activity Pattern Severity</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getActivityPatternSeverity()
 * @model
 * @generated
 */
public enum ActivityPatternSeverity implements Enumerator {
	/**
	 * The '<em><b>LOW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOW_VALUE
	 * @generated
	 * @ordered
	 */
	LOW(1, "LOW", "LOW"),

	/**
	 * The '<em><b>MEDIUM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDIUM_VALUE
	 * @generated
	 * @ordered
	 */
	MEDIUM(2, "MEDIUM", "MEDIUM"),

	/**
	 * The '<em><b>HIGH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIGH_VALUE
	 * @generated
	 * @ordered
	 */
	HIGH(3, "HIGH", "HIGH");

	/**
	 * The '<em><b>LOW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LOW</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOW
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LOW_VALUE = 1;

	/**
	 * The '<em><b>MEDIUM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MEDIUM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEDIUM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MEDIUM_VALUE = 2;

	/**
	 * The '<em><b>HIGH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HIGH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HIGH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HIGH_VALUE = 3;

	/**
	 * An array of all the '<em><b>Activity Pattern Severity</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ActivityPatternSeverity[] VALUES_ARRAY =
		new ActivityPatternSeverity[] {
			LOW,
			MEDIUM,
			HIGH,
		};

	/**
	 * A public read-only list of all the '<em><b>Activity Pattern Severity</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ActivityPatternSeverity> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Activity Pattern Severity</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ActivityPatternSeverity get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ActivityPatternSeverity result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Activity Pattern Severity</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ActivityPatternSeverity getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ActivityPatternSeverity result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Activity Pattern Severity</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ActivityPatternSeverity get(int value) {
		switch (value) {
			case LOW_VALUE: return LOW;
			case MEDIUM_VALUE: return MEDIUM;
			case HIGH_VALUE: return HIGH;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ActivityPatternSeverity(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ActivityPatternSeverity
