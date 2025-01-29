package java09;

public class J_02_Object {

	public static void main(String[] args) {
		J_01_Class obj1 = new J_01_Class();
		obj1.id = 01;
		obj1.name = "Dong";
		obj1.job = "SDET";
		obj1.info();

		J_01_Class obj2 = new J_01_Class();
		obj2.id = 02;
		obj2.name = "Joey";
		obj2.job = "QAE";
		obj2.info();
	}

}
