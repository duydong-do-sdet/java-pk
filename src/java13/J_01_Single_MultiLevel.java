package java13;

class A {
	void methodA() {
		System.out.println("Class A");
	}
}

class B extends A {
	void methodB() {
		System.out.println("Class B");
	}
}

class C extends B {
	void methodC() {
		System.out.println("Class C");
	}
}

public class J_01_Single_MultiLevel {

	public static void main(String[] args) {
		A objA = new A();
		objA.methodA();

		B objB = new B();
		objB.methodA();
		objB.methodB();

		C objC = new C();
		objC.methodA();
		objC.methodB();
		objC.methodC();
	}

}
