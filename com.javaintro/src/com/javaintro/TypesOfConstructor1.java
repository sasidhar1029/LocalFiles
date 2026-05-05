package com.javaintro;

public class TypesOfConstructor1 {
    
	 String name;
	 int rollNumber;
	 String course;
	 TypesOfConstructor1(){
		 
	 }
	 TypesOfConstructor1(String name){
		 System.out.println("one arg con!!!!");
		 this.name=name;
	 }
//	 TypesOfConstructor1(String name,int rollNumber){
//		 System.out.println("two arg con");
//		 this.name = name;
//		 this.rollNumber = rollNumber;
//	 }
//	 
//	 TypesOfConstructor1(String name,int rollNumber,String course){
//		 this.name = name;
//		 this.rollNumber = rollNumber;
//		 this.course = course;
//	 }
	public static void main(String[] args) {
		
		TypesOfConstructor1 t1 = new TypesOfConstructor1("sasi");
		t1.show();
//		TypesOfConstructor1 t2 = new TypesOfConstructor1("arjun",21);
//		t2.show();
//		TypesOfConstructor1 t3 = new TypesOfConstructor1("sai",21,"jfs");
//		t3.show();
	}
	void show() {
		System.out.println("String name:"+name);
//		System.out.println("Roll Number:"+rollNumber);
//		System.out.println("course:"+course);
		System.out.println("----------------------------");
	}

}
