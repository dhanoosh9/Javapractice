package relationaloperators;

import java.util.Scanner;

public class OR {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the appliance name: ");
		String appliances = scanner.nextLine();
		
		if(appliances.equalsIgnoreCase("TV") || appliances.equalsIgnoreCase("Television")) {
			System.out.println("Television");
		} else if (appliances.equalsIgnoreCase("Fridge") || appliances.equalsIgnoreCase("Refrigerator")) {
			System.out.println("Fridge");
		} else if (appliances.equalsIgnoreCase("Owen") || appliances.equalsIgnoreCase("Microwave")) {
			System.out.println("Microwave");
		} else {
			System.out.println("empty");
		}
		
		scanner.close();
	}
	
}
