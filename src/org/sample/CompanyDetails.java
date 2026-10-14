package org.sample;
//child 1
public class CompanyDetails extends StudentDetails {
	
	public void comName() {
		System.out.println("Company name vino");
	}
	
	public void comLocation() {
		System.out.println("company location chennai");
	}
	
	public static void main(String[] args) {
		
		CompanyDetails  c = new CompanyDetails();
		c.comLocation();
		c.comName();
		c.stuName();
		c.stuRegNo();
		
	}

}
