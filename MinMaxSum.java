package com.prac.basic;

public class MinMaxSum {

	public static void findSum(long a, long b, long c, long d, long e) {
		long[] arr = new long[5];

		arr[0] = a;
		arr[1] = b;
		arr[2] = c;
		arr[3] = d;
		arr[4] = e;

		int lenght = arr.length;

		for (int i = 0; i < lenght; i++) {

			for (int j = 1; j < lenght - i; j++) {

				if (arr[j] < arr[j - 1]) {

					long temp = arr[j];

					arr[j] = arr[j - 1];

					arr[j - 1] = temp;

				}

			}

		}

		int minsum = 0;
		int maxsum = 0;

		for (int i = 0; i < lenght - 1; i++) {
			minsum += arr[i];
		}

		for (int i = 1; i < lenght; i++) {
			maxsum += arr[i];
		}

		System.out.println(minsum + " " + maxsum);

	}

	public static void main(String[] args) {
		long a = 2;
		long b = 10;
		long d = 7;
		long c = 4;
		long e = 9;

		findSum(a, b, c, d, e);

	}

}
