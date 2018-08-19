package cyberPhysical_Incident.impl;

public class MessagePrinter {

	private static boolean isDebug = false;
	
	public static void printMsg(String msg) {
		
		if(!isDebug) {
			return;
		}
		
		System.out.println(msg);
	}
	
public static void printMsg( Object owner, String msg) {
		
		if(!isDebug) {
			return;
		}
		
		String className = owner.getClass().getSimpleName();
		System.out.println(className+": "+msg);
	}
}
