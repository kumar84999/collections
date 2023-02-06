package HasMap;

import java.util.HashMap;
import java.util.Set;

public class IterHashMap {
	public static void main(String[] args) {
		

	HashMap<String, String> map = new HashMap<>();
	map.put("First", "kumar");
	map.put("Second", "Sweety");
	map.put("Third", "mahaansh");
	map.put("Fourth", "Alekhya");
	System.out.println(map);
	Set<String> set = map.keySet();
	for (String string : set) {
		System.out.println("Value of " + string + " is: " + map.get(string));
	}

}
}