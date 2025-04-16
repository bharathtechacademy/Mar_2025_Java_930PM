package operators;

public class ArithmeticOperators {

	public static void main(String[] args) {
//		1. Arithmetic Operators  ==> to perform mathematical operations ( + , -, * , / , % (modulus) , ++ (increment), --(decrement))
		
		int a= 10;
		int b= 20;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(b/a);
		System.out.println(b%a);
		
		//a++ ==> post-increment ==> after executing the current line it will increase the value by 1
		//++a ==> pre-increment ==> before executing current line increase the value by 1
		
//		System.out.println(a++);
//		System.out.println(a);
//		System.out.println(b--);
//		System.out.println(b);
		
		System.out.println(++a);
		System.out.println(--b);
		
		

	}

}
