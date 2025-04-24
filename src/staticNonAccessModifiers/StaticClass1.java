package staticNonAccessModifiers;

public class StaticClass1 {
	
	static String name = "ABC";
	
	public static int empId() {
		return 1234;
	}

	public static void main(String[] args) {
		
//		StaticClass1 obj = new StaticClass1();
//		System.out.println(obj.name);
//		System.out.println(obj.empId());
		
		System.out.println(StaticClass1.name);
		System.out.println(StaticClass1.empId());
	}

}
