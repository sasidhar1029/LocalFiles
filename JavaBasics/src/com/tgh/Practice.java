package com.tgh;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		String s = "03:45 Ps";
		String s1 = s.substring(s.length() - 2, s.length());
		int ho = Integer.parseInt(s.substring(0, 2));
		int mi = Integer.parseInt(s.substring(3, 5));
		if (s1.equalsIgnoreCase("PM")) {
			if (ho != 12) {
				ho += 12;
			}
		} else {
			if (ho == 12) {
				ho = 0;
			}
		}
		String time = String.format("%02d:%s", ho, mi);
		System.out.println(time);
	}
}
