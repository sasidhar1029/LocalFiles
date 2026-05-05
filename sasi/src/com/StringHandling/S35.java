package com.StringHandling;

public class S35 {

	public static void main(String[] args) {
		String s = "sasi";
		s = s.concat("dhar");
		System.out.println(s);

//		StringBuffer s1 ="srikanth";//Type mismatch: cannot convert from String to StringBuffe
		StringBuffer sb = new StringBuffer("java is");
		sb.append(" simple ");
		System.out.println(sb);
		
		StringBuilder s2 =new StringBuilder("shubham");
		s2.append(" Gill");
		System.out.println(s2);
	}

}
