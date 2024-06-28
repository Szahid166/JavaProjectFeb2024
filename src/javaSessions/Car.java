package javaSessions;

public class Car {
	
    private static final String Static = null;
	String name;// instance variables
	String licenceNumber;// instance variables
	int price;// instance variables
	//int wheels;// all cars has 4 will which will take 4 byte in the memory.
	           // in this case we need to create static variable and it will go CMA for memory to store
	static int wheels= 4;// static variables
		
    
	
	// instance variable : n copies
	// Static variable: i common copy will be created---> CMA
	
	public static void main(String[] args) {
		
    Car c1 = new Car ();
    c1.name = "Honda";
    c1.licenceNumber = "12345";
    c1.price = 3000;
    //c1.wheels = 4;
   //static final int wheels = 4; using final key word 
    Car.wheels = 5;
    
    System.out.println("----------");
    Car c2 = new Car ();
    c2.name = "Kia";
    c2.licenceNumber = "121212";
    c2.price = 200;
    //c2.wheels = 4;
    System.out.println("----------");
    Car c3 = new Car ();
    c3.name = "BMW";
   c3.licenceNumber = "1333";
    c3.price = 400;
    //c3.wheels = 4;
	System.out.println(c3.name + "  " + c3.licenceNumber + " " + Car.wheels);	
	// Note: JAVA will have access to the CMA and all object will have access to the CMA memory 	
	//	All static variable get stored in CMA. 
	// How accses to static Variable? Ans: simple use class name	
	System.out.println(c1.name);// Honda
	System.out.println(Car.wheels);// 4 . best practice
		
	// 2. Static variable direct calling
	
		System.out.println(wheels);//4 
		
	//3. call static property with object reference name? 
		
		//System.out.println(c1.wheels);// should not use static variable with object name
		
		// 
		final int days =7;// once using key ward final you can't change the days anymore
		//days =10;
		int salary = days * 100;
		System.out.println(salary);
		
		//note: difference between static and final: 
		//static is common property for all the objects like one staring wheel for all cars.
		// final is a constant value. once use it you can not manipulate it and no one can change it.
		
		// no reference object
		new Car();
		// null reference object
		Car c4 = new Car();
		c4 = null;
		
		
		
		
		
	}
	
	

}
