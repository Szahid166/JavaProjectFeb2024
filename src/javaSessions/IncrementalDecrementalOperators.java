package javaSessions;

public class IncrementalDecrementalOperators {

	public static void main(String[] args) {
		
		//++ and --
		// 1. Post increment: first assign then increase
		int a = 1;
		int b = a++;
		
		System.out.println(a);//2
		System.out.println(b);//1
		
		int h = -99;
		int g = h++;
		
		System.out.println(h);// -98 // increase later but first give the original value to g. so g will become -99. Now increase the vale of h by one. so Value is -98 not adding.
		
		System.out.println(g);//-99
		
		int s = 5;
		System.out.println(s++);//5. here s =5 but here println is the consumer. so print ln consumed by s and then increase by one in the memory. 
		// but it wants original value of is which is 5. then do the increment . so in the memory its 6 but output is 5. 
		
		//What is the correct value of S?
		System.out.println(s);//6
		
		int t = 10;
		int f = t++;
		System.out.println(t);//11
		System.out.println(f);//10
		
		// 2. Pre increment: increase the value first then give it to y 
		
		int x =1;
		int y = ++x;
		System.out.println(x);//2
		System.out.println(y);//2
		
		int u = -999;
		int p = ++u;
		System.out.println(u);//-998
		System.out.println(p);//-998
		
		int total = 10;
		System.out.println(++total);//11
		System.out.println(total);//11
		
		
		int m1 = 0;
		int n1 = ++ m1;
		System.out.println(n1);
		System.out.println(m1);
		
		// post decrement: first assign then decrease
		
		int p1 = 2;
		int q1 = p1--;
		System.out.println(p1);//1
		System.out.println(q1);//2
		
		int v = -999;
		int k = v--;
		System.out.println(v);//-1000
		System.out.println(k);//-999
				
		// pre decrement: first decrease then assign
		
		int o = 2;
		int d = --o;
		System.out.println(o); //1
		System.out.println(d);//1
		
		
		
		// Can we use ++ or -- on the character? Yes. because char is a numeric value. character has ASCII value and ASCII value is a Numeric value
		
		
		
		

	}

}
