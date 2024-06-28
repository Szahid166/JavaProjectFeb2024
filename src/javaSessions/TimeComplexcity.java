package javaSessions;

public class TimeComplexcity {

	public static void main(String[] args) {
		
		// what is Time Complexity? : how much time it take to complete the code . 
		
		// TC -- BIG O -- > O// when ever we talk about the Time Complexity we are talking about BIG O
		
		int i =10;
		// TC of this is 0(1). --this is call Constant time
		System.out.println(i);// 0(1);
		
		//
		for (int k=1; k<=10; k++) {
			System.out.println(k);
		}
		
		// O(n) n number of times. explain how you get o of ten? 
		//1+ n+n+n +3n+1 -> linear equation
		//3n+1 ==> 3n ==> n ==> O(n)
		
		int p=1;
		while (p<=10) {
			System.out.println(p);
			p++;
			System.out.println("hello worls");
		}
		
		// 1+n+n+n+n => 4n+1 => O(n)
		
		// 3n +1+4+1=> 7n+2 --> linear Equation
		// 7n+2 --> 7n ==> o(n)
		
		// another ex: 
		
		for (int l=1; l<=10; l++) {
			System.out.println(l);
			if(l==5) {
				System.out.println("bye");
				break;
			}
		}
		//Linear equation is ..
		// 1+n+n+n=N+1 ==> 4n+2==> 4n ==> o(n)
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
