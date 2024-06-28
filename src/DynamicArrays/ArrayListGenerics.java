package DynamicArrays;

import java.util.ArrayList;

public class ArrayListGenerics {

	public static void main(String[] args) {
		
		 ArrayList ar = new  ArrayList() ;
			
			ar.add(100);
			ar.add(12.33);
			ar.add("testing");
			ar.add('g');
			ar.add(true);
			
			
			// Integer type of arraylist: Integer is a wrapper class and generics
			// in this particular arraylist only integer value can be used
			ArrayList<Integer>marksList = new ArrayList<Integer>();
			
			marksList.add(100);
			marksList.add(120);
		
			// it is restricted to double 
			ArrayList<Double>mList = new ArrayList<Double>();
			mList.add(12.33);
			
			// Restricted to String only
			ArrayList<String>browserList = new ArrayList<String>();
		
		     browserList.add("CHROME");
		     browserList.add("FIREFOX");
		
		// To hold any type of data then we have to use 'object' for generic type of data
		     
		     ArrayList<Object>empData = new ArrayList<Object>();
		     
		     empData.add("Tom");
		     empData.add(30);
		     empData.add('m');
		     empData.add(12.33);
		     empData.add(true);
		     
		     System.out.println(empData.size()); // 5
		     
		     // Array list always maintain the order. 
		     // Add method to add the value and get method to get the value
		     
		     System.out.println(empData.get(0));// Tom
		     
		     
		     

	}

}
