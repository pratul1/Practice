package com.prac.basic;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */

		BigInteger big = new BigInteger("0");
		
		
		
		Scanner scan = new Scanner(System.in);

		int input = scan.nextInt();
		long factorial = 1;

		if (input > 0) {
			while (input >= 1) {
				factorial = factorial * input;
				input--;
			}
		} else if (input < 0) {
			factorial = 0;
		}

		System.out.println(factorial);
	}
}
