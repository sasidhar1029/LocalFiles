package com.practice;

import java.util.Scanner;

public class P8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		int square = a * a;
		int cube = a * a * a;
		System.out.println("Number:" + a);
		System.out.println("Square:" + square);
		System.out.println("cube:" + cube);

	}

}
