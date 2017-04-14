package com.prac.basic;

public class QueueImplMainClass {

	public static void main(String[] args) {

		QueueImpl q1 = new QueueImpl();

		q1.add(10);
		q1.add(15);
		q1.add(20);
		q1.add(25);
		q1.add(30);

		q1.remove();

	}

}
