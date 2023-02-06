package com.Collection;

public class SalaryBasedSorting {
	int id;
	String name;
	double salary;
	public SalaryBasedSorting(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "SalaryBasedSorting [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	

}
