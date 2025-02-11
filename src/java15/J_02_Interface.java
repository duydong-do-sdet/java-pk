package java15;

interface IAnimal {
	void makeSound();

	default void sleep() {
		System.out.println("Sleeping");
	}
}

class Cat implements IAnimal {
	@Override
	public void makeSound() {
		System.out.println("Meow!");
	}
}

public class J_02_Interface {

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.makeSound();
		cat.sleep();
	}

}
