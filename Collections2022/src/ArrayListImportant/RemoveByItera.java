package ArrayListImportant;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveByItera {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("kumar");
		al.add("Sweety");
		al.add("Mahaansh");
		al.add("laxmi");
		al.add("Rams");
		al.add("subash");
		System.out.println("Before data :" + al);
		Iterator<String> itr = al.iterator();
		// 3. multiple removing
		while (itr.hasNext()) {

			if ("kumar".equals(itr.next())) {
				itr.remove();
			}
			if ("sweety".equals(itr.next())) {
				itr.remove();
			}
		}
		System.out.println("After :" + al);
	}
	} 
	


