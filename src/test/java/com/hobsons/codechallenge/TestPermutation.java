package com.hobsons.codechallenge;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class TestPermutation {

	private Permutation permutation = new Permutation();

	@Test(expected = RuntimeException.class)
	public void testPermuteByNullInput() {
		permutation.permute(null);
	}

	@Test(expected = RuntimeException.class)
	public void testPermuteByEmptyInput() {
		permutation.permute(new int[0]);
	}

	@Test
	public void testPermuteByPositiveInput() {
		Set<String> expectedResult = new HashSet<>();
		expectedResult.add(Arrays.toString(new int[] { 3, 2, 2 }));
		expectedResult.add(Arrays.toString(new int[] { 2, 2, 3 }));
		expectedResult.add(Arrays.toString(new int[] { 2, 3, 2 }));
		int[] array = new int[] { 2, 2, 3 };
		Set<String> permutationResultSet = permutation.permute(array);
		Assert.assertEquals(expectedResult, permutationResultSet);
	}

	@Test
	public void testPermuteBySingleValueArrayInput() {
		Set<String> expectedResult = new HashSet<>();
		expectedResult.add(Arrays.toString(new int[] { 2 }));
		int[] array = new int[] { 2 };
		Set<String> permutationResultSet = permutation.permute(array);
		Assert.assertEquals(expectedResult, permutationResultSet);
	}
}
