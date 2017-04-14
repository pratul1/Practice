package com.prac.basic;

public class ArraySum {

	public static int arraySum(int[] numbers) {

		int leftsum = 0;
		int rightsum = 0;
		int finalindex = 0;

		for (int i = 1; i < numbers.length - 1; i++) {

			for (int j = 0; j < i; j++) {
				leftsum += numbers[j];
			}

			for (int k = i + 1; k < numbers.length; k++) {
				rightsum += numbers[k];
			}

			if (leftsum == rightsum) {
				finalindex = i;
				break;
			} else {
				leftsum = 0;
				rightsum = 0;
			}

		}

		System.out.println(finalindex);
		return finalindex;
	}

	public static void main(String a[]) {
		int[] num = { 0, 0, 0, 0, 0, 2 };

		arraySum(num);

	}
}
