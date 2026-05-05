package com.FileIo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class F15 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		System.out.println("Main method started");
		F14 f = new F14();
		FileInputStream fos = new FileInputStream("D:\\Batch 61\\sasi.text");
		ObjectInputStream oos = new ObjectInputStream(fos);
		F14 obj = (F14) oos.readObject();
		System.out.println(obj.username);
		System.out.println(obj.password);

	}

}
