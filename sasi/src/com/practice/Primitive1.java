package com.practice;

public class Primitive1 {
    static boolean b = false;
	public static void main(String[] args) {
	System.out.println("main method started");
	int a= 100;
	int b1 =100;
	System.out.println(a==b1);
	if(a==b1) {
	   b=true;
	}
   if(b) {
	  System.out.println("hello");
	  System.out.println("welcome");
	  System.out.println("main method ended");
   }
	}

}
