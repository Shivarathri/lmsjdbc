
public class Pattern3 {
	public static void main(String[] args) {
		int stars=4;
		int space=1;
		for(int i = 1; i<=5; i++) {
			for(int j =1; j<=space; j++) {
				 
					System.out.print(" ");
				}
				for(int k =1; k<=stars; k++) {
						System.out.print("*");
					
				}
			}
			System.out.println( );
			space--;
			stars+=2;
		}
	}

