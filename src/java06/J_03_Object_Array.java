package java06;

import java.util.Arrays;

public class J_03_Object_Array {

	public static void main(String[] args) {
		Object[] objArr = { "D", "SDET", 1310 };

		System.out.println("-Length: " + objArr.length);

		System.out.println("-Value by index: " + objArr[1]);

		System.out.println("-All values: " + Arrays.toString(objArr));

		for (Object obj : objArr) {
			System.out.println(obj);
		}
	}

}
