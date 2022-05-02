package inheritance;

public class Bike extends Vehicle {
	
	public void engine() {
		System.out.println("Brum Brum");
	}
	
	public void horn() {
		System.out.println("Honk Honk");
	}
	
	public static void main(String[] args) {
		
		Bike b = new Bike();
		b.engine();
		b.horn();
		
	}
}
