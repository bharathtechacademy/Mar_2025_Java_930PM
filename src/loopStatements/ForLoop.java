package loopStatements;

public class ForLoop {

	public static void main(String[] args) {
		
		String name = "Bharath Reddy";
		
//		for(condition1;condition2;condition3) { //condition1==> where to begin, condition2==> where to stop, condition3==> to specify the interval
//			//Statements
//		}
		
		for(int i=1; i<=10; i++) {
			System.out.println(i+"."+name);
		}
		
		for(int i=10; i>0; i--) {
			System.out.println(i+"."+name);
		}

	}

}
