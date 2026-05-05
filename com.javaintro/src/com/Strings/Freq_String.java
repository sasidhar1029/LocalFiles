package com.Strings;

public class Freq_String {

	public static void main(String[] args) {
		String s = "arjun reddy";
		for (int i = 0; i < s.length(); i++) {
			int count = 0;
			boolean isDuplicate = false;
			for (int k = 0; k < i; k++) {
				if (s.charAt(i) == s.charAt(k)) {
					isDuplicate = true;
					break;
				}
			}
			if (isDuplicate)
				continue;
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					count++;
				}
			}
			System.out.println(s.charAt(i) + " -> " + count);
		}

	}

}
