package GenricCustomCreation;

public class TestGeneric {

	public static void main(String[] args) {
		
		Mycreation<Integer> my = new Mycreation<Integer>(10);
		System.out.println(my.getobj());
		Mycreation<String> my1 = new Mycreation<String>("kumar");
		System.out.println(my1.getobj());
		Mycreation<Integer> my2 = new Mycreation();
		my2.add(10);
		System.out.println(my2.getobj());
		my2.add(20);
		System.out.println(my2.getobj());
		
	}

}
