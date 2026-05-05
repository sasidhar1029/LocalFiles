package com.Strings;

public class Find_duplicate_char {
//find duplicate characters
	public static void main(String[] args) {
		String s = "sasidhar";
		for (int i = 0; i < s.length(); i++) {
			boolean isDuplicate = false;
			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					isDuplicate = true;
					break;
				}
			}
			if (isDuplicate) {
				System.out.print(s.charAt(i));
			}
		}
	}

}
