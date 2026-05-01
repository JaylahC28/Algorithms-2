package Algorithms.SortingAlgorithms;

import Algorithms.Interfaces.Sorting;

public class SelectionSort implements Sorting{
	public static <T extends Comparable<T>> void sort(T[] arr){
		// TODO - make this work with Generic type T
		for(int i=0; i< arr.length-1; i++){
			int minIndex = i;

			for(int j=i+1; j<arr.length; j++){
				if(arr[j]<arr[minIndex]){
					minIndex =j;
				}
			}

			int smallerNumber = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = smallerNumber;
		}
	}
}
