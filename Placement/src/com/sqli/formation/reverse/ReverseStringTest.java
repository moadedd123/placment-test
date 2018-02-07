package com.sqli.formation.reverse;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseStringTest {

	@Test
	public void should_return_321_when_123() {
		ReverseString reverseString = new ReverseString();
		assertEquals("321", reverseString.reverseString("123"));
	}

}
