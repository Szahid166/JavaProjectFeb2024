package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

//Note: instead od switch back and forth to different type of exception and commenting out , we can use onely eceptin e this case. 
// when you have multiple type of exception then its better to write multiple catch block with one try..
// Multiple catch block is better for more clearity even though you can use only expection super class to handle the exception.
public class Customer {
	String name;

	public static void main(String[] args) {

		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		Customer obj = new Customer();
		obj = null;
		try {
			// int i = 9/0;
			obj.name = "Tom";
		} catch (ArithmeticException e) { // with the exception have to use reference name e
			System.out.println("AE is coming");
			e.printStackTrace(); // this line of will print out exactly what type of exception was getting. its a
									// good practice to use
		} catch (NullPointerException e) { // with the exception have to use reference name e
			System.out.println("NEP is coming");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("some excetion is coming");
			e.printStackTrace();
		}
		System.out.println("Bye");
		

//	     // Checked / compile type exception  
		
//		   try {
//			Thread.sleep(3000);// giving exception before running, and suggested to use try/ catch
//		} catch (InterruptedException e) {
//			
//			e.printStackTrace();
//		}
//		
//		// Another example of pompile time 
//		   
//		  try {
//			FileInputStream ip = new FileInputStream("c:\\test.pdf");
//		} catch (FileNotFoundException e) {
//			
//			e.printStackTrace();
//		}
//		

	}

}
