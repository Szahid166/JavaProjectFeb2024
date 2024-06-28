package StringManipulation;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args ) {
	
String str = "this is my java code and i am so happy i am so good";
		
		System.out.println(str.length());//38
		
		System.out.println("Li = " + 0  );//0
		System.out.println("Hi = " + (str.length() -1) );//37
		
		//Cacharecter value of zero position
		System.out.println(str.charAt(0));// t
		System.out.println(str.charAt(7));// blank space
		System.out.println(str.charAt(8));// m
		
		//In Array concept in java -1 fegetive number and beyond the ragne both will give StringIndexOutOfBoundsException
		//System.out.println(str.charAt(-1));//StringIndexOutOfBoundsException
		//System.out.println(str.charAt(38));//StringIndexOutOfBoundsException
		
		System.out.println(str.indexOf('t'));//0
		System.out.println(str.indexOf('i'));// 2, 1st occurrence of i		
		//Find 2nd apparance of i 
		System.out.println(str.indexOf('i', str.indexOf('i')+1));//2nd occurrence of i. Inthis case same for formula will work even you add new character in the string.
		
		// Find 3rd and 4th apparance of i
		// this is my java code and i am so happy and i am so good.
		
		System.out.println(str.indexOf('i', str.indexOf('i', str.indexOf('i')+1)+1));//25 
		System.out.println(str.indexOf('i', str.indexOf('i', str.indexOf('i', str.indexOf('i')+1)+1)+1));
		
		//When there is no perticulaer string in not  found it returns -1
		System.out.println(str.indexOf("Java"));// -1
		System.out.println(str.indexOf("naveen"));//-1
		
		System.out.println("---------");
		
		
		String username = "admin";
		String mesg = "welcome " + username;
		
		if(mesg.indexOf("admin") == 8) {
			System.out.println("user name is present");
		}
		else {
			System.out.println("user name is not found");
		}

		
		//Change string character lower to and upper case and vise varsa
				String test = "selenium automation";
				String pop = "SELENIUM TESTING";
				System.out.println(test.toUpperCase());//SELENIUM AUTOMATION
				System.out.println(pop.toLowerCase());//selenium testing
				
				//trim method :will always trim the corner spaces
				String un = "  test automation   ";
				System.out.println(un.trim());
				
		
				//replace:
				String dob = "01-01-1990"; //01/01/1990
				System.out.println(dob.replace("-", "/"));//01/01/1990
				
				String loop = "I love testing";
				System.out.println(loop.replaceAll("love", "enjoy"));//I enjoy testing
				
				System.out.println("automation".replace("a", "P"));
				
		        System.out.println("baby".replace("b","d" ));//dady
		        
		     
		       	 System.out.println("--------");	    
//				String messg = "admin welcome";
				System.out.println(mesg.contains("admin"));//true
				
				//String url = "https://naveenautomationlabs.com/opencart/index.php?route=product/search&search=macbook";
				//System.out.println(url.contains("search=macbook"));
				
//				String url = "https://drive.google.com/drive/u/0/home";
//						
//				System.out.println(url.contains("home"));//true
				
				System.out.println("--------");
				
				//equals: it is case sensetive. If there is extra space it will give false return too. 
				String t1 = "hello selenium";
				String t2 = "hello Selenium";
				System.out.println(t1.equals(t2));//false
				System.out.println(t1.equalsIgnoreCase(t2));//true
				   
				System.out.println("--------");
				
				//split:
				
				String lang = "JAVA_PYTHON_JAVASCRIPT_RUBY";
				String lg[] = lang.split("_");
				
				//System.out.println(lg[0]);//JAVA
				
				//System.out.println(Arrays.toString(lg));//[JAVA, PYTHON, JAVASCRIPT, RUBY]
				
				
				String data = "xXTestingXxXSeleniumXXxXAutomatonxXxJavaX";		
				String d[] = data.split("xX");
				
				System.out.println(d[0].length());//0
				System.out.println(d[1]);//TestingX
				System.out.println(d[2]);//SeleniumXX
				System.out.println(d[3]);//Automaton
				System.out.println(d[4]);//xJavaX
				
				
				String rest = "testing | automation | cypress | selenium";
//				String r[] = rest.split("\\|");
//				System.out.println(r[0]);
//				System.out.println(r[1]);

			
				
				String pest = "testing.automation.cypress.selenium";
				String p[] = pest.split("\\.");// there are some character that has special meaning in java, we have to escape that character.
				// Thats why \\ is used. Because | is means or oparetor and that confused Java and may give incorrect return
				System.out.println(p[0]);
				
				String empData = "Tom;peter;30;IBM;Banaglore;India";
				String emp[] = empData.split(";");
				System.out.println(emp[0]);
				
				System.out.println("--------");
				//
				
				String word = "I love \"java\" coding"; //I love "java" coding
				System.out.println(word);
				
				String w = "I love 'java' coding";
				System.out.println(w);
				
				String xpath = "//input[@id=\"firstname\"]";
				System.out.println(xpath);  ////input[@id="firstname"] 
				
				String x = "//input[@id=first\\name]";
				System.out.println(x);////input[@id=first\name]
				
				String k = "  h    ello   tes   ting   ";
				System.out.println(k.replaceAll("\\s+", " "));
				
				String me = "welcome admin";
				System.out.println(me.replace("admin", "seller"));
				
				
				
	}

}
