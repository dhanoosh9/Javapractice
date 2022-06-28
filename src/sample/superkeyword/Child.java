package sample.superkeyword;

public class Child extends Parent {

	String empName = "Andy";
	int empNo = 3226;

	public Child() {
		super(1);
	}

	public void getData() {
		super.getData();

		System.out.println(super.empName);
		System.out.println(empNo);
	}

	public static void main(String[] args) {
		Child c = new Child();
		c.getData();
	}

}
