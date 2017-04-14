package com.prac.basic;

public class LinkedListImpl {

	Node head;

	public void append(int data) {

		if (head == null) {
			head = new Node(data);
			return;
		}
		Node current = head;

		while (current.next != null) {
			current = current.next;
		}

		current.next = new Node(data);
	}

	public void prepend(int data) {
		Node newhead = new Node(data);

		Node current = head;
		if (head == null) {
			head = newhead;
			return;
		}

		newhead.next = head;
		head = newhead;

	}

	public void deleteWithValue(int data) {
		if (head == null)
			return;

		if (head.data == data) {
			head = head.next;
			return;
		}

		Node current = head;
		while (current.next != null) {
			if (current.next.data == data) {
				current.next = current.next.next;
				return;
			}
			current = current.next;
		}

	}

	public void reverseTheList(Node head) {

		Node currNode = head;
		Node nextNode = null;
		Node prevNode = null;

		while (currNode != null) {
			nextNode = currNode.next;
			currNode.next = prevNode;
			prevNode = currNode;
			currNode = nextNode;
		}
		head = prevNode;
		printMyList(head);
	}

	public void printMyList(Node head) {

		Node current = head;
		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}
}
