package OOPInheritance;

public class Car extends Vehicle {
  // creating start method
	// variable override
	int minSpeed = 100;
	public final void testDrive() {// with 'final' key word mathod can not be override
		System.out.println("Car-- testDrive");
	}
	
	public void start() {
		System.out.println("Car---start");
	}
	
	public void stop() {
		System.out.println("Car---stop");
	}
	public void refuel() {
		System.out.println("Car---refuelt");
	}

   // Creating a static method
	// static method can not be overriden. It can be overload only
     public static void billing() {
    	 System.out.println("Car-- billing");
     }
      



}



