package java10;

public class J_02_Constructor {
	int id;
	String name;
	String job;

	void info() {
		System.out.println("ID: " + id + " |Name: " + name + " |Job: " + job);
	}

	public J_02_Constructor() {
		id = 01;
		name = "Dong";
		job = "SDET";
	}

	public J_02_Constructor(int eId, String eName, String eJob) {
		this.id = eId;
		this.name = eName;
		this.job = eJob;
	}

}
