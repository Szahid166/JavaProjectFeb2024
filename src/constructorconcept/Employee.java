package constructorconcept;

public class Employee {

	
	String name;// all 3s are local or class variables
	int age;
	double salary;
	
	// Constructor:
	// constructor name same as class name
	// it look like a function but its not
	// cons.. can never return anything
	// cons'' can not have void either
	// cons.. can be over loaded
	//cons.. respective will be called when you create the object and argument value you are passing
	// cons.. will help initialize the instance variables
	// in order to call method we need to create an object first with 'new' key word
	// cons help with 2 major things: Initialize the instance variable
	                                 // Restrict the object creation
	// In any parameter either function or constructor , it is a local variable
	
      public Employee() {
    	  System.out.println(" default const..");
      }
	    public Employee (String name1) {
	    	//name =name1; // local to local but to fix this need to change the name to name1, error will be gone
	    	             // but its still not a good code if you have to write a lots of similer codes.
	    	             // so we will use key word 'this' to resolve his issue
	    	             // L=L : G=L
	    	this.name = name;
	    }
	    public Employee(String name, int age) {
        	this.name = name;
        	this.age = age;
        }
	   
	    


	    
	public static void main(String[] args) {
		
        // Employee e1 = new Employee();// if no value added then default constructor will be called
         //Employee e1 = new Employee(10);
        // Employee e1 = new Employee(10,20);
		
		Employee e1 = new Employee("tom");
		System.out.println(e1.name);// tom
		System.out.println(e1.age);//0
		
		// you can update the value age  or name Ex:
		e1.age= 30;
		System.out.println(e1.age);//30
		
		Employee e2 = new Employee("Piter", 20);
		System.out.println(e2.name);// piter
		System.out.println(e2.age);//20
		
		//Employee e3 = new Employee("Lisa", 35,30.34);
		
		
		
		
		
		
		
	}

}
