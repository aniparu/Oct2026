package org.demo;

public class EmployeeDetails {

	private void employee() {
		System.out.println("employee details:");
		System.out.println("==================");

	}

	private void employee(int id) {
		System.out.println("employee id:"+id);

	}

	private void employee(String name) {
		System.out.println("employee name:"+name);
	}
	
	private void employee(String city,char gender) {
		System.out.println("employee city:"+city);
		System.out.println("employee gender:"+gender);
	}
	
	private void employee(long phoneNo,float salary) {
		System.out.println("employee phoneNo:"+phoneNo);
		System.out.println("employee salary:"+salary);
	}
	
	private void employee(float weight,long accNo) {
		System.out.println("employee accNo:"+accNo);
		System.out.println("employee weight:"+weight);
	}

	public static void main(String[] args) {

		EmployeeDetails e = new EmployeeDetails();
		e.employee();
		e.employee(100);
		e.employee("hari");
		e.employee("chennai", 'f');
		e.employee(7339660927l, 43434.4f);
		e.employee(765.5f, 4764653453534l);

	}
}
