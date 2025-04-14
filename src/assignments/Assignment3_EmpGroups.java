package assignments;

public class Assignment3_EmpGroups{

	public static void main(String[] args) {
		//Create object of Employees class
		Assignment3_Employees obj = new Assignment3_Employees();
		
		//Access the data and store in arrays
		String[] employeeNames = new String[3];
		employeeNames[0] = obj.employeeName1;
		employeeNames[1] = obj.employeeName2;
		employeeNames[2] = obj.employeeName3;

		int[] employeeIDs = new int[3];
		employeeIDs[0] = obj.employeeID1;
		employeeIDs[1] = obj.employeeID2;
		employeeIDs[2] = obj.employeeID3;

		//Print the data
		System.out.println(employeeNames[0] + " : " + employeeIDs[0]);

	}

}
