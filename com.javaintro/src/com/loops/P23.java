package com.loops;
//find the biggest number
public class P23 {

	
		    public static void main(String[] args) {
		        int a = 25;
		        int b = 40;
		        int c = 90;

		        int big;

		        if (a > b && a > c) {
		            big = a;
		        } else if (b > c) {
		            big = b;
		        } else {
		            big = c;
		        }

		        System.out.println("The biggest number is: " + big);
		    }
		

	}


