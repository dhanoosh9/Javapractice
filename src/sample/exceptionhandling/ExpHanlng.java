package sample.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExpHanlng {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		try {
			
			System.out.println("Enter a number: ");
			int a = scanner.nextInt();
			
			if(a % 2 == 0) {
				System.out.println("The given number is even");
			} else {
				System.out.println("The given number is odd");
			}
			
		} catch(InputMismatchException | InstantiationError e) {
			//System.out.println(e.getCause());
			System.out.println("Please enter a integer value");
			
		}
		
		scanner.close();
	}
	
}
