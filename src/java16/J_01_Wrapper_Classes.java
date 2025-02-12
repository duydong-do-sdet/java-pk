package java16;

public class J_01_Wrapper_Classes {

	public static void main(String[] args) {
		// Autoboxing - Primitive Type to Object
		int i = 10;
		Integer iObj = i;

		System.out.println(iObj.intValue());

		// Unboxing - Object to Primitive Type
		Character cObj = 'D';
		char c = cObj;

		System.out.println(c);
	}

}
