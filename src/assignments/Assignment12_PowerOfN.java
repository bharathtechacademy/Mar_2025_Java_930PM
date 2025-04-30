package assignments;

public class Assignment12_PowerOfN {

	public static void main(String[] args) {

		// Base value (x) and exponent (n) are initialized
		double x = 10;  // Base number
		int n = 3;     // Exponent (can be positive, negative, or zero)
		double result = 1;  // Variable to store the final result of x^n

		// Case when exponent is 0: x^0 is always 1 (regardless of the base, except when x is 0)
		if (n == 0) {
			result = 1;
		}

		// Case when exponent is negative: 
		// Convert the base to its reciprocal and make the exponent positive
		if (n < 0) {
			x = 1 / x;   // Inverse the base: x^(-n) = (1/x)^n
			n = -n;      // Make exponent positive for the loop calculation
		}

		// Multiply the base 'x' with itself 'n' times
		for(int i = 0; i < n; i++) {
			result = result * x;  // Accumulate the result
		}
		
		// Print the final result of x raised to the power n
		System.out.println(result);
	}
}
