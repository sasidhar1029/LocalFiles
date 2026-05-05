package com.FileIo;

import java.io.File;
import java.io.IOException;

public class F4 {
	public static void main(String[] args) throws IOException {
		File  f=new File("D:\\Batch 61\\arjun.doc");
		
		f.createNewFile();
	}
}
