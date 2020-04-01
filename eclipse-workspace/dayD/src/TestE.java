
public class TestE {
	public static void main(String[] args) {
		ElectricBike e  = new ElectricBike();
		e.move();
		e.charge();
		
		Cycle c = new ElectricBike();
		c.move();
		
		Battery b = new ElectricBike();
		b.charge();
	}
}