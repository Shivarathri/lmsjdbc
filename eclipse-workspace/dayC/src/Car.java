
public class Car {
	String reg_no;
	double cost;
	String color;
	
	void move() {
		System.out.println("Car is Moving");
	}
	
	void stop() {
		System.out.println("Car is Stopped");
	}
	
	void display() {
		System.out.println("RegNo is "+reg_no);
		System.out.println("Cost is "+cost);
		System.out.println("Color is "+color);
	}
}
