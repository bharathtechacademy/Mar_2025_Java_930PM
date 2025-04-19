package assignments;

public class Assignment7_ConditionalStatements {

	public static void main(String[] args) {

		// Input values for the customer
		String customerName = "John Doe"; // Customer's name
		int creditScore = 720; // Customer's credit score
		double income = 55000.0; // Annual income of the customer
		boolean isEmployed = true; // Employment status
		double debtToIncomeRatio = 45.0; // Debt-to-Income ratio in percentage

		// Display initial message
		System.out.println("Loan Evaluation Result for: " + customerName);

		// Step 1: Check credit score
		if (creditScore > 750) {
			// If credit score is above 750, the loan is automatically approved
			System.out.println("Loan Approved: Excellent credit score.");
		} else if (creditScore >= 650) {
			// If credit score is between 650 and 750, further checks are needed
			// Step 2: Check income
			if (income >= 50000) {
				// If income is at least $50,000, check employment status
				if (isEmployed) {
					// Step 3: Check debt-to-income ratio
					if (debtToIncomeRatio < 40.0) {
						// If DTI ratio is less than 40%, approve the loan
						System.out.println("Loan Approved: Meets all criteria.");
					} else {
						// If DTI is 40% or greater, deny the loan
						System.out.println("Loan Denied: Debt-to-Income ratio is too high.");
					}
				} else {
					// If the customer is unemployed, deny the loan
					System.out.println("Loan Denied: Customer is not employed.");
				}
			} else {
				// If income is less than $50,000, deny the loan
				System.out.println("Loan Denied: Income is less than required.");
			}
		} else {
			// If credit score is below 650, deny the loan
			System.out.println("Loan Denied: Credit score is too low.");
		}
	}
}
