package ArrayListImportant;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Iterator;

public class Swap {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList<>();
		a1.add("zero");
		a1.add("First");
		a1.add("second");
		a1.add("third");
		a1.add("fourth");
		a1.add("fifth");
		System.out.println(a1);
		Collections.swap(a1, 0, 3);
		System.out.println(a1);
		for(Object str:a1) {
		System.out.println(str);
		
		

	}

}
}