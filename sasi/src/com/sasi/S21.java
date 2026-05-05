package com.sasi;
import java.util.Scanner;
public class S21 {
  
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		System.out.println("enter a number;");
	int a = sc.nextInt();
		System.out.println("enter a another a number:");
		int b = sc.nextInt();
		 	int sum = a+b;
		int  sub = a-b;
		int mul = a*b;
		int div = a/b;
		int mod = a%b;
	
		System.out.println("addition:"+sum);
		System.out.println("subtraction:"+sub);
		System.out.println("multiplication:"+mul);
		System.out.println("division:"+div);
		System.out.println("modlus:"+mod);
	
	}

}
