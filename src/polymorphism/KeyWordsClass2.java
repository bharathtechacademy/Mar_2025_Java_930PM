package polymorphism;

public class KeyWordsClass2 extends KeyWordsClass1{
	
	String name = "Bharath Reddy";
	
	public void printName(String name) {
		System.out.println(name);
//		System.out.println(new KeyWordsClass2().name);
//		System.out.println(new KeyWordsClass1().name);
		System.out.println(this.name);//current class instance
		System.out.println(super.name);//parent class
	}

	public static void main(String[] args) {
		KeyWordsClass2 obj = new KeyWordsClass2();
		obj.printName("Mr. Bharath Reddy");
	}

}
