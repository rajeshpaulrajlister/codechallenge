package com.hobsons.codechallenge;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class TestSortOddEven {

	@Test(expected = RuntimeException.class)
	public void testSortByNullInput() {
		new SortOddEven().sort(null);
	}

	@Test(expected = RuntimeException.class)
	public void testSortByEmptyInput() {
		new SortOddEven().sort(new int[0]);
	}

	@Test
	public void testSortSortPositiveInput() {
		int[] expectedArray = new int[] { 1, 3, 5, 2, 6, 8 };
		int[] array = new int[] { 2, 3, 1, 5, 8, 6 };
		new SortOddEven().sort(array);
		Assert.assertEquals(Arrays.toString(expectedArray), Arrays.toString(array));
	}

	@Test
	public void testSortBySingleValueArrayInput() {
		int[] expectedArray = new int[] { 2 };
		int[] array = new int[] { 2 };
		new SortOddEven().sort(array);
		Assert.assertEquals(Arrays.toString(expectedArray), Arrays.toString(array));
	}
}
