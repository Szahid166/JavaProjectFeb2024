package javaSessions;

public class LoopsConcept {

	public static void main(String[] args) {
	
		// while loop: when  repetitive  pattern are there and we need to avoid it then we need to use loop.its basic java concept.
		// break can be written in loop and switch case. 'while' have to have condition()
		//1 to 10:
		// while loop never write directly in statement. It will become infinite loop and keep printing same thing and crush the program.
	
	
		int i =1;
		while(i<=10) {
			System.out.println(i);
			i++;
			if(i==5) {
				System.out.println("bye");
				break;
			}
		}
				
				
		
		
		
			
		
		// after 10 want to print 9
		System.out.println("--------------");
		int t = 10;
		while(t>=1) {
			System.out.println(t);
			t--;
		}
		
		
		// 2.for loop: 1 t0 10
		// k=1 then k=2
		
		for (int k =1; k<=10; k++) {  // Mechanism of for loop is you have to increase the value of k by one using k++. other wise it will make infinity loop.
			                           // Semicolon is mandatory in for loop. variable has to be separated by semicolon.
			System.out.println(k);
			if(k==5) {
				System.out.println("bye");
				break;
			}
			
		}
		
		
		System.out.println("-----------");  // inside the for loop we can use double,short,byte, float long and char too
		for(double d=1.0; d<=5; d++) {
			System.out.println(d);//1.0 2.0 ..5.0);
		}
		
		
		System.out.println("-----------");  
		for( char ch = 'a'; ch<='z'; ch++) {
			
			System.out.println(ch);
			
		}
		
		// print ASCII value in console
		// a =97
		//b = 98
		for(char ch ='a'; ch<='z'; ch++) {
			System.out.println(ch);
		}
		
		for(char ch ='a'; ch<='z'; ch++) {
			System.out.println(ch);
		}
		//
		for(char ch ='a'; ch<='z'; ch++) {
			System.out.println((int)ch);  // with 'int' it will print number value .
		}
		
		//
		//a = 97
		//b = 98		
		for(char ch ='a'; ch<='z'; ch++) {
			System.out.println(ch +"=" +(int)ch);  // with 'int' it will print number value . Print with a =97 and b = 98 format for ASCII value in console
		                                           // '=' this is string concatenation, 
		}
		
		// this code with semicolon has three parts. By default thard part is true/or satisfied and wil genarate infinte loop wich is not a good code. 
		//and . Interview question is what happen if you do not enter anything in for loop ? It should be terminate with RED stop button. 
		
		for(;;) {
			System.out.println("helooo");
			break; // if you add break then it will print only helloo. 
		}
		
		// can write the code few more ways: example below
		// 1.
		for(float h =1.3f; h<=4.6; h++) {
			System.out.println(h);
		}
		
		// 2. directly write the code 10 is greater then 5. 
		
		System.out.println(10>5);// true
		
		// 3. not equal to !=
		
		System.out.println(10!= 5);
		
		
		//
		//do while lopp:do-while loop will check condition at the end of the block so it will be executed minimum 1 time.
		// In a do while the statement or body of the loop will be executed at least once before the condition is validated.
		
		//1 to 10
		int p =1;
		do {
			p++;
			System.out.println(p);
			p++;
			break; //Can we write break? yes we can . output will be 2
		}
		while (p<=10); // while can not have body. Body of the code inside the do . Out put will be //11
		
		
		 
		
		// different between for loop and while loop 
		
		//Use Cases for while Loop
//		waiting for element on the page
//
//		waiting for the page to be loaded
//
//		pagination - Loop until the element is found
//
//		(exp- Finding a person name in multiple pages of a web table)
//
//		4. For increment operators we can use
//
//		 i++, ++i or i=i+1
//
//		5. For Decrement operators we can use
//
//		i--,--i or i=i-1
		//Carousel landling
		//page scrolling
		//Wait for element on the page
		
//		
		
	//Use Cases for for Loop
		
//drop-down traversing
//menu items
// foot note on the webpage
//calendar handling
//We use for loop when number of iterations are  fixed
// arrays 
// menu sub menu
		
//Use Cases for do-while loop

//		Java do-while loop is used to iterate a part of the program several times.
//
//	
//		for-each loop: 
		// streams with lambda
	
		
		
		
		
		
	}

}
