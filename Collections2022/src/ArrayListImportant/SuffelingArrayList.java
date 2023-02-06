package ArrayListImportant;

import java.util.ArrayList;
import java.util.Collections;

public class SuffelingArrayList {
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add("Zero");
		a1.add("first");
		a1.add("seconds");
		a1.add("Third");
		a1.add("fourth");
		System.out.println(a1);
		Collections.shuffle(a1);
		// Random Acess values like that
		System.out.println(a1);
		// changes every time
		Collections.shuffle(a1);
		System.out.println(a1);
	}
	}
	


