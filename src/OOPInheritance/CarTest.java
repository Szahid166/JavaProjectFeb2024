package OOPInheritance;

public class CarTest {

	public static void main(String[] args) {
		
		// create a class object of BMW
		
		BMW b = new BMW();
		b.start();// overriden
		b.stop();// Inherited
		b.refuel();// Inherited
		b.autoParking();// individual
		b.engine();// overriden
		BMW.billing();// child class name can  Inharit or access parents static method
		Car.billing();
		System.out.println(b.minSpeed);// 200
		
		System.out.println("---------");
		// creating obj of parent class
		
		Audi au = new Audi();
		au.start();//inharited
		au.stop();// inherited
		au.refuel();// inherited
		au.engine();// inherited
		au.theftSafety();// individual
		
		
		System.out.println("---------");
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		
		System.out.println("---------");
		
		// child class object can be referred by parent class ref variable ->creating object for BMW
		// this concept is call 'TOP CASTING'
		 Car c1 = new BMW();
		 c1.start();// BMW-- start
         c1.stop();
         c1.refuel();
         c1.engine();
         c1.drive();
         System.out.println(c1.minSpeed);//100
         System.out.println("---------");
         
         Vehicle v1 = new BMW ();
         v1.engine();
         v1.drive();
         
		// Reference type check will be failed if it is  individual child property
       
         // Down Casting: Parent class object refferd by child class object 
         
          BMW b1= (BMW) new Car (); // Down casting is not allowed// will get 'ClassCastException'
         
		
		
		

	}

}
