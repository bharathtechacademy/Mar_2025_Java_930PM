package jumpingStatements;

public class JumpingStatements {

	// Jumping Statements ==> The statements used to jump from the current
	// iteration.

	// break, continue, return

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			if (i > 4 && i < 7) {
				break;//break the loop
//				continue; // skip current iteration remaining statements
			}
			System.out.println(i);
		}

	}

}
