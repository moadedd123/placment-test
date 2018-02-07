package com.sqli.formation.sort;

import static org.junit.Assert.*;

import org.junit.Test;

public class SortArrayTest {

	@Test
	public void should_return_1234_when_4231() {
		SortArray sortArray = new SortArray();
		int[] array = {4, 2, 3, 1};
		sortArray.sortArray(array);
		assertArrayEquals(new int[]{1, 2, 3, 4}, array);
	}

}
