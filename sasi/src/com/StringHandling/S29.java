package com.StringHandling;
//input :swssi
//output::w(frist non-repeating charcter)
public class S29 {

	public static void main(String[] args) {
		String s = "swssi";
		int feq[] = new int[26];

		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			feq[ch[i] - 'a']++;

		}

		for(char c:ch)
		{
			if(feq[c-'a']==1) {
				System.out.println(c);
				break;
			}
		}
	}

}
