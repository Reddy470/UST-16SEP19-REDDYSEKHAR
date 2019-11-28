
public class Student {
	String name;
	int eid;
	String  branch;
	int age;
	long mobilenum;

	public Student(String name,int eid,String  branch,int age,long mobilenum) {
		this.name = name;
		this.eid =  eid;
		this.branch= branch;
		this.age = age;
		this.mobilenum = mobilenum;

	}

	void printDetails() {
		System.out.println("Student name is " +name);
		System.out.println("Student eid is " +eid);
		System.out.println("Student branch is " +branch);
		System.out.println("Student age is" +age);
		System.out.println("Student mobilenum " +mobilenum);

	}
	public static void main(String[] args) {
		Student s = new Student("reddy",470,"ece",22,9100);
		Student s1 = new Student("sekhar",476,"cse",21,169154);
		Student s2 = new Student("susmi",493,"eceb",20,897800);
		Student s3 = new Student("navvu",457,"ece ",23,787878);
		Student s4 = new Student("deva",409,"ece a",24,989898);
		Student s5 = new Student("viswa",422,"eceb",24,656565);
		Student s6 = new Student("durga",414,"ece",19,720777);
		Student s7 = new Student("yoga",345,"eee",22,9898986);
		Student s8 = new Student("mohan",422,"bsc",18,850555);
		Student s9 = new Student("ram",47,"csc",18,967668);
		s.printDetails();
		System.out.println("**********");
		s1.printDetails();
		System.out.println("************");
		s2.printDetails();
		System.out.println("************");
		s3.printDetails();
		System.out.println("************");
		s4.printDetails();
		System.out.println("************");
		s5.printDetails();
		System.out.println("************");
		s6.printDetails();
		System.out.println("************");
		s7.printDetails();
		System.out.println("************");
		s8.printDetails();
		System.out.println("************");
		s9.printDetails();
		






	}
}
