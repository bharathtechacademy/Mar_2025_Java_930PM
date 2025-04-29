package finalNonAccessModifiers;

public class FinalClass {
	
	// final can be used before class, method and data as well.
	
	// final can stop modifications at data, method and class level
	
	// final data cannot be modified
	// final method can't allow overriding
	// final class won't allow inheritance
	
	
	final String name = "Bharath Reddy";
	
	public void changeName(String newName) {
//		name = newName;
	}
	
	final double pi = 3.14;
	
	public final void printNameAndRole() {
		System.out.println("Bharath Reddy");
		System.out.println("SDET");
	}

	public static void main(String[] args) {

	}

}
