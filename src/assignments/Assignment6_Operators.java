package assignments;

public class Assignment6_Operators {

	public static void main(String[] args) {
		// Declare an array of student names
		String[] studentNames = {"Suresh", "Mahesh", "Naresh"};
		
		// Declare an array of original marks for each student
		int[] marks = {75, 80, 82};
		
		// Create an array to store updated marks after adding bonus
		int[] updatedMarks = new int[3];

		// Add 10 bonus marks to each student and store in updatedMarks array
		updatedMarks[0] = marks[0] + 10;
		updatedMarks[1] = marks[1] + 10;
		updatedMarks[2] = marks[2] + 10;

		// Print updated marks for each student
		System.out.println(studentNames[0] + " : " + updatedMarks[0]);
		System.out.println(studentNames[1] + " : " + updatedMarks[1]);
		System.out.println(studentNames[2] + " : " + updatedMarks[2]);

		// Calculate the average of updated marks
		int averageMarks = (updatedMarks[0] + updatedMarks[1] + updatedMarks[2]) / updatedMarks.length;

		// Print the average marks
		System.out.println("Average Marks: " + averageMarks);
	}
}
