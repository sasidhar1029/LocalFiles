package com.exception_handling;

public class Test2 {

	public static void main(String[] args) {
		System.out.println("main method started");
		String s= "srinkanth";
		System.out.println(s.length());
		try {
		String s1 = null;
		System.out.println(s1.length());
		}catch(NullPointerException ne) {
//			System.out.println(ne);
			ne.printStackTrace();
		}
		System.out.println(100/0);
		System.out.println("Main method ended");
	}

}
