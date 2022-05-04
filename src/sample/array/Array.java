package sample.array;

public class Array {
	
	private static String names[] = new String[4];
	
	public static void main(String[] args) {
		
		names[0] = "FootBall";
		names[1] = "VolleyBall";
		names[2] = "CricketBall";
		names[3] = "BaseBall";
		
		System.out.println(names[1]);
		
		for(int i=0;i<names.length;i++) {
			System.out.println("I'm playing with:"+names[i]);
		}
		
		int age[] = new int[5];
		
		age[0] = 10;
		age[1] = 20;
		age[2] = 30;
		age[3] = 40;
		age[4] = 50;
		
		int j = 0;
		
		while(age.length > j) {
			System.out.println(age[j]);
			j++;
		}
		
	}
	
}
