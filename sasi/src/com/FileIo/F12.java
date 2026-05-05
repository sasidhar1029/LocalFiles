package com.FileIo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.Buffer;

public class F12 {

	public static void main(String[] args) throws IOException, InterruptedException {
		File f = new File("D:\\Batch 61\\sasi.txt");
		FileReader fr = new FileReader(f);
		fr.read();
		FileWriter fw = new FileWriter(f);
		fw.write(65);
		fw.write('\n');
		fw.write("roll number is 11");
		fw.write('\n');
		fw.write("name is sasidhar");
		fw.write('\n');
		fw.write("Course is java fullstack");
		fw.write('\n');
		fw.write("Marks are 99");
		fw.write('\n');
		int i = fr.read();
		while (i != -1) {
			System.out.print((char) i + " ");
			Thread.sleep(1000);
			i = fr.read();
		}
		fw.flush();

	}

}
