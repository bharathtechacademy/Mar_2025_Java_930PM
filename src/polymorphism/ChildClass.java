package polymorphism;

public class ChildClass extends ParentClass{
	
	@Override
	public void launchTheBrowser(String browserName) {
		System.out.println("Launch the "+browserName+" Browser");
	}	
	
	public void sumOfNumbers(int a, int b) {
		System.out.println(a+b);
	}
	
	public void sumOfNumbers(int a, int b,int c) {
		System.out.println(a+b);
	}



	public static void main(String[] args) {
		ChildClass obj = new ChildClass();
		obj.launchTheBrowser("Chrome");
		obj.sumOfNumbers(1, 2,3);
		
		System.out.println("Bharath");
		System.out.println(1234);
		System.out.println(true);
	}

}
