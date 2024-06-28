package javaSessions;

public class QuizeDatatype {

	public static void main(String[] args) {
		
		//1. Write a Java program to add two strings:

//			String a = "hello";

			//String b = "SamiaZ";
			System.out.println("hello Samia Z");//hello Samia Z
			
			
		//	2. Write a Java program to print the sum of two numbers. Test Data: 74 + 36  expected result 110.
			
            int c = 74;
			int d = 36;
						
			int w = (c + d);
		
		System.out.println(c+d);//110
		
			
		//3 Write a Java program to print the division of two numbers.Expected Output : 43 

//        16 — correct one
//
//          19
//
//          13	
		int k= 50/3;
		System.out.println(50/3);//16 because both number are single integer value. 
		
		
		//4. Write a Java program to compute the specified expressions and print the output. Go to the editor.Test Data:((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) 
		//Expected Output  2.138888888888889
        
		//double num = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
		System.out.println( (25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));// 2.138888888888889
		
		// 5. Try to concat "Hello Selenium" with a character 't'. Solution: String a = “Hello Selenium”; char b = ‘t‘;System.out.println(a+t);
		  
		//String a = "hello Selenium";
		//char b = 't';
		
		//System.out.println(a + 't');
		
		//6. Create three int variables having values like : 100, 200, 3400. Add them and concatenate and generate this output String : 

           //"Your Total  amount is: 3700".
		
		int a = 100;
		int b = 200;
		//int c= 3400;
		System.out.println("your total number is:" +(a+b+c)); //your total number is:3700
		
		
		
		//7.Print the ASCII value of the character 'h'.
		
//		int ch = 'h';//104
//		System.out.println((byte) ch);//104
		
		//8. Write a program to add 3 to the ASCII value of the character 'd' and print the equivalent character.
		
		char ch ='d';//100
		int  res = ch + 3;
		System.out.println((char)res);//g
		System.out.println('d' +3); //103
		
		//9.Write a program to find the square of the number 3.9.
		
		double num = 3.9;
		System.out.println(num*num);//15.209999999999999
		//or
//		double num = 3.9;
//		System.out.println(Math.pow(num, 2));//15.209999999999999  Did not understand this. 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
			
		
	}

}
