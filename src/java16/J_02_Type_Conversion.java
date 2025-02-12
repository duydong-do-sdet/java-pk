package java16;

public class J_02_Type_Conversion {

	public static void main(String[] args) {
		// String to Primitive Type
		String price1 = "$10", price2 = "$20";

		int num1 = Integer.parseInt(price1.replace("$", ""));
		int num2 = Integer.parseInt(price2.replace("$", ""));

		System.out.println(price1 + price2);
		System.out.println(num1 + num2);

		// Primitive Type to String
		int iNum1 = 13, iNum2 = 10;

		String s1 = String.valueOf(iNum1);
		String s2 = String.valueOf(iNum2);

		System.out.println(iNum1 + iNum2);
		System.out.println(s1 + s2);
	}

}
