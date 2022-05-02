package arraylist;

import java.util.ArrayList;

public class ArrayLists {
	
	private static ArrayList<String> fruits = new ArrayList<String>();
	
	public static void main(String[] args) {
		
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Goa");
		fruits.add("Grapes");
		fruits.add("Pineapple");
		
		System.out.println(fruits);
		
		int i = 0;
		while(fruits.size() > i) {
			System.out.println(fruits.get(i));
			i++;
		}
		
	}
	
}
