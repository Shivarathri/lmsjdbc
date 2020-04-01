/*class A{
 * 	class B{
 * 
 * 	}
 * }
 * 
 * to access B or to create B instace
 * A a = new A();
 * A.B b = a.new B();
 * 
 * for static class B i.e., static class B{
 * }
 * 
 * A.B b = new B();
 * 
 * 
 */



package practice.innerclass;

public class TestA {
	public static void main(String[] args) {
		 Age oj1 = new Age() { 
	            @Override
	            public void getAge() { 
	                 // printing  age 
	                System.out.print("Age is "+x); 
	            } 
	        }; 
	        oj1.getAge(); 
	}
}
