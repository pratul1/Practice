package com.prac.basic;

public class CountWords {

	public static String countWords(String str) {
		String[] arr = str.trim().split(" ");

		System.out.println(arr.length);

		return null;
	}

	public static void main(String[] args) {
		String str = "My name is Shruthi";
		countWords(str);

	}

}
