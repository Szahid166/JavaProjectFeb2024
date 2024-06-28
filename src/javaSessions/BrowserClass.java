package javaSessions;

public class BrowserClass {
	
	// creating a function: 
	// creating a acceptance criteria. EX: Launch a browser : browserName(String)-- input parameter
	// return: boolean: true/false
     public BrowserClass(int a) {
		
	}
	
	public boolean launcebrowser(String browserName) { // void change to boolean since if else is used
	   System.out.println("launching browser ---"+ browserName);
	    if (browserName.equals("chrome")) {
	    	System.out.println("chrome is launched");
	    	return true;
	    }
	    else if (browserName.equals("edge")) {
	    	System.out.println("edge is launched");
	    	return true;
	    	 }
	    else if (browserName.equals("firefox")) {
	    	System.out.println("firefox is launched");
	    	return true;
	    }
	    
	    else if (browserName.equals("safari")) {
	    	System.out.println("fsafari is launched");
	    	return true;
	}
	    else {
	    	System.out.println("plz pass the right browser...");
	    	return true;
	    }
	}
	public void launchAppBrowser(String browserName) {
		System.out.println("launch browser ---" + browserName);
		switch (browserName) {
		case "chrome":
		System.out.println("chrome is launched");
		break;
		default:
			break;
		}
	}
	
	// have to watch rest of the recording stopped at 1.03
	
	// Caller method

	public static void main(String[] args) {
		
	BrowserClass br = new BrowserClass(0);
	br.launcebrowser("chrome");
    boolean flag = br.launcebrowser("chrome");//chrome is launched
    System.out.println(flag);// true
     
    if (br.launcebrowser("chrome")) {
		System.out.println("enter url: https://google.com");
	} 
	else {
		System.out.println("no need to enter the url");
	}	
		
		
		
		
		

}
}