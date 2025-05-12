package assignments;

public class Assignment17_Triangle {

	public static void main(String[] args) {
		
		int n =5;
		
		for(int i=1; i<=n; i++) {
			
			//Print spaces
			for(int j=i; i<n;j++) {
				System.out.print(" ");
			}
			
			//print *
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			
			//move to next line
			System.out.println();
			
		}


	}

}
