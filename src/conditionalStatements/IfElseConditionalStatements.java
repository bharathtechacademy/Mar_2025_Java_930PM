package conditionalStatements;

public class IfElseConditionalStatements {

	public static void main(String[] args) {
	
		double percentage = 82.3;
		
		if (percentage >= 65) {
			System.out.println("You got First Class");	
			
			if (percentage >= 90) {
				System.out.println("Hey , You are eligible for Gold Medal");
			} else {
				System.out.println("But , You are not eligible for Gold Medal");
			}
			
		} else if (percentage >= 50 && percentage < 65) {
			System.out.println("You got Second Class");
		} else if (percentage >= 40 && percentage < 50) {
			System.out.println("You got Third Class");
		} else {
			System.out.println("Sorry, You Failed Bro");
		}

	}

}
