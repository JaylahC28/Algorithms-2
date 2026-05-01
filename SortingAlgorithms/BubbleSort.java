package Algorithms.SortingAlgorithms;

import Algorithms.Interfaces.Sorting;

public class BubbleSort implements Sorting{
	public static <T extends Comparable<T>> void sort(T[] arr){
		// TODO - make this work with Generic type T
		for(int i = 0; i < arr.length-1; i++){

			for(int j = 0; j<arr.length-i-1; j++){

				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
}
