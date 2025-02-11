package java15;

interface IFlyable {
	void fly();
}

abstract class Bird {
	String name;

	Bird(String name) {
		this.name = name;
	}

	abstract void makeSound();
}

class Sparrow extends Bird implements IFlyable {
	Sparrow(String name) {
		super(name);
	}

	@Override
	void makeSound() {
		System.out.println(name + " chirps.");
	}

	@Override
	public void fly() {
		System.out.println(name + " is flying.");
	}
}

public class J_03_Abstract_Class_Interface {

	public static void main(String[] args) {
		Sparrow sparrow = new Sparrow("Jack");
		sparrow.makeSound();
		sparrow.fly();
	}

}
