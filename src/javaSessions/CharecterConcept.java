package javaSessions;

public class CharecterConcept {

	public static void main(String[] args) {

		// Character does the calculation and whenever it does the calculation its ask for ASCII values
		//ASCII table is computer fundamental not only for java. 
		// if no arithmetic calculation done then it will return only given values
		// Character is coming from integer family
		// a to z 97 to 122
		// A to Z 65 to 90
		// 0 to 9: 48 to 57
		// ASCII value is numeric or numbers

		char c1 = 'a';// ASCII value of a is 97
		char c2 = 'b'; // ASCII value of a is 98

		System.out.println(c1);
		System.out.println(c2);

 System.out.println(c1+c2);// 195

		int a = 100;
		int b = 100;
		System.out.println(a+b);
		
		// way to get ASCII value with out looking at the chart
		// can write with variable or use directly the value
		System.out.println((byte)c1);
		System.out.println(0+c1);
		System.out.println(0+'$');// ASCII value is $ is 36
		
		
		
		
		
		
		
		

	}

}
