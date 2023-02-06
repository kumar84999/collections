package com.Collection;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee e1=new Employee(101, "kumar",20000.00);
		Employee e2=new Employee(102, "Sriman", 25000.00);
		Employee e3=new Employee(103, "pooja", 23000.00);
		Employee e4=new Employee(104, "Ramya", 24000.00);
		Employee e5=new Employee(105, "mahesh", 25000.00);
		List<Employee>employees=new ArrayList<>();
		
		
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employees.add(e5);
		System.out.println("Employee");
		Collections.sort(employees, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				
				return o1.getId() - o2.getId();
			}

			private double getId() {
				// TODO Auto-generated method stub
				return 0;
			}
		});
		Iterator<Employee>itr =employees.iterator();
		while (itr.hasNext()) {
			Employee employee=itr.next();
			System.out.println(employee);
		}
	}
}