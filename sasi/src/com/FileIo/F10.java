package com.FileIo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class F10 {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("D:\\Batch 61\\venky.txt");
		BufferedWriter bw = new BufferedWriter(fw); 
		
		bw.write("hi raa");
		bw.newLine();
		bw.flush();
		bw.close();
		fw.close();
		

	}

}
