package ComparableInterface;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class StudentWithTreeSet {
	public static void main(String[] args) {
		Student s1=new Student(1, "kumar", 22000.00);
		Student s2=new Student(2, "Sriman", 22000.00);
		Student s3=new Student(3, "mahesh", 19000.00);
		Student s4=new Student(4, "Shan", 18000.00);
		Student s5=new Student(5, "Ravi", 18000.00);
		Student s6=new Student(6, "Ramya", 17000.00);
		Student s7=new Student(7, "pooja", 16000.00);
	//	Student s8=new Student(1, "kumar", 22000.00);
		TreeSet<Student>student=new TreeSet<>();
		student.add(s1);
		student.add(s2);
		student.add(s3);
		student.add(s4);
		student.add(s5);
		student.add(s6);
		student.add(s7);
		
		Iterator<Student>itr=student.iterator();
		while(itr.hasNext());
		System.out.println(itr.next());
		
	}
	TreeSet<Student>sted=new TreeSet<>(new Comparator<Student>() {
		
		
		
	

}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}}