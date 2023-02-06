package Array1;

import java.util.ArrayList;

import com.ArrayList.vegitable;

public class TestToSuper {
	public static void main(String[] args) {
		vegitable v=new vegitable("potato");
		Fruits f=new Fruits("Apple");
		Grocerious g=new Grocerious("grocerious");
		ArrayList<Object> al = new ArrayList<>();
		al.add(v);
		al.add(f);
		al.add(g);
		System.out.println(al);
		System.out.println("Contains :"+al.contains(v));
		// toString implementation
		for (Object o : al) {
			if( o instanceof Integer)
				System.out.println(o.toString());
			if(o instanceof Character)
				System.out.println(o.toString());
			if(o instanceof vegitable) {
				vegitable v1=(vegitable)o;
				System.out.println(v1.vegitables+"   :Add another one like that   :"+v1.vegitables);
			}if(o instanceof Fruits) {
				Fruits f1= (Fruits) o;
				System.out.println(f1.fruits+" :"+Fruits.fruits+" :"+f1.hashCode());
			}if(o instanceof Grocerious) {
				Grocerious g1= (Grocerious) o;
				System.out.println(g1.itms+" :"+g1.itms+" :"+g1.hashCode());
			}
		}
	}

}
