package sample.encapsulation;

public class Encap3 {
	private String name;
	private int age;
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public static void main(String[] args) {
		Encap3 en = new Encap3();
		en.name="John";
		en.age=18;
		System.out.println(en.name);
		System.out.println(en.getName());
		en.setName("Luffy");
		System.out.println(en.getName());
	}
}
