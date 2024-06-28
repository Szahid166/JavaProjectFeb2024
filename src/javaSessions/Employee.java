package javaSessions;

public class Employee {
	
	// data members
	// class variables: class variable have to declare inside the class and 
	//that make a copy in the memory so we can use that when work in the main method 
	
	String name;
	int age;
	double salary;
	boolean isPrem;
	
	
	public static void main(String[] args) {
		
		// object declaration will be inside the main method only
		// creating the object of the employee class: use key word is "new Keyword"
		
		Employee obj = new Employee(); // obj is just a name of the object or object reference name.
		
		obj.name =" tom";
		obj.age = 50;
		obj.salary = 12.33;
		obj.isPrem = true;
		System.out.println(obj.name+ "  " +obj.age  + "  "+ obj.salary + "  " +  obj.isPrem );//tom  50  12.33  true
		
		// creating another object but can't use same object name
		// if you do not declare the object variable then return will be null and zero. 
		
		Employee ABC = new Employee();
		
		ABC.name = "Pat";
		ABC.age = 30;
		ABC.salary = 30.44;
		ABC.isPrem = true ;
		
		System.out.println(ABC.name+ "  " +ABC.age  + "  "+ ABC.salary + "  " +  ABC.isPrem );// Pat  30  30.44  true
		
		
		// we can write object name with out reference name  and its possible
		// its call no reference object but 
		// no reference objects : not recommended
		
		new Employee();
		
		new Employee().name = "Tony";
		new Employee().age = 30;

		// 
		// Null point exception happens when value is null declared or not declared means value even not declared.
		// null reference object : is not recommended
//		Employee a1 = new Employee();
//		a1.name = " Sam";
//		System.out.println(a1.name);// Sam
//		a1 = null;
//		a1.age = 20;
//		System.out.println(a1.age);// NullPointerException-> NPE
//		
		
		// another example:
		//
		Employee a2 = new Employee();
		a2.name = " Tim";
		System.out.println(a2.name);
		
		a2 = null;
		
		// 
		a2 = null;
		a2 = new Employee();
		a2.name =  "Samia";
		a2.age = 30;
		System.out.println(a2.name);
		System.out.println(a2.age);
		
	// creating reference name and not assigning any object. this is another way of declaring the object. but preferable is the above one.
		
		Employee a3; 
		a3 = new Employee();
		
     // Creating new User class--> next 
		
		
		
		
		
		
	}

}
