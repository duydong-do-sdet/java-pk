package java06;

public class J_02_Multi_Dimensional {

	public static void main(String[] args) {
		// #1
		int[][] numbers = new int[2][3];

		numbers[0][0] = 13;
		numbers[0][1] = 10;
		numbers[0][2] = 97;
		numbers[1][0] = 21;
		numbers[1][1] = 1;
		numbers[1][2] = 25;

		System.out.println("-Number of rows: " + numbers.length);
		System.out.println("-Number of columns (By row index): " + numbers[1].length);

		System.out.println("-Single value: " + numbers[0][1]);

		System.out.println("-All values");
		for (int r = 0; r < numbers.length; r++) {
			for (int c = 0; c < numbers[r].length; c++) {
				System.out.print(numbers[r][c] + " ");
			}
			System.out.println();
		}

		// #2
		String[][] courses = { { "Java", "21" }, { "Selenium", "4" }, { "TestNG", "7" }, { "Framework", "Hybrid" } };

		System.out.println("-Number of rows: " + courses.length);
		System.out.println("-Number of columns (By row index): " + courses[1].length);

		System.out.println("-Single value: " + courses[3][0]);

		System.out.println("-All values");
		for (String[] course : courses) {
			for (String detail : course) {
				System.out.print(detail + " ");
			}
			System.out.println();
		}
	}

}
