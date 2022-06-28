package sample.superkeyword;

public class Parent {
	
	String empName = "Tom";
	int empNo = 4557;
	
	public Parent() {
		System.out.println("No argument constructor");
	}
	
	public Parent(int i) {
		System.out.println("Integer constructor");
	}
	
	public void getData() {
		System.out.println(empName);
		System.out.println(empNo);
	}
	
}
