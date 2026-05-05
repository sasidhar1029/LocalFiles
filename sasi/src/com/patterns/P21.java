package com.patterns;

//A 
//AB 
//ABC 
public class P21 {
	public static void main(String[] args) {
	
		for (int i = 1; i <= 3; i++) {
			char c = 'A';
			for (int j = 1; j <= i; j++) {
				System.out.print(c);
				c++;
			}
		
			System.out.println();
		}
	}
}
