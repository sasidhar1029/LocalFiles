package com.practice;

public class Method2 {

	public static void main(String[] args) {
		Method2 m1 = new Method2();
		add();
		add(10);
	}
   static void add() {
	   System.out.println("in add with no arg");
   }
   static void add(int a) {
	   System.out.println("in add with in one arg"+a);
	   int b = 20;
	   System.out.println(a+b);
   }
}
