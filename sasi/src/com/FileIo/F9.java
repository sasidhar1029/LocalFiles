package com.FileIo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class F9 {

	public static void main(String[] args) throws IOException, InterruptedException {
		File f = new File("D:\\Batch 61\\venky.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String s = br.readLine();
		while (s != null) {
			System.out.println(s);
			Thread.sleep(1000);
			s = br.readLine();
		}
		br.close();
		fr.close();

	}

}
