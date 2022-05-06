package sample.multidimenarray;

public class MultiArray {
	
	public static void main(String[] args) {
		
		String[][] foods = new String[2][2];
		
		foods[0][0] = "Biryani";
		foods[0][1] = "Chicken";
		
		foods[1][0] = "Mutton";
		foods[1][1] = "Fish";
		
		for(int i=0;i<foods.length;i++) {
			for(int j=0;j<foods[i].length;j++) {
				System.out.println(foods[i][j]);
			}
		}
		
		
	}
	
}
