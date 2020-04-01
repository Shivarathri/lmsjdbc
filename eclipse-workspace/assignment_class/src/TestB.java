
public class TestB {
	public static void main(String[] args) {
		Car c = new Automatic();
		c.changegear();
		c.horn();
		//c.music();
		
		Automatic d = new Automatic();
		d.changegear();
		d.horn();
		d.music();
	}
}