
public class Constructor {
	Constructor(){
		System.out.println("Constructor");
	}
	public static void main(String[] args) {
		System.out.println("main started");
		Constructor c = new Constructor();
		System.out.println("main ended");
	}

}
