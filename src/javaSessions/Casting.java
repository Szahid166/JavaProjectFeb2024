package javaSessions;

public class Casting {

	public static void main(String[] args) {
		
	//widening and narrowing 	
	byte a = 100;
	byte b =10;
	//range: -128 to 127
	
	//byte c = a+b; // why get the error? when you add 2 bytes  then always use higher range of data type. safer is using in int.
	
	// int or long . any arithmetic calculation is not allowed in byte and short. 
	int c = a+b ;
	System.out.println(c);
	
	//Range: -32768 to 32767
	
	short s1 =100;
	short s2 = 200;
	
	int s3 =s1+s2;// this can't store in short. Has to be int or long. 
	System.out.println(s3);//300
	
	int i = 200;
	int  j = 300;
	int k = i+j;
	System.out.println(k);//500  it is 
	
	
	byte g = 10;
	int u = g;
	
	// can not store int into byte
	
	int r1 = 100;
	//byte r2 =r1;
	
	byte r2 = (byte)r1;
	System.out.println(r2);//100
	
	int e1 = 200;
	System.out.println(r2);// -56 so even you could store int in to byte  you are loosing data. it will not give any error or exception. 
	
	// what about character ? 
	
	char c1 = 'a';// 97 
	//byte b1 = c1;
	byte b1= (byte)c1;
	System.out.println(b1);
	
	double dr = 12.33;
	//int tr = dr
	int tr = (int)dr;
	System.out.println(tr);
	
	
	// best way to write variable is to think memory points of view. speciall when you do the calculation use the int value because of the memory space.
	
	char c4 = 'c';// 99 is ASCII valu
	char c5 = 'd';// 100
	System.out.println(c4 * c5);//990
	System.out.println(c4 + c5);//199
	System.out.println(c4 - c5);//-1
	System.out.println(c4 / c5);//0
	// ASCII value of space is  32
	System.out.println(c4 + " " + c5);
	System.out.println(c4 + ' ' + c5);// 231

	System.out.println(' ' + ' ');// 64 // when we work with 2 character we have to consider ASCII value. '' ASCII value is 36
	System.out.println(" "+ ' '); // double coat is not a character. so space add with char because single coat is char. 
	                            //if we are cot adding two char then we have to take normal value with is space.
	
	System.out.println((byte)1000);//-24 
	
	
	
	
	
	
	
	
	
	
		
		
		
		

	}

}
