package com.FileIo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class F16 {

	public static void main(String[] args) throws IOException {

		File dir = new File("C:\\Users\\sasidhar reddy\\sasi");
		if (!dir.exists()) {
			dir.mkdirs();
		}

		File file = new File(dir, "sss. txt");
		if (file.createNewFile()) {
			System.out.println("File created successfully");
		} else {
			System.out.println("File already exists");
		}

		FileWriter fw = new FileWriter(file);
		fw.write("Hello Java");
		fw.write('\n');
		fw.write("sasi");
		fw.close();

//        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
//        bw.write("Hello");
//        bw.newLine();
//        bw.write("Java");
//        bw.close();

//		PrintWriter pw = new PrintWriter(file);
//		pw.println("hello");
//		pw.println(100);
//		pw.println(true);
//		pw.close();

		System.out.println("Data written successfully");
	}
}
