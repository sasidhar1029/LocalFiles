package com.loops;

import java.util.Scanner;

//Check if a number is krishna murthy,Special number or not .where sum of factorial of digits
//is equal to the number 
//ex:145 => 1! +4!+5!
public class KmNumber {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int m = n;
	    int sum =0;
		
		while(n!=0) {
			int d = n%10;
			int fact =1;
		    for(int i=1;i<=d;i++)
		    	fact*=i;
		    sum =sum+fact;
			n =n/10;			
		}
		if(sum==m) {
			System.out.println("The given number is Km:"+m);
		}else {
			System.out.println("The given number is not a Km:"+m);
		}
	}

}
