package com.prac.basic;

import java.util.LinkedList;
import java.util.List;

public class RotateOpsOnString {

	public static String perform(String str, String[] function) {

		for (String st : function) {

			int op1 = Integer.parseInt(st.split("\\s{1,}")[0]);
			int op2 = Integer.parseInt(st.split("\\s{1,}")[1]);
			
			// 0 0 C [0,0,C]

			char[] ch = str.toCharArray();

			List<Character> l1 = new LinkedList<Character>();

			for (char c : ch) {
				l1.add(c);
			}

			for (int i = 0; i <= ch.length; i++) {

				if (i >= op1 && i <= op2) {
					char c = l1.get(i);

					if (st.endsWith("R")) {
						c = (char) (c + 1);
						if ((c > 122) || (c > 90 && c < 97)) {
							c = (char) (c - 26);
						}
						l1.remove(i);
						l1.add(c);
					} else if (st.endsWith("L")) {
						c = (char) (c - 1);
						if ((c < 97 && c > 90) || (c < 65)) {
							c = (char) (c + 26);
						}
						l1.remove(i);
						l1.add(c);
					}
				}

			}

			String tmp = "";
			for (Character c : l1) {
				tmp = tmp + c;

			}
			str = tmp;

		}

		String reverse = new StringBuffer(str).reverse().toString();
		System.out.println(reverse);
		return str;
	}

	public static void main(String[] args) {

		String inp = "RTY";
		String[] arr = { "0 2  L", "2 2 R", "1 1 L" };
		perform(inp, arr);

	}

}
