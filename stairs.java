package com.prac.basic;

import java.util.LinkedList;
import java.util.List;

class stairs {
	// A recursive function used by countWays
	public static Long countThe(int n) {

		int numberOfWays = 3;
		if (n <= 1)
			return (long) n;
		Long res = 0l;
		for (int i = 1; i <= numberOfWays && i <= n; i++)
			res += countThe(n - i);
		return res;
	}

	// Returns number of ways to reach s'th stair
	public static Long countWays(int s) {
		return countThe(s + 1);
	}

	/* Driver program to test above function */
	public static void main(String args[]) {
		int s = 3;
		System.out.println("Number of ways = " + countWays(s));
	}
}
