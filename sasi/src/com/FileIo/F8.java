package com.FileIo;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class F8 {

	public static void main(String[] args) throws IOException, InterruptedException {
		File f = new File("D:\\Batch 61\\venky.txt");
		FileReader fr = new FileReader(f);
		fr.read();
		FileWriter fw = new FileWriter(f);
		fw.write(65);
		fw.write('\n');
		fw.write("good morning");
		fw.write('\n');
		fw.write("good morning sasidhar");
		int i = fr.read();
		while (i != -1) {
			System.out.print((char) i+" ");
			Thread.sleep(1000);
			i = fr.read();
		}
		fw.flush();
		
	
	}

}
