package javaSessions;

public class DataTypes {

	public static void main(String[] args) {

		// Data types: means types of data
		// strict data type -> whenever we declare any variable have to declare data
		// type also.
		// Java is not 100% object oriented

		// 1.byte: size and range have to declare for byte
		// size 1 byte = 8 bits
		// Range -128 to 127 Rage is higher then the byte
		// byte use for small numbers
		
		//primitive data type has predefined sizes and ranges
		byte b = 10; // total number of months, year can be use in bytes. byte use for small number like age. 
		b = 20;
		b = 30;
		System.out.println(b);
		byte h = 30; // total space taken in the memory by this particular program is 2 bytes . for variable b and h are two variables. Range is the value.

		byte j = -10;
		byte j1 = -128; 

		// short 
		
		
		
		//4. long : size 8byte =64 bytes
		//range:-
		// long tell# =2343454567, SSN, CC, account Number it  numbers are not for arithmetic calculation then we will use string not integral type.thats a bad practice.
		long t = 100000;
		long t1 = 2323232329888888l; // l is just a indicator for a long number. it will not display in console.
		System.out.println(t1);
		
		
		//5. float: 
		//size: 4 bytes =32 bits
		//Range- up to 7 digit can be taken
		float r = 12.33f; 
		System.out.println(r);
		float r1 = (float) 34.33;
		System.out.println(r1); // another way to write float then f at the end of the number. 
		
		
		// 6. double: allow decimal point value
		// size 8 bytes = 64 bits
		// range: up to 15 digits can be taken 
		double d = 12.333333d;
		System.out.println(d);
		double d1 = 100;
		System.out.println(d1);
		double d2 = 100.44f;
		
		
		// 7. Character: means single digit value. always need single coat to store '' unicode: ACSCII values
		//Size: 2 bytes = 16 bits
		
		char c1 ='a';// a to z
		char c2 ='b'; //A to Z
		
        char c3 = '$'; // special character
		char c4 = '1';
		System.out.println(c1);
		
		
		
		// 8. boolean
		// no range: only true or false--> these are not key words but boolean literals
		//size: i bit
		boolean bg = true; 
		boolean flag = false;
		
		
		
		
		

	}

}
