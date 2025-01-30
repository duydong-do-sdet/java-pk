package java10;

public class MainClass {

	public static void main(String[] args) {
		// Method
		J_01_Method greeting = new J_01_Method();
		greeting.method1();
		System.out.println(greeting.method2());
		greeting.method3("Dong");
		System.out.println(greeting.method4("Joey"));

		// Constructor
		J_02_Constructor emp1 = new J_02_Constructor();
		emp1.info();

		J_02_Constructor emp2 = new J_02_Constructor(2, "Joey", "QAE");
		emp2.info();
	}

}
