package com.prac.basic;

public class ReverseString {

	public static String reverseString(String str) {
		String rev = "";

		/*
		 * char[] arr = new char[str.length()];
		 * 
		 * arr = str.toCharArray();
		 * 
		 * for (int i = arr.length - 1; i >= 0; i--) { rev = rev + arr[i]; }
		 * 
		 * System.out.println(rev);
		 */

		StringBuffer sb = new StringBuffer(str);

		sb.reverse();

		rev = sb.toString();

		rev = rev.substring(0, 3);

		return null;
	}

	public static void main(String[] args) {

		for (String str : args) {
			System.out.println(str);
		}

		String name = "shruthi";

		reverseString(name);

	}

}
