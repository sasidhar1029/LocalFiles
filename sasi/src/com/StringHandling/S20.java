package com.StringHandling;

public class S20 {

	public static void main(String[] args) {
		String s1 = "srikanth";
		String s2 = "srikanth";
		System.out.println(s1 == s2);
		String s3 = new String("java");
		String s4 = "java";
		s3 = s3.intern();// converting heap to scp not scp to heap.(until i store in a variable
		// otherwise i will get false).
		System.out.println(s3 == s4);
		s4 = s4.intern();
		System.out.println(s3 == s4);//s3 = s3.intern() if this is no in this program 
		//then we will get a false 

	}

}
