package Algorithms.SearchingAlgorithms;

import Algorithms.Interfaces.Searching;

public class BinarySearch implements Searching{
	public static <T extends Comparable<T>> int search(T[] arr, T elem){
		// TODO - make this work with Generic type T
		for(int left = 0, right = arr.length-1; left <= right;){
			int mid = (right+left)/ 2;

			if(arr[mid] == elem){
				return mid;
			}
			else if(arr[mid] > elem){
				right = mid - 1;
			}
			else{
				left = mid + 1;
			}
		}

		return -1;
	}
}
