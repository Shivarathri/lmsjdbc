
import java.util.Scanner;

public class TestC {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the Name");
		String name = scan.nextLine();

		System.out.println("Enter the Age");
		int age = scan.nextInt();
		System.out.println("Enter the Height");
		double height = scan.nextDouble();
		
		scan.close();

		System.out.println("Name is "+name);
		System.out.println("Age is "+age);
		System.out.println("Height is "+height);
	}
}