package com.ustglobal.beanobject.bean;

public class TestA {
	public static void main(String[] args) {
		Student s = new Student();
		s.setId(12);
		s.setRollno(12345);
		s.setName("shivagamni");
		
		Databases db = new Databases();
		db.receive(s);
		
		Employee e = new Employee();
		e.setId(470);
		e.setSalary(25000.555);
		e.setName("reddy");
		e.setDept("developer");
		e.setDesigination("hr");
		
		System.out.println("*************");
		db.save(e);
	}

}
