package OOPEncapsulation;

public class EmpTest {
	//Can we create object of employee class? do we have private constructor there? 
    // private property we can't access directly
	//
	public static void main(String[] args) {
		Employee e1 = new Employee();
         e1.setName("Arti"); 
		System.out.println(e1.getName());//Arti
		
		e1.setAge(30);
		System.out.println(e1.getAge());//30
		
		
		
		
	}

}
