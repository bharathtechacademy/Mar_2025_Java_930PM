package basics;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.logging.Logger;

public class PrintStatementsInJava {
	
/*******	Benefits of Print Statements   **********/

	/*
	 * 1.Debugging and Error DetectionPrint statements help easily verify variable
	 * values and program flow without requiring complex debugging tools.
	 * 
	 * 2.Monitoring Program ExecutionProvides real-time feedback by allowing
	 * developers to monitor program execution step-by-step during runtime.
	 * 
	 * 3.Education and LearningSimplifies learning for beginners by showing immediate
	 * results, making it easier to understand program behavior.
	 * 
	 * 4.Lightweight and AccessibleWorks in all environments without additional setup,
	 * making it a simple yet effective tool.
	 * 
	 * 5.Testing and ValidationHelps check program output and ensure expected behavior
	 * during development.
	 * 
	 * 6.Logging System PrototypesPrint statements can act as placeholders for logging
	 * mechanisms during the early stages of development before implementing a
	 * full-fledged logging system.
	 */
	
/*******	When NOT to Use Print Statements    *******/

	/*
	 * 1.Production Code: Print statements can clutter output and may expose sensitive
	 * information, making them unsuitable for production environments.
	 * 
	 * 2.Complex Applications: For better control, filtering, and structured output,
	 * use logging frameworks instead of print statements.
	 * 
	 * 3.Performance-Critical Code: Print statements can slow down execution, making
	 * them unsuitable for high-performance environments where efficiency is
	 * crucial.
	 */
	public static void main(String[] args) throws FileNotFoundException {
		
		// Print the content and then go to next line
		System.out.println("Hello, World!");
		System.out.println("Hello, Mega!");
		
		// Print the content and then stay on same line
		System.out.print("Hello,");
		System.out.print(" World!");
		System.out.println();
		
		// Print the formated content and then stay on same line
		System.out.printf("%s is completed Btech, empId is %d and visa status is %b","Chandra",1236,false);
		System.out.println();
		
		// Format the digits and then Print the formated content and then stay on same line
		System.out.format("Total Bill is %.2f %n",100.93543539);
		System.out.println();
		
		// Join multiple print statements together 
		System.out.append("My Name is Bharath reddy").append(", My emp id is 1234");
		System.out.println();
		
		// Print the char based on ASCII value
		System.out.write(65);
		System.out.println();
		
		// Print Logs of Program
		Logger log = Logger.getLogger("MyLogger");
		log.info("Current line is 44");
		log.warning("There is some warning at line 45, Please check");
		
		// Print the errors in print statements
		System.err.println("ERROR : Expected result is not matching with actual Result");
		
		// Print & Export the messages into text file.
		PrintWriter writer = new PrintWriter("C:\\Training\\Mar_2025_930PM\\AutomationTraining\\AutomationProject\\Logs.txt");
		writer.println(LocalDateTime.now()+"Currently Line 54 is running");
		writer.println(LocalDateTime.now()+"Currently Line 55 is running");
		writer.println(LocalDateTime.now()+"Execution is compled");
		writer.close();
	}

}
