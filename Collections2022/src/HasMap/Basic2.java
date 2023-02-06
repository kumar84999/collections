package HasMap;

import java.util.HashMap;
import java.util.Iterator;

public class Basic2 {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<>();
		map.put("kumar", 3);
		map.put("Sriman", 2);
		map.put("subhash", null);
		map.put("subbu", null);// value allowed so many times
		map.put(null, 5);
		map.put(null, 6);// one time allow key
		System.out.println(map);
		System.out.println(".........Iterator........");
		Iterator itr = map.entrySet().iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
