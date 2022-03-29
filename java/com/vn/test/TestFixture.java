package com.vn.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.vn.MyException;
import com.vn.SubClass;

public class TestFixture {

	
	@BeforeClass
	public static void beforeAllEg() {
		System.out.println("Before All");
	}
	@AfterClass
	public static void afterAllEg() {
		System.out.println("After All");
	}
	@Before
	public void beforeEach () {
		System.out.println("BeforeEach ");
	}
	@After
	public void afterEach() {
		System.out.println("AfterEach");
	}
	
	@Test(expected = ArithmeticException.class)
	public void tc01() {
		int a = 5/0;
		System.out.println("Test case 1");
	}
	@Test
	public void tc02() {
		System.out.println("Test case 2");
	}
	@Test(expected = MyException.class)
	public void tc03() throws MyException {
		SubClass subClass = new SubClass();
		
			int a = subClass.getName();
		
	}
}
