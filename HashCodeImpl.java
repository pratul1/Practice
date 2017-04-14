package com.prac.basic;

public class HashCodeImpl {

	public static void main(String[] args) {

		Price p1 = new Price(20, "Banana");
		Price p2 = new Price(20, "Banana");

		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());

		System.out.println(p1.equals(p2));

	}

}
