package sample.interfaces;

public class Cat implements Animal{
	
	public void makeSound() {
		System.out.println("My sound is meow meow");
	}
	
	public void sleep() {
		System.out.println("I am sleeping");
	}
	
	public static void main(String[] args) {
		Cat c =  new Cat();
		c.makeSound();
		c.sleep();
	}
	
}
