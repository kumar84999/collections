package ArrayListImportant;

import java.util.ArrayList;
import java.util.List;

public class MyListToCsvString {
	public String getListAsCsvString(List<String> list) {
		StringBuilder sb = new StringBuilder();
		for (String str : list) {
			if (str.length() != 0) {
				sb.append(",");
			}
			sb.append(str);
		}

		return sb.toString();

	}

	public static void main(String[] args) {
		List<String> al1 = new ArrayList<String>();
		al1.add("kumar");
		al1.add("sweety");
		al1.add("mahaansh");
		MyListToCsvString my = new MyListToCsvString();
		System.out.println(my.getListAsCsvString(al1));
		List<String> al2 = new ArrayList<String>();
		al2.add("kumar");
		al2.add("mahaansh");
		al2.add("Rams");
		System.out.println(my.getListAsCsvString(al2));
		System.out.println("..................................");
		List<String> s1 = new ArrayList<String>() {
			{
				this.add("kumar");
				this.add("sweety");
				this.add("mahaansh");
			}
		};
		System.out.println(my.getListAsCsvString(s1));
		List<String> s2 = new ArrayList<String>() {
			{
				this.add("kumar");
				this.add("mahaansh");
				this.add("Rams");
			}
		};

		System.out.println(my.getListAsCsvString(s2));
		System.out.println("..................................");
		List<String> li1 = new ArrayList<String>() {
			{
				this.add("animal");
				this.add("nuts");
				this.add("java");
			}
		};
		MyListToCsvString mtc = new MyListToCsvString();
		System.out.println(mtc.getListAsCsvString(li1));
		List<String> li2 = new ArrayList<String>() {
			{
				this.add("java");
				this.add("unix");
				this.add("c++");
			}
		};
		System.out.println(mtc.getListAsCsvString(li2));
	}

}
