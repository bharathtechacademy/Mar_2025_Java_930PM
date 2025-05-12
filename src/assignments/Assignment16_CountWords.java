package assignments;

public class Assignment16_CountWords {

	public static void main(String[] args) {
		String paragraph = "Java is a popular programming language. Java is used for web development, mobile applications, and more.";
		
		String [] words = paragraph.split(" ");
		
		//get total count and index of 'java' words
		int count=0;
		for(int i=0;i<words.length;i++) {
			if(words[i].equalsIgnoreCase("Java")) {
				System.out.println("Java word is present in Array with Index :"+i);
				count++;
			}				
		}
		System.out.println("Total words with Java are :"+count);
		

	}

}
