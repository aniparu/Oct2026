package org.sample;


public  class EmployeeDetails {

	public  void empId() {
		System.out.println("employee id 35435");
	}

	private void empName() {
		System.out.println("employee name hari");
	}

	private void empCity() {
		System.out.println("employee city chennai");
	}
	
	public static void main(String[] args) {
		
		EmployeeDetails  e = new EmployeeDetails();
		e.empCity();
		e.empName();
		
	}

	
}
