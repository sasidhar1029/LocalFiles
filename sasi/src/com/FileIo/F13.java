package com.FileIo;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class F13 {
	public static void main(String[] args) throws FileNotFoundException {
		F13 f = new F13();
		System.out.println(f);
		PrintWriter pw = new PrintWriter("c:\\Downloads\\sasi.txt");
	}
}