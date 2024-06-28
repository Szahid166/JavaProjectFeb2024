package OOPInheritance;

//Since BMW is the child of Car class so need introduce a key word 'extends Car'here.
public class BMW extends Car{
	int minSpeed =200; // if you create an object of child class it will get the preference at the runtime
	
     // method Overriding : poly+morphism-- > this is call Runtime polymosphism or Dynamic Polymorphism
	// creating another class with main method 
		// Method 'OverRide' when child whats to have the same method as parent but update the method.
		// anotation or keyword should be added as '@Override' its not mendetory but recomended
		// @Override conditions are:
		// 1. with the samename
		//2. with same number of parameter with same sequence
		//3. withbsame return type 
		// with in the class you can overload can be done
	    // Private method can not be override
	
	 @Override
      public void start() {
	      System.out.println("BMW-- start");
	}
	 @Override
     public void engine() {
	      System.out.println("BMW-- engine");
	}
	 
	 
	public void autoParking() {
		System.out.println("BMW-- autoParking"); 
	}
	// @Override: can not override. this concept is call Method hidding: 
	//static method in parent class and the same method in child class
//	  public static void billing() {
//		System.out.println("BMW--billing");
//	}
	
	
}
