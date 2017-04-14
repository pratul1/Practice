package com.prac.basic;

public class BinarySearch {

	public static void performSearch(int[] arr, int value) {

		int lowindval = 0;
		int highindval = arr.length - 1;

		while (lowindval <= highindval) {

			int middleindval = (lowindval + highindval) / 2;

			if (arr[middleindval] > value) {
				highindval = middleindval - 1;
			} else if (arr[middleindval] < value) {
				lowindval = middleindval + 1;
			} else {
				System.out.println("element found at position:" + middleindval);
				lowindval = highindval + 1;
			}

		}

	}

	public static void selectionSort(int[] arr) {

		int index = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			index = i;

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[index]) {
					index = j;
				}
			}

			int smallest = arr[index];
			arr[index] = arr[i];
			arr[i] = smallest;

		}

	}

	public static void main(String[] args) {

		int[] arr = { 5, 78, 1, 35, 9, 25 };

		selectionSort(arr);

		for (int a : arr) {
			System.out.println(a);
		}

	}

}
