package java12;

public class J_01_This_Keyword {
	int a, b;

	void setData(int a, int b) {
		this.a = a;
		this.b = b;
	}

	void method() {
		System.out.println(a * b);
	}

	public static void main(String[] args) {
		J_01_This_Keyword obj = new J_01_This_Keyword();
		obj.setData(13, 10);
		obj.method();
	}

}
