package java15;

abstract class Animal {
	String name;

	public Animal(String name) {
		this.name = name;
	}

	abstract void makeSound();

	void sleep() {
		System.out.println(name + " is sleeping.");
	}
}

class Dog extends Animal {
	public Dog(String name) {
		super(name);
	}

	@Override
	void makeSound() {
		System.out.println(name + " says Woof!");
	}
}

public class J_01_Abstract_Class {

	public static void main(String[] args) {
		Dog dog = new Dog("Murphy");
		dog.makeSound();
		dog.sleep();
	}

}
