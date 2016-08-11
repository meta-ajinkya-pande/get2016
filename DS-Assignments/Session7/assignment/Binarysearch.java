package assignment;
/**
 * This program of binary Search gives the left most element of the search
 * if there are duplicates elements present in it.
 * The comment is under progress please regret if comment is wrong anywhere.
 * @author Ajinkya pande
 */
public class Binarysearch {
	
	/**
	 * This is main algorithm of the binary search where we find the left most
	 * element of the given array.
	 * @param array is the integer array in which we want to search an element 
	 * @param low is integer type index in which lower bound of array is given
	 * @param high is integer type of index in which upper bound of array is given
	 * @param index is the location where element is present
	 * @param target is integer type of value which we have to search in an array 
	 * @return index which contain the left most target element
	 */
	private int binarySearch(int[] array,int low, int high,int index,int target){
		if(low<high){
			int mid = low + (high - low)/2;
			if(array[mid] == target){
				index = mid;
			}
			if(array[mid] >= target){
				return binarySearch(array, low, mid, index, target);
			}else{
				return binarySearch(array, mid+1, high, index, target);
			}
		}
		return index;
	}
	
	/**
	 * This is used for public interaction only.
	 * User can access this binary search algorithm by this method.
	 * it will return -1 if element is not present else
	 * it will return index of left most element 
	 * @param array is the integer array in which we want to search an element
	 * @param target is integer type of value which we have to search in an array
	 * @return index of the left most element in an array
	 */
	public int search(int[] array,int target){
		int index = binarySearch(array, 0, array.length, -1, target);
		return index;
	}
	
	/**
	 * This is main for this program.
	 */
	public static void main(String[] ar){
		Binarysearch obj = new Binarysearch();
		int[] array = {20,21,21,21,23,23,25,26,26,28};
		int target = 26;
		System.out.println(obj.search(array, target));
	}
}
