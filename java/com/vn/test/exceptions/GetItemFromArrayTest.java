package com.vn.test.exceptions;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.junit.rules.ExpectedException;

import com.vn.exceptions.GetItemFromArray;

public class GetItemFromArrayTest {
	public static GetItemFromArray arrClass;
	
	@Rule
	public ExpectedException expec = ExpectedException.none();
	
	@Rule
	public ErrorCollector collector = new ErrorCollector();
	
	@BeforeClass
	public static void beforeItem() {
		
			arrClass = new GetItemFromArray();
			
		
	}
	
	@Test(expected = NullPointerException.class)
	public void tc_excep_null_001() {
		arrClass.getItem(11);
	}
	
	

	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void tc_excep_out_of_bound_002() {
		arrClass.setArr(new int[] {1,2,3,4,5,6,7,8,9,10});
		arrClass.getItem(11);
	}
	@Test()
	public void tc_excep_error_001() {
		collector.addError(new Throwable("First line have an error"));
		collector.addError(new Throwable("Second line have an error"));
		try {
			Assert .assertEquals("a", "b");
		} catch (Exception e) {
			collector.addError(e);
		}
		System.out.println("Done!");
	}
	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void tc_excep_out_of_bound_rule_003() throws Exception {
		expec.expect(ArrayIndexOutOfBoundsException.class);
		expec.expectMessage("index invalid");
		arrClass.setArr(new int[] {1,2,3,4,5,6,7,8,9,10});
		arrClass.getItem(11);
	}
	
		
	
}
