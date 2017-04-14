package com.prac.basic;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapExample {

	public static HashMap<Integer, String> sortByKey(HashMap<Integer, String> map) {

		Map<Integer, String> trmap = new TreeMap<Integer, String>(map);
		System.out.println(trmap);
		return (HashMap<Integer, String>) trmap;
	}

	public static HashMap<Integer, String> sortByValue(HashMap<Integer, String> map) {
		
		

		return null;
	}

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(5, "B");
		map.put(7, "D");
		map.put(2, "A");
		map.put(1, "L");
		map.put(0, "K");

		sortByKey(map);
	}

}
