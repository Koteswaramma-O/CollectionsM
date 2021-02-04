package collections;

public class EmployeeMain {
	String empName;
	String empId;
	int age;

	EmployeeMain(String empName, String empId, int age) {
		this.empName = empName;
		this.empId = empId;
		this.age = age;
	}

	public String toString() {
		return " " + empName + " " + empId + " " + age;
	}

}
