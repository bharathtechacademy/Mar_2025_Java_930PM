package assignments;

public class Class3 extends Assignment3_Employees{
	
	
	public void run() {	
		String[] employeeNames = new String[3];
		employeeNames[0] = employeeName1;
		employeeNames[1] = employeeName2;
		employeeNames[2] = employeeName3;

		int[] employeeIDs = new int[3];
		employeeIDs[0] = employeeID1;
		employeeIDs[1] =employeeID2;
		employeeIDs[2] = employeeID3;

		//Print the data
		System.out.println(employeeNames[0] + " : " + employeeIDs[0]);

	}

	public static void main(String[] args) {
		Class3 obj = new Class3();
		obj.run();
	}

}
