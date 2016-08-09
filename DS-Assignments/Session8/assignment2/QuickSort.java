package assignment8;

/**
 * This program do the quick sort for given array The comments are under
 * progress if there is mistake please regret that mistake
 * 
 * @author Ajinkya Pande
 *
 */
public class QuickSort {

	/**
	 * This is controller method which control the flow of the program
	 * 
	 * @param unSortedArray
	 *            contains the elements in unsorted manner
	 * @return sorted array that contain elements in sorted manner
	 */
	public int[] quickSort(int unSortedArray[]) {
		if (unSortedArray.length == 0)
			return unSortedArray;
		recursiveQuickSort(unSortedArray, 0, unSortedArray.length - 1);
		return unSortedArray;
	}

	/**
	 * This function call recursively to its left and right portion of
	 * unsortedArray
	 * 
	 * @param unSortedArray
	 *            contain the elements in unsorted way
	 * @param start
	 *            from where it had to start sorting
	 * @param end
	 *            up to which end it had to sort that array
	 */
	private void recursiveQuickSort(int[] unSortedArray, int start, int end) {
		int index = partition(unSortedArray, start, end);
		// Recursively call quick sort with left part of the partitioned array
		if (start < index - 1) {
			recursiveQuickSort(unSortedArray, start, index - 1);
		}
		// Recursively call quick sort with right part of the partitioned array
		if (end > index) {
			recursiveQuickSort(unSortedArray, index, end);
		}
	}

	/**
	 * This will move the pivot element into it position and divides the array
	 * into two parts from that position
	 * 
	 * @param unSortedArray
	 *            contains the elements in unsorted form
	 * @param low
	 *            is lower bound of the unsorted array
	 * @param high
	 *            is higher bound of the unsorted array
	 * @return position from where the partition is to be done
	 */
	private int partition(int[] unSortedArray, int low, int high) {
		int pivot = unSortedArray[low];
		// taking first element as pivot
		while (low <= high) {
			// searching number which is greater than pivot, bottom up
			while (unSortedArray[low] < pivot) {
				low++;
			}
			// searching number which is less than pivot, top down
			while (unSortedArray[high] > pivot) {
				high--;
			}
			// swap the values
			if (low <= high) {
				int tmp = unSortedArray[low];
				unSortedArray[low] = unSortedArray[high];
				unSortedArray[high] = tmp;
				// increment left index and decrement right index
				low++;
				high--;
			}
		}
		return low;
	}
}