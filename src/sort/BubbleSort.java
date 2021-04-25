package sort;

public class BubbleSort {

	public static int[] bubbleSort(int[] array) {
		if(array == null)
			throw new IllegalArgumentException("Array invalido.");

		for (int i = 0; i < array.length; i++) {
			for(int j = 1; j < (array.length - i); j++) {
				if(array[j-1] > array[j]) {
					int temp = array[j-1];
					array[j-1] = array[j];
					array[j] = temp;
				}
			}
		}
		
		return array;
	}
}
