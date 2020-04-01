/*
 * Anonymous Inner class that defines inside method/constructor argument
 */
package practice.innerclass;

public class TestD {
	public static void main(String[] args) {
		//Here we are using Anonymous Inner class 
        //that define inside argument, here constructor argument 
        Thread t = new Thread(new Runnable() 
        { 
            public void run() 
            { 
                System.out.println("Child Thread"); 
            } 
        }); 
          
        t.start(); 
          
        System.out.println("Main Thread"); 
	}
}
