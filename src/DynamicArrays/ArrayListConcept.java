package DynamicArrays;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		// ArrayList : default class: dynamic array: Its a class. Create array class object . Its inbuild java class so we need to inport
		
		ArrayList ar = new ArrayList();
		System.out.println(ar.size());// 0
		
		ar.add(100);
		ar.add(200);
		
		System.out.println(ar.size());//2
		
		
		ar.add(300);// 2
		ar.add(400);// 3

		System.out.println(ar.size());// 4
		
		ar.add(500);// 4
		ar.add(600);// 5
		
		System.out.println(ar.size());// 6
		
		System.out.println(ar.get(0));
		System.out.println(ar.get(5));
		
		//ar.add(700);//6
		
		//System.out.println(ar.get(6));//IndexOutOfBoundsException
		// vc= vertual capacity and PC= Physical Capacity
		// vc are 10 by default.
		// pc divided by 2 and this concept call LF= Load Factor
		ArrayList ar1 = new ArrayList(5);//vc=5, pc=0
		System.out.println(ar1.size());


		ArrayList ar2 = new ArrayList(50);//vc=50, pc=0
		//0 to 50 : pc = 50, vc = 0
		//lf = pc/2 = 25
		//pc = 75, lf = 75/2=37

		
		
		

	}

}
