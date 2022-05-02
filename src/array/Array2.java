package array;

class Array2 {
	
	public static void main(String[] args) {
		
		int[] age = {12, 14, 20, 16, 30};
		
		System.out.println("My age is: " + age[0]);
		System.out.println("My age is: " + age[1]);
		System.out.println("My age is: " + age[2]);
		System.out.println("My age is: " + age[3]);
		System.out.println("My age is: " + age[4]);
		
		System.out.println();
		
		int i=0;
		do {
			System.out.println("My age is: " + age[i]);
			i++;
		} while(age.length > i);
		
	}
	
}
