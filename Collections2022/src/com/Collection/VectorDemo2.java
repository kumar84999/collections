package com.Collection;

import java.util.Vector;

public class VectorDemo2 {

	public static void main(String[] args) {
		Vector<Integer> numbers=new Vector<>(2,3);
		System.out.println(numbers.capacity());
		numbers.addElement(102);
		numbers.addElement(101);
		numbers.addElement(103);
		numbers.add(105);
		numbers.addElement(104);
		numbers.addElement(100);
		System.out.println(numbers.firstElement());
		System.out.println(numbers.lastElement());
		System.out.println(numbers.capacity());
	}
}
