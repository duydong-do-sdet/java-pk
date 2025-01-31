package java11;

public class J_01_Overloading {

	void add(int a) {
		System.out.println(a + 21);
	}

	void add(double a) {
		System.out.println(a + 21);
	}

	void add(int a, int b) {
		System.out.println(a + b);
	}

	void add(double a, double b) {
		System.out.println(a + b);
	}

	void add(int a, double b) {
		System.out.println(a + b);
	}

	void add(double a, int b) {
		System.out.println(a + b);
	}

	public static void main(String[] args) {
		J_01_Overloading obj = new J_01_Overloading();

		obj.add(10);

		obj.add(31.1);

		obj.add(13, 10);

		obj.add(9.5, 8.7);

		obj.add(19, 17.5);

		obj.add(38.9, 12);
	}

}
