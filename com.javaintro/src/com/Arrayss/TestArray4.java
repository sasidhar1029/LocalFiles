package com.Arrayss;

//print elements in a reverse order with an array
public class TestArray4 {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 5, 4, 8, 6, 7,8 };//8 7 6 8 4 5 3 2 1 
//		for (int i = nums.length-1; i > 0; i--) {
//			System.out.print(nums[i] + " ");
//		}
		int temp = 0;
		int size = nums.length;
		for (int i = 0; i < size / 2; i++) {
			temp = nums[size - 1 - i];
			nums[size - 1 - i] = nums[i];
			nums[i] = temp;
		}
		for (int n : nums) {
			System.out.print(n + " ");
		}

	}

}
