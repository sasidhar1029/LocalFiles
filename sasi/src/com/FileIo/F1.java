package com.FileIo;

import java.io.File;

public class F1 {

	public static void main(String[] args) {
		System.out.println("main method started");

		File f = new File("D:\\Batch 61\\veny.txt");
		try {
			if (f.createNewFile()) {
				System.out.println("file is created:" + f.getAbsolutePath());
			} else {
				System.out.println("File is already exists :" + f.getAbsolutePath());
			}
		} catch (Exception e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}

	}

}
