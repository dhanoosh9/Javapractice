package sample.thiskeyword;

public class ThisDemo {
	
	int x = 30;
	int y = 40;
	String s = "ABCD";
	
	public ThisDemo(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public void getData() {

		System.out.println(x+y);
		System.out.println(this.x+this.y);

	}
	
	public static void main(String[] args) {
		ThisDemo tk = new ThisDemo(8,5);
		tk.getData();
		
	}
	
}
