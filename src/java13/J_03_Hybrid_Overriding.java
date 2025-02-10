package java13;

class CA {
	void methodA() {
		System.out.println("Method A");
	}
}

interface IB {
	void methodB();
}

interface IC {
	void methodC();
}

class CD extends CA implements IB, IC {

	@Override
	void methodA() {
		System.out.println("Overriding - Method A");
	}

	// Overloading
	void methodA(String value) {
		System.out.println("Overloading - " + value);
	}

	@Override
	public void methodB() {
		System.out.println("Overriding - Method B");
	}

	@Override
	public void methodC() {
		System.out.println("Overriding - Method C");
	}

}

public class J_03_Hybrid_Overriding {

	public static void main(String[] args) {
		CD obj = new CD();
		obj.methodA();
		obj.methodA("Method A");
		obj.methodB();
		obj.methodC();
	}

}
