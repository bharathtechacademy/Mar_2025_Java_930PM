package interfaceConcepts;

public interface InterfaceClass {

	// Special abstract class ==> it's an 100% abstract class

	
	public void printApplicationName();
	
	//default method
	public default void login() {
		launchApplication();
		System.out.println("Step 2");
		launchApplication();
	}

	//static method 
	public static void logout() {
		System.out.println("Logout from application");
	}
	
	
	//concrete methods 
	private void launchApplication() {
		System.out.println("Launch application using www.google.com");
	}
}
