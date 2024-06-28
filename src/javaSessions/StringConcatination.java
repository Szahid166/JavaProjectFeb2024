package javaSessions;

public class StringConcatination {

	public static void main(String[] args) {
		
		//  what is string: String is a class. 
		// how we can concatenate multiple strings
		
		int a = 100;
		int b =200;
		// string is a class. all class in java starts with upper case letter.
		// how to declare string? It has to be in double coat "". String is a combination of multiple characters
		// when adding 2 strings it calls concatenation. When add with numbers its call additional operator. but when merge with String its call 
		//Concatenation Operator. 
		// Minus is not allow in concatenation. Concatenation is for merging two things only.
		
		String  X = "hello";
		String Y = "world";
		
		System.out.println("the value of a:" +a);//the value of a:100
		
		
		System.out.println(a+b);
		System.out.println(X+Y);//helloworld
		
		System.out.println(X+Y+a+b);//helloworld100200 . Execution starts from left to right. so X+Y is hello world and now 
		//all of it will concatenate with a 100 and helloworld and 100 will concatenate with b 200. 
		
		System.out.println(a+b+X+Y);//300helloworld. 
		System.out.println(X+Y+(a+b));//helloworld300
		System.out.println(a+b+X+Y+a+b);//300helloworld100200
		
		//Can we add char also with the String? Yes we can. 
		
		char c1 = 'a';
		char c2 ='b';
		
		System.out.println(c1+c2+X+Y);//195helloworld. any mathematical Operation done on two char it will use the ASCII value. 
		
		                               // char is a single individual value. Whenever talk about single vale we have to conceder ASCII value.
		
		
		// How to get a and b in the output!!
		System.out.println(c1+""+c2);//ab. Left to right execution--> a contaminate with double coat and then with b. so output is ab.
		
		// Can we add boolean ? Yes we can but a practice
		System.out.println(true +X);//truehello
		
		
		
		
		
	}

}
