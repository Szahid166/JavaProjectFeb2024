package javaSessions;

public class QuizeWideningAndNarrowing3 {

	public static void main(String[] args) {
		
	//Q1//Q1: Widening Casting Assignment: Write a Java program that demonstrates widening casting. Create variables of different data types such as int, 
		//float, double, etc. Assign values to them and then cast them to a higher data type. 
		//Finally, print out the original and casted values to observe widening casting in action.	
		
		//EXAMPLES OF WIDENING: Implicit
		
		// range -32768 to 32767
		short s1 =100;
		short s2 = 200;
		
		int s3 = s1+s2;
		System.out.println(s3);// 300 can't store 2 value in short and java does not allow that. So its stored in int data type. same concept for byte too.
		                       // int data type is okay in this case since int range is much higher
		
		byte g = 10;
		int u =g;
		
		System.out.println(u); // 10
		
		
		int a1 = 1200;
		long a2 = a1;
		System.out.println(a1);// 1200
		
		
		long b1 = 50;
		float b2 = b1;
		System.out.println(b1); // 500
		
		float c1 = (float) 80.20;
		double c2 = c1;
		System.out.println(c1);// 80.2
		
		
	int d1 =  200;
	double d2 = d1;
	System.out.println(d1); // 200
	
	float e1 = 30.25f;
	double e2 = d1;
	System.out.println(e1);// 30.25
	
	
			
		
		
		//EXAMPLE OF NARROWING: Explicit
		
//		int r1 = 100;
//		byte r2 = r1;// can not convert int data type in byte thats not allowed in java.
		
		int r1 = 1200;
		byte r2 = (byte)r1;
		System.out.println(r2);// -80 so its loosing the data without giving in exception.
		
		double t1 =100.20;
		float t2 = (float) t1;
		System.out.println(t1); //100.2
		
		
       char f1 = 'b';
       byte f2 = (byte) f1;
       System.out.println(f2); // 98
       
       
       double dr =1200.33;
       byte tr = (byte)dr;
       System.out.println(tr);// -80 lost data and decimal point missing too.
       
       
       

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
