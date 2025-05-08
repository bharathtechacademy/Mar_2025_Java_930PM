package functionalInterfaces;

public class FunctionalInterfaceClass2 {

	public static void main(String[] args) {

//		FunctionalInterfaceClass1 fi = (a,b)->a+b;
//		System.out.println(fi.sumOfNumbers(1, 2));

//		FunctionalInterfaceClass1 fi = x -> x*x;
//		System.out.println(fi.square(2));

		FunctionalInterfaceClass1 fi = (a, b) -> {
			double c = a + (a * (b / 100));
			return c;
		};

		System.out.println(fi.totalAmount(1000.25, 12.0));

	}

}
