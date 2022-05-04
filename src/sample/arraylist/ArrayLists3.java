package sample.arraylist;

import java.util.ArrayList;

public class ArrayLists3 {
	
	public static void main(String[] args) {
		
		ArrayList<String> foods = new ArrayList<String>();
		
		foods.add("Biryani");
		foods.add("Ice cream");
		foods.add("Chapathi");
		foods.add("Samosa");
		
		for(String food : foods) {
			System.out.println(food);
		}
		
		foods.forEach(food -> 
			food.replace("Chapathi", "Parota")
				);
		System.out.println(foods.get(2));
	}
	
}
