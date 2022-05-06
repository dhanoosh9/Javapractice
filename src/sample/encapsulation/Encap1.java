package sample.encapsulation;

public class Encap1 {
	
	private int age = 18;
	
	public static void main(String[] args) {
		
		Encap1 e = new Encap1();
		e.getage();
		e.setage(23);
		e.getage();
	}
	
	public void getage() {
		System.out.println(age);
	}
	
	public void setage(int age) {
		this.age = age;
		
	}
	
}
