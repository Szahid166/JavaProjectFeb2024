package OOPAbstract;

public class LoginPage extends Page {  // page class has 2 abstract method and that need to be implemented then error will resolve
	
	 int timeOut = 5;
	
    public LoginPage() {
    	System.out.println("Lp-- default constractor");
    }
    // Overload the constractor
    public LoginPage(int a) {
    	System.out.println("Lp-- one param constractor" + a);
    }
    public LoginPage(int a, int b) {
		System.out.println("LP -- two param const..." + a + b);
	}
    
	@Override
	public void title() {
	System.out.println("LP-- title");	
		
	}

	@Override
	public void url() {
		System.out.println("LP-- url");
		
		}
	// individual method
	public void doLogin(String un, String pwd) {
		System.out.println("user is logged with : " + un + pwd);
	}
	
	
	
	

}
