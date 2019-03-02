 package com.regnant;

public class Studentdetails {
	public static void main(String[] args) {
		
		Detail student = new Detail();
		student.name= "Vamsi";
	    student.Id= 252;
	    System.out.println("Student Name: "+ student.name);
		System.out.println("ID no.      : "+ student.Id);
		System.out.println("Branch      : "+ Detail.Branch);
		System.out.println("College Name: "+ Detail.collegeName);
		
		Detail student1 = new Detail();
		student1.name= "Praveen";
	    student1.Id= 250;
	    System.out.println( );
		System.out.println("Student Name: "+ student1.name);
		System.out.println("ID no.      : "+ student1.Id);
		System.out.println("Branch      : "+ Detail.Branch);
		System.out.println("College Name: "+ Detail.collegeName);
		
	}

}
