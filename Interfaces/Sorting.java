package Algorithms.Interfaces;

public interface Sorting<SORTABLE> {
	public static <T extends Comparable<T>> void sort(T[] arr){}
}
