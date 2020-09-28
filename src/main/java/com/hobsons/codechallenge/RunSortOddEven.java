package com.hobsons.codechallenge;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Entry point to run odd even sorting.
 */
public class RunSortOddEven {

	public static void main(String[] args) {
		System.out.println("Enter size of array");
		Scanner scanner = new Scanner(System.in);
		try {
			int arraySize = scanner.nextInt();
			if (arraySize > 0) {
				System.out.println("Enter array elements");
				int array[] = new int[arraySize];
				for (int i = 0; i < arraySize; i++) {
					array[i] = scanner.nextInt();
				}
				new SortOddEven().sort(array);
				System.out.println(Arrays.toString(array));
			}
		} finally {
			scanner.close();
		}
	}
}
