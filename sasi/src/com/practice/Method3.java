package com.practice;

public class Method3 {

	public static void main(String[] args) {
		System.out.println("main method started");
    add(10,20);
    sub(10,20);
    mul(10,20);
    div(10,20);
    
	}
   static void add(int a,int b) {
	   System.out.println("add"+(a+b));
   }
   static void sub(int a ,int b) {
	   System.out.println("sub"+(a-b));
   }
   static void mul(int a,int b) {
	   System.out.println("mul"+(a*b));
   }
   static void div(int a,int b) {
	   System.out.println("div"+(a%b));
   }

}
