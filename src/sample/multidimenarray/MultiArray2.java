package sample.multidimenarray;

public class MultiArray2 {
	
	String[][] programming_languages = new String[2][3];
	
	public static void main(String[] args) {
		
		MultiArray2 p = new MultiArray2();
		
		p.programming_languages[0][0] = "C";
		p.programming_languages[0][1] = "C++";
		p.programming_languages[0][2] = "Java";
		
		p.programming_languages[1][0] = "Python";
		p.programming_languages[1][1] = "Ruby";
		p.programming_languages[1][2] = "GO";
		
//		for(String program : p.programming_languages[0]) {
//			for(String programs : p.programming_languages[1]) {
//				System.out.println(programs);
//			}
//			
//		}
		
		for(int i=0;i<p.programming_languages.length;i++) {
			for(int j=0;j<p.programming_languages[i].length;j++) {
				System.out.println(p.programming_languages[i][j]);
			}
		}
		
	}
	
}
