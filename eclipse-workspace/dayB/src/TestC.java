
public class TestC {
	static void gm() {
		System.out.println("Good Morning!");
		
	}
	static void hi(int a) {
		for(int i =1; i<a; i++) {
			System.out.println("Hi!");
		}
	}
	public static void main(String[] args) {
		hi(3);
		gm();
	}
}
