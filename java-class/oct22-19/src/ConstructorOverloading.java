
public class ConstructorOverloading {
	String name;
	int eid;
	long aadharno;
	 ConstructorOverloading(String name, int eid, long aadharno) {
		this.name = name;
		this.eid = eid;
		this.aadharno = aadharno;
	}
	ConstructorOverloading(String name, int eid) {
		this.name = name;
		this.eid = eid;
	}
	 ConstructorOverloading(int eid,String name) {
		this.name = name;
		this.eid = eid;
	}
	 void display() {
		 System.out.println(" Hi " +name+ " welcome to UST Global ");
	 }
public static void main(String[] args) {
	ConstructorOverloading c1 = new ConstructorOverloading(111,"bhavya");
	ConstructorOverloading c2 = new ConstructorOverloading("divya",222);
	ConstructorOverloading c3 = new ConstructorOverloading("priya",678,34456734);
	c1.display();
	c2.display();
	c3.display();
}
}
