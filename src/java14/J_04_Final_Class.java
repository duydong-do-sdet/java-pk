package java14;

final class Parent_Final_Class {
	void method() {
		System.out.println("Parent - Final Class");
	}
}

// * Error: Cannot inherit from a final class
// class Child_Final_Class extends Parent_Final_Class {}

public class J_04_Final_Class {

	public static void main(String[] args) {
		Parent_Final_Class obj = new Parent_Final_Class();
		obj.method();
	}

}
