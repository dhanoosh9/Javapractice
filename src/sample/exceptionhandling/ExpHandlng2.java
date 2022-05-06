package sample.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExpHandlng2 {
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		
		try {
			
			int a = scanner.nextInt();
			System.out.println("Enter a number: ");
			int b = scanner.nextInt();
			
			System.out.println("The addition of given two numbers is: " + a + b);
			
		}
		catch(InputMismatchException | IllegalAccessError e) {
			System.out.println("Please enter integer values only");
		}
		
		scanner.close();
		
	}
	
}
