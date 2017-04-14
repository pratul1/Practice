package com.prac.basic;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Ransom {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int n = in.nextInt();
		String magazine[] = new String[m];
		for (int magazine_i = 0; magazine_i < m; magazine_i++) {
			magazine[magazine_i] = in.next();
		}
		String ransom[] = new String[n];
		for (int ransom_i = 0; ransom_i < n; ransom_i++) {
			ransom[ransom_i] = in.next();
		}

		Map<String, Integer> rns = new TreeMap<String, Integer>();
		Map<String, Integer> mag = new TreeMap<String, Integer>();

		String result = "Yes";

		if (ransom.length > magazine.length) {
			result = "No";
			System.out.print(result);
		} else {

			for (String s : magazine) {
				if (mag.containsKey(s)) {
					mag.put(s, mag.get(s) + 1);
				} else {
					mag.put(s, 1);
				}
			}

			for (String s : ransom) {
				if (rns.containsKey(s)) {
					rns.put(s, rns.get(s) + 1);
				} else {
					rns.put(s, 1);
				}
			}

			Iterator it = rns.entrySet().iterator();

			while (it.hasNext()) {
				Map.Entry a = (Map.Entry) it.next();

				if (mag.containsKey(a.getKey())) {
					if (mag.get(a.getKey()) < rns.get(a.getKey())) {
						result = "No";
					} else {
						result = "Yes";
					}
				} else {
					result = "No";
				}

			}

			System.out.print(result);

		}
	}
}
