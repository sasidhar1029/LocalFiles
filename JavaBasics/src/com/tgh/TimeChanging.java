package com.tgh;

public class TimeChanging {

	public static void main(String[] args) {

		String s = "01:45 PM";
		String s1 = s.substring(s.length() - 2, s.length());
		String ho = s.substring(0, 2);
		String mi = s.substring(3, 5);
		int hr = Integer.parseInt(ho);
		System.out.println(hr);
		if (s1.equalsIgnoreCase("PM")) {
			if (hr != 12) {
				hr += 12;
			}
		} else {
			if (hr == 12) {
				hr = 0;
			}
		}
		String time = String.format("%2d:%s", hr, mi);
		System.out.println(time);
	}

}
