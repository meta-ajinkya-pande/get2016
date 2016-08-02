package assignment2;

public class BinarySearchRecursion {

	// This Search requires the sorted array
	// Logic is that break the sorted array into 2 parts.
	// if mid value of an array is less than target search only in 2nd array else 1st array
	public int binarySearch(int[] array, int target, int firstindex,
			int lastindex) {
		int mid = (firstindex + lastindex) / 2;
		if (firstindex > lastindex) {
			return 0;
		}
		if (array[mid] == target) {
			return 1;
		} else{ 
			if (array[mid] < target) {
				return binarySearch(array, target, mid + 1, lastindex);
			} else  {
				return binarySearch(array, target, firstindex, mid - 1);
			}
		}
	}
}
