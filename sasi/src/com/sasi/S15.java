//Create 5 variables in a class Customer, 
//
//	create 5 constructors like 
//		- no arg 
//		- one arg 
//		- Two arg 
//		- Three arg 
//		- four arg 
//		- five arg 
//		
//	Create few Objects with empty values. 
//	Call one arg constructor in no arg 
//	Call Two arg constructor in one arg
//	----------
//	---------
//	call five arg constructor in four arg 
//	
//	this() and super() first line of any constructors.
//	this() and super() we can call only in constructors, we cannot call it in methods.

package com.sasi;

public class S15 {
    int id;
    String fname;
    String lname;
    double marks;
    double percentage;
     S15(){
    	 this(12);
    	 System.out.println("no arg con.....");
     }
     S15(int id){
    	 this(13,"sai");
    	 this.id = id;
     }
     S15(int id, String fname){
    	 this(15,"sasi","dhar");
    	 this.id = id;
    	 this.fname = fname;
     }
     S15(int id, String fname,String lname){
    	 this(16,"arjun","suravaram",99);
    	 this.id = id;
    	 this.fname = fname;
    	 this.lname = lname;
     }
     S15(int id, String fname,String lname,double marks){
    	 this(18,"harsha","vardhan",97,89);
    	 this.id = id;
    	 this.fname = fname;
    	 this.lname = lname;
    	 this.marks = marks;
     }
     S15(int id, String fname,String lname,double marks,double percentage){
    	 this.id = id;
    	 this.fname = fname;
    	 this.lname = lname;
    	 this.marks = marks;
    	 this.percentage = percentage;
     }
     void show() {
    	 System.out.println(id);
    	 System.out.println(fname);
    	 System.out.println(lname);
    	 System.out.println(marks);
    	 System.out.println(percentage);
    	 System.out.println("*****************");
     }
	public static void main(String[] args) {
		S15 s0 = new S15();
//		s0.show();
	  S15 s =new S15();
	  s.show();
	  S15 s1 =new S15();
	  s1.show();
	  S15 s2 =new S15();
	  s2.show();
	  S15 s3 =new S15();
	  s3.show();
	  S15 s4 =new S15();
	  s4.show();
	}

}
