package staticNonAccessModifiers;

public class StaticClass3 {

	public static void main(String[] args) {

        // Creating instance of static nested class
        StaticOuter.StaticInnerClass1 obj1 = new StaticOuter.StaticInnerClass1();
        System.out.println(obj1.name);

        // Creating instance of non-static inner class
        
        System.out.println(StaticOuter.StaticInnerClass2.name);
	}

}
