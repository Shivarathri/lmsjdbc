
public class TestF {
	static void p() {
		System.out.println("pie");
		p();
	}
	
	public static void main(String[] args) {
		p();
	}
}
