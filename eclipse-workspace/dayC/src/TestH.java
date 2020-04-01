//Pencil, marker
public class TestH {
	public static void main(String[] args) {
		Marker m = new Marker();
		m.cost = 100;
		m.size = 6.1;
		
		System.out.println("Cost is "+m.cost);
		System.out.println("Size is "+m.size);
		
		m.write();
		m.color();
		
		Pencil p = new Pencil();
		p.cost = 50;
		p.size = 9.8;
		
		System.out.println("Cost is "+p.cost);
		System.out.println("Size is "+p.size);
		p.write();
		//p.color();
	}
}
