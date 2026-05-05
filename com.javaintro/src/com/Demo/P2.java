package com.Demo;

public class P2 {

	public static void main(String[] args) {
		int[] arr = { 9, 8, -6, -5, 22, -15 };
		int min = arr[0];
		int max = arr[0];
		for(int a:arr) {
			if(a>max) {
				max=a;
			}
			else if(a<min) {
				min=a;
			}
		}
		System.out.println("min value:"+min);
		System.out.println("Max value:"+max);
	}
}
