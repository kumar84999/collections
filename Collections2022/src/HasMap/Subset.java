package HasMap;

import java.util.HashMap;

public class Subset {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("First", "kumar");
		map.put("Second", "mahaansh");
		map.put("Third", "sweety");
		map.put("Fourth", "akhi");
		System.out.println(map);
		HashMap<String, String> map1 = new HashMap<>();
		map.put("s1", "s1 value");
		map.put("s2", "s2 value");
		map.putAll(map1);
		System.out.println(map);
	}

}
