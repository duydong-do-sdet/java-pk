package java12;

public class J_02_Get_And_Set {
	private int id;
	private String name;
	private String job;

	int getId() {
		return id;
	}

	void setId(int id) {
		this.id = id;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	String getJob() {
		return job;
	}

	void setJob(String job) {
		this.job = job;
	}

	void displayInfo() {
		System.out.println("ID: " + getId() + " |Name: " + getName() + " |Job: " + getJob());
	}

	public static void main(String[] args) {
		J_02_Get_And_Set obj1 = new J_02_Get_And_Set();
		obj1.setId(01);
		obj1.setName("Dong");
		obj1.setJob("SDET");
		obj1.displayInfo();

		J_02_Get_And_Set obj2 = new J_02_Get_And_Set();
		obj2.setId(02);
		obj2.setName("Joey");
		obj2.setJob("QAE");
		obj2.displayInfo();
	}

}
