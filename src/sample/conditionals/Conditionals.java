package sample.conditionals;

import java.util.Scanner;

public class Conditionals {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the ball name: ");
		String ball = scanner.nextLine();
		scanner.close();
		if(ball.equalsIgnoreCase("FootBall")) {
			System.out.println("I'm playing with football");
		} else if(ball.equalsIgnoreCase("VolleyBall")) {
			System.out.println("I'm playing with volleyball");
		} else if(ball.equalsIgnoreCase("CricketBall")) {
			System.out.println("I'm playing with cricketball");
		} else if(ball.equalsIgnoreCase("BaseBall")) {
			System.out.println("I'm playing with baseball");
		} else {
			System.out.println("I dnt know");
		}
		
	}
	
}
