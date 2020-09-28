package com.hobsons.codechallenge;

/**
 * Contains methods for sort array as ascending order as odd first and then even
 * 
 */
public class SortOddEven {

	/**
	 * Sort the given array as ascending order as odd first and then even. Logic
	 * done by move all odd number to left side and even number to right side of
	 * the array. And sort odd and even numbers.
	 */
	public void sort(int[] array) {
		if (array == null || array.length == 0) {
			throw new RuntimeException("array should not be null or empty");
		}
		if (array.length == 1) {
			return;
		}
		int arraySize = array.length, leftIndex = 0, rightIndex = arraySize - 1, oddCount = 0;
		while (leftIndex < rightIndex) {
			while (leftIndex < arraySize && isOdd(array[leftIndex])) {
				leftIndex++;
				oddCount++;
			}
			while (leftIndex < rightIndex && !isOdd(array[rightIndex])) {
				rightIndex--;
			}
			if (leftIndex < rightIndex) {
				swap(array, leftIndex, rightIndex);
			}
		}
		sortInAscendingOrder(array, 0, oddCount);
		sortInAscendingOrder(array, oddCount, arraySize);
	}

	/**
	 * Check that given number is odd or even. It return "true" if given number
	 * is odd and "false" if given number is even.
	 * 
	 */
	private boolean isOdd(int number) {
		return number % 2 != 0;
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

	/**
	 * Sort the given array as ascending order from fromIndex to toIndex.
	 * 
	 */
	private void sortInAscendingOrder(int[] array, int fromIndex, int toIndex) {
		for (int i = fromIndex; i < toIndex - 1; i++) {
			for (int j = i + 1; j < toIndex; j++) {
				if (array[i] > array[j]) {
					swap(array, i, j);
				}
			}
		}
	}
}
