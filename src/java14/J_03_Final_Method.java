package java14;

class Parent_Final_Method {
	final void method() {
		System.out.println("Parent - Final method");
	}
}

class Child_Final_Method extends Parent_Final_Method {
	// * Error: Cannot override a final method
	// void method() {}
}

public class J_03_Final_Method {

	public static void main(String[] args) {
		Child_Final_Method obj = new Child_Final_Method();
		obj.method();
	}

}
