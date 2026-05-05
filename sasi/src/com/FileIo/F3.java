package com.FileIo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class F3 {

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("main method stared");
		File f = new File("D:\\Batch 61\\ven.txt");
		FileReader fr = new FileReader(f);
		;
		try {
			fr = new FileReader(f);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			int i = fr.read();
			System.out.println(i);
		} catch (IOException e) {

		}
	}

}
