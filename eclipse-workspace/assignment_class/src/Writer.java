
public class Writer {
	void recieve(Pen i) {
		System.out.println("Writer Recieved");
		i.open();
		i.write();
	}
}
