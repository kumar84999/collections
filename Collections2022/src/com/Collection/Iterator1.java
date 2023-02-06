package com.Collection;

import java.util.ArrayList;
import java.util.Iterator;


public class Iterator1 {
	public static void main(String[] args) {
		ArrayList<String> countryList=new ArrayList<>();
		countryList.add("India");
		countryList.add("Pakistan");
		countryList.add("Srilanka");
		countryList.add("Dubai");
		Iterator iterator = countryList.iterator();
				System.out.println("countries");
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
			
	}


	}
