/**
 */
package cyberPhysical_Incident;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Abstraction Level</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getAbstractionLevel()
 * @model
 * @generated
 */
public enum AbstractionLevel implements Enumerator {
	/**
	 * The '<em><b>SAME OR SUBCLASS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAME_OR_SUBCLASS_VALUE
	 * @generated
	 * @ordered
	 */
	SAME_OR_SUBCLASS(0, "SAME_OR_SUBCLASS", "SAME_OR_SUBCLASS"),

	/**
	 * The '<em><b>SAME</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAME_VALUE
	 * @generated
	 * @ordered
	 */
	SAME(1, "SAME", "SAME"),

	/**
	 * The '<em><b>SAME OR SUPERCLASS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAME_OR_SUPERCLASS_VALUE
	 * @generated
	 * @ordered
	 */
	SAME_OR_SUPERCLASS(2, "SAME_OR_SUPERCLASS", "SAME_OR_SUPERCLASS"),

	/**
	 * The '<em><b>ANYDIGITAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANYDIGITAL_VALUE
	 * @generated
	 * @ordered
	 */
	ANYDIGITAL(3, "ANYDIGITAL", "ANYDIGITAL"),

	/**
	 * The '<em><b>ANYPHYSICAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANYPHYSICAL_VALUE
	 * @generated
	 * @ordered
	 */
	ANYPHYSICAL(4, "ANYPHYSICAL", "ANYPHYSICAL");

	/**
	 * The '<em><b>SAME OR SUBCLASS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SAME OR SUBCLASS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SAME_OR_SUBCLASS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SAME_OR_SUBCLASS_VALUE = 0;

	/**
	 * The '<em><b>SAME</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SAME</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SAME
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SAME_VALUE = 1;

	/**
	 * The '<em><b>SAME OR SUPERCLASS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SAME OR SUPERCLASS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SAME_OR_SUPERCLASS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SAME_OR_SUPERCLASS_VALUE = 2;

	/**
	 * The '<em><b>ANYDIGITAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ANYDIGITAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ANYDIGITAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ANYDIGITAL_VALUE = 3;

	/**
	 * The '<em><b>ANYPHYSICAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ANYPHYSICAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ANYPHYSICAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ANYPHYSICAL_VALUE = 4;

	/**
	 * An array of all the '<em><b>Abstraction Level</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AbstractionLevel[] VALUES_ARRAY =
		new AbstractionLevel[] {
			SAME_OR_SUBCLASS,
			SAME,
			SAME_OR_SUPERCLASS,
			ANYDIGITAL,
			ANYPHYSICAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Abstraction Level</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AbstractionLevel> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Abstraction Level</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AbstractionLevel get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AbstractionLevel result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Abstraction Level</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AbstractionLevel getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AbstractionLevel result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Abstraction Level</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AbstractionLevel get(int value) {
		switch (value) {
			case SAME_OR_SUBCLASS_VALUE: return SAME_OR_SUBCLASS;
			case SAME_VALUE: return SAME;
			case SAME_OR_SUPERCLASS_VALUE: return SAME_OR_SUPERCLASS;
			case ANYDIGITAL_VALUE: return ANYDIGITAL;
			case ANYPHYSICAL_VALUE: return ANYPHYSICAL;
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
	private AbstractionLevel(int value, String name, String literal) {
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
	
} //AbstractionLevel
