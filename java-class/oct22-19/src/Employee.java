
public class Employee {
	String name;
	int eid;
	public Employee(String ename, int  empid) {
		name = ename ;
		eid = empid;
	}
	void printDetails() {
		System.out.println("Employee name is"+name);
		System.out.println("Employee eid is"+eid);
	}
	public static void main(String[] args) {
		Employee e1 = new Employee("anu",143);
		e1.printDetails();
		Employee e2 = new Employee("rashmika",429);
		e2.printDetails();
		Employee e3 = new Employee("reddy",470);
		e3.printDetails();
	}
}
