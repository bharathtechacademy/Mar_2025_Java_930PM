package assignments;

public class Assignment13_PrimeNumber {

	public static void main(String[] args) {
		// Prime number is divisible by 1 and itself (prime number starts from 2)

		int input = 5;
		
		
		boolean prime = true;

		if (input <= 1) {
			System.out.println(input + " is not a prime number"); // prime numbers starts from 2
			prime=false;
		}

		for (int i = 2; i < input; i++) {
			if (input % i == 0) {
				prime = false;
			}
		}

		if (prime)
			System.out.println(input + " is  a prime number");
		else
			System.out.println(input + " is not a prime number");

	}

}
