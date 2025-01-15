package java03;

public class J_02_Assignment {

	public static void main(String[] args) {
		int a;
		a = 13;

		System.out.println(a); // a = 13
		System.out.println(a += 10); // a = a + 10 <=> a = 13 + 10 = 23
		System.out.println(a -= 10); // 23 - 10 = 13
		System.out.println(a *= 10); // 13 * 10 = 130
		System.out.println(a /= 10); // 130 / 10 = 13
		System.out.println(a %= 10); // 13 % 10 = 3
		System.out.println(a); // a = 3
	}

}
