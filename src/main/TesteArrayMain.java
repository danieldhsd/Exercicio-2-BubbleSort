package main;

import java.util.Arrays;

import sort.BubbleSort;

public class TesteArrayMain {

	public static void main(String[] args) {
		int[] array = {5, 3, 2, 4, 7, 1, 0, 6};
		array = BubbleSort.bubbleSort(array);
		System.out.println(Arrays.toString(array));
		
		int[] array2 = {5, -3, 2, -4, 7, 100, 0, 6};
		array2 = BubbleSort.bubbleSort(array2);
		System.out.println(Arrays.toString(array2));
	}
}
