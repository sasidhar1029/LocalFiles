package com.Arrayss;

public class Arrays18 {

	public static void main(String[] args) {

		int[] arr = { 3, 2, 0, 7, 25, 12, 11 };
		int[] arr1 = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			arr1[i]=arr[i];
		}
		System.out.println("copied array");
		for(int x:arr1) {
			System.out.print(x+" ");
		}
	}

}
