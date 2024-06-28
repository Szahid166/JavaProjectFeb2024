package OOPEncapsulation;

// No main method in this class
public class Employee {

private String name;
private int age;
private double salary;
private boolean isActive;
//public getter and setter: set the value and get the value
//we do not write manualy getter and setter. We generate  it from the editor
// getter and setter always public in nature
// do not have any constructor here so Java will create default constructor
// Encapsulation means data hiding concept. Example: computer, remote control etc.
// create private layer and give access through Public layer through setter and getter. this concept called Encapsulation.
// do not have access on private property
// this is one type of encapsulation
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
