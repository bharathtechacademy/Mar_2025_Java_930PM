package exceptionHandling;

public class TryAndCatchExceptionHandling {

	public static void main(String[] args) {

		String[] empNames = new String[3];
		
		try {
			empNames[0] = "Bharath";
			empNames[1] = "Meghana";
			empNames[2] = "Deepika";
			empNames[3] = "Vilasini";			
		} catch (Exception rajesh) {
			System.out.println("There is a error :"+rajesh.getLocalizedMessage());
			empNames[3] = "Vilasini";
		} finally {
			System.out.println("Execution Completed");
		}
		System.out.println(empNames[0]);
		
	}

}
