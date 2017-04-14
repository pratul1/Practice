package com.prac.basic;

import java.util.Stack;

public class StackSort {

	public static Stack<Integer> stackSorting(Stack<Integer> input) {

		Stack<Integer> tmpStack = new Stack<Integer>();

		while (!input.isEmpty()) {
			int tmp = input.pop();
			System.out.println("Element taken out: " + tmp);
			while (!tmpStack.isEmpty() && tmpStack.peek() > tmp) {
				input.push(tmpStack.pop());
			}
			tmpStack.push(tmp);
			System.out.println("input: " + input);
			System.out.println("tmpStack: " + tmpStack);
		}

		System.out.println(tmpStack);
		return tmpStack;

	}

	public static void main(String[] args) {

		Stack<Integer> st = new Stack<Integer>();

		st.add(34);
		st.add(3);
		st.add(31);
		st.add(98);
		st.add(92);
		st.add(23);
		stackSorting(st);

	}

}
