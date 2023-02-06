package ComparableInterface;

public class Student {
	int id;
	String name;
	Double fee;
	
public void student() {
	
	
	
}

public Student(int id, String name, Double fee) {
	super();
	this.id = id;
	this.name = name;
	this.fee = fee;
	
}



public Student(int id2, String name2, double fee2) {
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

public Double getFee() {
	return fee;
}

public void setFee(Double fee) {
	this.fee = fee;
	
}

@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", fee=" + fee + "]";
	
	
	
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((fee == null) ? 0 : fee.hashCode());
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
	if (fee == null) {
		if (other.fee != null)
			return false;
	} else if (!fee.equals(other.fee))
		return false;
	if (id != other.id)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	return true;
}
public int compareTo(Student o) {
	
	return this.getId()-o.getId();
}
}
