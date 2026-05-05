package com.javaintro;
//import java.util.Scanner;
public class methods{
	
     void add(int a,int b) {
    	 int add = a+b;
    	 System.out.println(add);
    	 sub(add);
     }
     static void  sub(int c) {
    	 int f = 10;
    	 int sub = f-c;
    	 System.out.println(sub);
    	 mul(sub);
     }
     static void mul(int d) {
    	 int g = 30;
    	 int mul = g*d;
    	 System.out.println(mul);
    	 div(mul);
     }
     static void div(int e) {
    	int h = 20;
    	int div = h/e;
    	System.out.println(div);
     }
     
	public static void main(String[] args) {
     	methods p1 = new methods();
     		p1.add(10,20);
     	
	}

}