package java12;

public class J_03_Static_Keyword {
	// Can be called without creating objects

	static String variable = "Static variable";

	static void method() {
		System.out.println("Static method");
	}

	public static void main(String[] args) {
		System.out.println(variable);

		method();
	}

}
