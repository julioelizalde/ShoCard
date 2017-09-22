package com.shocard;

import java.util.Arrays;
import java.util.LinkedHashSet;

/**
 * 
 * @author Julio Elizalde
 *
 */
public class Question4 {

	public static void main(String[] args) {
		int[] a = { 7, 9, 12, 9, 9, 8, 19, 22, 21, 22, 12, 6, 7, 9, 7 };

		Question4.removeDuplicates(a);
	}
	/*
	  Write a function to remove the duplicates from an unsorted array of integers. Maintain the order of the numbers in the deduped array.
	e.g. input:
	  int[] a = {7,9,12,9,9,8,19,22,21,22,12,6,7,9,7};

	output:
	  7,9,12,8,19,22,21,6
	*/

	public static int[] removeDuplicates(int arr[]) {
		
		System.out.println("Initial unsorted array with duplicates");
		System.out.println(Arrays.toString(arr));
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
		for (int i = 0; i < arr.length; i++) {
			linkedHashSet.add(arr[i]);
		}

		System.out.println("\nFinal unsorted array without duplicates");

		int[] ints = linkedHashSet.stream().mapToInt(Integer::intValue).toArray();
		System.out.println(Arrays.toString(ints));

		return ints;
	}

}
