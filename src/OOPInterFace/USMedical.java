package OOPInterFace;

public interface USMedical extends WHO{
	
	
	// define variable in interface
	// Interface variable are static and final by default
	int MIN_FEE = 10;

// interface methods can not have method body and this is call 'abstract method'
// so we can not have curly braces 	
// can not create the object of interface
// this is also polymorphysm
// abstrarct method can  ot be static or final or private
	
	public void physioServices(); 
// abstract method can be overloaded
	public void physioServices(int a);
	public void oncologyServices();
	public void dentalServices();
	public void emergencyServices();
	void physoServices();

	// After JDK 1.8, we can have a static method with method body
	//Example
	public static void billing() {
	System.out.println("USMedical---billing");	
	}
	
	// can have default method with method body: non statid
	// it can be over ridden
	default void helpDesk() {
		System.out.println("fh-- helpDesk");
		
		
		
		
	}

	
}
