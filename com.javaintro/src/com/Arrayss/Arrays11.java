package com.Arrayss;

public class Arrays11 {

	public static void main(String[] args) {
		String[][] names = { { "sasi", "dhar", "reddy" }, { "kunduru","venkata", "subba", "reddy" },
				{ "korrapolu", "arjun", "reddy"} };
//		for (String[] name : names) {
//			for (String n : name) {
//				System.out.print(n + " ");
//			}
//			System.out.println();
//		}
//		OR
		for(int i=0;i<names.length;i++) {
			for(int j=0;j<names[i].length;j++) {
				System.out.print(names[i][j]+" ");
			}
			System.out.println();
		}
	}

}
