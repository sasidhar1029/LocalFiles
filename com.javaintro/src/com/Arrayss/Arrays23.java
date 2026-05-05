package com.Arrayss;

public class Arrays23 {

	public static void main(String[] args) {
		
		int a= 123;
		int sum =0;
		while(a!=0) {
			int d = a%10;
			sum =sum+d;
			a=a/10;
		}
		System.out.println(sum);
	}

}
