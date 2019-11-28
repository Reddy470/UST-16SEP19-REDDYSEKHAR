
public class TestC {
	public static void main(String[] args) {
		Person.color ="white";
		Person.sleep();
		System.out.println("Person color "+Person.color);
		Person p = new Person();
		p.age=20;
		p.name="reddy";
		System.out.println("Person age is"+p.age);
		System.out.println("Person name is"+p.name);
		p.color= "black";
		p.sleep();
		System.out.println("*********************");

		Person p1=new Person();
		p1.age=22;
		p1.name="susmi";
		System.out.println("Person age is"+p1.age);
		System.out.println("Person name is"+p1.name);

	}

}
