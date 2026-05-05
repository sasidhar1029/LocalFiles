package com.FileIo;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class F11 {

	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter pw = new PrintWriter("D:\\Batch 61\\venky.txt");
		char[] ch = { 'A', 'B', 'c' };
		pw.println();
		pw.println(true);
		pw.print('c');
		pw.print("Hello good morning");

	}

}
