
public class TestB {
	static int a =25;
	int x;
public static void add() {
	//only final is supported
	int a;
	int b;
	a=70;
	b=93;
	System.out.println(a);
	System.out.println(b);
}
public static void main(String[] args) {
	add();
	TestB t = new TestB ();
	System.out.println("x value is"+t.x);
}
}
