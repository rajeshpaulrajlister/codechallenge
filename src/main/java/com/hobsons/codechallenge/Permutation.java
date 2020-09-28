package com.hobsons.codechallenge;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Contains methods to generate permutation result of an array.
 * 
 */
public class Permutation {

	private Set<String> permutationResultSet = new HashSet<>();

	/**
	 * Generate permutation result for given array and return as a Set.
	 * Validation of the inputs only done here, to avoid repetitive checking of
	 * the inputs validation.
	 */
	public Set<String> permute(int[] array, int leftIndex, int rightIndex) {
		if (array == null || array.length == 0) {
			throw new RuntimeException("array should not be null or empty");
		}
		return doPermute(array, leftIndex, rightIndex);
	}

	/**
	 * Actual logic to generate permutation is done here.
	 * 
	 */
	private Set<String> doPermute(int[] array, int leftIndex, int rightIndex) {
		if (leftIndex == rightIndex) {
			permutationResultSet.add(Arrays.toString(array));
		} else {
			for (int i = leftIndex; i <= rightIndex; i++) {
				swap(array, leftIndex, i);
				doPermute(array, leftIndex + 1, rightIndex);
				swap(array, leftIndex, i);
			}
		}
		return permutationResultSet;
	}

	/**
	 * Swap the array elements based on given leftIndex and rightIndex.
	 * 
	 */
	private void swap(int[] array, int leftIndex, int rightIndex) {
		int temp = array[leftIndex];
		array[leftIndex] = array[rightIndex];
		array[rightIndex] = temp;
	}
}
