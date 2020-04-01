/*
 * Predicate Chaining
 */

package practice.predicate;

import java.util.function.Predicate;

public class TestB {
	static void pred(int number, Predicate<Integer> predicate) 
	{ 
		if (predicate.test(number)) { 
			System.out.println("Number " + number); 
		} 
	} 
	static void example(double i, Predicate<Double> data) 
	{ 
		if (data.test(i)) { 
			System.out.println("Number " + i); 
		} 
	} 
	public static void main(String[] args) 
	{ 
		pred(10, (i) -> i > 7); 
		example(25, (j) -> j < 10);
	} 
}
