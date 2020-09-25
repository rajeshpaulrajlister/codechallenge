package com.hobsons.codechallenge;

/**
 * Contains methods for sort array as ascending order as odd first and then even
 * 
 */
public class SortOddEven {

	/**
	 * Sort the given array as ascending order as odd first and then even.
	 * 
	 */
	public void sort(int[] array) {

		int arraySize = array.length, leftIndex = 0, rightIndex = arraySize - 1, oddCount = 0;

		while (leftIndex < rightIndex) {
			// Find first even number from left side.
			while (leftIndex < arraySize && isOdd(array[leftIndex])) {
				leftIndex++;
				oddCount++;
			}

			// Find first odd number from right side.
			while (leftIndex < rightIndex && !isOdd(array[rightIndex]))
				rightIndex--;

			// Swap odd number present on left and even number on right.
			if (leftIndex < rightIndex) {
				swap(array, leftIndex, rightIndex);
			}
		}

		// Sort odd number
		sortInAscendingOrder(array, 0, oddCount);

		// Sort even number
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
