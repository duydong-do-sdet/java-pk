package java14;

public class J_02_Final_Variable {
	final String x = "10";
	final int y;
	static final String Z = "SDET"; // Constant

	J_02_Final_Variable() {
		y = 13;
	}

	public static void main(String[] args) {
		J_02_Final_Variable obj = new J_02_Final_Variable();
		System.out.println(obj.x);
		System.out.println(obj.y);
		System.out.println(Z);
	}

}
