package com.wrapperclass.autoboxing.unboxing;

public class Character_Wrapper {

	public static void main(String[] args) {
	
		
		//primitvive byte data type
		    char g ='s';
		  
		  
		// autoboxing
		Character obj = new Character(g);
		System.out.println("autoboxing value :" +obj);
		
		// unboxing
		
		char h = obj.charValue();
       
		System.out.println(" unboxing :" + h);
	}
	}


