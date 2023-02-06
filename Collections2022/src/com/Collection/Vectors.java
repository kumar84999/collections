package com.Collection;
import java.util.Vector;
public class Vectors {
	public static void main(String[] args) {
		
		Vector<String> v=new Vector<String>();
		
		v.add("zero");
		v.add("First");
		v.add("second");
		v.add("third");
		v.add("fourth");
		v.add("fifth");
		System.out.println(v);
		v.add(2,"kumar");
		System.out.println(v);
		String set = null;
		v.add(4,set);
		System.out.println(v);
		v.add("Sweety");
		System.out.println(v);
		System.out.println("first element:"+v.firstElement() );
		System.out.println("last element:"+v.lastElement());
		System.out.println(v.isEmpty());
		v.clear();
		System.out.println(v);
		System.out.println(v.isEmpty());
		System.out.println(v.equals(set));
		
		
	}

}
