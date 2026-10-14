package org.demo;

import org.sample.EmployeeDetails;

public class CompanyDetails  extends EmployeeDetails{
	
	public void comName() {
		System.out.println("Company name vino");
	}
	
	private void comLocation() {
		System.out.println("company location chennai");
	}
	
	public static void main(String[] args) {
		
		CompanyDetails  c = new CompanyDetails();
		c.comLocation();
		c.comName();
		
		
		EmployeeDetails   e = new EmployeeDetails();
		
		
	}


}
