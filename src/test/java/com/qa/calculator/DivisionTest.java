package com.qa.calculator;

import org.junit.Assert;
import org.junit.Test;

public class DivisionTest {
	private Division divider;

	@Test
	public void DivideTest() {
		divider = new Division();
		int expectedValue = 5;
		int actualValue = Division.divider(10,2);
			Assert.assertEquals(expectedValue, actualValue);
		
		}
		
	
	
	@Test(expected=ArithmeticException.class)
	public void ZeroTest() {
		divider = new Division();
		String expectedValue = "Error";
		int actualValue = Division.divider(10, 0);
			Assert.assertEquals(expectedValue, actualValue);
		}
		
	}


