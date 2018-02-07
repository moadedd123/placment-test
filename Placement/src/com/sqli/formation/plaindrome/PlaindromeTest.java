package com.sqli.formation.plaindrome;

import static org.junit.Assert.*;

import org.junit.Test;

public class PlaindromeTest {

	@Test
	public void should_true_when_121() {
		Plaindrome plaindrome = new Plaindrome();
		String phrase = "121";
		assertTrue(plaindrome.isPlaindrome(phrase));
	}
	
	@Test
	public void should_false_when_123() {
		Plaindrome plaindrome = new Plaindrome();
		String phrase = "123";
		assertEquals(false, (plaindrome.isPlaindrome(phrase)));
	}

}
