package java13;

class Parent {
	void method() {
		System.out.println("Class Parent");
	}
}

class Child1 extends Parent {
	void method1() {
		System.out.println("Class Child 1");
	}
}

class Child2 extends Parent {
	void method2() {
		System.out.println("Class Child 2");
	}
}

public class J_02_Hierarchical {

	public static void main(String[] args) {
		Child1 obj1 = new Child1();
		obj1.method();
		obj1.method1();

		Child2 obj2 = new Child2();
		obj2.method();
		obj2.method2();
	}

}
