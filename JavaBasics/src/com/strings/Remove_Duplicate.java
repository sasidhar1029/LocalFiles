package com.strings;

public class Remove_Duplicate {

	public static void main(String[] args) {
		String s = "sasidharreddy";
		String result = "";
		for (int i = 0; i < s.length(); i++) {
			boolean status = false;
			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					status = true;
					break;
				}
			}
			if (!status) {
				result += s.charAt(i);
			}
		}
		System.out.println(result);
	}

}
