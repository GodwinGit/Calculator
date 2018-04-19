package com.qa.calculator;

import org.junit.Assert;
import org.junit.Test;

public class MultiplierTest {
	
	private Multiplier multiply;

	@Test
	public void test() {
		multiply = new Multiplier();
		int expectedValue = 25;
		int actualValue = Multiplier.multiply(5,5);
		Assert.assertEquals(expectedValue, actualValue);
	}

}
