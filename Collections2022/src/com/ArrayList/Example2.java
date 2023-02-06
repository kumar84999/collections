package com.ArrayList;

import java.util.ArrayList;

public class Example2 {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		al.add("mahesh");
		al.add("sriman");
		al.add("kumar");
		al.add(100);
		al.add(true);
		System.out.println(al);
		al.add(0, "ponnaveni");
		System.out.println(al);
		al.remove("ponnaveni");
		al.remove(0);
		System.out.println(al);
		
	}
	}


