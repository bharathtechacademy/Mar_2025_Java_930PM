package variables;

public class RulesOfIdentifiers {

	public static void main(String[] args) {
		
		String name = "Bharath Reddy";
		
		/******* RULES  ******/
		
		//1. The variable/Identifier should not be same as java reserved keywords
		// String long = "Bharath Reddy";
		
		//2. The variable/Identifier should not be same as java literals (true, false, null)
		// String true ="Bharath Reddy";
		
		//3. The variable/Identifier should not contain white space
		// String Emp Name = "Bharath Reddy";

		//4. The variable/Identifier should not starts with number
		// String 1name = "Bharath Reddy";
		
		//5. The variable/Identifier should not contain special chars
		// String emp@name = "Bharath Reddy";
		
		//6. The variable/Identifier should be unique always
		//String name = "Ashwini Reddy";
		
		/***** STANDARDS  ********/
		
		//7. The variable/Identifier should starts with lower case when we are creating package, variable, method and it should starts with upper case when we are creating class
		String empName = "Rudra";
		
		//8. The variable/Identifier should be meaningful and should have atleast 3 chars and should not cross 15 chars length
		int carNumber = 3344;
		
	}

}
