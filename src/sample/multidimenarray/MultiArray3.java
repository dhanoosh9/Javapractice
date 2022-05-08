package sample.multidimenarray;

public class MultiArray3 {
	
	public static void main(String[] args) {
		
		char[][] vowels = {{'a','e','i','o','u'},{'A','E','I','O','U'}};
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<5;j++) {
				System.out.println("The vowels are: "+vowels[i][j]);
			}
		}
		
	}
	
}
