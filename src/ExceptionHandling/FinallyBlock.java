package ExceptionHandling;

// finally block in not a method . It is just a key word, thats why its written in lowercase letter

public class FinallyBlock {

	public static void main(String[] args) {
		
		System.out.println("A");
		
		try {
			int i =9/0; // AE
		} 
			catch (ArithmeticException e) {
		       e.printStackTrace();
		}
		    finally {
		    	System.out.println("finally block");
		    }
		
		        System.out.println("Bye");
		        
		        
		        
		        
		        

	}

}
