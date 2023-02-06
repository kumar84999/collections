package com.ArrayList;

import java.util.ArrayList;

public class AutoBoxingArrayList {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		Integer i=new Integer(10);
		Double d=new Double(10.25);
		Character ch=new Character('m');
		
		al.add(i);
		al.add(ch);
		al.add(d);
		System.out.println(al);
		ArrayList al1=new ArrayList<>();
		al1.add(i);
		al1.add(Integer.valueOf(10));//internally converting like that
		al1.add(String.valueOf(10));//String converts Int
		System.out.println(al1);
		
		
	}
	

}
