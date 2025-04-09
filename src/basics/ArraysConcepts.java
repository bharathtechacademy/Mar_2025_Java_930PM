package basics;

public class ArraysConcepts {

	public static void main(String[] args) {
		
		String [] empNames = new String [3];
		
		empNames[0]="Bharath";
		empNames[1]="Meghana";
		empNames[2]="Deepika";			
//		empNames[3]="Aishwarya";		
		System.out.println(empNames.length);
		System.out.println(empNames[0]);
		
		
		String [][] projects = new String [2][3];
		
		projects[0][2]="Bharath";		
		projects[1][1]="Anu";
		
	//	3, 2,4
		
//		company 1, project 2, employee 4 is Bhanu
		
		String [][][] companies = new String [3][2][4];
		
		companies[0][1][3] ="Bhanu";
		
		System.out.println(empNames);
	}

}
