package com.FileIo;

import java.io.File;
import java.io.IOException;

public class F2 {

	public static void main(String[] args) throws IOException {
		File f = new File("D:\\Batch 61\\veny.doc");
		try {
			if (f.createNewFile()) {
				System.out.println(" file is created:" + f.getCanonicalPath());
			} else {
				System.out.println("File is already exists:" + f.getAbsolutePath());
			}
		} catch (Exception e) {
			System.out.println("An error occuered");
		}
	}

}
