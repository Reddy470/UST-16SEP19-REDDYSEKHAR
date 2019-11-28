
public class TestD {
public static void main(String[] args) {
	Btm b =  new Btm();
	b.swipe();
	int count = b.getCount();
	System.out.println("Count is "+count);
	int totalcount =b.getCount();
	System.out.println("Total count is"+totalcount);
}
}
