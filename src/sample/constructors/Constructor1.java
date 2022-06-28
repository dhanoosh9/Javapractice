package sample.constructors;

public class Constructor1 {
	
	public Constructor1() {
		System.out.println("No argument constructor");
	}
	
	public Constructor1(int i) {
		System.out.println("Integer arugument constructor");
	}
	
	public Constructor1(int i, int j) {
		System.out.println("Two Integer argument constructor");
	}
	
	public Constructor1(String s) {
		System.out.println("String argument constructor");
	}

	public static void main(String[] args) {
		Constructor1 construct = new Constructor1();
		construct.getClass();
	}

}
