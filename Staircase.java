package com.prac.basic;

public class Staircase {

	public static void staircaseprint(int height) {

		for (int i = 0; i < height; i++) {
			for (int j = 0; j < height; j++) {
				if (i + j >= height - 1) {
					System.out.print("#");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {

		int num = 6;
		staircaseprint(num);

	}

}
