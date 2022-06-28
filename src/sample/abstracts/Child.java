package sample.abstracts;

public class Child extends Abstract{

	@Override
	public void addition(int a, int b) {
		System.out.println(a+b);
	}

	@Override
	public void multiplication(int a, int b) {
		System.out.println(a * b);
	}

	@Override
	public void division() {
		System.out.println("divide");
	}

	public static void main(String[] args) {
		Child c = new Child();
		c.addition(10,5);
		c.multiplication(5, 6);
		c.division();
	}

}
