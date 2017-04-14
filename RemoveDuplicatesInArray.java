package com.prac.basic;

public class RemoveDuplicatesInArray {

	public static int[] removeDup(int[] arr) {

		boolean isDistinct = false;

		for (int i = 0; i < arr.length - 1; i++) {
			isDistinct = false;
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					isDistinct = true;
				}

			}

			if (!isDistinct) {
				System.out.println(arr[i]);
			}
		}

		return null;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 1, 2, 3, 4 };

		removeDup(arr);

	}

}
