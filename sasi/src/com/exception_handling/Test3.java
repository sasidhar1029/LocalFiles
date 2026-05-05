package com.exception_handling;

public class Test3 {

	public static void main(String[] args) {
		try {

			String s = null;
			System.out.println(s.length());

		} catch (RuntimeException r) {

		}
//		catch (NullPointerException ne) {
//			System.out.println("Catch Block");
//			
//		} 

		finally {
		}
		System.out.println("in finally");
		System.exit(0);
	}
//		System.out.println("After Try-catch-Finally");
//		System.out.println(10/0);
}
