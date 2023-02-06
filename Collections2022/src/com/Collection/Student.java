package com.Collection;

import java.util.Iterator;

public class Student {
	public static Iterator<Student> itarator;
	private int id;
	private String name;
	
	public Student() {
		super();
		


	}
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		
		
	}
	public void Student(int id, String name) {
		// TODO Auto-generated constructor stub
	}
	public void Student1(int id, String name) {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
		
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	public static void add(Student student) {
		// TODO Auto-generated method stub
		
	}
	

}
