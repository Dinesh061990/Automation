package constructor;

public class EmployeeConstructor {
	int id;
	String name;
	int Perhour = 100;
	int PerDay = 1000;
	int Day = 1;
	int hours = 24;

	EmployeeConstructor(int empID, String empname) {
		this.id = empID;
		this.name = empname;
	}

	public int empSalary() {
		
		return (Perhour * hours);
		
		
	}

	public int empSalary1() {
		
		return (Day * PerDay);
	}

	void info() {
		System.out.println("Emp ID :" + id + "Emp Name : " + name);
	}

	public static void main(String[] args) {
		EmployeeConstructor Obj = new EmployeeConstructor(1, "Dinesh");
		EmployeeConstructor Obj1 = new EmployeeConstructor(2, "nanda");
		Obj.info();
		System.out.println(Obj.empSalary());
		Obj1.info();
		System.out.println(Obj.empSalary1());
		
	}
}
