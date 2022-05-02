package relationaloperators;

import java.util.Scanner;

public class RelationalOperators {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int num1 = scanner.nextInt();
		System.out.println("Enter any number: ");
		int num2 = scanner.nextInt();
		
		if(num1 >= num2) {
			System.out.println("The greatest number is: " + num1);
		} else {
			System.out.println("The greatest number is: " + num2);
		}
		scanner.close();
	}
	
}
