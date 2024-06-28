package javaSessions;

public class User {
	
	// Here USER is a class
		// Declaring class variable or global variables
			
			String name;
			int age;
			String city; 
			
	

	public static void main(String[] args ) {
		
		// 3 objects will be created in the memory
		
		User u1 = new User ();
		u1.name = " Tim";
		u1.age = 30;
		u1.city = " NY";
		
		
		
		User u2 = new User ();
		u2.name = "Tom";
		u2.age = 25;
		u2.city = " NJ";
		
		
		
		User u3 = new User ();
		u3.name = "Kim";
		u3.age = 30;
		u3.city = " CA";
		
		
		User u4 = new User ();
		u4.name = "Moly";
		u4.age = 35;
		u4.city = "Philly";
		
		
		System.out.println(u1.name + "  " + u1.age + "  "+ u1.city); //Tim  30   NY
		
		System.out.println(u2.name + "  " + u2.age + "  "+ u2.city); //Tom  25   NJ
		
		System.out.println(u3.name + "  " + u3.age + "  "+ u3.city); //Kim  30   CA
		
		System.out.println("-------------");
		
		// example: when we write object reference to another reference, it will break the connection from first one to 2nd one
		
		
		u1 =u2; // u1 will be disconnected and  u1 will be pointing to u2 only . 
	
        System.out.println(u1.name + "  " + u1.age + "  "+ u1.city); // Tom  25   NJ
		
		System.out.println(u2.name + "  " + u2.age + "  "+ u2.city); //Tom  25   NJ
		
		System.out.println(u3.name + "  " + u3.age + "  "+ u3.city); //Kim  30   CA
		
		System.out.println("-------------");
		
		u2 = u3; // u1 already in u2 and now u2 given to u3 
		
        System.out.println(u1.name + "  " + u1.age + "  "+ u1.city); // Tom  25   NJ
		
		System.out.println(u2.name + "  " + u2.age + "  "+ u2.city); // Kim  30   CA
		
		System.out.println(u3.name + "  " + u3.age + "  "+ u3.city); // Kim  30   CA
		
		System.out.println("-------------");
		
		u3 = u1; // u1 pointing to u2 so its Tom and u2 pointing to u3 Kim and  u3 is pointing to u3 Tom
		
		
         System.out.println(u1.name + "  " + u1.age + "  "+ u1.city); // Tom  25   NJ
		
		System.out.println(u2.name + "  " + u2.age + "  "+ u2.city); // Kim  30   CA
		
		System.out.println(u3.name + "  " + u3.age + "  "+ u3.city); // Tom  25   NJ
		
		
		
		System.out.println("-------------");
		
		 u4 = u1;
		
		   System.out.println(u1.name + "  " + u1.age + "  "+ u1.city); // Tom  25   NJ

			
			System.out.println(u2.name + "  " + u2.age + "  "+ u2.city); // Kim  30   CA
			
			System.out.println(u3.name + "  " + u3.age + "  "+ u3.city); // Tom  25   NJ
			System.out.println(u4.name + "  " + u4.age + "  "+ u4.city); // Tom  25   NJ

		
		
		
		// Notes: always create 3 or 4 objects in the main method. each object will get same property declared in class variable.
		
		// object reference interchange or object reference assignment is a interview question. 
		
		
		
		
		
		
		

	}

}
