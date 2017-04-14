package com.prac.basic;

public class RecursionPractice {

	public static void recursion(int n) {

		for (int i = 0; i < n; i++) {
			System.out.println(i);
			recursion(i);
		}

	}

	public static void main(String[] args) {

		recursion(5);
	}

}
