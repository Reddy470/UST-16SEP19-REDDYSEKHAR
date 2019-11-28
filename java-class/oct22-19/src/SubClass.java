
public class SubClass extends SuperClass {
	String s = "SubClass variable";
	SubClass(){
		super();
		System.out.println("Sub Class constructor");

	}
	void getData() {
		System.out.println(s);
		System.out.println(this.s);
		System.out.println(super.s);
		super.superClassMethod();
		superClassMethod();
	}
}
