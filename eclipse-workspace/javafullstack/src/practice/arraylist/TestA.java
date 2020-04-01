package practice.arraylist;

import java.util.ArrayList;

public class TestA {
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		System.out.println(cars);

		//to set a value
		cars.set(3, "I20");
		System.out.println(cars);

		//to remove
		cars.remove(2);
		System.out.println(cars);


		//to clear data
		cars.clear();
		System.out.println(cars);

	}
}
