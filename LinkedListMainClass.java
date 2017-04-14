package com.prac.basic;

public class LinkedListMainClass {

	public static void main(String[] args) {

		LinkedListImpl list = new LinkedListImpl();

		list.append(5);
		list.append(10);
		list.append(15);
		list.append(20);
		list.append(25);

		list.reverseTheList(list.head);

	}

}