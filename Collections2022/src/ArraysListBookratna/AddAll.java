package ArraysListBookratna;

import java.util.ArrayList;
import java.util.Collections;

public class AddAll {
	public static void main(String[] args) {
	ArrayList al = new ArrayList<>();
	String str[] = { "kumar", "ponnaveni", "village" };
	Collections.addAll(al, str);
	System.out.println(al);

}
}