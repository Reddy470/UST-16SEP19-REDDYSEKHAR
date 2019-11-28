
public class Student {
	String name;
	int rollno;
	final String cname="Qspiders";
	final int cid;
	Student(String name,int rollno,int cid){
		this.name=name;
		this.rollno=rollno;
		this.cid= cid;

	}
	final void printDeatils() {
		System.out.println(" Hi "+ name + "welcome to "+cname);
	}
	final void printDeatils(String name) {
		System.out.println(" Hi "+ name + "welcome to "+cname);
	}

}
