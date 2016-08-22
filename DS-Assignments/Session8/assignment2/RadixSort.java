package assignment8;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * This sort the given unsorted array by using radix sort In this there is
 * counting sort is used for every single loop
 * 
 * @author Ajinkya Pande
 *
 */
public class RadixSort {

	/**
	 * @param unSortedArray
	 *            contain the elements which is not sorted order
	 * @return sortedArray that contain the elements in sorted order
	 */
	public int[] radixSort(int[] unSortedArray) {
		boolean flag = true;
		int divisor = 1;
		Map<Integer, List<Integer>> buckets = new HashMap<Integer, List<Integer>>();
		// Initial HashMap
		for (int i = 0; i < 10; i++)
			buckets.put(i, new LinkedList<Integer>());

		// This will apply counting sort in every loop
		while (flag) {
			flag = false;
			// first copy the values into maps
			for (int i = 0; i < unSortedArray.length; i++) {
				int hashIndex = (unSortedArray[i] / divisor) % 10;
				if (hashIndex > 0)
					flag = true;
				((LinkedList<Integer>) buckets.get(hashIndex))
						.addLast(unSortedArray[i]);
			}
			divisor *= 10;
			int i = 0;
			// then copy the values back into arrays
			for (int j = 0; j < 10; j++) {
				while (!buckets.get(j).isEmpty()) {
					int value = ((LinkedList<Integer>) buckets.get(j))
							.getFirst();
					((LinkedList<Integer>) buckets.get(j)).removeFirst();
					unSortedArray[i++] = value;
				}
			}
		}
		return unSortedArray;
	}
}
