package StringManipulation;

public class StringBuilderAndStringBuffer {

	public static void main(String[] args) {
		
		// String is mutable
		// String Builder is better then Buffer even though both works almost same way
		// StringBuilderAndStringBuffer built in java program
		// String builder is faster in modification
		
		//mutable
		StringBuilder sb = new StringBuilder("Hello");
		sb.append("Selenium");
		System.out.println(sb);//HelloSelenium
		
		
		//slow: 1.1 : legacy classes 
		StringBuffer sf = new StringBuffer("Testing");
		sf.append("Cypress");
		System.out.println(sf);//TestingCypress
		

	}

}
