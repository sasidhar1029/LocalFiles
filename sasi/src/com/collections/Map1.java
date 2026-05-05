package com.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map1 {

	public static void main(String[] args) {
		Map<String, String> m1 = new HashMap<>();
		m1.put("mi", "Rohit");
		m1.put("csk", "Dhoni");
		m1.put("rcb", "virat");
		m1.put("Lsg", "KLRahul");
		System.out.println(m1.containsKey("csk"));
		System.out.println(m1.containsValue("Rohit"));
		System.out.println(m1.containsValue("pandya"));
		System.out.println(m1.put("RR", "samson"));
		System.out.println(m1.put("mi", "pandya"));
		System.out.println(m1);
		System.out.println(m1.containsValue("Rohit"));
		System.out.println(m1.containsValue("pandya"));
		Set<Entry<String, String>> m2 = m1.entrySet();
		System.out.println(m2);
		String team = m1.remove("csk");
		System.out.println(team);
		System.out.println(m2);
	}

}
