package HasMap;

import java.util.HashMap;
import java.util.Set;

public class Basic {

	public static void main(String[] args) {
		
		final HashMap<String, String> map = new HashMap<>();
		map.put("First", "kumar");
		map.put("Second", "Mahesh");
		map.put("Third", "sriman");
		map.put("Fourth", "pooja");
		map.put("Fifth", "Ramya");
		map.put("Sixth", "Sweety");

		System.out.println(map);
		System.out.println(map.get("Second"));
		System.out.println(map.isEmpty());
		System.out.println(map.size());
		System.out.println(".........keyBased..........");
		Set<String> set = map.keySet();
		for (String str : set) {
			System.out.println(str + " ==> " + map.get(str));
		}
		System.out.println(",,,,,,,,,,,,,,,");
		map.remove("Fourth");
		System.out.println(map);
	}

}
