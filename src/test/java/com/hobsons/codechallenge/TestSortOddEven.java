package com.hobsons.codechallenge;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class TestSortOddEven {

	@Test(expected = RuntimeException.class)
	public void testNullInput() {
		new SortOddEven().sort(null);
	}

	@Test
	public void testSortCase1() {
		int[] expectedArray = new int[] { 1, 3, 5, 2, 6, 8 };

		int[] array = new int[] { 2, 3, 1, 5, 8, 6 };
		new SortOddEven().sort(array);

		Assert.assertEquals(Arrays.toString(expectedArray), Arrays.toString(array));
	}

	@Test
	public void testSortCase2() {
		int[] expectedArray = new int[0];

		int[] array = new int[0];
		new SortOddEven().sort(array);
		Assert.assertEquals(Arrays.toString(expectedArray), Arrays.toString(array));
	}

	@Test
	public void testSortCase3() {
		int[] expectedArray = new int[] { 2 };

		int[] array = new int[] { 2 };
		new SortOddEven().sort(array);
		Assert.assertEquals(Arrays.toString(expectedArray), Arrays.toString(array));
	}

}
