package javaSessions;

public class Customer {

	 // method overloading : object Oriented programming concept (OOP)-->
		//it represent poly(many)+ Morphism(forms): compile time or static polymorphism.
		// duplicate method can not create not allowed. method name can't be same.
		// if you need to duplicate then have to 'overload' the method
		// OverLoad means: with same method name add extra parameter to it.
		//1. has to have same name
		//2. with different numbers of parameters
		//3. with different sequence in the parameter
		//4. return type does not matter.
		public void test() { // zero parameter
			System.out.println("test method");
		}
		
		// these method calls OVER LOADED METHOD. 
		//(int a)is added parameter to the same method name. 
		//Number of parameter has to be different with same parameter name.
		public void test(int a) { // 1 parameter
			System.out.println("test method" + a);
		
		}
		
		public void test (int a, int b) { // 2 parameter
			System.out.println("test method" + a+b);
		}
		
		public void test (int a, String b) { // 2 parameter
			System.out.println("test method" + a+b);
		}
		
		public void test (String a, int b, int c) { // 3 parameter
			System.out.println("test method" + a+b);
		}
		
		public void test (String a, int b, Float f) { // 3 parameter
			System.out.println("test method" + a+b);
		}
		// Use cases: amazon: search method is overloading
		public void search (String name) {
			System.out.println("searche with" + name);
		}
		
		public void search(String name, int price) {
			System.out.println("search with" + name + price);
		}
		public void search(String name, int price, String color) {
			System.out.println();
		}
		
		// 2.use case: payment: CC, CVV number OTP name, paymen
		public void doPayment( String cc, int cvv) {
			
		}
		
		// Uber: 
		public void booking (String st, String end) {
			
		}
public void booking (String st, String end, String carType) {
			
		}
public void booking (String st, String end, int persons) {
	
}

public void doLoging() {
	
}
public void doLoging(String un, String pwp, String role) {
	
}
		





///////
		
		
		
		// to call the above class have to create object of customer class
		// in the case of overloading compiler knows where is  the method to get from, 
		//that why its call compiler time Polymorphism
            public static void main(String[] args) {
		
            	Customer obj = new Customer ();
            	obj.test();
            	obj.test(10);// this 10 is call value or argument
            	obj.test(10,20);
            	obj.test(10, "testing");
            	obj.test("Kim" , 10, 12.33f);
            	
            	// calling a method by passing a value/ argument : call by  value
            	// select obj. test and press control button it will point to particular method for calling.
            	
            	// 
            	
	}

}
