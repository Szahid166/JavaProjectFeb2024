package javaSessions;

public class QuizConditionalOperators4 {

	private static int number;

	public static void main(String[] args) {
		
	//Q1.a : Find out the greatest number out of three different given numbers:

//Input the 1st number: 25 
//
//Input the 2nd number: 78 
//
//Input the 3rd number: 87	
		
		
	int a =25;
	int b = 78;
	int c= 87;

	if (a>b ) {
		System.out.println( "a is greater then b");
	}
	
	if (b>c) {
		System.out.println("b is greater then c");
	}
	
	else {
		System.out.println("c is greater then b");// 87
	}
		
	// 1b.: Find out the greatest number out of four different given numbers:

//Input the 1st number: 25 
//
//Input the 2nd number: 78 
//
//Input the 3rd number: 87
//
//Input the 4th number: 97
	
	int a1 = 25;
	int a2 = 78;
	int a3 = 87;
	int a4 = 97;
	
	if (a1>a2) {
		System.out.println("a1 is greater than a2");
	}
	
	if (a2> a3)	{
		System.out.println("a2 is greater than a3");
		
	}
	if (a3>a4)	{
		System.out.println("a3 is greater than a3");
	}
		
	else {
		System.out.println("a4 is greater than a3");// 97 :a4 is greater than a3
		
	}
		
	//2.  Write a Java program to test a number is positive or negative.

//Test Data

//Input number: 35 -- positive number

//Input number: -11 -- negative number
	
		
		int x = 35;
		int x1 = 11;
		if (x>x1) {
			System.out.println("x is greater than x1");
		}
		else {
			System.out.println("x1 s greater than x");
		}
			
		if (true) {
			System.out.println("35 is positive number");
		}
		
		//else { // Dead code
			//System.out.println("11 is negetive number");
		//}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
