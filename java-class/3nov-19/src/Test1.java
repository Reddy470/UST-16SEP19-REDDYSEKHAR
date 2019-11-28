import java.util.ArrayList;


public class Test1 {
	public static void main(String[] args) {
			ArrayList<Student> a1 = new ArrayList<Student>();
			Student s1 = new Student(470,"Reddy","aditya","ece", 75.4);
			Student s2 = new Student(493,"sushmi","aditya","ece",85.03);
			Student s3 = new Student(457,"navvu","mits","eee",68.40);
			Student s4 = new Student(470,"sekhar","viswam","cse", 70.4);
			Student s5 = new Student(470,"chinni","chaitanaya","cvil", 78.4);


			
			a1.add(s1);
			a1.add(s2);
			a1.add(s3);
			a1.add(s4);
			a1.add(s5);
			
			
			for (int i = 0 ;i<a1.size();i++ ) {
				Student s = a1.get(i);
				System.out.println(" id " +s.id);
				System.out.println(" name " +s.name);
				System.out.println(" percentage " +s.percentage);
			}
			System.out.println("======for each=====");
			for (Student s : a1) {
				System.out.println(s);
			}
		}

	}


