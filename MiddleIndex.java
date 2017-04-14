package com.prac.basic;

public class MiddleIndex {

	public static void middleIndex(int[] arr) {

		int leftsum = 0;
		int rightsum = 0;
		int start = 0;
		int end = arr.length - 1;

		while (true) {
			if (leftsum > rightsum) {
				rightsum = rightsum + arr[end--];
			} else {
				leftsum = leftsum + arr[start++];
			}
			if (leftsum == rightsum) {
				System.out.println(end);
				break;
			}

		}

	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 0, 6 };

		middleIndex(arr);
	}
}
