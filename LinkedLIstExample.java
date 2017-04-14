package com.prac.basic;

import java.util.LinkedList;

public class LinkedLIstExample {

	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<String>();

		ll.add("Shruthi");
		ll.add("Adesh");
		ll.add("Gooshi");

		ll.addFirst("Uma");
		ll.addLast("Adithi");

		String[] arr = ll.toArray(new String[ll.size()]);

		for (String str : arr) {
			System.out.println(str);
		}
		System.out.println(ll);
	}

}
