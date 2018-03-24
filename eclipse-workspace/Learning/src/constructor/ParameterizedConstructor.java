package constructor;

public class ParameterizedConstructor {
	int Empid;
	String Empname;

	ParameterizedConstructor(int id, String name) {
		this.Empid = id;
		this.Empname = name;
	}

	void info() {
		System.out.println("id " + Empid +   " name :" + Empname);
	}

	public static void main(String[] args) {

		ParameterizedConstructor obj = new ParameterizedConstructor(105425, "Nanda");
		ParameterizedConstructor obj1 = new ParameterizedConstructor(105426, "Raja");
		ParameterizedConstructor obj2 = new ParameterizedConstructor(105427, "Guru");
		obj.info();
		obj1.info();
		obj2.info();
	}

}
