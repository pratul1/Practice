package com.prac.basic;

public class FactorialUsingRecursion {

	public static int factorial(int n) {
		if (n == 0) {
			return 1;
		} else {
			return (n < 2) ? 1 : n * factorial(n - 1);
		}
	}

	public static void main(String[] args) {

		int res = factorial(5);

		System.out.println(res);

	}

}
