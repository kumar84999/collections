package com.Collection;

public class NameBasedSorting {
	int id;
	String name;
	double salary;
	public NameBasedSorting(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "NameBasedSorting [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	

}
