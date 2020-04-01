
public class TestG {
	public static void main(String[] args) {
		Student s = new Student();
		Chips k = new Kurkure();
		s.eatSnacks(k);
		
		Chips l = new Lays();
		s.eatSnacks(l);
	}
}
