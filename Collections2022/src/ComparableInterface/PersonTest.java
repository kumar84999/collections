package ComparableInterface;

public class PersonTest {
	public static void main(String[] args) {
		Person p1=new Person();
		Person p2=new Person();		
		int retval =p1.compareTo(p2);
		switch(retval) {
		case -1:{
			System.out.println("the"+((Person) p2).getName());
			break;
		}
		case 1:{
			System.out.println("the "+((Person) p1).getName());
			break;
		}
		default:
			System.out.println("the two persons are the same name");
		}
		
	}

}
