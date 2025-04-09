package basics;

public class ArraysConcepts {

    public static void main(String[] args) {
    	
		//✅ 1D Array: Simple list — great for names, roll numbers, etc.
		//✅ 2D Array: Table format — good for project-wise grouping.
		//✅ 3D Array: Cube format — perfect for company > project > employee data.
    	
    	/****Syntaxes to build Arrays****/
    	
    	// Syntax to initialize array : DataType [] Variable = new DataType [Length/size];
    	// Syntax to Store value in array : DataType [Index] = Value;
    	// Syntax to retrieve value in array : DataType [Index] ;
    	// Syntax to check total values in array : Variable.length;
    	
    	/****Challenges with Arrays****/
    	
    	// 1. Arrays are fixed in size
    	// 2. Memory will be allocated at the beginning of creating array / static memory allocation
    	// 3. Array allows similar data types only
    	// 4. Modifications also not allowed
        
        // 1D Array: A single row of data, like a list of employee names.
        String[] empNames = new String[3];  // This can hold 3 employee names.
        
        empNames[0] = "Bharath";
        empNames[1] = "Meghana";
        empNames[2] = "Deepika";
        // empNames[3] = "Aishwarya"; // Error: ArrayIndexOutOfBoundsException because index 3 is out of bounds.

        System.out.println("Length of 1D array empNames: " + empNames.length);
        System.out.println("First employee: " + empNames[0]);

        
        // 2D Array: A table-like structure with rows and columns.
        // This can be used to store employee names under different projects.
        // Example: 2 projects, each having up to 3 employees
        String[][] projects = new String[2][3];  // 2 rows (projects), 3 columns (employees per project)

        projects[0][0] = "Ravi";
        projects[0][1] = "Sneha";
        projects[0][2] = "Bharath";  // Project 0, Employee 2
        projects[1][0] = "Pooja";
        projects[1][1] = "Anu";      // Project 1, Employee 1
        projects[1][2] = "Kiran";

        System.out.println("Employee in project[1][1]: " + projects[1][1]);

        
        // 3D Array: A cube-like structure - used when you need data in three dimensions.
        // Example: Companies -> Projects -> Employees
        // This array stores employee names under different companies and projects.
        String[][][] companies = new String[3][2][4];  // 3 companies, 2 projects per company, 4 employees per project

        companies[0][0][0] = "Ram";
        companies[0][0][1] = "Shyam";
        companies[0][0][2] = "Radha";
        companies[0][0][3] = "Kavya";

        companies[0][1][0] = "Mohan";
        companies[0][1][1] = "Sita";
        companies[0][1][2] = "Latha";
        companies[0][1][3] = "Bhanu";  // Company 0, Project 1, Employee 3

        companies[1][0][0] = "Teja";
        companies[1][0][1] = "Rakesh";
        companies[1][0][2] = "Divya";
        companies[1][0][3] = "Harsha";

        companies[1][1][0] = "Neha";
        companies[1][1][1] = "Varun";
        companies[1][1][2] = "Priya";
        companies[1][1][3] = "Surya";

        System.out.println("Employee at company[0][1][3]: " + companies[0][1][3]);  // Output: Bhanu
    }
}
