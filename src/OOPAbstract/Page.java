package OOPAbstract;

public abstract class Page {   // abstract key word start with small letter

	// Can not create the object of abstract class
	// can have abstrat  and non abstract methods
	// Can have the constractor ... of abstract class? Yes.
	// this will be called when you create the object of its child class then abstract class will be called
	
	// Creating constractor class that is abstract in nature
	// in parent class default constrctor is mandetory 
	// can create a variable: properties of the interface: by default its static and final in nature
	// private method can not be use outside of the class
	static final int TIME_OUT = 10;
	
	public Page() {
		System.out.println("Page ---default constractor");
	}
	public Page(int a) {
		System.out.println("Page ---one param constractor" + a);
	}
	
	public Page(int a, int b) {
		System.out.println("LP -- two param const..." + a + b);
	}
	public abstract void title();
	public abstract void url();
	
	// make it static, final, this method--> 
	public static final void displayLogo() {
		System.out.println("page --display logo");
	}
	public void getPageInfo() {
		System.out.println("page --getPageInfo");
	}
	
	
	
	
}
