package org.demo;

public class Child implements  Parent2,Parent1{

	@Override
	public void test1() {
		System.out.println("test 1");
	}

	@Override
	public void test2() {
		System.out.println("test 2");
	}

	@Override
	public void test3() {
		System.out.println("test 3");
	}

	@Override
	public void test4() {
		System.out.println("test 4");
	}

	@Override
	public void test5() {
		System.out.println("test 5");
	}
	
	public static void main(String[] args) {
		Child  c = new Child();
		c.test1();
		c.test2();
		c.test3();
		c.test4();
		c.test5();
		
	}

}
