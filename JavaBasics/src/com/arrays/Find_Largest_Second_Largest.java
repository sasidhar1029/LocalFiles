package com.arrays;

public class Find_Largest_Second_Largest {
	public static void main(String[] args) {
		int arr[] = { 13, 30, 2, 15, 33 };
		int Largest = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length ; i++) {
			//if current element is greter than previous element than previous element becomes 
			//second largest
			if (arr[i] > Largest) {
				second = Largest;
				Largest = arr[i];
				
			} 
			//if current is greater than second and not to be a Largest it will be a second largest element
			else if (arr[i] > second && arr[i] != Largest) {
				second = arr[i];
			}
		}
		System.out.println("Largest:" + Largest);
		System.out.println("Second:" + second);
	}
}
