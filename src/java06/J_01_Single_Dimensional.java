package java06;

import java.util.Arrays;

public class J_01_Single_Dimensional {

	public static void main(String[] args) {
		// #1
		int[] numbers = new int[6];

		numbers[0] = 13;
		numbers[1] = 10;
		numbers[2] = 97;
		numbers[3] = 21;
		numbers[4] = 1;
		numbers[5] = 25;

		System.out.println("-Length: " + numbers.length);

		System.out.println("-Value by index: " + numbers[1]);

		System.out.println("-All values: " + Arrays.toString(numbers));

		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

		// #2
		String[] courses = { "Java", "Selenium", "TestNG", "Framework" };

		System.out.println("-Length: " + courses.length);

		System.out.println("-Value by index: " + courses[3]);

		System.out.println("-All values: " + Arrays.toString(courses));

		for (String course : courses) {
			System.out.println(course);
		}
	}

}
