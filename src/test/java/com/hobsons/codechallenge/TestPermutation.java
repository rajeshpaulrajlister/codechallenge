package com.hobsons.codechallenge;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class TestPermutation {

	@Test
	public void testPermuteCase1() {
		Set<String> expectedResult = new HashSet<>();
		expectedResult.add(Arrays.toString(new int[] { 3, 2, 2 }));
		expectedResult.add(Arrays.toString(new int[] { 2, 2, 3 }));
		expectedResult.add(Arrays.toString(new int[] { 2, 3, 2 }));

		int[] array = new int[] { 2, 2, 3 };
		Set<String> permutationResultSet = new Permutation().permute(array, 0, array.length - 1);

		Assert.assertEquals(expectedResult, permutationResultSet);
	}

	@Test(expected = RuntimeException.class)
	public void testNullInput() {
		new Permutation().permute(null, 0, 0);
	}

}
