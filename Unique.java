package com.prac.basic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Unique {

	static String runLengthEncode(String input) {

		LinkedHashMap<Character, Integer> mymap = new LinkedHashMap<Character, Integer>();

		char[] arr = new char[input.length()];

		arr = input.toCharArray();

		for (char c : arr) {
			if (mymap.containsKey(c)) {

				mymap.put(c, mymap.get(c) + 1);
			} else {
				mymap.put(c, 1);
			}

		}

		Set entrySet = mymap.entrySet();
		Iterator it = entrySet.iterator();

		String resstr = "";

		while (it.hasNext()) {
			Map.Entry me = (Map.Entry) it.next();

			int first = (int) me.getValue();

			if (first == 1) {
				resstr = resstr + me.getKey();

			}

		}

		String fin = resstr.substring(0, 1);

		System.out.println(fin);

		return fin;

	}

	public static void main(String[] args) {

		String inp = "racecars";

		runLengthEncode(inp);
	}

}
