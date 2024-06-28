package javaSessions;

public class MathmeticalOperations {

	public static void main(String[] args) {
		
		
	// If both the number are integer then output will also be single digit
		System.out.println(10/2); // 5
		System.out.println(9/2); // 4 instead of 4.5 because both numbers are single integer value
		
		System.out.println(9.0/2); //4.5  if one of the number is floating or percent value then output will also be float.
		
		//System.out.println(9/0); // any integer divide by zero will get an  exception
		
		System.out.println(9.0/0); // Infinity 
		System.out.println(9.0/0.0);//Infinity
		System.out.println(1.22/0); // Infinity
		
		//System.out.println(0/0);// AE Arithmetic Exception because any integer (single) divide by zero will get an  exception. 
		//Pure single integer divide by zero will give AE. But Floating or double number divided by zero will get output is INFINITY.
		System.out.println(10.0/2);
		
	    System.out.println(0.0/0.0); // 'NaN' means not a number. Java does not recognize this calculation
	    
	    System.out.println(0/0.0);// NaN
	    
	    System.out.println(0.1+0.4);//0.5
	    System.out.println(0.1+0.2); // 0.30000000000000004 // Loosing data. source code converted into byte code, then converted to machine code and machine code use the binary and adding two binary. Machine code giving the output. Google will give the different numbers.
	    
	    System.out.println(0/9);// 0. Any number divided  by zero output will be zero. 
	    
	    System.out.println(0.1+0.4);//0.5
	    System.out.println(0.1+0.2);//0.30000000000000004  Its calls procession error. it is because src code converted into byte code, and converted into machine code and display it for user, machine converting it into binaries. 
	    //when using these binaries its looses some data and give back output like this.
	    
	    
	    
	    
	    
	    
	    
	    
		
		

	}

}
