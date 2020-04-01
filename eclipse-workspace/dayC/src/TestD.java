
public class TestD {
	public static void main(String[] args) {
		Demo.count=1;
		Demo.eat();
		
		//System.out.println("Im a Static Count "+Demo.count);
		
		Demo a =  new Demo();
		a.size= 5;
		a.move();
		
		//System.out.println("Im a Non-Static size = "+a.size);
		
		Demo b = new Demo();
		b.size = 6;
		b.move();
		
		//System.out.println("Im a Non-Static size = "+b.size);
	}
}
