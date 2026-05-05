package com.arrays;
//Imp
public class Graphs {

	public static void main(String[] args) throws ArrayIndexOutOfBoundsException {

		int[] arr = { 1, 8, 7, 6, 11, 10, 12, 9 };
		int originalMax =0;
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			int element = 0;
			int unit = 0;
			int dmax = 0;
		
			for (int j = 0; j < arr.length; j++) {
				element = Math.min(arr[i], arr[i]);
				unit =j-i;
				dmax = element*unit;
				if(dmax>max) {
					max=dmax;
				}
			}
		}
		if(max>originalMax) {
			originalMax=max;
		}
		System.out.println(originalMax);

	}

}
