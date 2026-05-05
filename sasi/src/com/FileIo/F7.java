package com.FileIo;

import java.io.FileReader;
import java.io.IOException;

public class F7 {

	public static void main(String[] args) throws IOException, InterruptedException {
		FileReader fr = new FileReader("D:\\Batch 61\\veny.txt");
		int i = fr.read();
		while (i != -1) {
			System.out.print((char) i+" ");
			Thread.sleep(1000);
			i = fr.read();
		}
		fr.close();
	}

}
