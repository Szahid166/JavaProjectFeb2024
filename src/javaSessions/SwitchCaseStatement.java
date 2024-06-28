package javaSessions;

public class SwitchCaseStatement {

	public static void main(String[] args) {
		
		// write Switch and then press Ctrl and space. have to provide the key.provide the value or case. 
		//if break is not used the all the browser will try to open. if no default is use user will not get the right massage. 
		//default use for giving the correct massage to the users.
		// double and Float, long  are not allowed in switch case. allowed in Switch only byte,short,int, String  and char .
		
		String browser = "safari";
		
		switch (browser) {
		case "chrome":
			System.out.println(" launch chrome");
			break;
		case "edge":
			System.out.println(" launch edge");
			break;
		case "safari":
			System.out.println(" launch safari");
			break;
		default:
			System.out.println(" Please pass the right browser.." + browser);
			break;
		}
		
		
		// no range are allowed in case. can't use any condition in switch case. For grading if/else condition is better option.
//		int marks =100;
//		
//		switch (marks) {
//		case 100:
//			System.out.println("100 marks");
//			break;
//		case 0:
//			System.out.println("0 marks");
//		default:
//			break;
//		}
		
		
		// Use cases: multiple environments, Months, Blood group, payment method
		// RBAC: admit seller, vendor,partner,customer
		
		
		// vowels a e i o u .... good interview question
		
		char ch = 'm';
		switch (ch) {
		case 'a':
			System.out.println(ch + "is a vowel");
			break;
		case 'e':
			System.out.println(ch + "is a vowel");
			break;
		case 'i':
			System.out.println(ch + "is a vowel");
			break;
		default:
			System.out.println("please pass the consonent m");
			break;
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
