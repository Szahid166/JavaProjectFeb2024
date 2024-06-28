package javaSessions;

import java.util.Arrays;

public class ArrayLiterals {

	public static void main(String[] args) {
		
		//What is 
		
		// int array 
		//1. useing new
		int i [] = new int [4];// 0-3// use this array when data is unknown or when all data are not . 
		
		// 2. array literals: 
		
		int p [ ] = {1,2,3,22,12,90, 7,4,20}; // 9// Both are these arrays are static. 2nd one we will use when all the data are available.
		
		System.out.println(p.length); // 0-8
		
		System.out.println("li = " +  0); //formula to find lowest index
		System.out.println("hi = "+ (p.length-1));// formula for highest index
	
		System.out.println(p[0]);// what value available on p=o? Way to find value of p zero.
		
		
		for (int e : p) {
			System.out.println(e); // using for loop
		}
		
		System.out.println(Arrays.toString(p)); // using toString method will print all the method like this:[1, 2, 3, 22, 12, 90, 7, 4, 20] this method can print with out using loops. 
		
		
		// this arrays for all different types of array
		
		String students[] = { "jay", "Tim", "Mom", "Kim"};
		System.out.println(students.length);
		
		System.out.println(Arrays.toString(students));//[jay, Tim, Mom, Kim]
		
		
		// Example:
		
		Object empData[] = { "true", 25, 88.23, 'F', "Kim"};
		
         System.out.println(Arrays.toString(empData));  // [[true, 25, 88.23, F, Kim]
		
		
		
		

	}

}
