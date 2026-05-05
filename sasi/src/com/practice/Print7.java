package com.practice;

import java.util.Scanner;
//Count digits in a given number
public class Print7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a =sc.nextInt();
		int count =0;
		if(a==0) {
			count=1;
		}else {
			while(a!=0) {
				a/=10;
				count++;
			}
		}
		System.out.println("count:"+count);
	}

}
