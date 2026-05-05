package com.loops;

public class P24 {

	public static void main(String[] args) {
		int a=20;
		if( a<100 || a>1000) {
			System.out.println("wrong number:");
		}
		else {
			if(a%2==0) {
				int remainder = a%3;
				System.out.println(remainder);
			}
			else {
				int remainder = a%2;
				System.out.println(remainder);
			}
		}
	}

}
