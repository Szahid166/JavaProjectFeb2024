package javaSessions;

public class ConditionalStatement {

	private static final boolean PASS = false;
	private static final boolean FAILL = false;
	private static final boolean TRUE = false;

	public static void main(String[] args) {
		
		// when comparing two variable and on the basis of the variable I have to take a decision her either it is true or falls.
		 // if is a key word. after if use the parenthesis for boolean value. after that use the block body with curly bracket. If condition does not
		// satisfy then use else with curly bracket. We can write true or falls also as a boolean value after if ().
		
		int a = 100;
		int b =200;
		
		if (a>b) {
			System.out.println("a is not greater than b");
		
		}
		else  {
	
		System.out.println("b is greater then a");
		}
	
//	
		
		
		
		if (true) {
		System.out.println("PASS");
	}
			
	else {
		System.out.println("FAILL"); // this is call unreachable code or dead code. its gets warning too. Because if
                                     //of code . True directly written in the if condition code.
}
//		
	boolean flag = false;     // this code does not have warning because it is dependent on flag variable.always better option is boolean and declare the variable when using if and else condition. 
	if(flag) {
		System.out.println("pass");
		
	}
		
	else {
		
		System.out.println("fail");
		}

	//
	int marks = 100;
	if (marks<= 100) {
		System.out.println("calculate grade");
	// we can write another if condition inside the if condition. its call NESTED if /else condition
	
		if(marks>=100) {
			System.out.println("grade A");
			if(marks>=95) {
			System.out.println("grade A++");	
			  if (marks == 100) {                   // 'double equal' for comparison. and sing single equal for assignment operator. here 90 is assigned for marks
				  System.out.println("eligeble for the scolarships");
			  }
		}
		
		else {
			System.out.println("grade B");
			if (marks<= 50) {
				System.out.println("grade C");
			}
		}
	}
	
	else {
		System.out.println("marks not valid");
	
	//
	//if-if-if-if-if-else: do not use == in string. break is not allowed in if else condition. 
//		String browser  = "chrome";
//		if (browser.equals("chrome")) {
//			System.out.println("launch chrome");
//		}
//	
//	if (browser .equals("firefox")){
//		System.out.println("launch firefox");	
//	}
//	
//	if (browser .equals("edge")){
//		System.out.println("launch edge");	
//	}
//	if (browser .equals("safari")){
//		System.out.println("launch fsafari");	
//	}
//	if (browser .equals("samia")){
//		System.out.println("launch samia");	
//	}
//	else {
//		System.out.println("please pass the right browser:" + browser);
//	}
//	
	
	// if-else if
	
//	String browser = "safari";
//	if (browser.equals("chrome")
//	
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	}
	
	}
	
	}