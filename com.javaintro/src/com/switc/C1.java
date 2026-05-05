package com.switc;

import java.util.Scanner;

public class C1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int a = sc.nextInt();
		System.out.println("enter b number");
		int b = sc.nextInt();
		System.out.println("enter a symbol to proceed for calculation like +,-,*,/,%");
		String symb = sc.next();
		double result =0;
		switch(symb) {
		case "+" -> result =(a+b);
		case "-" -> result =(a-b);
		case "*" -> result =(a*b);
		case "/" -> result =(a/b);
		case "%" -> result =(a%b);
		default -> System.out.println("invalid operation");
		
		}
		System.out.println("The result is :"+result);
	}

}
