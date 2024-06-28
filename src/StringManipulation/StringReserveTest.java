package StringManipulation;

public class StringReserveTest {

	public static String reverseString(String s) { // if you want to print the rev in main arg then string need to add in method "public static void reverseString(String s)" { 
	
		// null check: null check always has tobe on top otherwise it will give NPE 
		
		if(s== null) {
			return s;
		}
	
		 
		if(s.isEmpty()  || s.isBlank());{
			//return s;
		}
	
		// another way to reverse
		int len = s.length();
		if(len == 1) {
			return s;
		}
		
		int rev = s.length();
		String rev1 = "";
		for (int i = len-1; i>=0; i --) {
			rev1 = rev1 + s.charAt(i);
		}
	      return rev1;
		//System.out.println(rev);//muineles
	}
	
	public static void main(String[] args) {
		
	// way to reverse String... : Have to creat a reverse method and call the mathod 
		
		
		String s = "samia";// try with samia
		
		System.out.println(reverseString(s));//muineles // aimas
		reverseString (s);
		
//	..............................................................................................................	
//	Code copied from Naveen 	
//		
//	if (s == null) {
//		return null;
//	}
//
//	if (s.isBlank() || s.isEmpty()) {
//		return s;
//	}
//
//	int len = s.length();
//	if (len == 1) {
//		return s;
//	}
//
//	String rev = "";
//	for (int i = len - 1; i >= 0; i--) {
//		
//		rev = rev + s.charAt(i);
//	}
//	return rev;
//	
//	}
//	//return rev.trim();
//	
//	//selenium
//	//rev = m
//	//rev = rev+u = mu
//	//i
//	


//public static void main(String[] args) {

	//test cases:
	System.out.println(reverseString("t"));
	System.out.println(reverseString("testing"));
	System.out.println(reverseString("testing automation"));
	System.out.println(reverseString(""));
	System.out.println(reverseString(null));
	System.out.println(reverseString("123"));
	System.out.println(reverseString("t "));
	System.out.println(reverseString("null"));



	
	
	
	}

}
