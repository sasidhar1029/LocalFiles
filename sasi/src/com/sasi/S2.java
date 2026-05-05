package com.sasi;
import java.util.Scanner;
public class S2 {
     static  void add (float f,float f1) {
    	 float sum = f+f1;
    	 System.out.println("sum of two numbers:"+sum);
     }
	public static void main(String[] args) {
		
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("print a number:");
		float a = sc.nextFloat();
		System.out.println("print b number:");
		float  b= sc.nextFloat();
		add(a,b);
		System.out.println("main method ended");
		
		
	}

}
