package com.prac.basic;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CostCalculation {

	public static int cost(int[] num) {

		int cost = 0;
		boolean Check = true;

		int len = num.length - 1;

		for (int i : num) {
			if (i < 1 || i > Math.pow(10, 5)) {
				Check = false;
			}
		}

		if (len >= 2 && len <= Math.pow(10, 4) && len == num[0] && Check == true) {

			List<Integer> list = new LinkedList<Integer>();

			for (int i = 1; i <= num.length - 1; i++) {
				list.add(num[i]);
			}

			Collections.sort(list);

			if (list.size() == 1) {
				cost = list.get(0);
			}

			while (list.size() >= 2) {
				Integer a = ((LinkedList<Integer>) list).poll();
				Integer b = ((LinkedList<Integer>) list).poll();
				int temp = a + b;
				cost = cost + (temp);
				list.add(temp);
				Collections.sort(list);
			}
		} else {
			Check = false;
		}

		if (Check == false) {
			cost = 0;
		}

		System.out.println(cost);
		return cost;

	}

	public static void main(String[] args) {

		int[] arr = { 4, 1, 2, 3, 4 };
		int s=0;
		while(s++<10){
			if(s<4 && s<9)
				continue;
			System.out.println(s + "\t");
		}
		//cost(arr);

	}
}
