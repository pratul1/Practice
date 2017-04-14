package com.prac.basic;

public class FibbonaciRecursion {

	public static int fibSeries(int n) {
		if (n <= 0)
			return 0;
		else if (n == 1)
			return 1;
		else {
			int res = fibSeries(n - 1) + fibSeries(n - 2);
			System.out.println(res);
			return res;

		}

	}

	public static void main(String[] args) {

		fibSeries(5);
	}

}
