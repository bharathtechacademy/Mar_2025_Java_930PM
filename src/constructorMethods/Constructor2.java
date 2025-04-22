package constructorMethods;

public class Constructor2 {

	public static void main(String[] args) {

		Constructor1 obj = new Constructor1(1234); // new + constructor ==> object

//		System.out.println(obj.name);
		obj.printEmpDetails("Prateek");
		obj.printEmpAddress("Delhi");
		obj.printEmpVisaDetails("1234ASDFT5");
		obj.printEmpStayDetails("Novotel");

	}

}
