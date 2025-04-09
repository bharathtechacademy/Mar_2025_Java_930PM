package basics;

public class CommentsInJava {
	
	
	/*
	 * This is main method 
	 * Always JVM execution will begin from this main method
	 * Without main method we cannot run the program  (Control+Shift+/) (Multi-line Comments)
	 */
	
	/**
	 * This is the main method that serves as the entry point for any Java application.
	 * The Java Virtual Machine (JVM) starts program execution from the main method.
	 * Without the main method, the program cannot be executed (the JVM needs the main method to begin execution).
	 * 
	 * @author Bharath
	 * 
	 * @version 0.1
	 * 
	 * @param args The main method accepts a single parameter, an array of strings (String[] args).
	 *             This is used to pass command-line arguments to the Java program. Although this 
	 *             method doesn’t use the parameter in this specific example, it can be used for 
	 *             passing dynamic data into the program at runtime.
	 * 
	 * @return This method does not return anything. The main method is void and serves as the starting 
	 *         point for program execution.
	 * 
	 * @throws Exception This method does not throw any exceptions by default. However, in cases 
	 *                   where the program uses file operations, networking, or other I/O tasks, 
	 *                   exceptions might be thrown.
	 * 
	 * 
	 * Example:
	 * To run a simple Java program, you can execute it from the command line or an IDE, and the program
	 * will begin executing from the main method.
	 * 
	 * In this example:
	 * The statement inside the main method prints "Hello, World!" to the console and then moves 
	 * the cursor to the next line.
	 */
	public static void main(String[] args) {
		
		// This is print statement in Java, It will print and go to next line. (Single Line Comment)
		System.out.println("Hello World !");

		/*
		 * This is also another print statement in Java This will Print all the content
		 * mentioned inside the ( ) And, It will stay on same line in the console
		 * (Multi-line Comments)
		 */
		
		System.out.print("Hello, ");
		System.out.print("World !");

	}

}
