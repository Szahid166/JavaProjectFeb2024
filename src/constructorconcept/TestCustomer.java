package constructorconcept;

import java.util.Arrays;

public class TestCustomer {

	public static void main(String[] args) {
		
		
		String d [] = {"mackbook", "iPhone", "Keyboard"};
		Customer obj = new Customer ("Rahul", 30, d);
		
		String rahulDev[] =obj.getDevicesInfo();
		System.out.println(Arrays.toString(rahulDev));// [mackbook, iPhone, Keyboard]
		
		int count = obj.getDevicesCount();
		System.out.println(count);// 3
		
		//browser br = new browser(); // red mark is because browser class is private
		
		// but we can create a private constructor
		// when we do not want to create an object 
		//browser br = new browser ("chrome");
		browser.get();
		browser.close();
		
				
		
		

	}

}
