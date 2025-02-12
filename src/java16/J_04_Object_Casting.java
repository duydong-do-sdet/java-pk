package java16;

class Animal {
	void makeSound() {
		System.out.println("Animal makes a sound");
	}
}

class Dog extends Animal {
	void bark() {
		System.out.println("Dog barks");
	}
}

public class J_04_Object_Casting {

	public static void main(String[] args) {
		Dog dog = new Dog();

		Animal animal = dog; // Widening
		animal.makeSound();
		// animal.bark(); // * Error

		dog = (Dog) animal; // Narrowing
		dog.bark();
	}

}
