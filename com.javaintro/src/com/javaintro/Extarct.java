//Write a Java program that:
//Takes a 3-digit integer as input (e.g., 781)
//Extracts and displays the middle digit (tens place)
//Conditions:
//Use only arithmetic operators: +, -, *, /
//Do not use:
//% operator
package com.javaintro;

public class Extarct {
    
	public static void main(String[] args) {
		int num = 432;
		if(num>100 && num<999) {
			System.out.println("The three digits number is:"+num);
		}
		int lastTwoDigits = num - ((num/100)*100);
		int middleNum = lastTwoDigits/10;
		System.out.println(middleNum);
		
		
//		int num = 456;
//		int num1 = (num/100)*10;
//		int num2 = num/10;
//		int num3 = num2-num1;
//		System.out.println(num3);
		
		
	}

}

