package WebDriver_Arch_Interface;

public interface WebDriver extends SearchContext {

	// webdriver only create the rules here for all the browsers but cant decide anything
    
	@Override
	public void findElement(String name);
	@Override
	public void findElements(String name);
	
	public void get (String url);
	public String getTitle();
	public void click(String element);
	public void sendkeys(String element, String value);
	public void close();
	
	
}
