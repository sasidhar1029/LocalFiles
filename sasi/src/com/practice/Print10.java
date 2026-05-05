package com.practice;

import java.util.Scanner;

//Print Fibonacci series up to N terms
public class Print10 {

	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter a number");
	  int n =sc.nextInt();
	  int a=0,b=1;
	  for(int i=0;i<=n;i++) {
		  System.out.println(a);
		  int next =a+b;
		  a=b;
		  b=next;
	  }

	}

}
