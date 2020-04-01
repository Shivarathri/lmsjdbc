
public class TestE {
	public static void main(String[] args) {
		Card ap = new Card();
		ap.swipe();
		ap.swipe();
		
		Card dl = new Card();
		dl.swipe();
		dl.swipe();
		
		Card mh = new Card();
		mh.swipe();
		
		System.out.println("Ap is "+ap.count);
		System.out.println("Dl is "+dl.count);
		System.out.println("Mh is "+mh.count);
		System.out.println("Total is "+Card.total);
	}
}
