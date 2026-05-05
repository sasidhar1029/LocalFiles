package com.javaintro;

public class TypesOfConstructor {
	 int sid;
	 String sname;
	 int age;
	 long phone;
	TypesOfConstructor (){
		System.out.println("no arg constructor");
	}
	TypesOfConstructor (int i,String n,int a,long p){
		sid = i;
		sname = n;
		age = a;
		phone = p;
		
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		
		TypesOfConstructor t1 = new TypesOfConstructor ();
//	

		TypesOfConstructor t2 = new TypesOfConstructor (13,"arjun",22,9515273090l);
        t2.show();
	}
   void show() {
	   System.out.println("student id:"+sid);
	   System.out.println("student name:"+sname);
	   System.out.println("student age:"+age);
	   System.out.println("student phone number:"+phone);
	   System.out.println("****************************");
   }
}
