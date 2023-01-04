package com.wrapperclass.autoboxing.unboxing;

public class Long_Wraper {

	public static void main(String[] args) {

		//primitvive byte data type
		    long d = 3255;
		  
		  
		// autoboxing
		Long obj = new Long(d);
		System.out.println("autoboxing value :" +obj);
		
		// unboxing
		
		long y = obj.longValue();
       
		System.out.println(" unboxing :" + y);
	}
	}

	


