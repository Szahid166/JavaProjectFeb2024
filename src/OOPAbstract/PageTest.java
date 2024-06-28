package OOPAbstract;

public class PageTest {

	public static void main(String[] args) {
		
	// create object of login page
		
		LoginPage lp = new LoginPage(10, 20);
		lp.title();
		lp.url();
		
	// inharit the parent method
		
		lp.getPageInfo();
		Page.displayLogo(); // static method need to call by class name so need to and 'page' class name
		LoginPage. displayLogo ();// also can use child class name
		lp.doLogin("admin", "admin");
		System.out.println(lp.TIME_OUT);//10
		//Can be maupulate
		
		System.out.println(Page.TIME_OUT);
		System.out.println(LoginPage.TIME_OUT);
		
	// Abstract class can not create an object of the page class	
	// Top casting : child class object can be referred by parent abstract class ref variable
		
//		Page p = new LoginPage();
//		p.title();
//		p.url();
//		p.getPageInfo();
		//Page.displayLogo();
		
		// down casting is not applicable here
		
		

	}

}
