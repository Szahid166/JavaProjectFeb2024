package StringManipulation;

public class StringCapitalLetter {

	public static void main(String[] args) {
		
		// first letter of each word should uppercase
		
	String s = "this is my java code";// This Is My Java Code	
		
		
		String ss[] = s.split(" ");
		String newStr = "";
		
		for (String e : ss) {
			newStr = newStr + e.replace(String.valueOf(e.charAt(0)), String.valueOf(e.charAt(0)).toUpperCase()) + " ";

		}

		System.out.println(newStr.trim());	//This Is My Java Code
		
		
		
		

	}

}
