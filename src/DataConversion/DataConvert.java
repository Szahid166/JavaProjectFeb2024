package DataConversion;

public class DataConvert {

	public static void main(String[] args) {
	
	String X = "100";// if in double coate its acting as string.
	System.out.println(X+20);//10020 concatinated 
	
		// to do Arithmatic convertion we have to use String to int: call Wrapper Class: Integer
	    // first do the convertion then do the arithmatic Oparation
	int i = Integer.parseInt(X);// 100
	System.out.println(i + 20);// 120
	
	// on the other hand, If there is alpha numeric value then handle this way....but will give exception
	

	String y = "12.33";
	
	System.out.println(y+20);//12.3320 concatonation worked here
	
	// here have to use double wrapper class
	// first do the convertion then do the arithmatic Oparation
	double d = Double.parseDouble(y);
	System.out.println(d+20); //32.33
	
	// Every premitive dataType has respective wrapper class and help with that class we can do the conversion first and can calculatr the numbers.	
		
	// Way to get the byte range
	// it is static final value 
	
	System.out.println(Byte.MIN_VALUE);// -128
	System.out.println(Byte.MAX_VALUE);// 127
	
	
	// String to boolean: this also need to convert into boolean 
	String execute = "true"; // if use false 
	
	boolean flag = Boolean.parseBoolean(execute);
	if(flag) {
		System.out.println("Run my test cases");
		
	}
	else {
		System.out.println("Exit");
	}
	
	
	// int to String conversion
	int p = 200;
	System.out.println(p+20);//220
	
	String pr = String.valueOf(p);
	System.out.println(pr+20);// 20020
	
	
	// boolean to String:
	boolean fg = true;
	String f = String.valueOf(fg);
	System.out.println(f.length());//4
	
	// way to check blank and empty string...
	
	String tr = "";
	System.out.println(tr.isEmpty());//true
    //System.out.println(tr.isBlank);// means there are some blank spaces available
	
	
	
	

	}

}
