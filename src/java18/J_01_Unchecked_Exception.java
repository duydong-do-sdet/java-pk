package java18;

import java.util.Scanner;

public class J_01_Unchecked_Exception {

	public static void main(String[] args) {
		System.out.println("Start");

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a number");

		int number = scanner.nextInt();

		try {
			System.out.println("100 : " + number + " = " + (100 / number));
		} catch (Exception e) {
			System.out.println("Error: '" + e.getMessage() + "'");
		} finally {
			System.out.println("Verified");
		}

		scanner.close();

		System.out.println("Completed");
	}

}
