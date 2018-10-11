/**
 */
package cyberPhysical_Incident;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Script Category</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see cyberPhysical_Incident.CyberPhysicalIncidentPackage#getScriptCategory()
 * @model
 * @generated
 */
public enum ScriptCategory implements Enumerator {
	/**
	 * The '<em><b>PATTERN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PATTERN_VALUE
	 * @generated
	 * @ordered
	 */
	PATTERN(1, "PATTERN", "PATTERN"), /**
	 * The '<em><b>PROTOPATTERN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROTOPATTERN_VALUE
	 * @generated
	 * @ordered
	 */
	PROTOPATTERN(2, "PROTOPATTERN", "PROTOPATTERN"), /**
	 * The '<em><b>METAPATTERN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #METAPATTERN_VALUE
	 * @generated
	 * @ordered
	 */
	METAPATTERN(3, "METAPATTERN", "METAPATTERN"), /**
	 * The '<em><b>INSTANCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSTANCE_VALUE
	 * @generated
	 * @ordered
	 */
	INSTANCE(4, "INSTANCE", "INSTANCE");

	/**
	 * The '<em><b>PATTERN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PATTERN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PATTERN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PATTERN_VALUE = 1;

	/**
	 * The '<em><b>PROTOPATTERN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PROTOPATTERN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROTOPATTERN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PROTOPATTERN_VALUE = 2;

	/**
	 * The '<em><b>METAPATTERN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>METAPATTERN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #METAPATTERN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int METAPATTERN_VALUE = 3;

	/**
	 * The '<em><b>INSTANCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INSTANCE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INSTANCE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INSTANCE_VALUE = 4;

	/**
	 * An array of all the '<em><b>Script Category</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ScriptCategory[] VALUES_ARRAY =
		new ScriptCategory[] {
			PATTERN,
			PROTOPATTERN,
			METAPATTERN,
			INSTANCE,
		};

	/**
	 * A public read-only list of all the '<em><b>Script Category</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ScriptCategory> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Script Category</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ScriptCategory get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ScriptCategory result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Script Category</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ScriptCategory getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ScriptCategory result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Script Category</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ScriptCategory get(int value) {
		switch (value) {
			case PATTERN_VALUE: return PATTERN;
			case PROTOPATTERN_VALUE: return PROTOPATTERN;
			case METAPATTERN_VALUE: return METAPATTERN;
			case INSTANCE_VALUE: return INSTANCE;
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
	private ScriptCategory(int value, String name, String literal) {
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
	
} //ScriptCategory
