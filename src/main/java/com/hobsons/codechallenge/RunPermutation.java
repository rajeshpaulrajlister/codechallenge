package com.hobsons.codechallenge;

import java.util.Scanner;

/**
 * Entry point to run permutation.
 */
public class RunPermutation {

	public static void main(String[] args) {

		System.out.println("Enter size of array");

		Scanner scanner = new Scanner(System.in);
		int arraySize = scanner.nextInt();

		System.out.println("Enter array elements");

		int array[] = new int[arraySize];
		for (int i = 0; i < arraySize; i++) {
			array[i] = scanner.nextInt();
		}
		scanner.close();

		new Permutation().permute(array, 0, arraySize - 1);
	}

}
