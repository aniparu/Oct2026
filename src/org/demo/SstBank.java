package org.demo;

public class SstBank extends RbiBank{
	
	@Override
	public void credit() {
		System.out.println("credit 8%");
	}
	
	
	public static void main(String[] args) {
		
		SstBank  s = new SstBank();
		s.savings();
		s.deposit();
		s.credit();
		
	}

}
