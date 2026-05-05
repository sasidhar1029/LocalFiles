package com.FileIo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class F17 {

	public static void main(String[] args) throws IOException, InterruptedException {
		try {
			FileReader fr = new FileReader("C:\\Users\\sasidhar reddy\\sasi\\sss.txt");
			int i =fr.read();
			while(i!=-1) {
				System.out.println((char)i);
				Thread.sleep(1000);
				i=fr.read();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		}

}
