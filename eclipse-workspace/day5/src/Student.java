
public class Student {
	
	int id;
	String name;
	double height;
	
	Student(int id, String name, double height){
		this.id= id;
		this.name= name;
		this.height = height;
	}
	
	
	void display() {
		System.out.println(" Id "+id);
		System.out.println(" Name "+name);
		System.out.println(" Height " +height);
	}
	
}
