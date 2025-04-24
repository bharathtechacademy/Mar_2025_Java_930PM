package staticNonAccessModifiers;

public class StaticClass2 {

	static int salary;

	//Static block
	static {
		salary = 1000;
		System.out.println("I will execute always at the begining");
	}
	
	String name = "Bharath";

	public static void main(String[] args) {
		StaticClass2 obj = new StaticClass2();
		System.out.println(obj.name);
		System.out.println(StaticClass2.salary);
	}

}
