package com.wrapperclass.autoboxing.unboxing;

public class boolen_Wraper {

	public static void main(String[] args) {
		// Intialistion 
		boolean x = true;     // Primitive Data Types

        boolean y = false;
  
        //1st obj 
        //  Autoboxing
        Boolean obj1 = new Boolean (x);              
      System.out.println(" Autoboxing :" + obj1 );
       
      //  unboxing
        boolean p = obj1.booleanValue();
        System.out.println(" unboxing :" +p);
        
        // 2nd obj
        // Autoboxing
        Boolean obj2 = new Boolean(y);
        System.out.println(" Autoboxing :" + obj2 );
        
        //unboxing
        boolean u = obj2.booleanValue();
        System.out.println(" unboxing :" +u);
	}

}
