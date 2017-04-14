package com.prac.basic;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ArrayShift {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[] a = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}

		while (k > 0) {

			for (int i = 0; i < n - 2; i++) {
				int temp = a[i];
				a[i] = a[i + 1];
				a[i + 1] = temp;

			}

			k--;
		}

		for (int i = 0; i < k; i++) {
			System.out.println(a[i] + " ");
		}
	}
}
