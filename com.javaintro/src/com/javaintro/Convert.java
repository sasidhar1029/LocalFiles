package com.javaintro;
public class Convert{
	public static void main(String[] args) {
		double grams = 1500;
		double kilograms = grams/1000;
		int milligrams = (int)grams*1000;
		
		System.out.println(grams+" grams");
		System.out.println(kilograms+" kg");
		System.out.println(milligrams+" milligrams");
	}
}