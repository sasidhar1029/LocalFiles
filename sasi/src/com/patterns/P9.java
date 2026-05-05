package com.patterns;

//1 
//23 
//456
public class P9 {

	public static void main(String[] args) {
		int a = 1;
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(a);
				a++;
			}
			System.out.println();
		}

	}

}
