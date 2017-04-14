package com.prac.basic;

import java.awt.DisplayMode;

public class QueueImpl {

	/*
	 * private static class Node {
	 * 
	 * private int data; private Node next;
	 * 
	 * private Node(int data) { this.data = data; } }
	 */

	Node head; // remove from the head
	Node tail; // add to the tail

	public boolean isEmpty() {
		return head == null;
	}

	public int peek() {
		return head.data;
	}

	public void add(int data) {
		Node node = new Node(data);

		if (tail != null) {
			tail.next = node;
		}

		tail = node;

		if (head == null) {
			head = node;
		}
	}

	public int remove() {
		int data = head.data;
		head = head.next;

		if (head == null) {
			tail = null;
		}

		display(head);
		return data;
	}

	public static void display(Node head) {
		
		Node current = head;
		
		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}

}
