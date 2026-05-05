package com.javaintro;

public class Counting {

	public static void main(String[] args) {
		int input = 590;
		int hundred = input/100;
		int remain= (input/100)*100;
		int balance = input-remain;
		System.out.println("Total Amount:-"+590+"Rupees");
		System.out.println(hundred+"-Hundred Notes");
	
        System.out.println(balance+"-Remaining Amount");
	}

}
