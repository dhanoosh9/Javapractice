package sample.loops;

public class WhileLoop {
	
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
		
	}
	
}
