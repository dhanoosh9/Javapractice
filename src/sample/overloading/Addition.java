package sample.overloading;

public class Addition {
	
	public static void add(int a, int b) {
		System.out.println(a + b);
	}
	
	public static void add(float a, float b) {
		System.out.println(a + b);
	}
	
	public static void main(String[] args) {
		add(7,5);
		add(7.5f,8.5f);
	}
	
}
