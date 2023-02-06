package com.ArrayList;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList objects=new ArrayList();
		System.out.println(objects.isEmpty());
		System.out.println(objects.size());
		System.out.println(objects.toString());
		objects.add(123);
		objects.add(true);
		objects.add(null);
		objects.add(123.21);
		objects.add('k');
		objects.add("kumar");
		objects.add("chinna");
		System.out.println(objects);
		//retrive operation
	//	System.out.println(objects.isEmpty());
	//	System.out.println(objects.size());
		objects.add(5,'s');
		//System.out.println(objects);
		if(objects.contains("kumar")) {
		objects.set(6, "Sweety");
		objects.set(7, "chikkulu");
		
		}
		System.out.println(objects);
		//remove ,addall,remove,removeall
		System.out.println(objects.size());
		int oldcapacity=10;
		int newcapacity=(oldcapacity*3)/2+1;
		System.out.println(newcapacity);
		
		
		Iterator itr=objects.iterator();
		while(itr.hasNext()) {
			Object obj=itr.next();
			System.out.println(obj);
			System.out.println(itr.next());
			System.out.println("---------");
		}
		for (Object object : objects) {
			System.out.println(object);
		}
		
		
		
	}

}
