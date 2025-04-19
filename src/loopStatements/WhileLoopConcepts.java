package loopStatements;

public class WhileLoopConcepts {

	public static void main(String[] args) {
		
//		while(condition) {
//			//condition to break
//			//statements
//		}
		
		String text = "Refresh the page !";
		
		int i= 1;
		
		while(i>=1) {	
			//condition to break
			if(i>10) {
				break;
			}			
			System.out.println(text);
			i++;
		}

	}

}
