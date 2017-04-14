package com.prac.basic;

public class StaircaseRecursion {

	public static void justPrint(int num) {
		if (num == 1) {
			System.out.println("#");
		} else {

			for (int i = 0; i < num; i++) {
				System.out.print("#");
			}
			System.out.println("");
			justPrint(num - 1);
		}
	}

	public static void main(String[] args) {

		justPrint(10);

	}

}
