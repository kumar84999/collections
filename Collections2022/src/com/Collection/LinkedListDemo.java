package com.Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<String>country=new LinkedList<>();
		country.add("india");
		country.add("rasya");
		country.add("australia");
		country.add("america");
		Iterator<String>itr=country.iterator();	
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		ListIterator<String>listiterator=country.listIterator();
		while (listiterator.hasPrevious()) {
			System.out.println(listiterator.previous());
		}
		
	}

}
