package com.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistDemo2 {
	public static void main(String[] args) {
		ArrayList prices=new ArrayList(30);
		prices.add(240.00);
		prices.add(265.00);
		prices.add(564.00);
		prices.add(546.00);
		
		
		ArrayList products=new ArrayList();
		products.add("milk");
		products.add("oil");
		products.add("apple");
		products.add("rice");
		
		ArrayList groceryList=new ArrayList(prices);
		groceryList.addAll(products);
		
		Iterator itr=groceryList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
				
		
		
		
		
	}

}
