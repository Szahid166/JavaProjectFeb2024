package constructorconcept;

public class Customer {  // no main method in this class. when we create templed class is for variable, 
	                     //method no need main method or caller method in this type of class here. 
	
	String name;
	int age;
	String devices[];
	public Customer(String name, int age, String[] devices) {
		this.name = name;
		this.age = age;
		this.devices = devices;
	}
	
	// create constructor with array variables
	// will create main method in another class , so will create another class
	// non-static to non-static no need to create an object
	//
	
   public String [] getDevicesInfo() {  // devices is String so change the void to String
	   return devices; 
   }
	
	// lets create one more method here
   public int getDevicesCount () {  // length is int, so void change to int
	   return devices.length;
   }
}
