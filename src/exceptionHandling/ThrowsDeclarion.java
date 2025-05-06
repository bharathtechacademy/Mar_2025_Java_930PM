package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsDeclarion {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException{
		FileInputStream fis = new FileInputStream("");
		
		System.out.println("Naresh");
		Thread.sleep(2000);
		System.out.println("Bhavitha");
		Thread.sleep(3000);
		System.out.println("Vilasini");
	}

}
