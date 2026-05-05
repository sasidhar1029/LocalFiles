package com.StringHandling;

public class S14 {

	public static void main(String[] args) {
		String str = "java";
		byte[] b = str.getBytes();
		int temp = 0;
		for (int i = 0; i < b.length / 2; i++) {
			temp = b[i];
			b[i] = b[b.length - 1 - i];
			b[b.length - 1 - i] = (byte) temp;
		}
		System.out.println(str);
		for (byte b1 : b) {
			System.out.print((char) b1 );
		}
	}
}
