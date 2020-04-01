//GenOne, GenTwo, GenThree
public class Phone {
	public static void main(String[] args) {
		
		System.out.println("*****Third Generation*****");
		
		GenThree g = new GenThree();
		g.docall();
		g.msg();
		g.music();
		g.camera();
		
		System.out.println("*****Second Generation*****");

		GenTwo t = new GenTwo();
		t.docall();
		t.msg();
		t.music();
		
		System.out.println("*****First Generation*****");
		
		GenOne o = new GenOne();
		o.docall();
		o.msg();
	}
}
