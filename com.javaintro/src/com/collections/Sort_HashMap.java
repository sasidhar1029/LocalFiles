package com.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sort_HashMap {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("A", 10);
		map.put("B", 3);
		map.put("C", 7);
		List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
		list.sort(Map.Entry.comparingByKey());
		System.out.println(list);
	}

}
