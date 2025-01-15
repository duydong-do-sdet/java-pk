package java03;

public class J_01_Arithmetic {

	public static void main(String[] args) {
		int a = 13, b = 10;

		System.out.println("Addition: " + (a + b));
		System.out.println("Subtraction: " + (a - b));
		System.out.println("Multiplication: " + (a * b));
		System.out.println("Division: " + (a / b));
		System.out.println("Modulus: " + (a % b));

		// Increment
		int preInc = ++a;
		System.out.println(a);
		System.out.println(preInc);

		// Decrement
		int postDec = b--;
		System.out.println(b);
		System.out.println(postDec);
	}

}
