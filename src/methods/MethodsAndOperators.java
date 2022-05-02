package methods;



public class MethodsAndOperators {
	public static void main(String[] args) {
		add(5,6);
		System.out.println(add1(6,7));
		
		MethodsAndOperators obj = new MethodsAndOperators();
		System.out.println(obj.multiply(5, 6));
		System.out.println(obj.subtract(6, 5));
		System.out.println(obj.division(10,5));
		System.out.println(obj.division(5,10));
		
	}
	
	public static void add(int num1, int num2) {
		System.out.println(num1+num2);
	}
	
	public static int add1(int num1, int num2) {
		return num1+num2;
	}
	
	public int multiply(int num1, int num2) {
		return num1 * num2;
	}
	
	public int subtract(int num1, int num2) {
		return num1 - num2;
	}
	
	public int division(int num1, int num2) {
		return num1 / num2;
	}
	public int remainder(int num1, int num2) {
		return num1 % num2;
	}
}
