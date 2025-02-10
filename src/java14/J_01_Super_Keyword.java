package java14;

class Parent {
	String variable = "Parent - Variable";

	Parent() {
		System.out.println("Parent - Constructor");
	}

	void method() {
		System.out.println("Parent - Method");
	}
}

class Child extends Parent {
	String variable = "Child - Variable";

	Child() {
		super();
		System.out.println("Child - Constructor");
	}

	void method() {
		super.method();
		System.out.println("Child - Method");
	}

	void displayVar() {
		System.out.println(super.variable);
		System.out.println(variable);
	}
}

public class J_01_Super_Keyword {

	public static void main(String[] args) {
		Child obj = new Child();
		obj.method();
		obj.displayVar();
	}

}
