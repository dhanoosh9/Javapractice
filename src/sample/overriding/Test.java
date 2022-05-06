package sample.overriding;



public class Test {

	public static void main(String[] args) {
		SBI s = new SBI();
		System.out.println("SBI Rate of Interest: " + s.getRateOfInterest());
		ICICI c = new ICICI();
		System.out.println("ICICI Rate of Interest: " + c.getRateOfInterest());
		Axis a = new Axis();
		System.out.println("Axis Rate of Interest: " + a.getRateOfInterest());
	}

}


