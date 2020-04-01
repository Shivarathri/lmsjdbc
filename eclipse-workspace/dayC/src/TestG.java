
public class TestG {
	public static void main(String[] args) {
		ScientificCal s = new ScientificCal();
		s.name = "Casio";
		s.cost = 1000;
		
		System.out.println("Name is "+s.name);
		System.out.println("Cost is "+s.cost);
		
		s.add();
		s.sub();
		s.sin();
		s.log();
	}
}
