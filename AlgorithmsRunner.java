package Algorithms;

import java.util.Random;

import Algorithms.SearchingAlgorithms.BinarySearch;
import Algorithms.SearchingAlgorithms.LinearSearch;
import Algorithms.SortingAlgorithms.BubbleSort;
import Algorithms.SortingAlgorithms.InsertionSort;
import Algorithms.SortingAlgorithms.SelectionSort;

public class AlgorithmsRunner {
	public static void main(String[] args){
		testSort();

		testSearch();
	}

	public static void testSort(){
		int[] sizes = {5, 10};

		//Testing Integer Arrays
		for(int size : sizes){
			Integer[] arrInt = makeIntArr(size);
			System.out.print("The original array :: ");
			printarr(arrInt);
			System.out.println();

			Integer[] arrCopy = arrInt.clone();
			BubbleSort.sort(arrCopy);
			System.out.printf("Bubble sort sorted the array like the following:: ");
			printarr(arrCopy);
			System.out.println();

			arrCopy = arrInt.clone();
			SelectionSort.sort(arrCopy);
			System.out.printf("Selection sort sorted the array like the following:: ");
			printarr(arrCopy);
			System.out.println();

			arrCopy = arrInt.clone();
			InsertionSort.sort(arrCopy);
			System.out.printf("Insertion sort sorted the array like the following:: ");
			printarr(arrCopy);
			System.out.println();

		}

		//Testing Node Arrays
		for(int size : sizes){
			Node[] arrNode = makeNodeArr(size);
			System.out.print("The original array :: ");
			printarr(arrNode);
			System.out.println();

			Node[] arrCopy = arrNode.clone();
			BubbleSort.sort(arrCopy);
			System.out.printf("Bubble sort sorted the array like the following:: ");
			printarr(arrCopy);
			System.out.println();

			arrCopy = arrNode.clone();
			SelectionSort.sort(arrCopy);
			System.out.printf("Selection sort sorted the array like the following:: ");
			printarr(arrCopy);
			System.out.println();

			arrCopy = arrNode.clone();
			InsertionSort.sort(arrCopy);
			System.out.printf("Insertion sort sorted the array like the following:: ");
			printarr(arrCopy);
			System.out.println();

		}

		//Testing String Arrays
		for(int size : sizes){
			String[] arrString = makeStringArr(size);
			System.out.print("The original array :: ");
			printarr(arrString);
			System.out.println();

			String[] arrCopy = arrString.clone();
			BubbleSort.sort(arrCopy);
			System.out.printf("Bubble sort sorted the array like the following:: ");
			printarr(arrCopy);
			System.out.println();

			arrCopy = arrString.clone();
			SelectionSort.sort(arrCopy);
			System.out.printf("Selection sort sorted the array like the following:: ");
			printarr(arrCopy);
			System.out.println();

			arrCopy = arrString.clone();
			InsertionSort.sort(arrCopy);
			System.out.printf("Insertion sort sorted the array like the following:: ");
			printarr(arrCopy);
			System.out.println();
		}
	}

	public static void testSearch(){
		int size = 100;
		Integer[] arrInt = makeIntArr(size);
		Node[] arrNode = makeNodeArr(size);
		String[] arrString = makeStringArr(size);

		// Requires that your bubble sort works
		BubbleSort.sort(arrInt);
		BubbleSort.sort(arrNode);
		BubbleSort.sort(arrString);

		Random rng = new Random();

		int linearFailCounter = 0;
		int binaryFailCounter = 0;

		int runs = 50;

		// Integer Searching run
		for(int i = 0; i < runs; i++){
			int index = rng.nextInt(size);
			Integer test = new Integer(arrInt[index]);

			if(LinearSearch.search(arrInt, test) != index){
				linearFailCounter++;
			}
			if(BinarySearch.search(arrInt, test) != index){
				binaryFailCounter++;
			}
		}

		System.out.printf("Linear Search failed to find the Integer %d times%n", linearFailCounter);
		System.out.printf("Binary Search failed to find the Integer %d times%n", binaryFailCounter);
		linearFailCounter = 0;
		binaryFailCounter = 0;

		// Node Searching run
		for(int i = 0; i < runs; i++){
			int index = rng.nextInt(size);
			Node test = new Node(arrNode[index]);

			if(LinearSearch.search(arrNode, test) != index){
				linearFailCounter++;
			}
			if(BinarySearch.search(arrNode, test) != index){
				binaryFailCounter++;
			}
		}

		System.out.printf("Linear Search failed to find the Node %d times%n", linearFailCounter);
		System.out.printf("Binary Search failed to find the Node %d times%n", binaryFailCounter);
		linearFailCounter = 0;
		binaryFailCounter = 0;

		// String Searching run
		for(int i = 0; i < runs; i++){
			int index = rng.nextInt(size);
			String test = new String(arrString[index]);

			if(LinearSearch.search(arrString, test) != index){
				linearFailCounter++;
			}
			if(BinarySearch.search(arrString, test) != index){
				binaryFailCounter++;
			}
		}

		System.out.printf("Linear Search failed to find the String %d times%n", linearFailCounter);
		System.out.printf("Binary Search failed to find the String %d times%n", binaryFailCounter);

	}

	public static Integer[] makeIntArr(int size){
		Integer[] arr = new Integer[size];

		Random rng = new Random();
		int bound = Integer.MAX_VALUE;

		for(int i = 0; i < size; i++){
			arr[i] = rng.nextInt(bound);
		}

		return arr;
	}

	public static Node[] makeNodeArr(int size){
		Node[] arr = new Node[size];

		Random rng = new Random();
		int bound = Integer.MAX_VALUE;

		for(int i = 0; i < size; i++){
			arr[i] = new Node(rng.nextInt(bound), rng.nextInt(bound));
		}

		return arr;
	}

	public static String[] makeStringArr(int size){
		String[] arr = new String[size];

		Random rng = new Random();
		int bound = 26;

		for(int i = 0; i < size; i++){
			String entry = "";
			for(int j = 0; j < 5; j++){
				entry += (char)(97 + rng.nextInt(bound));
			}

			arr[i] = entry;
		}

		return arr;
	}

	public static <T> void printarr(T[] arr){
		System.out.print("[");

		for(T e : arr){
			System.out.printf("%s, ", e.toString());
		}

		System.out.println("]");
	}
}
