package com.loops;

import java.util.Scanner;

//A factory of a number is a number which divides into it exactly without leaving a remainder
//Find factors of a number 
//ex : 8 has factors 1,2,4,8
public class Factors {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n =sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.print(i+" ");
				
			}
			
		}Thread.sleep(1000);
	}

}
