
public class TestG {
public static void main(String[] args) {
	FirstGen f = new FirstGen();
	f.msg();
	f.call();
	System.out.println("*****************");
	
	SecondGen s = new SecondGen();
	s.call();
	s.msg();
	s.games();
	
	System.out.println("******************");
	
	ThirdGen th= new ThirdGen();
	th.msg();
	th.call();
	th.camera();
	th.games();
}
}
