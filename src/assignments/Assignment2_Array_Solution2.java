package assignments;

public class Assignment2_Array_Solution2 {

	public static void main(String[] args) {

		String[][][] data = new String[5][2][6]; //5 SEMESTERS , each semister 2 GROUPS (sub, marks) and each group 6 SUBJECTS

		// Semester 1
		
		//Subjects
		data[0][0][0] = "Mathematics I";
		data[0][0][1] = "Physics";
		data[0][0][2] = "Chemistry";
		data[0][0][3] = "Computer Programming";
		data[0][0][4] = "Engineering Drawing";
		data[0][0][5] = "Basic Electrical Eng.";
		
		//marks
		data[0][1][0] = "Pass(78)";
		data[0][1][1] = "Pass(85)";
		data[0][1][2] = "Fail(21)";
		data[0][1][3] = "Pass(74)";
		data[0][1][4] = "Pass(88)";
		data[0][1][5] = "Pass(79)";

		// Semester 2
		data[1][0][0] = "Mathematics II";
		data[1][0][1] = "Mechanics";
		data[1][0][2] = "Environmental Sci.";
		data[1][0][3] = "Basic Electronics";
		data[1][0][4] = "Engineering Physics";
		data[1][0][5] = "Engineering Graphics";
		
		data[1][1][0] = "Pass(82)";
		data[1][1][1] = "Pass(77)";
		data[1][1][2] = "Pass(93)";
		data[1][1][3] = "Fail(19)";
		data[1][1][4] = "Fail(24)";
		data[1][1][5] = "Pass(90)";

		// Semester 3
		data[2][0][0] = "Data Structures";
		data[2][0][1] = "Discrete Mathematics";
		data[2][0][2] = "Digital Electronics";
		data[2][0][3] = "Operating Systems";
		data[2][0][4] = "Signals and Systems";
		data[2][0][5] = "Object-Oriented Prog.";
		
		data[2][1][0] = "Pass(88)";
		data[2][1][1] = "Pass(81)";
		data[2][1][2] = "Pass(76)";
		data[2][1][3] = "Fail(32)";
		data[2][1][4] = "Pass(85)";
		data[2][1][5] = "Pass(78)";

		// Semester 4
		data[3][0][0] = "Algorithms";
		data[3][0][1] = "Computer Networks";
		data[3][0][2] = "Database Systems";
		data[3][0][3] = "Microprocessors";
		data[3][0][4] = "Communication Eng.";
		data[3][0][5] = "Software Engineering";
		
		data[3][1][0] = "Pass(91)";
		data[3][1][1] = "Pass(73)";
		data[3][1][2] = "Fail(19)";
		data[3][1][3] = "Pass(80)";
		data[3][1][4] = "Pass(76)";
		data[3][1][5] = "Pass(87)";

		// Semester 5
		data[4][0][0] = "Probability & Stats";
		data[4][0][1] = "Machine Learning";
		data[4][0][2] = "Compiler Design";
		data[4][0][3] = "Theory of Computation";
		data[4][0][4] = "Embedded Systems";
		data[4][0][5] = "Computer Graphics";
		
		data[4][1][0] = "Pass(86)";
		data[4][1][1] = "Pass(88)";
		data[4][1][2] = "Pass(84)";
		data[4][1][3] = "Pass(95)";
		data[4][1][4] = "Pass(73)";
		data[4][1][5] = "Pass(90)";

		// Print Semester 3 Subject 4 and Subject 5 names
		System.out.println("Semester 3, Subject 4: " + data[2][0][3]); // Operating Systems
		System.out.println("Semester 3, Subject 5: " + data[2][0][4]); // Signals and Systems

		// Print marks of Semester 5, Subject 3 and Subject 6
		System.out.println("Semester 5, Subject 3 Marks: " + data[4][1][2]); // Compiler Design - Pass(84)
		System.out.println("Semester 5, Subject 6 Marks: " + data[4][1][5]); // Computer Graphics - Pass(90)

	}

}
