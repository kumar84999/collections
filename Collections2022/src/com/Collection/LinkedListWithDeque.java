package com.Collection;

import java.util.Deque;
import java.util.LinkedList;

public class LinkedListWithDeque {

	public static void main(String[] args) {
		Deque<Integer>tokens=new LinkedList<Integer>();
		tokens.addFirst(100);
		tokens.add(101);
		tokens.offer(102);
		tokens.addLast(103);
		System.out.println(tokens.getFirst());
		System.out.println(tokens.peekFirst());
		System.out.println(tokens.removeFirst());
		System.out.println(tokens);
		System.out.println(tokens.poll());
		System.out.println(tokens);
		System.out.println(tokens.removeLast());
		System.out.println(tokens);
		

	}

}
