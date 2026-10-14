package org.demo;

public class Sample  extends  Employee{

	@Override
	public void empId() {
		System.out.println("625376");
	}

	@Override
	public void empPhoneNo() {
		System.out.println("7339660927");
	}
	
	public static void main(String[] args) {
		
		Sample  s = new Sample();
		s.empCity();
		s.empId();
		s.empName();
		s.empPhoneNo();
		
	}
	

}
