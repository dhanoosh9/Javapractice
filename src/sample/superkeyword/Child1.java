package sample.superkeyword;

public class Child1 extends Parent1 {
	
	public Child1() {
		super();
	}
	
	public static void main(String[] args) {
		Child1 c = new Child1();
		c.data();
	}
	
	public void data() {
		super.data();
		System.out.println(super.name);
	}

}
