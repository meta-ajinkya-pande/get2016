package assignment8;

/**
 * A sorting system, which takes input from user and provide a sorted list. Here
 * User could choose if he want to go with Comparison Sorting Or Linear Sorting.
 * @author Ajinkya Pande
 *
 */
public class SortingSystem {
	/**
	 * In this program the array should be sorted by different algorithms of
	 * sorting according to users input and choice
	 * 
	 * @param unsortedArray
	 *            contains the elements that is not in sorted order
	 * @param userChoice
	 *            determine which algorithm should be used if userChoice is 1 it
	 *            will use bubble or quick sort else it will use radix or
	 *            counting sort
	 * @return the sorted array
	 */
	public int[] sorting(int[] unsortedArray, int userChoice) {
		int forRadix = 0;
		for (int i = 0; i < unsortedArray.length; i++) {
			// Doing validation that number should not less than 0
			if (unsortedArray[i] < 0) {
				throw new IllegalArgumentException();
			}
			// Condition when to use radix sort
			if (unsortedArray[i] > 99) {
				forRadix++;
			}
		}
		if (userChoice == 1) {
			if (unsortedArray.length <= 10) {
				BubbleSort bubbleSort = new BubbleSort();
				return bubbleSort.bubbleSort(unsortedArray);
			} else {
				QuickSort quickSort = new QuickSort();
				return quickSort.quickSort(unsortedArray);
			}
		} else {
			if (forRadix != 0) {
				RadixSort radixSort = new RadixSort();
				return radixSort.radixSort(unsortedArray);
			} else {
				CountingSort countingSort = new CountingSort();
				return countingSort.countingSort(unsortedArray);
			}
		}
	}
}