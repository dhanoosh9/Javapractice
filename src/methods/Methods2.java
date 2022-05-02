package methods;

public class Methods2 {
	
	public static void oddNumber(int num) {
		if(num % 2 != 0) {
			System.out.println("The given number is a odd number");
		} else {
			System.out.println("The given number is a even number");
		}
	}
	
	public void divisible_by_two(int num) {
		if(num % 2 == 0) {
			System.out.println("The given number is divisble by 2");
		} else {
			System.out.println("The given number is not divisible by 2");
		}
	}
	
	public static void main(String[] args) {
		
		oddNumber(1);
		oddNumber(2);
		System.out.println();
		Methods2 two = new Methods2();
		two.divisible_by_two(4);
		two.divisible_by_two(3);
		
	}
	
}
