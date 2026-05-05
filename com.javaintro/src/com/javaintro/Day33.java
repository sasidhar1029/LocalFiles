package com.javaintro;
  import java.util.Scanner;
public class Day33 {
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number:");
		  int a = sc.nextInt();
		  System.out.println("enter a another number:");
		  int b = sc.nextInt();
		  System.out.println("before swapping a is:"+a);
		  System.out.println("before swapping b is:"+b);
		  a = a+b;
		  b = a-b;
		  a = a-b;
		   System.out.println("after swapping a is:"+a);
		   System.out.println("after swapping a is :"+b);
       
	}

}
