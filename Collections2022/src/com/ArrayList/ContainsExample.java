package com.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ContainsExample {
	public static void main(String[] args) {
		ArrayList fruit=new ArrayList<>();
		fruit.add("1.Apple");
		fruit.add("2.anner");
		fruit.add("3.bananna");
		fruit.add("4.papayya");
		fruit.add("5.WaterMilen");
		fruit.add("6.mango");
		fruit.add("6.mango");
		fruit.set(4, "hhh");
		
		
		if(fruit.contains("6.mango")) {
		//set is used to change elements
		fruit.set(5, "....");
		fruit.set(6, "...0");
	}
		System.out.println(fruit);
		Collections.reverse(fruit);
		System.out.println(fruit);
		//Collections.sort(fruit);
		Collections.sort(fruit, Collections.reverseOrder());
		System.out.println(fruit);

}
}