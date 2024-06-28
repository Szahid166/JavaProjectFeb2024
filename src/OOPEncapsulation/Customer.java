package OOPEncapsulation;
// POJO--->Plain Old Java Object
// Date 3/ 19/2024
public class Customer {
	
	private String name;
	private int age;
	private double salary;
	private boolean isActive;
	
	// creating one constructor using source: with the help of constructor I can get the value
	public Customer(String name, int age, double salary, boolean isActive) {
		
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.isActive = isActive;
	}

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	// getters and setter and then create EmployeeTest class to create object of this class
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	
	
	
	
	

}
