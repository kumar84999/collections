package HasMap;

import java.util.HashMap;
import java.util.Set;

public class AllKeyValues {
	/*
	 * Program: How to get all keys from HashMap?
	 * 
	 * Description: Below example shows how to get all keys from the given HashMap.
	 * By calling keySet() method, you can get set object with all key values.
	*/public static void main(String[] args) {
	HashMap<String, String> map = new HashMap<>();
	map.put("First", "kumar");
	map.put("Second", "Sweety");
	map.put("Third", "mahaansh");
	map.put("Fourth", "akhi");
	System.out.println(map);
	System.out.println("....keys.......");
	Set<String> set= map.keySet();
	for (String str : set) {
		System.out.println(str);
	}
}
}