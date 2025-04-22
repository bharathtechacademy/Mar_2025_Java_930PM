package methodsInJava;

public class WithMethodsInTesting2 {
	
	// Method / Function ==> Method is collection of statements  / Block of code written to complete specific task.
	
	// Step 1: Identify the duplicate code written in sequence
	// Step 2: Create the block out side of the main method and add all duplicate lines inside the block { }
	// Step 3: Add name to the block
	// Step 4: call with same name whenever it's required
	
	public static void main(String[] args) {
		WithMethodsInTesting2 obj = new WithMethodsInTesting2();	
		
		obj.launchBrowserAndApplication("chrome","www.amazon.com");
		WithMethodsInTesting2.loginIntoApp();
		System.out.println("Execute Test Case 1 Steps Related to HomePage....");
		obj.logoutAndCloseBrowser();
		
		obj.launchBrowserAndApplication("chrome","www.amazon.com");
		WithMethodsInTesting2.loginIntoApp();
		System.out.println("Execute Test Case 2 Steps Related to Fund Transfer Page....");
		obj.logoutAndCloseBrowser();
		
		obj.launchBrowserAndApplication("firefox","www.qa.amazon.com");
		WithMethodsInTesting2.loginIntoApp();
		System.out.println("Execute Test Case 3 Steps Related to Login Page....");
		obj.logoutAndCloseBrowser();
		
		obj.launchBrowserAndApplication("firefox","www.qa.amazon.com");
		WithMethodsInTesting2.loginIntoApp();
		System.out.println("Execute Test Case 3 Steps Related to Login Page....");
		obj.logoutAndCloseBrowser();
		
		obj.launchBrowserAndApplication("edge","www.uat.amazon.com");
		WithMethodsInTesting2.loginIntoApp();
		System.out.println("Execute Test Case 4 Steps Related to Check the balance Page....");
		System.out.println(obj.getbalance());
		obj.logoutAndCloseBrowser();
	}
	
	
	void launchBrowserAndApplication(String browserName , String appUrl) { //method with arguments , //method without return type
		System.out.println("Launch the "+browserName+" browser");
		System.out.println("Enter url "+appUrl+" and launch application");
	}	

	static void loginIntoApp() {//static method
		System.out.println("Enter username as Bharath");
		System.out.println("Enter password as bharath123");
		System.out.println("Click on Login button");
	}

	void logoutAndCloseBrowser() {//method without arguments
		System.out.println("Logout from application");
		System.out.println("Close the browser");
	}

	double getbalance() {//method with return type
		System.out.println("Navigate to account section");
		System.out.println("Capture the Account balance");
		double balance = 1000.50;
		return balance;	
	}
	

}
