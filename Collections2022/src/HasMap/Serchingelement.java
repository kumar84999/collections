package HasMap;

import java.util.HashMap;

public class Serchingelement {
	/*
	 * Program: How to search a key in HashMap?
	 * 
	 * Description: Below example shows how to find whether specified key exists or
	 * not. By using containsKey() method you can find out the key existance.
	 */
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("First", "kumar");
		map.put("Second", "Sweety");
		map.put("Third", "mahaansh");
		map.put("Fourth", "laxmi");
		System.out.println(map);
		System.out.println(map.containsKey("Second"));// true
		System.out.println(map.containsValue("sweety"));// true
		if (map.containsKey("First")) {
			System.out.println("The hashmap contains key first");
		} else {
			System.out.println("The hashmap does not contains key first");
		}
		if (map.containsKey("fifth")) {
			System.out.println("The hashmap contains key fifth");
		} else {
			System.out.println("The hashmap does not contains key fifth");
		}
		if (map.containsValue("Sweety")) {
			System.out.println("The hashmap contains value Sweety");
		} else {
			System.out.println("The hashmap does not contains value kumar");
		}
		if (map.containsValue("kumar")) {
			System.out.println("The hashmap contains value kumar");
		} else {
			System.out.println("The hashmap does not contains value kumar");
		}
}
}