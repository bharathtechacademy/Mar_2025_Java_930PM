package operators;

public class TernaryOperator {

	public static void main(String[] args) {
	//	5. Ternary Operator ==> shot form of conditional statements ==> ?
		
	//	(condition) ? true : false
		
		int x = 30;
		int y = 20;
		
		int max = (x>y) ? x : y; // (true) 
		
		String output = (x>y) ? "30 is max" : "20 is max" ;
		
		System.out.println(max);
		System.out.println(output);

	}

}
