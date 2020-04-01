
public class Student {
	String name;
	int age;
	double height;
	
	void walk() {
		System.out.println("I can Walk");
	}
	/*void name() {
		System.out.println(name);
	}
	void age() {
		System.out.println(age);
	}
	void height() {
		System.out.println(height);
	}*/
	
	void display() {
		System.out.println("------------------");
		System.out.println("Name is "+name);
		System.out.println("Age is "+age);
		System.out.println("Height is "+height);
		System.out.println("------------------");
	}
	
}
