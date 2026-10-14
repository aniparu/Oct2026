package org.sample;

public class StudentDetails extends EmployeeDetails{
	
	

	public void stuName() {
		System.out.println("student name madhu");
	}

	public void stuRegNo() {
		System.out.println("student reg number:75218365136");
	}

	public static void main(String[] args) {
		StudentDetails s = new StudentDetails();
		s.stuName();
		s.stuRegNo();
	
		
	}

}
