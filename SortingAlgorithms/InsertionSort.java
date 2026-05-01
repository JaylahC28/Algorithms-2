package Algorithms.SortingAlgorithms;

import Algorithms.Interfaces.Sorting;

public class InsertionSort implements Sorting{
	public static <T extends Comparable<T>> void sort(T[] arr){
		// TODO - make this work with Generic type T
		int i;
		int key;
		int j;

		for (i = 1; i < arr.length; i++){
			key = arr[i];
			j = i - 1;

			while (j >= 0 && arr[j] > key){
				arr[j + 1] = arr[j];
				j = j - 1;
			}

			arr[j + 1] = key;
		}
	}
}
