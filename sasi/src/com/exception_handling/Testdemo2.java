package com.exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Testdemo2 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("in try");
			System.out.println("Enter a number");
			int a = sc.nextInt();
			System.out.println("Enter b number");
			int b = sc.nextInt();
			System.out.println(a / b);
		} catch (ArithmeticException e) {
			System.err.println("in catch ar");
			e.printStackTrace();
		} catch (InputMismatchException e) {
			System.err.println("in catch inp");
			e.printStackTrace();
		}
		System.out.println("main method ended");
		System.out.println("main method ended");
	}

}
