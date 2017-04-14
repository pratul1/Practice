package com.prac.basic;

public class Linkedlist {

	static Node head;

	static class Node {

		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	Node reverse(Node node) {
		Node prev = null;
		Node current = head;
		Node next = null;

		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;

		}

		node = prev;
		return node;
	}

	void printList(Node node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	public static void main(String[] args) {

		Linkedlist l1 = new Linkedlist();
		l1.head = new Node(85);
		l1.head.next = new Node(15);
		l1.head.next.next = new Node(4);
		l1.head.next.next.next = new Node(20);

		head = l1.reverse(head);

		l1.printList(head);

	}

}