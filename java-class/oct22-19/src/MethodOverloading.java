
public class MethodOverloading {
	public static int add(int a,int b) {
		System.out.println("add(int a,int b) method");
		return a + b;
	}
	public static long add(long a ,byte b) {
		System.out.println("long(int a,byte b) method");
		return a + b;
	}
	public static int add(int a ,byte b) {
		System.out.println("add(int a,byte b) method");
		return a + b;
	}
	public int multiply(int a, int b) {
		System.out.println("multiply(int a, int b)method");
		return a+b;
	}
	public int multiply(byte a, int b) {
		System.out.println("multiply(byte a, int b)method");
		return a+b;
	}
	public static void main(String[] args) {
		System.out.println("main(String[] args)");
		main(10);
		add(10, 12);
		add(12,24);
		add(98,56);
		MethodOverloading m = new MethodOverloading();
		m.multiply(10,20);
		m.multiply(12, 34);
	}
	public static void main(int a) {
		System.out.println("main(int a)method");
	}

}
