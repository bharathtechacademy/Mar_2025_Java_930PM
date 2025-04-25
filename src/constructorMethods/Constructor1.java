package constructorMethods;

public class Constructor1 {
	
	// constructor method , it will create by default by java ,
	// every time when new class is created with same name as class name 
	// method won't have any return type
	
	String name = "Prateek";
	
	Constructor1(){ //default constructor
		
	}

	int empId =0;
	
	Constructor1(int id){ //parameterized constructor
		empId=id;
	}
	
	public void printEmpDetails(String name) {
		System.out.println(empId);
		System.out.println(name);
	}

	public void printEmpAddress(String Address) {
		System.out.println(empId);
		System.out.println(Address);
	}

	public void printEmpVisaDetails(String visaNumber) {
		System.out.println(empId);
		System.out.println(visaNumber);
	}

	public void printEmpStayDetails(String HotelName) {
		System.out.println(empId);
		System.out.println(HotelName);
	}	

	public static void main(String[] prateek) {

	}

}
