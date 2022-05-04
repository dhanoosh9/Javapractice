package sample.arraylist;

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
		ArrayList<Integer> age = new ArrayList<Integer>();
		
		age.add(10);
		age.add(15);
		age.add(25);
		age.add(30);
		
		for(int j=0;j<age.size();j++) {
			System.out.println(age.get(j));
		
			
		}
		
	}
	
}
