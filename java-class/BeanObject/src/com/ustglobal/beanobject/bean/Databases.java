package com.ustglobal.beanobject.bean;

public class Databases {
	void receive(Student s) {
		System.out.println("Id is "+s.getId());
		System.out.println("Name is"+s.getName());
		System.out.println("Rollno is "+s.getRollno());
		System.out.println("*********++++***********");
	}

	
	void save(Employee e) {
		
		System.out.println("----------Im data bases-----");
		System.out.println("id is "+e.getId());
		System.out.println(" salary is "+e.getSalary());
		System.out.println(" name is "+e.getName());
		System.out.println(" dept is "+e.getDept());
		System.out.println(" desigination is"+e.getDesigination());
	}

}
