package com.qa.calculator;

import org.junit.Assert;
import org.junit.Test;

public class DivisionTest {
	private Division divider;

	@Test
	public void test() {
		divider = new Division();
		int expectedValue = 5;
		int actualValue =Division.divider(10,2);
		Assert.assertEquals(expectedValue, actualValue);
	}

}
