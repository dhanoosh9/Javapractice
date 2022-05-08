package sample.array;

public class Array3 {
	
	public static void main(String[] args) {
		
		char[] vowels = new char[5];
		
		vowels[0] = 'a';
		vowels[1] = 'e';
		vowels[2] = 'i';
		vowels[3] = 'o';
		vowels[4] = 'u';
		
		for(int i=0;i<5;i++) {
			System.out.println("The vowels are: "+vowels[i]);
		}
	}
	
}
