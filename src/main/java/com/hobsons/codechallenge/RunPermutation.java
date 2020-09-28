package com.hobsons.codechallenge;

import java.util.Scanner;
import java.util.Set;

/**
 * Entry point to run permutation.
 */
public class RunPermutation {

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
				Set<String> permutationResultSet = new Permutation().permute(array, 0, arraySize - 1);
				System.out.println(permutationResultSet);
			}
		} finally {
			scanner.close();
		}
	}
}
