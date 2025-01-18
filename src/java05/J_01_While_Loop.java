package java05;

public class J_01_While_Loop {

	public static void main(String[] args) {
		int number = 1;

		// while
		while (number <= 10) {
			if (number % 2 == 0) {
				System.out.println(number);
			}
			number++;
		}

		// do-while
		do {
			System.out.println(number);
			number--;
		} while (number > 0);
	}

}
