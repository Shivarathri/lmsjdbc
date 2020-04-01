
public class Loops {
	public static void main(String[] args) {

		System.out.println("******for loop*****");

		for(int i = 0; i<6;i++) {
			System.out.println(i);
		}

		System.out.println("****** do while loop******");

		int j = 6;
		do {
			System.out.println(j);
			j--;
		}while(j>=1);

		System.out.println("****while loop*****");

		int k = 5;

		while(k<10) {
			System.out.println(k);
			k++;
		}

		/*for(int j = 6; j>=1; j--) {
			System.out.println(j);
		}*/
	}

}
