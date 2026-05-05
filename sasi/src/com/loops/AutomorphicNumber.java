package com.loops;

import java.util.Scanner;

//check if a number is automorphicNumber or not .it is a number which in the last digits of 
//its square.
//ex:25 in 625
public class AutomorphicNumber {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int m = n;
		int flag =0;
		int q=n*n;
		while(n!=0) {
			int d = n%10;
			int d1 =q%10;
			if(d!=d1) flag = 1;
			n =n/10;
			q=q/10;
		}
		if(flag==0) {
			System.out.println("The given number is AutomorphicNumber:"+m);
		}else {
			System.out.println("The given number is not a AutomorphicNumber:"+m);
		}

	}

}
