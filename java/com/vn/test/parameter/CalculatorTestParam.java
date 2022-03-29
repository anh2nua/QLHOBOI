package com.vn.test.parameter;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.vn.parameters.Calculator;

@RunWith(Parameterized.class)
public class CalculatorTestParam {
	@Parameterized.Parameters
	public static Collection input() {
		return Arrays.asList(new Object[][] { { 1, 2, "-", -1 }, { 1, 2, "-", -1 }, { 1, 2, "-", -1 } });
	}

	public float a;
	public float b;
	public String action;
	public float expect;
public Calculator calculator = new Calculator();
	public CalculatorTestParam (float a, float b, String action, float expect) {
		Calculator calculator = new Calculator();
		this.a = a;
		this.b = b;
		this.action = action;
		this.expect = expect;
		
	}
@Test
public void test() {
	float acture = calculator.calculator(a, b, action);
			assertTrue(this.expect == acture);
}
}
