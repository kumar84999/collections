package ArraysListBookratna;

import java.util.ArrayList;

public class AnonymousAdding {
	public static void main(String[] args) {
		ArrayList al = new ArrayList<>() {

			{
				add("kumar");
				add("ponnaveni");
			}

		};
		System.out.println(al);
	}
	}


