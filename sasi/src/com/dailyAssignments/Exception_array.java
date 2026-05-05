package com.dailyAssignments;

public class Exception_array {

	public static void main(String[] args) {
		int a[] = {12,1,13,56};
		
		try {
			System.out.println("Array of elemnets:"+a[5]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("invalid");
		}
		
//		System.out.println(a[5]);
	}

}
