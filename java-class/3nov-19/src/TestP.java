import java.util.ArrayList;

public class TestP {
	public static void main(String[] args) 
	{ 
		
		
			ArrayList a1 = new ArrayList();
			a1.add(2);
			a1.add(20);
			a1.add(70);
			a1.add(20);
			a1.add(22.5);
			a1.add(330.4);
			a1.add(true);
			a1.add('A');
			
			
			
			
			
			for (int i = 0; i<8;i++) {
				Object obj = a1.get(i);
				System.out.println(obj);
			}
			System.out.println("++++++for each method+++++");
			
			for (Object o: a1) {
				System.out.println(o);
			}
		
	} 
} 


