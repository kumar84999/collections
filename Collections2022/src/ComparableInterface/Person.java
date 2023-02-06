package ComparableInterface;

public class Person implements Comparable<Person> {
	private String name;
	private int age;
	

public Person() {
		super();
		// TODO Auto-generated constructor stub
	}






	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	@Override
	public int compareTo(Person per) {
		if (this.age==per.age)
		
		return 0;
		else
			return this.age>per.age?1:-1;
	}

}
