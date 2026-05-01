package Algorithms.SearchingAlgorithms;

import Algorithms.Interfaces.Searching;

public class LinearSearch implements Searching{
	public static <T extends Comparable<T>> int search(T[] arr, T elem){
		// TODO - make this work with Generic type T

		for(int i = 0; i < arr.length; i++){
			if(arr[i] == elem){
				return i;
			}
		}

		return -1;
	}
}
