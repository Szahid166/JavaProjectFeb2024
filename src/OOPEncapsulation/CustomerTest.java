package OOPEncapsulation;
//3/19/2024
public class CustomerTest {

	public static void main(String[] args) {
		
// Creating an object of the Customer Class and passing the values
		//with the help of constructor I can get the value
		// POST--> Create
		Customer obj = new Customer("Ekta", 30, 23.44, true);
		// to get into public layer I have to use 'get'	
		// GET--> Retrive
System.out.println(obj.getName() + "  " +obj.getAge()+ "  "+ obj.getSalary()+ "  " + obj.isActive());//Ekta  30  23.44  true
		
		// Exact purpose of the setter is to update the value
      // PUT/PATCH-->UPDATE
		obj.setSalary(35.55);
		obj.setAge(35);
		//GET
	System.out.println(obj.getName()+ "  " +obj.getAge()+ "  " +obj.getSalary()+ "  " +obj.isActive());//Ekta  35  35.55  true
		
	// what is the purpose of setter?
    //2nd EX: this customer does not have initial value but can create updated value
  Customer c1 = new Customer();// create a customer with out any value.
  System.out.println(c1.getName()+ "  " +c1.getAge()+ "  " +c1.getSalary()+ "  " +c1.isActive());//Ravi
	//PUT
  c1.setName("Robi");
  c1.setAge(40);
  c1.setSalary(40.33);
  c1.setActive(true);
  //GET
 System.out.println(c1.getName()+ "  " +c1.getAge()+ "  " +c1.getSalary()+ "  " +c1.isActive());//Ravi
	
	}

}
