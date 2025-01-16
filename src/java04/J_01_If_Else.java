package java04;

public class J_01_If_Else {

	public static void main(String[] args) {
		int age = 28;

		if (age >= 18) {
			System.out.println("Yes!");
		} else {
			System.out.println("No!");
		}

		int number = 1310;

		if (number % 2 == 0) {
			System.out.println("Even");
			if (number > 0) {
				System.out.println("Positive");
			} else {
				System.out.println("Negative");
			}
		} else {
			System.out.println("Odd");
			if (number > 0) {
				System.out.println("Positive");
			} else {
				System.out.println("Negative");
			}
		}
	}

}
