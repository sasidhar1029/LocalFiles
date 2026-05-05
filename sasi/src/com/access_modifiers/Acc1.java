package com.access_modifiers;

public class Acc1 {
//	private Acc1() {
//		
//	}
	  static {
		System.out.println("hello static block");
	}
	  {
		 System.out.println("hello instance block");
	 }
	  //private date-members
     private int  a =10;
     private String name ="sasi";
     private void method1() {
    	 System.out.println("hello method1");
    	 System.out.println("****************");
     }
     //default data-members
     int b = 20;
     String name1 ="arjun";
     void method2() {
    	 System.out.println("hello method 2");
     }
     
	public static void main(String[] args) {
		System.out.println("main method started");
		Acc1 a1 = new Acc1();
		
		//Accessing private data_members
	    System.out.println(a1.a);
	    System.out.println(a1.name);
	    a1.method1();
	    
	    
	    //Accessing default data-members
	    System.out.println(a1.b);
	    System.out.println(a1.name1);
	     a1.method2();

	}

}
