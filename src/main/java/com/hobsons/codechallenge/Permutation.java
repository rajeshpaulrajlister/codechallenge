package com.hobsons.codechallenge;

import java.util.Arrays;

/**
 * Contains methods for generate permutation result.
 * 
 */
public class Permutation {

	/**
	 * Print permutation result for given array.
	 * 
	 */
	public void permute(int[] array, int leftIndex, int rightIndex) {
		if (leftIndex == rightIndex)
			System.out.println(Arrays.toString(array));
		else
			for (int i = leftIndex; i <= rightIndex; i++) {
				swap(array, leftIndex, i);
				permute(array, leftIndex + 1, rightIndex);
				swap(array, leftIndex, i);
			}
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
