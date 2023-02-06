package com.Collection;

import java.util.HashSet;

public class HasSetDemo {
	public static void main(String[] args) {
	HashSet<String>pl=new HashSet<>();
	pl.add("Java");
	pl.add("C");
	pl.add("Cobalt");
	pl.add("Java script");
	pl.add(".Net");
	pl.add(null);
	pl.add("Java script");
	pl.add(".Net");
	pl.add(null);

	System.out.println(pl);

  HashSet<String>newPL=new HashSet<>();
  newPL.add("Python");
	newPL.add("C#");
	newPL.add("SAP");
	newPL.add("Sql");
//	newPL.add("Java script");
//	newPL.add(".Net");
	newPL.add("Java");
	newPL.add("C");
	newPL.add("Cobalt");
	newPL.add("Java script");
	pl.addAll(newPL);
	System.out.println(pl.containsAll(newPL));

	System.out.println(pl);

//	for (String lg : pl) {
//		System.out.println(lg.toUpperCase());
//	}
	HashSet<String> languagesReliable = new HashSet<>();
	languagesReliable.add("Java");
	languagesReliable.add("Sql");
	languagesReliable.add("Java script");
	languagesReliable.add("Angular");
	languagesReliable.add("React JS");
	pl.retainAll(languagesReliable);
	System.out.println(pl);

}
}