package exceptionHandling;

public class ExceptionHandling {
	
	// Error is an issue that occurs during run time and we cannot control the same.
	// Exception is an issue that occurs due to logical error and we can control the same.
	
	
	// ExceptionHandling ==> Handle / Control the Exceptions
	
	// throws declaration
	// try/catch exception handling mechanism
	// throw an customized exception
	
	// Example : StatckOverFlowError
	
	public static void method1() {
		method1();
	}

	

	public static void main(String[] args) {
//		method1();
		
		System.out.println(Integer.MAX_VALUE);
		
		//Example : OutOfMemoryError
		int [] arr = new int[Integer.MAX_VALUE];
	}

}
