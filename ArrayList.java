package com.prac.basic;

import java.util.*;

public class ArrayList {

	public static List<Integer> sortReverse(int[] arr) {

		int size = arr.length;
		int j = 0;

		List<Integer> l1 = new java.util.ArrayList<>();
		List<Integer> l2 = new java.util.ArrayList<>();

		for (int i = 0; i < size / 2; i++) {
			l1.add(arr[i]);
		}

		for (int i = size / 2; i < size; i++) {
			l2.add(arr[i]);
		}

		Collections.sort(l1);
		Collections.sort(l2);
		Collections.reverse(l2);
		l1.addAll(l2);
		System.out.println(l1);

		Integer[] tmp = new Integer[l1.size()];
		l1.toArray(tmp);

		return null;
	}

	public static void main(String[] args) {

		int[] myArray = new int[] { 1, 4, 2, 14, 53, 66, 3, 5 };

		sortReverse(myArray);

	}

}
