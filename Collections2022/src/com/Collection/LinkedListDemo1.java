package com.Collection;

import java.util.LinkedList;

public class LinkedListDemo1 {
public static void main(String[] args) {
	LinkedList<String>list=new LinkedList<>();
	System.out.println(list.peekFirst());
	System.out.println(list.pollFirst());
	list.add("breashing your teeth");
	list.add("goining to gym or walk");
	list.add("take a dog to walk");
	list.add("doing breakfast");
	list.element();
	list.addLast("going to sleep");
	System.out.println(list.removeFirst());
	System.out.println(list.removeLast());
	System.out.println(list.peek());
	System.out.println(list.getFirst());
	System.out.println(list.getLast());
	System.out.println(list);
	
}
}
