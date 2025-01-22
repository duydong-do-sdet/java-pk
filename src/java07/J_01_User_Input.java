package java07;

import java.util.Scanner;

public class J_01_User_Input {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter an integer number:");
		int iNum = sc.nextInt();

		System.out.println("Enter a decimal number:");
		double dNum = sc.nextDouble();

		System.out.println(iNum + dNum);

		System.out.println("Enter a word:");
		String text = sc.next();
		System.out.println(text);

		sc.close();
	}

}
