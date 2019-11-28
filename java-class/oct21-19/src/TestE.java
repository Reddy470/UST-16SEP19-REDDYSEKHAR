
public class TestE {
public static void main(String[] args) {
	Student.cname = "Qspiders";
	Student s1 =new Student();
	s1.name = "reddy";
	s1.usn=7;
	System.out.println("Student name is "+Student.cname);
	System.out.println("Name is"+s1.name);
	System.out.println("ID is"+s1.usn);

}
}
