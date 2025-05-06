package assignments;

public class Assignment14_DiamondProblem {

	public static void main(String[] args) {

		int n = 5;

		// Upper pyramid

		// to use the numbers 1 to 5 in pyramid
		for (int i = 1; i <= n; i++) {

			// print spaces
			for (int j = n; j > i; j--) {
				System.out.print(" ");
			}

			// print numbers
			for (int k = 1; k <= i; k++) {
				System.out.print(k + " ");
			}

			// go to next line
			System.out.println();
		}

		// Lower pyramid

		// to use the numbers 1 to 5 in pyramid
		for (int i = n-1; i >=1 ; i--) {

			// print spaces
			for (int j = n; j > i; j--) {
				System.out.print(" ");
			}

			// print numbers
			for (int k = 1; k <= i; k++) {
				System.out.print(k + " ");
			}

			// go to next line
			System.out.println();
		}

	}

}
