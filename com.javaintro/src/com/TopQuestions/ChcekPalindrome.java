package com.TopQuestions;

public class ChcekPalindrome {

	public static void main(String[] args) {
//		String str = "sasidhar";
//		String rev = "";
//		for (int i = str.length()-1; i >0 ; i--) {
//			char c = str.charAt(i);
//			rev += c;
//		}
//		System.out.println(rev);
		
		String str1 ="madam";

	    String sb = new StringBuilder(str1).reverse().toString();
	    if(str1.equals(sb)) {
	    	System.out.println("The given string is palindrome");
	    }else {
	    	System.out.println("The given is not a palindrome");
	    }
	    
	}

}
