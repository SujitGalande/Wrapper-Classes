package com.wrapperclass.autoboxing.unboxing;

public class Byte_Wraper {

	public static void main(String[] args) {
		 
		//primitvive byte data type
		  byte a =2;
		  
		  
		// autoboxing
		Byte obj = new Byte(a);
		System.out.println("autoboxing value :" +obj);
		
		// unboxing
		
		byte z = obj.byteValue();
         
		System.out.println(" unboxing :" + z);
	}

}
