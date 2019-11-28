
public class Employee1 {
	String name;
	int eid;
	public Employee1(String name, int  eid) {
		this.name = name ;
		this.eid = eid;
	}
	void printDetails() {
		System.out.println("Employee name is " +name);
		System.out.println("Employee eid is " +eid);
		this.sayHello();
	}
	void sayHello() {
		System.out.println("Hello " +name+ " Welocome  to UST gloabal company");
	}
	public static void main(String[] args) {
		Employee1 e1 = new Employee1("anu",143);
		e1.printDetails();
		Employee1 e2 = new Employee1("kajal",243);
		e2.printDetails();
		Employee1 e3 = new Employee1("samantha",343);
		e3.printDetails();
		
	}
}
