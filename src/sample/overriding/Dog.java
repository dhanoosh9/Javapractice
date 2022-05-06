package sample.overriding;

public class Dog extends Animal{
	
	public void makeSound() {
		System.out.println("Bow Bow");
	}
	
	public static void main(String[] args) {
		
		Dog d = new Dog();
		d.makeSound();
		
		Cat c = new Cat();
		c.makeSound();
		
	}
}

class Cat extends Animal{
	
	public void makeSound() {
		System.out.println("Meow Meow");
	}
	
}