package assignments;

public class Assignment15_ReverseSentence {

	public static void main(String[] args) {
		
		String sentence = "Java programming is fun and challenging";
		
		String [] words = sentence.split(" ");
		
		//Count the words
		System.out.println("Total words in the sentence are "+words.length);
		
		//Print sentence in reverse order of words
		String reverseSentence ="";
		for(int i=words.length-1;i>=0;i--) {
			reverseSentence=reverseSentence+words[i]+" ";
		}
		System.out.println("Reverse Sentence is :"+reverseSentence);
		
		// Print each word of sentence in upper case
		String uppercaseSentence = "";
		for(String word : words) {
			uppercaseSentence=uppercaseSentence+word.substring(0,1).toUpperCase()+word.substring(1)+" ";
		}
		System.out.println("Uppercase Sentence is :"+uppercaseSentence);
	}

}
