package sample.overriding;

public class OverRiding2 extends OverRiding {

	public void data() {
		System.out.println("engo");
	}
	
	public static void main(String[] args) {
		OverRiding2 over = new OverRiding2();
		over.data();
	}
	
}
