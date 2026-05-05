package com.StringHandling;

public class S3 {

	public static void main(String[] args) {
		String s1="Srikanth";
		String s2 ="java";
		String s3 =new String("Srikanth");
		String s4 ="Srikanth";
//		System.out.println(s1==s3);
//		System.out.println(s1.equals(s3));
//		System.out.println(s1==s4);
		String s5=s4;
		System.out.println(s5);
		System.out.println(s1==s5);
		System.out.println(s4==s1);
		System.out.println(s4==s5);

	}

}
