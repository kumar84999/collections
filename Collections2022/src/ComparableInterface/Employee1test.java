package ComparableInterface;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee1test {
	
	public static void main(String[] args) {
		List<Employee1> employee1=new ArrayList<>();
		
		employee1.add(new Employee1(1010,"kumar",10000,LocalDate.of(2023, 04, 20)));
		employee1.add(new Employee1(1011, "sweety",120000, LocalDate.of(2023, 05, 10)));
		employee1.add(new Employee1(1013, "chinnu", 200000,LocalDate.of(2039, 07, 25)));
		
		
		System.out.println("Employee(Before sorting") ;
		
		for (int i=0; i<employee1.size(); i++) {
			System.out.println("id             :" +employee1.get(i).getId());
			System.out.println("name           :"+employee1.get(i).getName());
			System.out.println("salary         :"+employee1.get(i).getSalary());
			System.out.println("joiningDate    :"+employee1.get(i).getJoiningdate());
			System.out.println("----------------------------------");
		}
			Collections.sort(employee1);
			System.out.println("\nEmployee(After sorting) :");
			
			for(int i=0; i <employee1.size();i++) {
				System.out.println("id          :"+ employee1.get(i).getId());
				System.out.println("name        :"+ employee1.get(i).getName());
				System.out.println("salary      :"+ employee1.get(i).getSalary());
				System.out.println("joiningdate :"+ employee1.get(i).getJoiningdate());
				System.out.println("---------------------------------");
			
			
	}

	
	}

	}


