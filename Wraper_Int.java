package com.wrapperclass.autoboxing.unboxing;

public class Wraper_Int {

	public static void main(String[] args)  
	{
	 int f = 35;        // Primitive Data Types
	 
	 
	//  Autoboxing
	 Integer obj = new Integer(f);  
	 System.out.println(" value of autoboxing: " + obj );
	 
	// Unboxing
	 int n = obj.intValue();                          
	 System.out.println("valu of unboxing:" +n);

	}

}
