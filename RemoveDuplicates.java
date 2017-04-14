package com.prac.basic;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {

	public static int[] removeDuplicates(int[] input) {

		Set<Integer> myset = new TreeSet<Integer>();

		for (int i = 0; i < input.length - 1; i++) {

			myset.add(input[i]);

		}

		Integer[] newarray = new Integer[myset.size()];

		myset.toArray(newarray);

		for (int i = 0; i < newarray.length - 1; i++) {
			System.out.println(newarray[i]);
		}

		return null;
	}

	public static void main(String a[]) {
		int[] input1 = { 100, 2, 3, 6, 6, 8, 9, 10, 10, 10, 12, 12 };
		int[] output = removeDuplicates(input1);
	}

}
