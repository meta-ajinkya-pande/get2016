package assignment8;

import java.util.Arrays;

/**
 * This program sort the unsorted data when there is less than 3 digits number
 * 
 * @author Ajinkya Pande
 *
 */
public class CountingSort {
	/**
	 * 
	 * @param unSortedArray
	 *            contains the elements in unsorted form
	 * @return sorted array that contain elements in sorted manner
	 */
	public int[] countingSort(int[] unSortedArray) {
		int low = unSortedArray[0];
		int high = unSortedArray[0];
		for (int i = 1; i < unSortedArray.length; i++) {
			if (unSortedArray[i] < low) {
				low = unSortedArray[i];
			} else if (unSortedArray[i] > high) {
				high = unSortedArray[i];
			}
		}
		// this will hold all possible values, from low to high
		int[] counts = new int[high - low + 1];
		for (int x : unSortedArray)
			counts[x - low]++;
		int current = 0;
		for (int i = 0; i < counts.length; i++) {
			// fills counts[i] elements of value i + low in current
			Arrays.fill(unSortedArray, current, current + counts[i], i + low);
			// leap forward by counts[i] steps
			current += counts[i];
		}
		return unSortedArray;
	}
}
