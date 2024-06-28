package javaSessions;

import java.util.Arrays;

public class ArrayConcept {

	private static char[][] num;

	public static void main(String[] args) {
		
		
		// What is Array? : Set of similar type of data.
		// Major drawback of the Array
		// 1.Size is fixed- > Static-> to overcome this problem, we have to create dynamic array (Array List)
		// Similar type of data. But we can use Object array but this is still static array. 
		
//		int i= 10;
//		i =20;
//		i = 30;
//		System.out.println(i);//output ->30. latest value of i will print out. in permeative datatype it print out one value at a time. 
//		                      // so in this case If I want to print all the value I have to use ArrayConcept.
		
		// Array is non premitive dada type. It does not have fixed value. In array lowest (LI) index always be ZERO. Array size will be 
		//fixed during declaration. its not dynamically changing. 
		
		// LI= 0
		// length =4
        //Hi = length - 1 =>4-1=3
		//length = Hi + 1 => 3+1 =>4		
		
		int i [] = new int [4]; // 4 is the length of the variable.//0 -3
		i[0] =10;
		i [1]= 20;
		i [2]= 30;
		i[3]= 40;
		System.out.println(i[0]);//10 Time complexcity will be 0 (1)
		System.out.println(i[3]);//40
		//System.out.println(i[4]);// i= 4 is beyond the index. Is this code highest rage is 3. will get exception error. java.lang.ArrayIndexOutOfBoundsException: 4
		//System.out.println(i [-1]);// this also out of range exception  during runtime .
		
		
		
		// use cases: Month of the year, days of the week, seats in movie theater, 
		
		// more ex: 
		
		
		int len = i.length;//4
		int hi =len-1;//3
	    int li = 0;//0
		System.out.println(len);//4
		System.out.println(hi);//3
		System.out.println(li);//0
		
		//  to print all the value in for loop
		// index based loop
		for (int k=0; k<=len-1; k++) {  
			System.out.println(i[k]);   // if you write = after k and not write - then it will give exception error.
		}
		
			                             //With out = sign can be written then no need to add - sign with length. 
			
        
//		
		System.out.println("-----------");
//		// how to use 'for each' loop. this is advance way to write. Here no need index.
//		
		for (int e: i) {            // i is array variable that declared at the top and e is representing  i. variable name can be anything like even samia.
		System.out.println(e);
//			
//		}
//		
//		// Example with dDouble Array
//		
		double d[] = new double [3]; // 0 to 2
//		
//		d [0] = 12.33;
//		d [1] = 10.99;
//		d [2] = 23.44;
//		for (double e : d) {
//			System.out.println(e);
//		}
//		
//		//char array
//		char ch[]=new char [4];//3
//		
//		ch[0] = 'a';
//		ch[1] = '1';
//		ch[2] = '$';
//		ch[3] = 'd';
//		for (char e : ch) {
//			System.out.println(e);
//			
//		}
//		
//		
//		//String array
////		
	    String  empNames [] = new String[4];
	    empNames [1] = "srina";
		empNames [0] = "samia";		
		empNames [2] = "Fayyad";
	    empNames [3] = "Rony";
		System.out.println( empNames[0]);
		System.out.println(Arrays.toString(empNames)); //[samia, srina, Fayyad, Rony] Ex of another way of printing names. with out using for  loop. 
		
		
		// printing all the names
		//for(String e : empNames) {  // 
			System.out.println(e);
//		}
//		
//		// default value on integer is zero. int, short, double, float default value is 0 or 0.0 and char default value is space.
//		// default value of boolean is falls
		int num[]= new int [4]; // 0-3
		System.out.println(num [0]);
		System.out.println(num [1]);
		System.out.println(num [2]);
//		
//		// Another EX: of if you skip the number what will be the output?yes we can skip the number and 
//		//default value zero will be printing out for the skipped number..
//		
		//int num [] = new int [4];
		num [0] = 100;
		num [1] = 100;
		num [2] = 200;
		num [3] = 100;
		System.out.println(num[1]);
		
       
		System.out.println(num[2]);
		System.out.println(num[3]);
		
		
		// can we print array name directly with out using for loop? NO: do not write variable directly. It will give only memory address for nothing 
		//int num [] = new int [4];
		num [0] = 100;
		num [1] = 200;
		num [2] = 300;
		num [3] = 400;
	
		System.out.println(num);// [I@15db9742 this is memory address of the array.
//		
//		// SO correct way to print is with out for loop use the method below
//		System.out.println(Arrays.toString(num));// [100, 100, 200, 100]
//		
		
		// why do we need for loop?
		
		String names [] = new String [5];
		names [0] = "Samia";
		names [1] = "Sami";
		names [2] = "Sam";
		names [3] = "Sama";
		names [4] = "Sana";
		for (String r : names ) {
			System.out.println(r);
			if (r.equals("Samia")) {
				System.out.println("HR");
				break;
				
			}
			else if (r.equals("sam")) {
				System.out.println("Admin");
			}
		
		
		}
		
		// EX: 
		int n [] = new int [4]; //3
		n[0] = 100;
		n[1] = 200;
		n[2] = 300;
		n[3] = 400;
		
		System.out.println(Arrays.toString(n));// you can only use this method 
		for (int y  : n) {
			System.out.println(y);
			if( y == 200) {
				System.out.println("bye");
				break;
			}
		}
		
		
		// emp data: name  (String), Salary (double), gender(char), isprem(boolean)
		
		// Object Array: Way to print different types of data in array list. 
		// Object is a class. Object is the parent class of all the JAVA classes . default value of object is null. 
		
		Object ob [] = new Object [5];
		//System.out.println(Arrays.toString(ob));//[null, null, null, null, null]
		
		ob [0]= "mim";
		ob [1]= 25;
		ob [2]= 23.44;
		ob[3]= true;
		ob[4]= 'F';
		
		System.out.println(Arrays.toString(ob));//[mim, 25, 23.44, true, F]
		
		for (Object t : ob) {
			System.out.println(t);
		}
		
		
		// way to find length of the index of the Array
		
		 String []friendsArray2 = {"adam", "Ali", "yasmis", "Mim"}; // index starts from 0 - 3
		 System.out.println(friendsArray2.length); // 4 find How may Array values are here
		
		
		
		
		
		
		
		}
		
		
		
		
		
		
		
			
		
		
		
		
	}

}
