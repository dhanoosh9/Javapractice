package sample.inheritance;

public class Dog extends Animal {
	
	public void makeSound() {
		System.out.println("My sound is bow bow");
	}
	
	public static void main(String[] args) {
		
		Dog d = new Dog();
		d.makeSound();
		
	}
}
