package javaSessions;

public class FunctionInJavaChapter10 {
	
	//Function: is a piece of code. its like a factory. you give something and get somthing in return.
	// data member of the class
	// can not create a function inside a function means can't create inside the main method arg.
	// but call a function from another function.
	//Function and method are same and parallel to each other / independent
	
	// way to declare function
	
	// 1. with no input and no return: Void means it can not return anything. and below code does not have any parameter to print.
	     // return and void can not be together. return type of void method is also void in the arg.
	     // naming convention id begin with lower sace and do write in camel case 
	public void test() {
		System.out.println("test method");// this will not print anything since there is no call from the main method
		                                  // data vale can give this to all the objects create in the main method
		}
	 public String getTrainerName() { // changed void to String because return name is String
		 System.out.println("getTrainerName");
		 String name = "Naveen";
		 return name;
	 }
	
	
	
	public void getInfo() {  // this will create another another o
		int a =10;
		int b =20;
		int c= a+b;
		System.out.println(c);// this function is fixed and I can not manipulate later in main method.
	}
	
	// 2. function with no input but some return
	// return type is int. its importent to check what is the function type always.
	    public int getBillAmount() {
	    	System.out.println("getBillAmount");
	    	int foodBill = 100;
	    	int tax =20;
	    	int finalAmount = foodBill + tax;
	    	return finalAmount; // to get rid of the red under return key word,  and get some return, 
	    	                   //we have to use int instead of void to get the return.
	       //  Purpose of return: when we get something from the function, in the form of data, 
	      //we can manipulate the data in the main method during calling time. 
	    
	    }
	    
	    // 3rd type of function: some input and some return
	     public int add(int a, int b) { // 2 parameter here
	    	System.out.println("adding two numbers");
	    	int sum = a+b;
	    	return sum;
	    	
	    	 
	     }
	
	     // another example with multiple int values. 
	     // have to use all 3 parameters that declared in the function
		// also make sure if there is return in double then it should declared in double. 
	     //number of parameter declared have to use them all 
	     
	     public double getTotalMarks(int firstSubject, int secondSubject, double negativeMarking) {
	 		System.out.println("getting total marks");
	 		double finalMarks = firstSubject + secondSubject - negativeMarking;
	 		return finalMarks;
	     }

	
	     public static void main(String[] args) {
		
         // have to create an object in the main method first so it can call the function created in public class.
		
		FunctionInJavaChapter10 obj = new FunctionInJavaChapter10 ();// obj is object reference
		
		obj.test(); // now it will print in the class.
		
		obj.getInfo();// 2nd method will be printed
		
		int  m = obj.getBillAmount(); //this is the best practice. do declare the variable and then print in the console
		System.out.println(m);// 120
		System.out.println(m-10);// Example of manipulation of data. 
		
		// another way to get 120 in the console
		
		System.out.println(obj.getBillAmount());// 120 but this is not a good practice. 
		
		obj.getTrainerName();
		String n = obj.getTrainerName();
		System.out.println(n);// Naveen
		
		// 3rd example 
		
		obj.add(10, 20);
		int s1 = obj.add(10, 20);
		System.out.println(s1);// 30
		
		int s2 = obj.add(20,5);
		System.out.println(s2);// 25
		
		// have to use all 3 parameters that declared in the function
		// also make sure if there is return in double then it should declared in double. can not skip any parameter. 
		
		double d = obj.getTotalMarks(100, 200, 10.33);
		System.out.println(d);// 289.67
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
