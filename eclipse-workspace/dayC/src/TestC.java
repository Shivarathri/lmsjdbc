
public class TestC {
	public static void main(String[] args) {
		Car c = new Car();
		c.reg_no = "TS03AE8765";
		c.cost =878000.09;
		c.color = "Red";
		c.move();
		c.stop();
		c.display();
		
		/*System.out.println("RegNo is "+c.reg_no);
		System.out.println("Cost is "+c.cost);
		System.out.println("Color is "+c.color);*/
	}
}
