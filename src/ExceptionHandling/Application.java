package ExceptionHandling;

public class Application {
//Amazon loging
	public void m1 ()throws ArithmeticException {
	System.out.println(" m1 method");
	m2();
	}
// Amazon cart	
public void m2 () {
	try{
		m3();
	}catch (ArithmeticException e) {
		System.out.println(" AE is coming");
	}
	// use it more for reporting-- Pass and fail
	// screenshot
	//logs
	
	}
// payment ICICI bank	
public void m3()throws ArithmeticException{
	System.out.println(" m3 method");
	int i= 9/0;
	
}
	
	// how to call m1 method? 
	
	// create object of application class. 
	// caller/user method
    // never handle exception in the main method that is not a good practice
	 public static void main(String[] args) {
		 Application obj = new Application();
		 obj.m1();
		 System.out.println("Bye");
//		 try {
//			 obj.m1();
//		 }catch(ArithmeticException e) {
//			 System.out.println("AE is coming");
			 
//		 }
//		
	
	//obj.m1();
		

	}

}
