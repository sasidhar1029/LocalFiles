//Sum, Difference, Product, Quotient, and Modulus
//➤ Write a program to accept two numbers and display their sum, difference, 
//product, quotient, and remainder.
package com.sasi;
//import java.util.Scanner;

public class S26 {
 
   int sum(int a,int b) {
return a+b;
   }
   int  sub(int a,int b) {
	  return a-b;
   }
   int  div(int a ,int b) {
	return a/b;
   }
   int mul(int a ,int b) {
	  return a*b;
   }
	int mod(int a ,int b) {
		return a%b;
	}
	public static void main(String[] args) {
		S26 s = new S26();
		s.sum(10,20);
		s.sub(10,20);
		s.mul(10,20);
		s.div(10,20);
		s.mod(10,20);
		
		
	}

}
