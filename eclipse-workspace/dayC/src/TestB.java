
public class TestB {
	public static void main(String[] args) {
		
		Student s = new Student();
		s.name = "Shalini";
		s.age = 22;
		s.height = 5.2;
		s.walk();
		s.display();
		
		Student b = new Student();
		b.name = "Soumya";
		b.age = 21;
		b.height = 5.4;
		b.walk();
		b.display();
		
		System.out.println(b.name);
	}
}
