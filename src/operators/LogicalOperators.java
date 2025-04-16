package operators;

public class LogicalOperators {

	public static void main(String[] args) {
		// 4. Logical Operators ==> will be used to build the logics ( &&(and) , ||(or) , !(not) )

		int x = 10;
		int y = 20;
		int z = 10;

		System.out.println(x > y && x == z); // false and true ==> false
		
		System.out.println(x > y || x == z); //false or true ==> true
		
		System.out.println(!(x > y || x == z)); // not (false or true)  ==> not (true) ==> false

	}

}
