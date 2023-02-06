package ComparableInterface;

import java.time.LocalDate;

public class Employee1 implements Comparable<Employee1> {
	private int id;
	private String name;
	private double salary;
	private LocalDate joiningdate;
	
	

	public Employee1(int id, String name, double salary, LocalDate joiningdate) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.joiningdate = joiningdate;
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



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}



	public LocalDate getJoiningdate() {
		return joiningdate;
	}



	public void setJoiningdate(LocalDate joiningdate) {
		this.joiningdate = joiningdate;
	}



	@Override
	public int compareTo(Employee1 anotherEmployee) {
		
		return this.getId()-anotherEmployee.getId();
	}



	



	
		
	}
	


