package ExceptionHandling;

public class Student {
	
	

	public static int  getMarks(String name) {
		System.out.println("getting marks for: " + name );
		if (name.equals("ravi")) {
			try {
			//int i = 9/3;
			//System.exit(1);// Shut down JVM. it will shut down the program. Its hardly use but should know. 
			                   // but it this case oonly code will not reach to filally block. 
				int i = 9/0;
			return 50;
			}
			catch(ArithmeticException e) {
				System.out.println("AE is coming..");
				return 20;// if AE is there then it will print 20 
			}
			finally {
				System.out.println("Finally Block");
				return 80; // it will always go to finally even no returns. 
				           //Return is not mandetory here but if written it 
				           //will override the catch return in try catch executed.
				
			}
			
		}
		else if (name.equals("Tom")) {
			return 95;
		}
		else if (name.equals("Samia")) {
			return 10;
		}
		else {
			System.out.println("Student not found");
			return -1;
		}
			
	}
		
	
	
	
	


	public static void main(String[] args) {
		
		int m1 = getMarks("ravi");
		System.out.println(m1);
	}
	

}
