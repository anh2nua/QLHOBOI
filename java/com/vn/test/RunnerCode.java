package com.vn.test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class RunnerCode {
 public static void main(String[] args) {
	Result result = JUnitCore.runClasses(TestFixture.class);

	System.out.println("Result :" + result.wasSuccessful());
 
 }
}
