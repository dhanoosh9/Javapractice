package sample.encapsulation;


public class Encap2 {
	
	private String name = "Blah";
	
	public static void main(String[] args) {
		
		Encap2 e = new Encap2();
		e.getname();
		e.setname("dhanoosh");
		e.getname();
		
	}
	
	public void getname() {
		System.out.println(name);
	}
	
	public void setname(String name) {
		this.name = name;
	}
	
	
}
