package constructorconcept;

public class Registration {

	
	String name;
	String emaild;
	String phone;
	int age;
	String city;
	String dob;
	
	//hidden constructor.. default const.. will be added by Java
	
	// If I do not want hidden constructor.. right click and select source option and then select constructor catagory and select option again
	
	
	
		public Registration(String name, String emaild) {
			this.name = name;
			this.emaild = emaild;
		}


	     public Registration(String name, String emaild, String phone) {
			
			this.name = name;
			this.emaild = emaild;
			this.phone = phone;
		}
		
		public Registration(String name, String emaild, String phone, int age, String city) {
			this.name = name;
			this.emaild = emaild;
			this.phone = phone;
			this.age = age;
			this.city = city;
		}
		public Registration(String name, String emaild, String phone, int age, String city, String dob) {
			super();
			this.name = name;
			this.emaild = emaild;
			this.phone = phone;
			this.age = age;
			this.city = city;
			this.dob = dob;
		}

		
		public static void main(String[] args) {
			Registration r1 = new Registration("samia", "samia@gmail.com");		
			System.out.println(r1.name+ "  " + r1.emaild + "  " + r1.age + "  " + r1.city);		
		}
		
		

		
		
	}


