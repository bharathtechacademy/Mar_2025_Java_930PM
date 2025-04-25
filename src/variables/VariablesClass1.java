package variables;

public class VariablesClass1 {

	static String name1 = "Bharath Reddy";  //name1 is Static variable 

	String name2 = "Rudra"; // name2 is Instance Variable
	
	
	public void method1() {
		System.out.println(new VariablesClass1().name2);
	}

	public static void main(String[] args) {		
		String name3 = "Bala"; // name3 is Local Variable 
		System.out.println(name3);
		
		VariablesClass1 obj = new VariablesClass1();
		System.out.println(obj.name2);
		
		System.out.println(VariablesClass1.name1);
	}
	


}
