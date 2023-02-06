package com.Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StudentTest {
	public static void main(String[] args) {
		Set<Student>students=new HashSet<>();
		students.add(new Student(100, "kumar"));
		students.add(new Student(101,"Sweety"));
		students.add(new Student(102,"chinna"));
		Iterator<Student> iterator=students.iterator();
		while(iterator.hasNext()){
			Student student=iterator.next();
			System.out.println(student);
		
	}

}
}