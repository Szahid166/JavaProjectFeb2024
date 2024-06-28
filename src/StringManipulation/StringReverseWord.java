package StringManipulation;

public class StringReverseWord {

	

	public static void main(String[] args) {
		
		// reverse each words in a sentence
		String s = "This is my java code";
		

		String ss[] = s.split(" ");
		String rev = "";
		for(String e : ss) {
			rev = rev + StringReserveTest.reverseString(e) + " "; // (+ and " " double coat added to get the space between the words.
		
		}
		
		
		System.out.println(rev); //sihTsiymavajedoc// sihT si ym avaj edoc 
		
		// remove the extra space in the corner 
		System.out.println(rev.trim());//sihT si ym avaj edoc
		
		
		
		
		
	}

}
