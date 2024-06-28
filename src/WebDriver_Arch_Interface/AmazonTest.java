package WebDriver_Arch_Interface;

public class AmazonTest {

	public static void main(String[] args) {
		
	// Have to create object of the driver and rest of the code remain same 
	// to run each browser we are commenting each drider at a time. 
	//to resolve this commenting issue everytime .. use the Switch case method
	// all we need to do is parameter change thats all. 	
		
		
		//ChromeDriver driver = new ChromeDriver();
		// FirefoxDriver driver = new FirefoxDriver();
		//SafariDriver driver = new SafariDriver();
		  String browserName = "Safari"; // just have to change the browsername here to launched the browser
		
		WebDriver driver = null;

			switch (browserName.toLowerCase().trim()) {
			case "chrome":
				driver = new ChromeDriver();
				break;

			case "firefox":
				driver = new FirefoxDriver();
				break;

			case "safari":
				driver = new SafariDriver();
				break;

			default:
				System.out.println("plz pass the right browser...");
				break;
			} 
		   
		   
		driver.get("https://www.amazon.com");
		String title = driver.getTitle();
		System.out.println("page title : " + title);
        
		if (title.equals("Amazon")) {
			System.out.println("title is correct");
		} else {
			System.out.println("title is not correct");
		}

		driver.findElement("amazon logo");

		driver.sendkeys("Emaild", "naveen@gmail.com");
		driver.sendkeys("password", "naveen@123");
		driver.click("loginButton");

		driver.close();

		
		
		

	}

}
