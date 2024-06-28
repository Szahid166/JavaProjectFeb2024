package javaSessions;

public class CallByReference {
	
	String name;
	int age;
	
	
	public static void test(CallByReference t1) {
		System.out.println("test method");
		System.out.println(t1.name);
		System.out.println(t1.age);
	}
	
	
	
	// inside the main method creating the object of reference class. 

	public static void main(String[] args) {
		
		CallByReference obj = new CallByReference();
		// Initializing the value 
		obj.name = "Rahul";
		obj.age = 30;
		System.out.println(obj.name);
		System.out.println(obj.age);
		
		// Note: in the test method can I access name and age? name and age are non static but test method is static in nature.
		// static method can be call with class name or test method.
		// what should be the parameter in test? We have touse same call by reference and give one variable is t1. now warning is gone.
		// here is only one object which is obj. 
		
		CallByReference.test(obj);// call by reference

	}
 
}
