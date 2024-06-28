package OOPEncapsulation;
 // instead of exposing all the method you can make some of the method private.
//Encapsulation is for getting the private data and variables too
public class Browser {
	
	public void  launchbrowser() {
		System.out.println("launching browser..");
	}
	private void  checkbrowser() {
		System.out.println("lcheckinging browser..");
	}
	private void  checkbrowserOS() {
		System.out.println("Compatibilitybrowser..");
	}
	private void  checkbrowserUpdate() {
		System.out.println("check browser update..");
	}
	private void checkbrowserversion() {
		System.out.println("checking browser version..");
	}
	
	
}


