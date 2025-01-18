package java05;

public class J_03_Break_Continue {

	public static void main(String[] args) {
		// break
		for (int i = 0; i <= 10; i++) {
			if (i == 5) {
				break;
			}
			System.out.println(i);
		}

		// continue
		for (int i = 0; i <= 10; i++) {
			if (i == 5) {
				continue;
			}
			System.out.println(i);
		}
	}

}
