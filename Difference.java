package com.prac.basic;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Difference {
	public static int numberNeeded(String first, String second) {

		Map<Character, Integer> str1map = new TreeMap<Character, Integer>();
		Map<Character, Integer> str2map = new TreeMap<Character, Integer>();

		char[] str1 = new char[first.length() - 1];
		char[] str2 = new char[second.length() - 1];

		str1 = first.toCharArray();
		str2 = second.toCharArray();

		for (char c : str1) {
			if (str1map.containsKey(c)) {
				str1map.put(c, str1map.get(c) + 1);
			} else {
				str1map.put(c, 1);
			}
		}

		for (char c : str2) {
			if (str2map.containsKey(c)) {
				str2map.put(c, str2map.get(c) + 1);
			} else {
				str2map.put(c, 1);
			}
		}

		int difference = 0;

		System.out.println(str1map);
		System.out.println(str2map);

		Set str1set = str1map.entrySet();
		Set str2set = str2map.entrySet();

		Iterator it1 = str1map.entrySet().iterator();
		Iterator it2 = str2map.entrySet().iterator();

		while (it1.hasNext()) {
			Map.Entry a = (Map.Entry) it1.next();
			if (str2map.containsKey(a.getKey())) {
				int str1val = str1map.get(a.getKey());
				int str2val = str2map.get(a.getKey());

				int diff = Math.abs(str1val - str2val);
				difference = difference + diff;
			} else {
				difference = difference + (str1map.get(a.getKey()));
			}
		}

		while (it2.hasNext()) {
			Map.Entry a = (Map.Entry) it2.next();
			if (!str1map.containsKey(a.getKey())) {
				difference = difference + (str2map.get(a.getKey()));
			}
		}

		return difference;

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = in.next();
		String b = in.next();
		System.out.println(numberNeeded(a, b));
	}
}
