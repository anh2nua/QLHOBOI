package com.vn.test.exceptions;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.junit.rules.ExpectedException;

import com.vn.exceptions.GetItemFromArray;

public class ErrorCollectorDemo {

	
	@Rule
	public ErrorCollector collector = new ErrorCollector();
	
	@Test()
	public void tc_excep_null_001() {
		collector.addError(new Throwable("First line have an error"));
		collector.addError(new Throwable("Second line have an error"));
		try {
			assertEquals("a", "b");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
