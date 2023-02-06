package CustomSortingUseingComparator;

import java.util.ArrayList;
import java.util.Collections;

public class StudentTest {
	public static void main (String []args) {
		ArrayList<Student>ar=new ArrayList<Student>();
		ar.add(new Student(111, "kumar", "mancherial"));
		ar.add(new Student(112, "mahesh", "srikakulam"));
		ar.add(new Student(113, "Sriman", "peddapelly"));
		
		System.out.println("unsorted");
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
			
		}
		System.out.println("-----------------------------------");
		Collections.sort(ar,new Sortbyroll());
		System.out.println("\nsorted by rollno");
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));


		}
		System.out.println("-------------------------------------");
		Collections.sort(ar,new Sortbyname());
		System.out.println("\nsorted by name");
		for (int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
	}

}
