package com.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting1 {
	public static void main(String[] args) {
		ArrayList mobile=new ArrayList();
		mobile.add("samsung");
		mobile.add("apple");
		mobile.add("motorola");
		mobile.add("oppo");
		mobile.add("vivo");
		mobile.add("10");
		// Ascii values sorting
		Collections.sort(mobile);
		System.out.println(mobile);
		
		ArrayList al= new ArrayList();
		al.add(4);
		al.add(3);
		al.add(2);
		al.add(5);
		al.add(7);
		Collections.sort(al);
		System.out.println(al);
	}

}
