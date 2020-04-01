
public class ElectricBike implements Cycle, Battery {
	public void move() {
		System.out.println("I am Move");
	}
	
	public void charge() {
		System.out.println("I am Charge");
	}
	
	public void run() {
		System.out.println("I am Run");
	}
}
