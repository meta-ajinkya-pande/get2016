package assignment8;

public class BubbleSort {
	/**
	 * 
	 * @param unSortedArray
	 *            contains the elements in unsorted form
	 * @return sorted array that contain elements in sorted manner
	 */
	public int[] bubbleSort(int[] unSortedArray) {
		int j;
		boolean flag = true;
		int temp;
		while (flag) {
			flag = false;
			for (j = 0; j < unSortedArray.length - 1; j++) {
				if (unSortedArray[j] > unSortedArray[j + 1]) {
					temp = unSortedArray[j];
					unSortedArray[j] = unSortedArray[j + 1];
					unSortedArray[j + 1] = temp;
					flag = true;
				}
			}
		}
		return unSortedArray;
	}
}
