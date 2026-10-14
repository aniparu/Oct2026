package org.demo;

public class AxisBank implements SbiBank {

	@Override
	public void savings() {
		System.out.println("savings 3%");
	}

	@Override
	public void deposit() {
		System.out.println("deposit 4%");
	}

	@Override
	public void credit() {
		System.out.println("credit 6%");
	}
	
	
	public static void main(String[] args) {
		
		AxisBank   a = new AxisBank();
		a.credit();
		a.deposit();
		a.savings();
		
	}

}
