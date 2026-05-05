package com.FileIo;

import java.io.File;
import java.io.IOException;

public class F6 {

	public static void main(String[] args) throws IOException {
		File f = new File("D:\\Batch 61");
		String[] names = f.list();
		int count = 0;
		for (String name : names) {
			System.out.println(name);
			count++;
		}
		System.out.println("Count of the files:" + count);
		System.out.println("Total space:"+f.getTotalSpace());
		System.out.println("Free space:"+f.getFreeSpace());
		System.out.println("Path:"+f.getAbsolutePath());
		System.out.println("Path1:"+f.getCanonicalPath());

	}

}
