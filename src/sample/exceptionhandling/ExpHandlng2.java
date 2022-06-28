package sample.exceptionhandling;

import java.io.IOException;
//import java.util.InputMismatchException;
import java.util.Scanner;

public class ExpHandlng2 {
	
	
	public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		try {
			
			int a = scanner.nextInt();
			System.out.println("Enter a number: ");
			int b = scanner.nextInt();
			
			System.out.println("The addition of given two numbers is: " + a + b);
			
		}
		catch(Exception e) {
			System.out.println("Please enter integer values only");
			} finally {
			System.out.println("final block");
		}
		
		scanner.close();
		
	}
	
}
