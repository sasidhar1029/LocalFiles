package com.arrays;

public class Rotate_array_k_positions {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		int k = 2;
		k = k % a.length;

		reverse(a, 0, a.length - 1);//reverse an array//{5,4,3,2,1}
		reverse(a, 0, k - 1);  //swap the elements from kth index like//5,4 -> 4,5 {4,5,3,2,1,}
		reverse(a, k, a.length - 1);//swap the elements from k to index last 3,2,1 -> 1,2,3
		//{4,5,1,2,3}
		for (int b : a) {
			System.out.print(b + " ");
		}
	}

	static void reverse(int[] a, int i, int j) {
		while (i < j) {
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i++;
			j--;
		}
	}

}
