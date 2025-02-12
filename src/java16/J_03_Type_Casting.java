package java16;

public class J_03_Type_Casting {

	public static void main(String[] args) {
		// Widening
		int iNum = 1310;
		double dNum = iNum;

		System.out.println(iNum);
		System.out.println(dNum);

		// Narrowing (Explicit)
		double numD = 9.7;
		int numI = (int) numD;

		System.out.println(numD);
		System.out.println(numI);

		int maxScore = 180;
		int userScore = 113;

		float percentage = (float) userScore / maxScore * 100;
		System.out.println(percentage);
	}

}
