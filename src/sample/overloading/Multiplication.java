package sample.overloading;

public class Multiplication {
	
	public static void multiply(int a, int b) {
		
		System.out.println(a * b);
		
	}
	
	public static void multiply(int a, int b, int c) {
		
		System.out.println(a * b * c);
		
	}
	
	public static void main(String[] args) {
		
		multiply(5, 6);
		multiply(7, 8, 9);
		
	}
	
}
