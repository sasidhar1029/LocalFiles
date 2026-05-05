//reverse a string
package com.dsa;

public class Reverse_a_string {

	public static void main(String[] args) {
	
     String name ="chapri";
     String ans="";
     for(int i=5;i>=0;i--) {
    	 ans = ans+name.charAt(i);
     }
     System.out.println(ans);
	}

}
