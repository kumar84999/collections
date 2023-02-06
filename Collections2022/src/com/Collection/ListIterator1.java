package com.Collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIterator1 {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		
		ListIterator iterator=list.listIterator();
		System.out.println("Display list elements in forward directions");
		
		while(iterator.hasNext()) {
			System.out.print(iterator.next());
			
		}
		System.out.println();
		
		
		System.out.println("Display list element in backward directions");
		
		while(iterator.hasPrevious()) {
			System.out.print(iterator.previous());
		}
		
		
		
	}

}
