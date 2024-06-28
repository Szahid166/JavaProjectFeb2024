package ExceptionHandling;
// Error is another java class unlike Exception 
//Error is another class in java. Error come during system failure or ram memory issues .
// Error can not handle with exception
// never handle exception with error 
// super class of exception is Throwable
// Exception and Error both are child class of Throwable class
// Throwable can handle exception and Erroe both
// Object can not handle any kind of exception

public class Employee {

	public static void main(String[] args) {
		
		System.out.println("A");
		
		try {
			int i = 9/0;
			}
		
		catch (Throwable e) { 
			e.printStackTrace();
			
			
		}
		
		System.out.println("Bye");
		
		
		
		
		
		
		
	}

}
