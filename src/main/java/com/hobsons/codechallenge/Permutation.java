package com.hobsons.codechallenge;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Contains methods for generate permutation result.
 * 
 */
public class Permutation {

	private Set<String> permutationResultSet = new HashSet<>();

	/**
	 * Print permutation result for given array.
	 * 
	 */
	public Set<String> permute(int[] array, int leftIndex, int rightIndex) {

		if (array == null) {
			throw new RuntimeException("array should not be null");
		}

		if (leftIndex == rightIndex)
			permutationResultSet.add(Arrays.toString(array));
		else
			for (int i = leftIndex; i <= rightIndex; i++) {
				swap(array, leftIndex, i);
				permute(array, leftIndex + 1, rightIndex);
				swap(array, leftIndex, i);
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
