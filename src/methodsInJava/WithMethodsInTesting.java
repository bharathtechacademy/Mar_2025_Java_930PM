package methodsInJava;

public class WithMethodsInTesting {
	
	// Method / Function ==> Method is collection of statements  / Block of code written to complete specific task.
	
	// Step 1: Identify the duplicate code written in sequence
	// Step 2: Create the block out side of the main method and add all duplicate lines inside the block { }
	// Step 3: Add name to the block
	// Step 4: call with same name whenever it's required
	
	public static void main(String[] args) {
		WithMethodsInTesting obj = new WithMethodsInTesting();	

//		System.out.println("Launch the chrome browser");
//		System.out.println("Enter url and launch application");
//		System.out.println("Enter username as Bharath");
//		System.out.println("Enter password as bharath123");
//		System.out.println("Click on Login button");
		
		obj.launchBrowserAndApplication();
		obj.loginIntoApp();
		System.out.println("Execute Test Case 1 Steps Related to HomePage....");
		obj.logoutAndCloseBrowser();
		
//		System.out.println("Logout from application");
//		System.out.println("Close the browser");
		
//		System.out.println("Launch the chrome browser");
//		System.out.println("Enter url and launch application");
//		System.out.println("Enter username as Bharath");
//		System.out.println("Enter password as bharath123");
//		System.out.println("Click on Login button");
		
		obj.launchBrowserAndApplication();
		obj.loginIntoApp();
		System.out.println("Execute Test Case 2 Steps Related to Fund Transfer Page....");
		obj.logoutAndCloseBrowser();
		
//		System.out.println("Logout from application");
//		System.out.println("Close the browser");
		
//		System.out.println("Launch the chrome browser");
//		System.out.println("Enter url and launch application");
//		System.out.println("Enter username as Bharath");
//		System.out.println("Enter password as bharath123");
//		System.out.println("Click on Login button");
		
		obj.launchBrowserAndApplication();
		obj.loginIntoApp();
		System.out.println("Execute Test Case 3 Steps Related to Login Page....");
		obj.logoutAndCloseBrowser();
		
//		System.out.println("Logout from application");
//		System.out.println("Close the browser");

//		System.out.println("Launch the chrome browser");
//		System.out.println("Enter url and launch application");
//		System.out.println("Enter username as Invalid");
//		System.out.println("Enter password as invalid123");
//		System.out.println("Click on Login button");
		
		obj.launchBrowserAndApplication();
		obj.loginIntoApp();
		System.out.println("Execute Test Case 3 Steps Related to Login Page....");
		obj.logoutAndCloseBrowser();
		
//		System.out.println("Logout from application");
//		System.out.println("Close the browser");
		
//		System.out.println("Launch the chrome browser");
//		System.out.println("Enter url and launch application");
//		System.out.println("Enter username as Bharath");
//		System.out.println("Enter password as bharath123");
//		System.out.println("Click on Login button");
		
		obj.launchBrowserAndApplication();
		obj.loginIntoApp();
		System.out.println("Execute Test Case 4 Steps Related to Check the balance Page....");
		System.out.println(obj.getbalance());
		obj.logoutAndCloseBrowser();
		
//		System.out.println("Navigate to account section");
//		System.out.println("Capture the Account balance");
//		double balance = 1000.50;
		
//		System.out.println("Logout from application");
//		System.out.println("Close the browser");

	}
	
	
	void launchBrowserAndApplication() {
		System.out.println("Launch the firefox browser");
		System.out.println("Enter url and launch application");
	}

	void loginIntoApp() {
		System.out.println("Enter username as Bharath");
		System.out.println("Enter password as bharath123");
		System.out.println("Click on Login button");
	}

	void logoutAndCloseBrowser() {
		System.out.println("Logout from application");
		System.out.println("Close the browser");
	}

	double getbalance() {
		System.out.println("Navigate to account section");
		System.out.println("Capture the Account balance");
		double balance = 1000.50;
		return balance;
	}
	

}
